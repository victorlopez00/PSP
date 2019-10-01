package ejemplos;

public class PrimerHiloR_06  implements Runnable {
    private int x;

    PrimerHiloR_06 (int x)
    {
        this.x=x;
    }

    public void run() {
        for (int i=0; i<x;i++)
            System.out.println("En el Hilo... "+i);
    }
}
