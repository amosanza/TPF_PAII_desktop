package dbasTPF;

import modeloDatosTPF.Laboreo;
import modeloDatosTPF.Orden;
import persistenciaTPF.*;

public class DBALaboreo {
    private InterfazDAO busq;

    public DBALaboreo() {
        this.busq = new DAOhb();
    }
    
    public Laboreo labXOrden(Orden ordenx){
        return (Laboreo) this.busq.obtenerUno("FROM Laboreo WHERE id = " + ordenx.getLaboreo().getId());
    }
}
