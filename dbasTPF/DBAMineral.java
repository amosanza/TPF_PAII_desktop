package dbasTPF;

import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Mineral;
import modeloDatosTPF.Porcentaje;
import modeloDatosTPF.Suelo;
import persistenciaTPF.*;

public class DBAMineral {
    private InterfazDAO busq;

    public DBAMineral() {
        this.busq = new DAOhb();
    }
    
    public Mineral busquedaXPorcentaje(Porcentaje porc){
        Mineral encontrado = new Mineral();
        encontrado = (Mineral) busq.obtenerUno("FROM Mineral WHERE id IN (SELECT mineral FROM Porcentaje WHERE id = "+ porc.getId()+")");
        return encontrado;
    }
    
}
