package controlTPF;

import dbasTPF.DBACultivo;
import dbasTPF.DBALote;
import dbasTPF.DBAProyecto;
import dbasTPF.DBASitAn;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Proyecto;
import modeloDatosTPF.Situacionanormal;


public class GestorVerProysLot {
    private Campo campoElegido;
    private List <Lote> lotes;//lista de todos los lotes del campo, esten activos o no
    private Lote loteElegido;
    private List <Proyecto> proyectos;//lista de todos los proyectos que posea dicho lote, esten finalizados o no
    
    
    public GestorVerProysLot(Campo campoElegido) {
        this.campoElegido = campoElegido;
        this.lotes = new ArrayList();
        this.loteElegido = new Lote();
        this.proyectos = new ArrayList();
    }

    public Campo getCampoElegido() {
        return campoElegido;
    }

    public void setCampoElegido(Campo campoElegido) {
        this.campoElegido = campoElegido;
    }

    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes() {
        DBALote dba = new DBALote();
        this.lotes = dba.lotesXCampo(this.campoElegido);
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
    
    public List<Proyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos() {
        DBAProyecto dba = new DBAProyecto();
        this.proyectos = dba.proysXLote(this.loteElegido);
    }
    
    public Cultivo encontrarCultivo(Proyecto proy){
        DBACultivo dba = new DBACultivo();
        return dba.cultivoXProy(proy);
    }
    
    public Situacionanormal encontrarSitAn(Proyecto proy){
        DBASitAn dba = new DBASitAn();
        return dba.sitanXProy(proy);
    }
    
    public String msjConsultaTieneProys(){
        String jlabel;
        if(this.proyectos.isEmpty()){
            jlabel = ("El lote " + this.loteElegido.getId() + " aún no tiene proyectos");
        }else{
            jlabel = ("Los proyectos realizados hasta el momento en el lote " + this.loteElegido.getId() + " son");
        }
        return jlabel;
    }
    
    public Proyecto busqProyecto(String idElegido){
        Proyecto proyElegido = new Proyecto();
        for(Proyecto p: this.proyectos){
            if(p.equals(Integer.parseInt(idElegido))){
                proyElegido = p;
            }
        }
        return proyElegido;
    }
}
