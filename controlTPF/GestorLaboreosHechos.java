package controlTPF;

import dbasTPF.DBADetPro;
import dbasTPF.DBAEtPro;
import dbasTPF.DBALaboreo;
import dbasTPF.DBAOrden;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Detalleproyecto;
import modeloDatosTPF.Etapaproyecto;
import modeloDatosTPF.Laboreo;
import modeloDatosTPF.Orden;
import modeloDatosTPF.Proyecto;


public class GestorLaboreosHechos {

    private Proyecto proyElegido;
    private List <Detalleproyecto> detPros;
    private Orden ordenx;
    private Etapaproyecto etProx;
    private Laboreo laboreox;

    public GestorLaboreosHechos(Proyecto proyElegido) {
        this.proyElegido = proyElegido;
        this.detPros = new ArrayList();
    }

    public Proyecto getProyElegido() {
        return proyElegido;
    }

    public List<Detalleproyecto> getDetPros() {
        return detPros;
    }

    public void setDetPros() {
        DBADetPro dba = new DBADetPro();
        this.detPros = dba.detPros(this.proyElegido);
    }

    public Orden getOrdenx() {
        return ordenx;
    }

    public void setOrdenx(Detalleproyecto dp) {
        DBAOrden dba = new DBAOrden();
        this.ordenx = dba.ordenXId(dp.getOrden());
    }

    
    
    public Etapaproyecto getEtProx() {
        return etProx;
    }

    public void setEtProx() {
        DBAEtPro dba = new DBAEtPro();
        this.etProx = dba.etProXOrden(this.ordenx);
    }

    public Laboreo getLaboreox() {
        return laboreox;
    }

    public void setLaboreox() {
        DBALaboreo dba = new DBALaboreo();
        this.laboreox = dba.labXOrden(this.ordenx);
    }

    
    
    public Etapaproyecto busqEtPro(Orden ordenx){
        DBAEtPro dba = new DBAEtPro();
        return dba.etProXOrden(ordenx);
    }
    
    public Laboreo busqLaboreo(Orden ordenx){
        DBALaboreo dba = new DBALaboreo();
        return dba.labXOrden(ordenx);
    }
    
    
}
