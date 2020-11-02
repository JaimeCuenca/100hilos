
public class hilo extends Thread {

    public int id=0;
    public callback ppal;

    public hilo(int id, callback ppal){
        this.id=id;
        this.ppal=ppal;
    }

    public void run() {
        try{
            long dormir = (long) Math.floor(Math.random() * (8000 - 1000 + 1) + 1000);
            sleep(dormir);
            System.out.println(id+" "+dormir);
            ppal.hilos.add(id);
            ppal.hilos.add((int) dormir);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
