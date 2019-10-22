package CajeraSupermercado;

public class main {
    public static void main (String[] args){
        Contador cont= new Contador(100);
        Cajera1 c1 = new Cajera1("Cajera 1",cont);
        Cajera2 c2 = new Cajera2(" Cajera 2",cont);
        c1.start();
        c2.start();
    }
}
