package examen2_carlosdiaz;

import java.io.Serializable;
import java.util.ArrayList;

public class cGrupo extends Chat implements Serializable{
    //Tendrán un nombre, una lista de miembros, un administrador y una lista de mensajes
    private String Nombre;
    private ArrayList<Usuario> Miembros = new ArrayList();
    //private ArrayList<Mensaje> listaMensajes = new ArrayList();               clase con herencia, esto es innecesario

    public cGrupo(String Nombre) {
        super();
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Usuario> getMiembros() {
        return Miembros;
    }

    public void setMiembros(ArrayList<Usuario> Miembros) {
        this.Miembros = Miembros;
    }
    
    @Override
    public String toString() {
        return Nombre;
    }
    
}
