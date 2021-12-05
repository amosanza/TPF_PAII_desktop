package controlTPF;

import dbasTPF.DBACampo;
import dbasTPF.DBALote;
import dbasTPF.DBAProyecto;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;


public class GestorBuscarCampo implements java.io.Serializable {
    private DBACampo dba;
    private DBALote dbaL;
    private List<Campo> campos;
    private List<Lote> lotes;
    private Campo campoElegido;
    private boolean tieneLotes;
    private boolean tieneProyectos;

    public GestorBuscarCampo() {
        this.dba = new DBACampo();
        this.campos = new ArrayList();
        this.lotes = new ArrayList();
        this.campoElegido = new Campo();
        this.tieneLotes = false;
        this.tieneProyectos = false;
    }

    public List<Campo> getCampos() {
        return campos;
    }

    public void setCampos() {
        this.campos = dba.busquedaTotal();
    }

    public Campo getCampoElegido() {
        return campoElegido;
    }

    public void setCampoElegido(Campo campoElegido) {
        this.campoElegido = campoElegido;
    }
    
    public void elegirCampo(String busq){
        this.dbaL = new DBALote();
        for(Campo c: this.campos){
            if(c.getId()==Integer.parseInt(busq)){
                this.campoElegido = c;
            }
        }
        this.lotes = this.dbaL.lotesXCampo(this.campoElegido);
    }
    
    public void verTieneLotes(){
        if(this.lotes.isEmpty()){//si el campo tiene lotes, pone en verdadero
            this.tieneLotes = false;
        }else{
            this.tieneLotes = true;
        }
    }
    
    public String[] crearArreglo(){
        String [] arreglo = new String [this.campos.size()];
        for(int i=0; i<this.campos.size();i++){
            arreglo[i] = String.valueOf(this.campos.get(i).getId());
        }
        return arreglo;
    }
    
    public boolean isTieneLotes() {
        return tieneLotes;
    }

    public boolean isTieneProyectos() {
        return tieneProyectos;
    }

    public void setTieneProyectos(boolean tieneProyectos) {
        this.tieneProyectos = tieneProyectos;
    }
    
    public void verTieneProyectos() {
        DBAProyecto dbaP = new DBAProyecto();
        for(Lote l: this.lotes){
            if(dbaP.proysIniciados(l)!=null){//si algun lote tiene un proyecto
                this.tieneProyectos = true;
            }
        }
    }

}
