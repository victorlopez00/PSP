package CajeraSupermercado;

public class Cajera1 extends Thread{
    private Contador contador;
    public Cajera1(String n, Contador c){
        setName(n);
        contador=c;
    }
    public void run() {
        synchronized (contador) {
            for (int j = 0; j < 300; j++) {
                contador.incrementa(); //incrementa

            }
            System.out.println(getName() + " contador vale " + contador.valor());
        }
    }
}
