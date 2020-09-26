package examen2_carlosdiaz;

import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

public class hiloBarra extends Thread {
    private JProgressBar barra;
    private boolean avanzar;
    private boolean vive;
    private int limite;
    
    public hiloBarra(JProgressBar barra, int limite) {
        this.barra = barra;
        this.limite = limite;
        avanzar=true;
        vive=true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }
    @Override
    public void run(){
        int cont=1;
        while(vive){
            if(avanzar){
                barra.setValue(barra.getValue()+1);

                if(barra.getValue()==limite){
                    JOptionPane.showMessageDialog(null, "Se envió el mensaje");
                    barra.setValue(0);
                    vive=false;
                }
            } //FIN IF
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
}
