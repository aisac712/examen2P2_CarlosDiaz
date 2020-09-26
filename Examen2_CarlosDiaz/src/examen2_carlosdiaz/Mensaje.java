package examen2_carlosdiaz;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable{
    //Tendrán contenido, hora, fecha y si fue leído o no
    private String contenido;
    private Date horaEnviado;
    private Date fechaEnviado;
    private boolean leido;
    
    private Usuario enviadoPor;

    /*public Mensaje(String contenido, Date horaEnviado, Date fechaEnviado, boolean leido) {
        this.contenido = contenido;
        this.horaEnviado = horaEnviado;
        this.fechaEnviado = fechaEnviado;
        this.leido = leido;
    }*/

    public Mensaje(String contenido, Date horaEnviado, Date fechaEnviado, boolean leido, Usuario enviadoPor) {
        this.contenido = contenido;
        this.horaEnviado = horaEnviado;
        this.fechaEnviado = fechaEnviado;
        this.leido = leido;
        this.enviadoPor = enviadoPor;
    }
    
    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public Date getHoraEnviado() {
        return horaEnviado;
    }

    public void setHoraEnviado(Date horaEnviado) {
        this.horaEnviado = horaEnviado;
    }

    public Date getFechaEnviado() {
        return fechaEnviado;
    }

    public void setFechaEnviado(Date fechaEnviado) {
        this.fechaEnviado = fechaEnviado;
    }

    public boolean isLeido() {
        return leido;
    }

    public void setLeido(boolean leido) {
        this.leido = leido;
    }

    public Usuario getEnviadoPor() {
        return enviadoPor;
    }

    public void setEnviadoPor(Usuario enviadoPor) {
        this.enviadoPor = enviadoPor;
    }
    
    @Override
    public String toString() {
        return contenido;
    }
    
}
