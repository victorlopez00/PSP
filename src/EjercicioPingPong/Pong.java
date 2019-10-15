package EjercicioPingPong;

public class Pong extends Thread{
    private Cola cola;

    public Pong(Cola cola){
        this.cola = cola;
    }
    public void run(){
        String valor = "";
        while(true){
            valor = cola.decirPing();
            System.out.println(valor);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
