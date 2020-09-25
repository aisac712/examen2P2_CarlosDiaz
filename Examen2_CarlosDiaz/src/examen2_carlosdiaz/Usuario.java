package examen2_carlosdiaz;

import java.util.ArrayList;

public class Usuario extends Persona{
    private String user;
    private String pw;
    private ArrayList<Chat> chats = new ArrayList();
    private ArrayList<Usuario> amigos = new ArrayList();
    private int wifi;                                                           //1 al 5
    
    private ArrayList<Usuario> solicitudes = new ArrayList();                   //ATRIBUTO AGREGADO

    public Usuario(String user, String pw, int wifi, String Nombre, String Apellido, int numTelefono) {
        super(Nombre, Apellido, numTelefono);
        this.user = user;
        this.pw = pw;
        this.wifi = wifi;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public ArrayList<Chat> getChats() {
        return chats;
    }

    public void setChats(ArrayList<Chat> chats) {
        this.chats = chats;
    }

    public ArrayList<Usuario> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuario> amigos) {
        this.amigos = amigos;
    }

    public int getWifi() {
        return wifi;
    }

    public void setWifi(int wifi) {
        this.wifi = wifi;
    }

    public ArrayList<Usuario> getSolicitudes() {
        return solicitudes;
    }

    public void setSolicitudes(ArrayList<Usuario> solicitudes) {
        this.solicitudes = solicitudes;
    }
    
    @Override
    public String toString() {
        return user + ": " + this.toString();
    }

    @Override
    public int enviarMensaje(int k) {
        System.out.println("enviar");
        return 0;
    }
    
    
}
