package examen2_carlosdiaz;

import java.io.Serializable;

public abstract class Persona implements Serializable{
    private String Nombre;
    private String Apellido;
    private int numTelefono;

    public Persona(String Nombre, String Apellido, int numTelefono) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.numTelefono = numTelefono;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return Nombre + " " + Apellido;
    }
    
    public abstract int enviarMensaje(int k);
}
