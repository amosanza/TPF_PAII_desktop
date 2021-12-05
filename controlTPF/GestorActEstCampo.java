package controlTPF;

import dbasTPF.DBACampo;
import dbasTPF.DBALote;
import dbasTPF.DBAProyecto;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Proyecto;


public class GestorActEstCampo {
    
    private List <Campo> campos;
    private List <Lote> lotesCampox;
    private Proyecto proyLotex;
    private DBACampo dbaC;
    private List <Campo> camposEnDesuso;

    public GestorActEstCampo() {
        this.campos = new ArrayList();
        this.lotesCampox = new ArrayList();
        this.proyLotex = null;
        this.dbaC = new DBACampo();
        this.camposEnDesuso = new ArrayList();
    }

    public void setCampos() {
        this.campos = dbaC.busquedaTotal();
    }

    public void setLotesCampox(Campo campox) {
        DBALote dba = new DBALote();
        this.lotesCampox = dba.lotesActivos(campox);
    }

    public void setProyLotex(Lote lotex) {
        DBAProyecto dba = new DBAProyecto();
        this.proyLotex = dba.proysIniciados(lotex);
    }
    
    public void actualizarEstCampo(){
        int cantLoteSinProy = 0;
        setCampos();
        for(Campo c: this.campos){
            setLotesCampox(c);
            for(Lote l: this.lotesCampox){
                setProyLotex(l);
                if(this.proyLotex==null){
                    cantLoteSinProy++;
                }
                this.proyLotex=null;
            }
            if(cantLoteSinProy>0 && cantLoteSinProy<this.lotesCampox.size()){
                c.setEstadocampo("Parcialmente trabajado");
                this.dbaC.actualizarCampo(c);
            }
            if(cantLoteSinProy==0 && this.lotesCampox.size()>0){
                c.setEstadocampo("Completamente trabajado");
                this.dbaC.actualizarCampo(c);
            }
            if(cantLoteSinProy==this.lotesCampox.size()){
                c.setEstadocampo("Creado");
                this.dbaC.actualizarCampo(c);
            }
            cantLoteSinProy = 0;
        }
    }
    
    public void setCamposNoDesuso(){
        this.campos = this.dbaC.busquedaNoDesuso();
    }
    
    public void setCamposEnDesuso(){
        int cantLoteSinProy = 0;
        setCamposNoDesuso();//se buscan los campos que no se encuentren ya en el estado "En Desuso"
        for(Campo c: this.campos){
            setLotesCampox(c);
            for(Lote l: this.lotesCampox){
                setProyLotex(l);
                if(this.proyLotex==null){
                    cantLoteSinProy++;
                }
                this.proyLotex=null;
            }
            if(cantLoteSinProy==this.lotesCampox.size()){
                this.camposEnDesuso.add(c);
            }
            cantLoteSinProy = 0;
        }
    }
    
    public void ponerEnDesusoCampo(String resp){
        for (Campo c : this.camposEnDesuso) {
            if (c.getId() == Integer.parseInt(resp)) {
                c.setEstadocampo("En desuso");
                this.dbaC.actualizarCampo(c);
            }
        }
    }

    
    public String[] convCEDenArray(){
        String [] arreglo = new String [this.camposEnDesuso.size()];
        for(int i=0; i<this.camposEnDesuso.size();i++){
            arreglo[i] = String.valueOf(this.camposEnDesuso.get(i).getId());
        }
        return arreglo;
    }
    
    public void limpiarListaCamposEnDesuso(){
        this.camposEnDesuso.clear();
    }
}
