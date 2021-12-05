package tpfinal;

import modeloDatosTPF.HibernateUtil;
import vistasTPF.VentanaPrincipal;

public class TPFinal {

    public static void main(String[] args) {
        HibernateUtil.buildSessionFactory();
        VentanaPrincipal vent = new VentanaPrincipal();
    }
 
}
