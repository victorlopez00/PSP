package Ejercicio_11;

public class Arbitro {
    int numero;
    int jugadores;
    boolean fin=false;
    int turno=0;


    public Arbitro(int jugadores){
        this.numero=1+(int) (10*Math.random());
        this.jugadores=jugadores;
        this.turno=this.turno+1;

    }

    public boolean isFin() {
        return fin;
    }

    public int getTurno() {
        return turno;
    }
    public void comprobarJugada(){

    }
}
