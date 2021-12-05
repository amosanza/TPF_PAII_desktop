package controlTPF;

import dbasTPF.DBACultivo;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Proyecto;
import dbasTPF.DBALote;
import dbasTPF.DBAProyecto;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Etapaproyecto;


public class GestorCrearProyecto {
    private List <Lote> lotes; //lista de lotes inactivos del campo
    private List<Cultivo> cultivos;//lista de cultivos disponibles para el tipo de suelo del lote elegido
    private Campo campoElegido;
    private Lote loteElegido;
    private Cultivo cultiElegido;

    public GestorCrearProyecto() {
        this.lotes = new ArrayList();
        this.cultivos = new ArrayList();
    }
    
    public List<Lote> getLotes() {
        return lotes;
    }

    public void setLotes() {
        DBALote dba = new DBALote();
        this.lotes = dba.lotesSinProyAct(this.campoElegido);
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos() {
        DBACultivo dba = new DBACultivo();
        this.cultivos = dba.cultivosXSuelo(this.loteElegido.getSuelo());
    }
    
    public Campo getCampoElegido() {
        return campoElegido;
    }

    public void setCampoElegido(Campo campoElegido) {
        this.campoElegido = campoElegido;
    }

    public Lote getLoteElegido() {
        return loteElegido;
    }

    public void setLoteElegido(Lote loteElegido) {
        this.loteElegido = loteElegido;
    }

    public Cultivo getCultiElegido() {
        return cultiElegido;
    }

    public void setCultiElegido(Cultivo cultiElegido) {
        this.cultiElegido = cultiElegido;
    }
    
        
    public void nuevoProyecto(){
        Etapaproyecto etPro = new Etapaproyecto();
        etPro.setId(1);
        Proyecto pro = new Proyecto(this.getCultiElegido(), this.loteElegido, "Iniciado");
        DBAProyecto dba = new DBAProyecto();
        dba.guardarProyecto(pro);
        pro.crearDetalleproyectos(pro.primerOrden(1,etPro),"Germinado");
    }
    
    public Lote compararLote(int i){
        Lote lotex = new Lote();
        for(Lote l: this.lotes){
            if(i == l.getId()){
                lotex = l;
            }
        }
        return lotex;
    }
    
    public Cultivo compararCultivo(int i){
        Cultivo cult = new Cultivo();
        for(Cultivo c: this.cultivos){
            if(i == c.getId()){
                cult = c;
            }
        }
        return cult;
    }
}
