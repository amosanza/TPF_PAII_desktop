package dbasTPF;

import java.util.List;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Etapaproyecto;
import modeloDatosTPF.Orden;
import persistenciaTPF.DAOhb;
import persistenciaTPF.InterfazDAO;

public class DBAOrden {
    private InterfazDAO busq;

    public DBAOrden() {
        this.busq = new DAOhb();
    }
    
    public Orden ordenArealizar(int ordEj, Etapaproyecto etPro, Cultivo culti){
        return (Orden) busq.obtenerUno("FROM Orden WHERE ordenejecucion = " + ordEj+
        "AND etapaproyecto = "+ etPro.getId() +" AND cultivo = " + culti.getId());
    }
    
    public Orden ordenXId(Orden ordenx){
        return (Orden) busq.obtenerUno("FROM Orden WHERE id = " + ordenx.getId());
    }
    
    public List ordenesXCultivo(Cultivo culti){
        return this.busq.obtenerTodos("FROM Orden WHERE cultivo = " + culti.getId());
    }
}
