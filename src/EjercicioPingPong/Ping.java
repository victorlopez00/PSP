package EjercicioPingPong;

public class Ping extends Thread{
    private Cola cola;
    int contador = 0;
    public Ping(Cola cola){
        this.cola = cola;
    }

    @Override
    public void run() {
        super.run();
        String valor="";
        while(true){
            valor =cola.decirPong();
            System.out.println(valor);
            contador++;
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


