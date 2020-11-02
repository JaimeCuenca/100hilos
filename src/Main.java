import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        boolean it1 = false, it2 = false, it3 = false, it4 = false, it5 = false;

        callback ppal = null;

        hilo hilo1 = new hilo(1, ppal);
        hilo hilo2 = new hilo(2, ppal);
        hilo hilo3 = new hilo(3, ppal);
        hilo hilo4 = new hilo(4, ppal);
        hilo hilo5 = new hilo(5, ppal);

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();


        do {
            if (it1 == false && ppal.hilos.size()>=5) {
                System.out.println("ITERACION 1:");
                for (int j = 0; j <= 4; j+=2) {
                    System.out.println("El Hilo "+ppal.hilos.get(j)+" ha dormido por "+ppal.hilos.get(j+1)+" milisegundos");
                }
                it1 = true;
            }
            if (it2 == false && ppal.hilos.size()>=10) {
                System.out.println("ITERACION 2:");
                for (int j = 5; j <= 9; j+=2) {
                    System.out.println("El Hilo "+ppal.hilos.get(j)+" ha dormido por "+ppal.hilos.get(j+1)+" milisegundos");
                }
                it2 = true;
            }
            if (it3 == false && ppal.hilos.size()>=15) {
                System.out.println("ITERACION 3:");
                for (int j = 10; j <= 14; j+=2) {
                    System.out.println("El Hilo "+ppal.hilos.get(j)+" ha dormido por "+ppal.hilos.get(j+1)+" milisegundos");
                }
                it3 = true;
            }
            if (it4 == false && ppal.hilos.size()>=20) {
                System.out.println("ITERACION 4:");
                for (int j = 15; j <= 19; j+=2) {
                    System.out.println("El Hilo "+ppal.hilos.get(j)+" ha dormido por "+ppal.hilos.get(j+1)+" milisegundos");
                }
                it4 = true;
            }
            if (it5 == false && ppal.hilos.size()==25) {
                System.out.println("ITERACION 5:");
                for (int j = 20; j <= 24; j+=2) {
                    System.out.println("El Hilo "+ppal.hilos.get(j)+" ha dormido por "+ppal.hilos.get(j+1)+" milisegundos");
                }
                it5 = true;
            }
        }while(!it1 || !it2 || !it3 || !it4 || !it5);
    }
}
