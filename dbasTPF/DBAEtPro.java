package dbasTPF;

import modeloDatosTPF.Etapaproyecto;
import modeloDatosTPF.Orden;
import persistenciaTPF.*;

public class DBAEtPro {
    
    private InterfazDAO busq;

    public DBAEtPro() {
        this.busq = new DAOhb();
    }
    
    public Etapaproyecto etProXOrden(Orden ordenx){
        return (Etapaproyecto) this.busq.obtenerUno("FROM Etapaproyecto WHERE id = " + 
        ordenx.getEtapaproyecto().getId());
    }
    
}
