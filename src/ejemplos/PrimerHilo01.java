package ejemplos;

public class PrimerHilo01 extends Thread {
    private int x;

    PrimerHilo01 (int x)
    {
        this.x=x;
    }

    public void run() {
        for (int i=0; i<x;i++)
            System.out.println("En el Hilo... "+i);
    }

    public static void main(String[] args) {
        PrimerHilo01 p = new PrimerHilo01 (10);
        p.start();
    }
}
