package controlTPF;

import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Suelo;
import dbasTPF.DBASuelo;


public class GestorAsignarTipoSuelo {
    private List <Suelo> suelos;
    private Suelo elegido;
    private DBASuelo busq;


    public GestorAsignarTipoSuelo() {
        this.suelos = new ArrayList();
        this.elegido = new Suelo();
        this.busq = new DBASuelo();
    }

    public List<Suelo> getSuelos() {
        return suelos;
    }

    public void setSuelos() {
        this.suelos = busq.suelosActuales();
    }

    public Suelo getElegido() {
        return elegido;
    }

    public void setElegido(int i) {
        for(Suelo s:suelos){
            if(s.getId()==i){
                this.elegido = s;
            }
        }
    }


    
}
