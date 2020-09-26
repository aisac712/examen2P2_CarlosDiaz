package examen2_carlosdiaz;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class admiGrupo {
    private ArrayList<cGrupo> listaGrupos = new ArrayList();
    private File archivo = null;
    
    public admiGrupo(String path) {
        archivo = new File(path);
    }

    public ArrayList<cGrupo> getListaGrupos() {
        return listaGrupos;
    }

    public void setListaGrupos(ArrayList<cGrupo> listaGrupos) {
        this.listaGrupos = listaGrupos;
    }
    //mutador extra
    public void setGrupo(cGrupo g){
        this.listaGrupos.add(g);
    }
    public void cargarArchivo() {
        try {            
            listaGrupos = new ArrayList();
            cGrupo temp;
            if (archivo.exists()) {
                  FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (cGrupo) objeto.readObject()) != null) {
                        listaGrupos.add(temp);
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
            for (cGrupo t : listaGrupos) {
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
