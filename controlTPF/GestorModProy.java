package controlTPF;

import dbasTPF.DBACultivo;
import dbasTPF.DBADetPro;
import dbasTPF.DBAEtPro;
import dbasTPF.DBALaboreo;
import dbasTPF.DBALote;
import dbasTPF.DBAOrden;
import dbasTPF.DBAProyecto;
import dbasTPF.DBASitAn;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Detalleproyecto;
import modeloDatosTPF.Etapaproyecto;
import modeloDatosTPF.Laboreo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Orden;
import modeloDatosTPF.Proyecto;
import modeloDatosTPF.Situacionanormal;

public class GestorModProy {
    
    private Campo campoElegido;
    private List <Lote> lotes;
    private Lote loteElegido;
    private Proyecto proyActual;
    private Detalleproyecto detProActual;
    private Orden ordenActual;
    private List <Orden> ordenes;
    private Orden siguiOrden;
    private List <Situacionanormal> sitAns;
    

    public GestorModProy(Campo campoElegido) {
        this.campoElegido = campoElegido;
        this.lotes = new ArrayList();
        this.loteElegido = new Lote();
        this.ordenes = new ArrayList();
        this.sitAns = new ArrayList();
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes() {
        DBALote dba = new DBALote();
        this.lotes = dba.lotesConProyAct(this.campoElegido);
    }

    public Lote getLoteElegido() {
        return loteElegido;
    }

    public void setLoteElegido(String idElegido) {
        for(Lote l: this.lotes){
            if(l.equals(Integer.parseInt(idElegido))){
                this.loteElegido = l;
            }
        }   
    }

    public Proyecto getProyActual() {
        return proyActual;
    }

    public void setProyActual() {
        DBAProyecto dba = new DBAProyecto();
        this.proyActual = dba.proysIniciados(this.loteElegido);
    }
    
    public Cultivo busqCulti(){
        DBACultivo dba = new DBACultivo();
        return dba.cultivoXProy(this.proyActual);
    }

    public Detalleproyecto getDetProActual() {
        return detProActual;
    }

    public void setDetProActual() {
        DBADetPro dba = new DBADetPro();
        this.detProActual = dba.detProActual(this.proyActual);
    }

    public void setOrdenActual() {
        DBAOrden dba = new DBAOrden();
        this.ordenActual = dba.ordenXId(this.detProActual.getOrden());
    }

    public Orden getOrdenActual() {
        return ordenActual;
    }
    
    public Etapaproyecto busqEtPro(Orden ordenx){
        DBAEtPro dba = new DBAEtPro();
        return dba.etProXOrden(ordenx);
    }
    
    public Laboreo busqLaboreo(Orden ordenx){
        DBALaboreo dba = new DBALaboreo();
        return dba.labXOrden(ordenx);
    }

    public void setOrdenes() {
        DBAOrden dba = new DBAOrden();
        this.ordenes = dba.ordenesXCultivo(this.proyActual.getCultivo());
    }

    public Orden getSiguiOrden() {
        return siguiOrden;
    }

    public void setSiguiOrden() {
        int siguiente = 1;
        for(Orden o: this.ordenes){//se busca en toda la lista de ordenes de ese cultivo
            if(o.equals(this.ordenActual)){//si encuentra el orden actual, realiza la siguiente consulta
                if(siguiente < this.ordenes.size()){//si hay mas ordenes en la lista, asigna la siguiente a la actual
                    this.siguiOrden = this.ordenes.get(siguiente);
                }else{//si ya esta en el ultimo orden no se asigna un nuevo orden
                    this.siguiOrden = null;
                }
            }else{
                siguiente++;
            }
        }
    }

    public void cambiarEstadoProy(String estado){
        DBAProyecto dba = new DBAProyecto();
        this.proyActual.setEstadoproyecto(estado);
        dba.actualizarEstado(this.proyActual);
    }
    
    public void avanzarEtapa(){
        String estadoCultivo = null;
        switch(this.siguiOrden.getEtapaproyecto().getId()){
            case 1://etapa de preparación
                estadoCultivo = "Germinado";
                break;
            case 2://etapa de siembra
                estadoCultivo = "Germinado";
                break;
            case 3://etapa de post siembra
                estadoCultivo = "Nacido";
                break;
            case 4://etapa de cosecha
                estadoCultivo = "Maduro";
                break;
        }
        this.proyActual.crearDetalleproyectos(this.siguiOrden, estadoCultivo);
        finalizarDetPro();
    }
    
    public void finalizarDetPro(){
        this.proyActual.finalizarDetPro(this.detProActual);
    }
        
    public void cargarDatos(){
        setProyActual();
        setDetProActual();
        setOrdenActual();
        setOrdenes();
        setSiguiOrden();
    }
    
    public boolean pasarAPostSiembra() {
        int siguiente = 1;
        boolean band = false;
        for(Orden o: this.ordenes){//se busca en toda la lista de ordenes de ese cultivo
            if(o.equals(this.ordenActual)){//si encuentra el orden actual, realiza la siguiente consulta
                if(o.getEtapaproyecto().getId()==2 && this.ordenes.get(siguiente).getEtapaproyecto().getId()==3){
                    band = true;//si se pasa a la etapa de post siembra, se asigna verdadero
                }
            }else{
                siguiente++;
            }
        }
        return band;
    }
       
    public void resembrar(){
        this.detProActual.setEstadoproyecto("No nacido");
        this.proyActual.finalizarDetPro(this.detProActual);
        for (Orden o : this.ordenes) {
            if (o.getEtapaproyecto().getId() == 2 && o.getOrdenejecucion() == 1) {//se consulta si es el primer paso de la etapa de sembrado
                this.proyActual.crearDetalleproyectos(o, "Germinado");
            }
        }
    }
    
    public void cancelarProyecto(){
        this.detProActual.setEstadoproyecto("No nacido");
        this.proyActual.finalizarDetPro(this.detProActual);
        cambiarEstadoProy("Cancelado");
    }
    
    public String[] crearArreglo(){
        DBASitAn dba = new DBASitAn();
        this.sitAns = dba.sitanTotal();
        String [] arreglo = new String [this.sitAns.size()];
        for(int i=0; i<this.sitAns.size();i++){
            arreglo[i] = String.valueOf(this.sitAns.get(i).getNombre());
        }
        return arreglo;
    }
    
    public void cambiarSitAnProy(Situacionanormal sa){
        DBAProyecto dba = new DBAProyecto();
        this.proyActual.setSituacionanormal(sa);
        dba.actualizarEstado(this.proyActual);
    }
    
   
    public void encontrarSitAnProy(String resp){
        for (Situacionanormal sa : this.sitAns) {
            if (Objects.equals(sa.getNombre(), resp)) {
                cambiarSitAnProy(sa);
            }
        }
        cancelarProyecto();
    }
}
