package Ejercicios11_12.Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> ficheros = new ArrayList<String>();
        ficheros.add("fichero1");
        ficheros.add("fichero2");

        for(int i = 0; i<ficheros.size(); i++){
            Ficheros hilo = new Ficheros(ficheros.get(i));
            hilo.start();
        }
    }
}