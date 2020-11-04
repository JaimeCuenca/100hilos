import java.util.ArrayList;

public class Principal {

    ArrayList<ArrayList> hilos = new ArrayList<ArrayList>();
    final int NumHilos=3;
    final int NumIt=6;

    public void principal() {

        for (int j=0; j<NumHilos; j++) {
            hilo h = new hilo(j, this);
            h.setName("Hilo " + j);
            h.start();
        }
    }

    public ArrayList<ArrayList<Integer>> buscarArray(int num){
        ArrayList<ArrayList<Integer>> lista = new ArrayList();
        for(ArrayList<Integer> i : hilos){
            if(i.get(0)==num){
                lista.add(i);
            }
        }

        return lista;
    }

    public void hiloAcabado(ArrayList lista) {
        hilos.add(lista);
    }

    public void iteraciones(int i){
        if (buscarArray(i).size() == NumHilos) {
            System.out.println("ITERACION "+i);
            for( ArrayList<Integer> j : buscarArray(i)){
                System.out.println("El Hilo "+ j.get(1) + " ha dormido por "+ j.get(2)+ " milisegundos");
            }
            System.out.println("--------------*-------------\n");
        }
    }
}
