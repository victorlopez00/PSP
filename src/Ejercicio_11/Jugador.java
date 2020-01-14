package Ejercicio_11;

public class Jugador extends Thread{
    int id;
    Arbitro arbitro;

    public Jugador(int id, Arbitro arbitro  ) {
    this.id=id;
    this.arbitro=arbitro;
    }
    public void run(){
        super.run();
    }
}
