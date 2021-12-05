package dbasTPF;

import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Campo;
import persistenciaTPF.*;

public class DBACampo {
    private String estadoCampo;
    private InterfazDAO busq;

    public DBACampo() {//El string que recibe es el estado del campo, si es que tiene
        this.estadoCampo = new String();          
        busq = new DAOhb();
    }

    public String getEstadoCampo() {
        return estadoCampo;
    }

    public void setEstadoCampo(String estadoCampo) {
        this.estadoCampo = estadoCampo;
    }
    
    public List<Campo> busquedaTotal(){
        List <Campo> campos = new ArrayList();
        campos = busq.obtenerTodos("FROM Campo ORDER BY id");
        return campos;
    } 
       
    public List <Campo> busquedaXEstado(){
        List <Campo> campos = new ArrayList();
        String hql = new String(); 
        hql = ("FROM Campo WHERE estadocampo = '" + this.estadoCampo + "' ORDER BY id");
        campos = busq.obtenerTodos(hql);
        return campos;
    }
    
    public void agregarCampo(Campo campox){
        busq.agregar(campox);
    }
    
    public void actualizarCampo(Campo campox){
        busq.modificar(campox);
    }
    
    public List<Campo> busquedaNoDesuso(){
        List <Campo> campos = new ArrayList();
        campos = busq.obtenerTodos("FROM Campo WHERE estadocampo != 'En desuso' ORDER BY id");
        return campos;
    } 
}
