package examen2_carlosdiaz;

import java.io.Serializable;
import java.util.Date;

public class Mensaje implements Serializable{
    //Tendrán contenido, hora, fecha y si fue leído o no
    private String contenido;
    private Date horaEnviado;
    private Date fechaEnviado;
    private boolean leido;

    public Mensaje(String contenido, Date horaEnviado, Date fechaEnviado, boolean leido) {
        this.contenido = contenido;
        this.horaEnviado = horaEnviado;
        this.fechaEnviado = fechaEnviado;
        this.leido = leido;
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

    @Override
    public String toString() {
        return contenido;
    }
    
}
