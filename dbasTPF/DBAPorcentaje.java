package dbasTPF;

import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Porcentaje;
import modeloDatosTPF.Suelo;
import persistenciaTPF.*;

public class DBAPorcentaje {
    private InterfazDAO busq;

    public DBAPorcentaje() {
        this.busq = new DAOhb();
    }
    
    public List<Porcentaje> busquedaXSuelo(Suelo sue){
        List <Porcentaje> porc = new ArrayList();
        porc = busq.obtenerTodos("FROM Porcentaje WHERE suelo = "+sue.getId()+ " ORDER BY id");
        return porc;
    } 
    
}
