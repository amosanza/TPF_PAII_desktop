package controlTPF;

import modeloDatosTPF.Suelo;
import modeloDatosTPF.Campo;
import dbasTPF.DBALote;
import dbasTPF.DBAMineral;
import dbasTPF.DBAPorcentaje;
import java.util.List;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Mineral;
import modeloDatosTPF.Porcentaje;

public class GestorCrearLote {
    private Campo campoElegido;//objeto campo que proviene de seleccionar el campo a trabajar
    private float superficie;
    private Suelo sueloElegido;
    private GestorAsignarTipoSuelo gestorSuelo;
    private List<Porcentaje> porcent;

    public GestorCrearLote() {
        this.gestorSuelo = new GestorAsignarTipoSuelo();
        this.gestorSuelo.setSuelos();//lista de suelos actuales en el sistema
    }

    public float getSuperficie() {
        return superficie;
    }

    public void setSuperficie(float superficie) {
        this.superficie = superficie;
    }

    public GestorAsignarTipoSuelo getGestorSuelo() {
        return gestorSuelo;
    }
    
    public Campo getCampoElegido() {
        return campoElegido;
    }

    public void setCampoElegido(Campo campoElegido) {
        this.campoElegido = campoElegido;
    }
  
    public Suelo getSueloElegido() {
        return sueloElegido;
    }

    public void setSueloElegido(Suelo suelo) {
        this.sueloElegido = suelo;
    }
    
    public void elegirSuelo (String i){//se busca el suelo elegido y luego se lo asigna
        gestorSuelo.setElegido(Integer.parseInt(i));
        this.sueloElegido = gestorSuelo.getElegido();
    } 
    
    public void crearLote(){//se crea un lote con los valores obtenidos y luego se actualiza en la base de datos
        Lote lotex = new Lote();
        DBALote dba = new DBALote();
        lotex = this.campoElegido.crearLoteYRetornar(this.sueloElegido, this.superficie);
        dba.nuevoLote(lotex);
    }
    
    public List <Porcentaje> devolverPorcentaje(){
        DBAPorcentaje dba = new DBAPorcentaje();
        return dba.busquedaXSuelo(this.sueloElegido);
    }
    
    public Mineral devolverMineral(Porcentaje porc){
        DBAMineral dba = new DBAMineral();
        return dba.busquedaXPorcentaje(porc);
    }
        
    public String controlCarga(String txt){
        String resp = null;
        float valor;
        try {
            valor = Float.parseFloat(txt);
            if(valor<=0 || valor>1000){//en base al censo de campos se determinó que la superficie promedio es de 627 ha
                resp = "Número fuera del rango de valores admitidos (Entre 0 y 1000 ha)";
            }else{
                setSuperficie(valor);
            }
        } 
        catch (NumberFormatException error){
            resp = "Debe escribir un formato de número válido";
        }
        return resp;
    }
}
