package CajeraSupermercado;

public class Cajera2 extends Thread{
    private Contador contador;
    public Cajera2(String n, Contador c){
        setName(n);
        contador=c;
    }
    public void run() {
        synchronized (contador) {
            for (int j = 0; j < 300; j++) {
                contador.decrementa(); //decrementa


            }
            System.out.println(getName() + " contador vale " + contador.valor());
        }
    }
}



