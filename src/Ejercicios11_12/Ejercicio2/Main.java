package Ejercicios11_12.Ejercicio2;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            HolaMundo hilo1 = new HolaMundo(String.valueOf(i), "mensaje" + i);
            Thread thread = new Thread(hilo1);
            thread.start();
        }
    }
}
