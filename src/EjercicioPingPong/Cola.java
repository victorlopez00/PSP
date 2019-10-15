package EjercicioPingPong;

public class Cola {

    private boolean disponible= false;

    public synchronized String dPong(){
        while(!disponible){
            try{
                wait();
            }catch(InterruptedException e){

            }

        }
        disponible = false;
        notify();

        return "Pong";
    }
    public synchronized String dPing(){
        while(disponible){
            try{
                wait();
            }catch(InterruptedException e){
            }

        }
        disponible = true;
        notify();

        return "Ping";

    }

}
