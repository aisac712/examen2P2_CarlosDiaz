package examen2_carlosdiaz;

import java.util.ArrayList;

public class cGrupo extends Chat{
    //Tendrán un nombre, una lista de miembros, un administrador y una lista de mensajes
    private String Nombre;
    private ArrayList<Usuario> Miembros = new ArrayList();
    //private ArrayList<Mensaje> listaMensajes = new ArrayList();               clase con herencia, esto es innecesario

    public cGrupo(String Nombre) {
        super();
        this.Nombre = Nombre;
    }
    
}
