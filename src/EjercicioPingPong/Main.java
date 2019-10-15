package EjercicioPingPong;

public class Main {
    public static void main(String[] args){
        Cola cola = new Cola();
        Ping ping = new Ping(cola);
        Pong pong = new Pong(cola);

        ping.start();
        pong.start();

    }
}
