package dbasTPF;

import java.util.List;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Proyecto;
import persistenciaTPF.*;

public class DBAProyecto {
    private InterfazDAO busq;

    public DBAProyecto() {
        this.busq = new DAOhb();
    }
    
    public void guardarProyecto(Proyecto pro){
        busq.agregar(pro);
    }
    
    public List proysXLote(Lote loteElegido){
        return busq.obtenerTodos("FROM Proyecto WHERE lote = "+ Integer.toString(loteElegido.getId())+" ORDER BY id");
    }
    
    public Proyecto proysIniciados(Lote loteElegido){
        return (Proyecto) busq.obtenerUno("FROM Proyecto WHERE estadoproyecto = 'Iniciado' AND"
        + " lote = "+ loteElegido.getId());
    }
    
    public void actualizarEstado(Proyecto pro){
        busq.modificar(pro);
    }
}
