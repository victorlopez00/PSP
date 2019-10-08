package EjemploProductor_Consumidor;

public class Cola {
    private int numero;
    private boolean disponible = false; //inicialmente cola vacia


    public int get() {
        if (disponible) {//hay numero en cola
        disponible=false; //se pone la cola vacia
        return numero; // se devuelve

        }
        return -1; //no hay numero, cola vacia

    }
    public void put(int valor){
        numero=valor; //se coloca el valor en la cola
        disponible=true; //disponible para consumir, cola llena
    }
}