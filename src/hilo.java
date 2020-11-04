import java.util.ArrayList;

public class hilo extends Thread {

    public int id=0, it=0;
    public Principal ppal;

    public hilo(int id, Principal ppal){
        this.id=id;
        this.ppal=ppal;
    }

    public void run() {
        try {
            for(int i=1; i<=ppal.NumIt; i++) {
                this.it=i;
                ArrayList<Integer> lista = new ArrayList<Integer>();
                long dormir = (long) Math.floor(Math.random() * (8000 - 1000 + 1) + 1000);
                sleep(dormir);
                lista.add(it);
                lista.add(id);
                lista.add((int) dormir);
                ppal.hiloAcabado(lista);
                ppal.iteraciones(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
