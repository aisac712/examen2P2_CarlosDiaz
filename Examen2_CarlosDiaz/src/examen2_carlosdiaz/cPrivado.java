package examen2_carlosdiaz;

import java.io.Serializable;

public class cPrivado extends Chat implements Serializable{
    //Tendrán una lista de mensajes y un usuario al cual se le escribe.
    private Usuario userAEscribir;
    private Usuario userEscribe;                                                //MUTADOR EXTRA
    //private ArrayList<Mensaje> listaMensajes = new ArrayList();               clase con herencia, esto es innecesario

    public cPrivado(Usuario userAEscribir, Usuario userEscribe) {
        this.userAEscribir = userAEscribir;
        this.userEscribe = userEscribe;
    }

    public Usuario getUserAEscribir() {
        return userAEscribir;
    }

    public void setUserAEscribir(Usuario userAEscribir) {
        this.userAEscribir = userAEscribir;
    }

    public Usuario getUserEscribe() {
        return userEscribe;
    }

    public void setUserEscribe(Usuario userEscribe) {
        this.userEscribe = userEscribe;
    }
    
}
