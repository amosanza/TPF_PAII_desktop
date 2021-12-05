package controlTPF;

import dbasTPF.DBACampo;
import modeloDatosTPF.Campo;

public class GestorCrearCampo {
    
    private DBACampo dba;

    public GestorCrearCampo() {
        this.dba = new DBACampo();
    }
    
    public void crearCampo(){
        Campo campox = new Campo();
        dba.agregarCampo(campox);
    }   
    
}
