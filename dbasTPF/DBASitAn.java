package dbasTPF;

import java.util.List;
import modeloDatosTPF.Proyecto;
import modeloDatosTPF.Situacionanormal;
import persistenciaTPF.DAOhb;
import persistenciaTPF.InterfazDAO;


public class DBASitAn {
    
    private InterfazDAO busq;

    public DBASitAn() {
        this.busq = new DAOhb();
    }
    
    public Situacionanormal sitanXProy(Proyecto proy){
        return (Situacionanormal) this.busq.obtenerUno("FROM Situacionanormal WHERE id IN "
        + "(SELECT situacionanormal FROM Proyecto WHERE id = " + String.valueOf(proy.getId())+")");
    }
    
    public List sitanTotal(){
        return this.busq.obtenerTodos("FROM Situacionanormal ORDER BY id");
    }
}
