package dbasTPF;

import java.util.List;
import modeloDatosTPF.Detalleproyecto;
import modeloDatosTPF.Proyecto;
import persistenciaTPF.DAOhb;
import persistenciaTPF.InterfazDAO;


public class DBADetPro {
    
    private InterfazDAO busq;

    public DBADetPro() {
        this.busq = new DAOhb();
    }
    
    public void agregarDetPro(Detalleproyecto detPro){
        this.busq.agregar(detPro);
    }
    
    public Detalleproyecto detProActual(Proyecto proyActual){
        return (Detalleproyecto) this.busq.obtenerUno("FROM Detalleproyecto WHERE proyecto = "+proyActual.getId()
        + " AND fechafin = null");
    }
    
    public void actualizar (Detalleproyecto detPro){
        this.busq.modificar(detPro);
    }
    
    public List detPros(Proyecto proyElegido){
        return this.busq.obtenerTodos("FROM Detalleproyecto WHERE proyecto = "+ proyElegido.getId()+" ORDER BY id");
    }
 
}
