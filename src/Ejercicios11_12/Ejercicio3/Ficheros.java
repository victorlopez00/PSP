package Ejercicios11_12.Ejercicio3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


    public class Ficheros extends Thread{
        String fichero;

        public void setFichero(String fichero) {

            this.fichero = fichero;
        }

        public String getFichero() {
            return fichero;
        }

        public Ficheros(String fichero){
            this.fichero = fichero;
        }



        public int calcularcantidadCaracteres(){
            int contador = 0;
            File fichero = new File(".",getFichero());
            FileReader fic = null;
            try {
                fic = new FileReader(fichero);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            int i ;

            try {
                while (!((i=fic.read()) != -1)) {
                    System.out.print((char) i);
                    contador++;
                }
                fic.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return contador;
        }

        @Override
        public void run() {
            super.run();
            calcularcantidadCaracteres();
        }
    }