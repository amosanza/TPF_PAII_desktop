package dbasTPF;

import java.util.List;
import modeloDatosTPF.Cultivo;
import modeloDatosTPF.Proyecto;
import modeloDatosTPF.Suelo;
import persistenciaTPF.*;

public class DBACultivo {
    private InterfazDAO busq;

    public DBACultivo() {
        this.busq = new DAOhb();
    }
       
    public List cultivosActuales(){
        return busq.obtenerTodos("FROM Cultivo ORDER BY id");
    }
    
    public List cultivosXSuelo(Suelo suelox){
        String consulta = new String();
        consulta = String.valueOf(suelox.getId());
        return busq.obtenerTodos("FROM Cultivo WHERE suelo ='" + consulta + "' ORDER BY id");
    }
    
    public Cultivo cultivoXProy(Proyecto proy){
        return (Cultivo) busq.obtenerUno("FROM Cultivo WHERE id IN "
        + "(SELECT cultivo FROM Proyecto WHERE id = " + String.valueOf(proy.getId())+")");
    }
}
