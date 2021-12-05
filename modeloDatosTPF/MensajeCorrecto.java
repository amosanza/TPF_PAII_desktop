package modeloDatosTPF;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MensajeCorrecto {
    
    private int tit;
    private int msj;
    private String titulo;
    private String mensaje;

    public MensajeCorrecto(int tit, int msj) {
        this.tit = tit;
        this.msj = msj;
        this.titulo = new String();
        this.mensaje = new String();
    }
    
        public String getTitulo() {
        return titulo;
    }

    public void setTitulo() {
        switch(this.tit){
            case 1:
                this.titulo = "Carga finalizada";
                break;
            case 2:
                this.titulo = "División finalizada";
                break;
            case 3:
                this.titulo = "Unión finalizada";
                break;
            case 4:
                this.titulo = "Estado campo";
                break;
        }
        
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje() {
        switch(this.msj){
            case 1:
                this.mensaje = "El lote ha sido creado correctamente";
                break;
            case 2:
                this.mensaje = "El lote ha sido dividido correctamente";
                break;
            case 3:
                this.mensaje = "Los lotes han sido unidos correctamente";
                break;
            case 4:
                this.mensaje = "Se ha avanzado a la siguiente etapa correctamente";
                break;
            case 5:
                this.mensaje = "Se ha reiniciado la etapa de siembra";
                break;
            case 6:
                this.mensaje = "Se ha cancelado el proyecto correctamente";
                break;
            case 7:
                this.mensaje = "El proyecto ha sido finalizado";
                break;
            case 8:
                this.mensaje = "El campo se ha puesto en desuso";
                break;
        }
    }
    
    public void mostrarVentanaCorrecto(JFrame vent){
        setTitulo();
        setMensaje();
        JOptionPane.showMessageDialog(vent, this.mensaje, this.titulo, JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
