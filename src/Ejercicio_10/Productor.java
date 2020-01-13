package Ejercicio_10;

import EjemplosHilos.Productor_Consumidor_1.Cola;

import java.io.*;

public class Productor extends Thread {
    private Cola cola;
    private int n;
    File file;
    FileReader leer = new FileReader(file);

    public Productor(Cola c, int n, File file) {
        cola = c;
        this.n = n;
        this.file=file;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            cola.put(i); //pone el n�mero
            System.out.println(i + "=>Productor : " + n
                    + ", produce: " + i);

            try {
                sleep(100);
            } catch (InterruptedException e) { }

        }
    }
}
