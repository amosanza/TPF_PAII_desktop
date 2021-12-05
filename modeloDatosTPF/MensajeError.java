package modeloDatosTPF;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class MensajeError {
    private int tit;
    private int msj;
    private String titulo;
    private String mensaje;

    public MensajeError(int tit, int msj) {
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
                this.titulo = "Error en la carga";
                break;
            case 2:
                this.titulo = "Error en la unión";
                break;
        }
        
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje() {
        switch(this.msj){
            case 1:
                this.mensaje = "Debe escribir un formato de número válido";
                break;
            case 2:
                this.mensaje = "Número fuera del rango de valores admitidos (Entre 0 y 1000 ha)";
                break;
            case 3:
                this.mensaje = "Los lotes a unir deben tener el mismo tipo de suelo";
                break;
        }
    }
    
    public void mostrarVentanaError(JFrame vent){
        setTitulo();
        setMensaje();
        JOptionPane.showMessageDialog(vent, this.mensaje, this.titulo, JOptionPane.ERROR_MESSAGE);
    }
    
}
