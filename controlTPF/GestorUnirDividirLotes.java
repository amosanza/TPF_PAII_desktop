package controlTPF;

import dbasTPF.DBALote;
import java.util.ArrayList;
import java.util.List;
import modeloDatosTPF.Campo;
import modeloDatosTPF.Lote;
import modeloDatosTPF.Suelo;

public class GestorUnirDividirLotes {
    GestorCrearLote gest;
    private Campo campoElegido;//objeto campo que fue seleccionado previamente como campo a trabajar en el sistema
    private List <Lote> lotes;
    private List <Lote> lotesElegidos;

    public GestorUnirDividirLotes(Campo campoElegido) {
        this.campoElegido = campoElegido;
        this.gest = new GestorCrearLote();
        this.gest.setCampoElegido(campoElegido);
        this.lotes = new ArrayList();
        this.lotesElegidos = new ArrayList();
    }
        
    public Campo getCampoElegido() {
        return campoElegido;
    }

    public void setCampoElegido(Campo campoElegido) {
        this.campoElegido = campoElegido;
    }
    
    public List<Lote> getLotes() {
        return lotes;
    }
    
    public void setLotes() {//son los lotes del campo que no tienen un proyecto activo
        DBALote dba = new DBALote();
        this.lotes = dba.lotesSinProyAct(this.campoElegido);
    }

    public List<Lote> getLotesElegidos() {
        return lotesElegidos;
    }

//*******************************DIVIDIR LOTE*******************************    

    public void dividirLote(int idLoteElegido, int cantidad){
        DBALote dba = new DBALote();
        Lote loteElegido = new Lote();
        for(Lote l:this.lotes){
            if(l.equals(idLoteElegido)){
                loteElegido = l;
            }
        }
        float nuevaSup = loteElegido.getSuperficie()/cantidad;//divide la superficie del lote en las cantidades elegidas
        loteElegido.setActivo(false);//cambia el estado del lote elegido, inhabilitandolo
        dba.actualizarLote(loteElegido);
        for(int j=0;j<cantidad;j++){//crea la cantidad de lotes que se haya elegido
            gest.setSueloElegido(loteElegido.getSuelo());
            gest.setSuperficie(nuevaSup);
            gest.crearLote();
        }
        
    }

//*******************************UNIR LOTES*******************************    
    
    public void armarListaElegida(List<String> idElegidos){//arma la lista que luego sera usada para actualizar la base de datos
        for(Lote l: this.lotes){
            for(int i=0;i<idElegidos.size();i++){
                if(l.getId()==Integer.parseInt(idElegidos.get(i))){
                    this.lotesElegidos.add(l);
                    break;
                }
            }
        }
    }
    public boolean controlarSuelo(){//se controla que la lista armada tenga los mismos tipos de suelo
        boolean band = true;
        Lote comparacion = this.lotesElegidos.get(0);//se toma el primer lote como base de comparacion
        for(Lote l:this.lotesElegidos){
            if(!comparacion.getSuelo().equals(l.getSuelo())){
                band = false;
            }
        }
        if(!band){//si no tiene los mismos tipos de suelo, se reinicia la lista
            this.lotesElegidos.clear();
        }
        return band;
    }
    
    public void unirLotes(){
        DBALote dba = new DBALote();
        float superficie = 0;
        Suelo suelox = this.lotesElegidos.get(0).getSuelo();
        for(Lote l: this.lotesElegidos){
            l.setActivo(false);
            superficie += l.getSuperficie();
            dba.actualizarLote(l);
        }
        dba.nuevoLote(this.campoElegido.crearLoteYRetornar(suelox, superficie));
    }
    
    public void reiniciarListaArmada(){
        this.lotesElegidos.clear();
    }
}
