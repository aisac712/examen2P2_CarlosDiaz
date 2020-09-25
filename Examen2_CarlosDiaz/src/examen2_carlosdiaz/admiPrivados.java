package examen2_carlosdiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admiPrivados {
    private ArrayList<cPrivado> listaChatsPrivs = new ArrayList();
    private File archivo = null;
    
    public admiPrivados(String path) {
        archivo = new File(path);
    }

    public ArrayList<cPrivado> getListaChatsPrivs() {
        return listaChatsPrivs;
    }

    public void setListaChatsPriv(ArrayList<cPrivado> listaChatsPrivs) {
        this.listaChatsPrivs = listaChatsPrivs;
    }
    //mumtador extra
    public void setChat(cPrivado c){
        this.listaChatsPrivs.add(c);
    }
    
    public void cargarArchivo() {
        try {            
            listaChatsPrivs = new ArrayList();
            cPrivado temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (cPrivado) objeto.readObject()) != null) {
                        listaChatsPrivs.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            } //fin if           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (cPrivado t : listaChatsPrivs) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        }
    }
}
