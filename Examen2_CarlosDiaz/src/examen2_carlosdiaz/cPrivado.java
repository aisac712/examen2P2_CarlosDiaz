package examen2_carlosdiaz;

public class cPrivado extends Chat{
    //Tendrán una lista de mensajes y un usuario al cual se le escribe.
    private Usuario userAEscribir;
    //private ArrayList<Mensaje> listaMensajes = new ArrayList();               clase con herencia, esto es innecesario

    public cPrivado(Usuario userAEscribir) {
        super();
        this.userAEscribir = userAEscribir;
    }

    public Usuario getUserAEscribir() {
        return userAEscribir;
    }

    public void setUserAEscribir(Usuario userAEscribir) {
        this.userAEscribir = userAEscribir;
    }
    
}
