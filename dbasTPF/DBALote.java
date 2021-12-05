package dbasTPF;

import java.util.List;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import persistenciaTPF.*;

public class DBALote {
    private InterfazDAO busq;

    public DBALote() {
        this.busq = new DAOhb();
    }
    
    public List lotesXCampo(Campo campox){
        return busq.obtenerTodos("FROM Lote WHERE campo = "+ Integer.toString(campox.getId())+
        " ORDER BY id");
    }
    
    public List lotesActivos(Campo campox){
        return busq.obtenerTodos("FROM Lote WHERE campo = "+ Integer.toString(campox.getId()) +
        " AND activo = true ORDER BY id");
    }
    
    public List lotesSinProyAct(Campo campox){
        return busq.obtenerTodos("FROM Lote WHERE activo = true AND campo = " + Integer.toString(campox.getId()) +
        "AND id NOT IN (SELECT lote FROM Proyecto WHERE"+
        " (estadoproyecto != 'Cancelado' AND estadoproyecto != 'Finalizado')) ORDER BY id");
    }
    
    public List lotesConProyAct(Campo campox){
        return busq.obtenerTodos("FROM Lote WHERE activo = true AND campo = " + campox.getId() +
        " AND id IN (SELECT lote FROM Proyecto WHERE estadoproyecto = 'Iniciado' ORDER BY id)");
    }
    
    public void nuevoLote(Lote lotex){
        busq.agregar(lotex);
    }
    
    public void actualizarLote(Lote lotex){
        busq.modificar(lotex);
    }
    
}
