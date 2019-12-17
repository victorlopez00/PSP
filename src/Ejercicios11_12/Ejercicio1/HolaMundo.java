package Ejercicios11_12.Ejercicio1;

public class HolaMundo extends Thread {
    String hilo;

    public HolaMundo() {

    }

    public HolaMundo(String hilo) {
        this.hilo = hilo;
    }

    public String getHilo() {
        return this.hilo;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.getHilo() + ":Hola Mundo");
    }

}
