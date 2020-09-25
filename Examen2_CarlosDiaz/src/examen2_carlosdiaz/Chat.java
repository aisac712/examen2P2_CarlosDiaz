package examen2_carlosdiaz;

import java.io.Serializable;
import java.util.ArrayList;

public class Chat implements Serializable{
    private ArrayList<Mensaje> mensajes = new ArrayList();

    public Chat() {
    }

    public ArrayList<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(ArrayList<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
    
}