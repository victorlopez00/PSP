package Ejercicios11_12.Ejercicio2;

import static java.lang.Thread.sleep;

public class HolaMundo implements Runnable {
    String hilo;
    String cadena;

    public HolaMundo() {

    }

    public HolaMundo(String hilo, String cadena) {
        this.hilo = hilo;
        this.cadena=cadena;
    }

    public String getHilo() {
        return this.hilo;
    }
    public String getCadena(){
        return this.cadena;
    }
    @Override
    public void run() {
        System.out.println(this.getHilo() + ":Hola Mundo "+this.getCadena());
        try{
            sleep(1000);
        }catch (InterruptedException e){

        }
    }
}
