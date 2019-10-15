package EjemploProductor_Consumidor;

public class Produc_Consum {
    public static void main (String[] args){
        Cola cola= new Cola();
        Productor p = new Productor(cola,1);
        Consumidor c = new Consumidor (cola,1);
        Productor p1= new Productor(cola,2);
        Consumidor c1 = new Consumidor(cola,2);
        p.start();
        c.start();
        p1.start();
        c1.start();
    }
}
