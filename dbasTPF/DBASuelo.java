package dbasTPF;

import java.util.List;
import persistenciaTPF.*;

public class DBASuelo {
    private InterfazDAO busq;

    public DBASuelo() {
        this.busq = new DAOhb();
    }
       
    public List suelosActuales(){
        return busq.obtenerTodos("FROM Suelo ORDER BY id");
    }
    
    public Object sueloXid(int i){
        String consulta = new String();
        consulta = String.valueOf(i);
        return busq.obtenerUno("FROM Suelo WHERE id = '" + consulta + "'");
    } 
    
}
