package EjercicioPingPong;

public class Cola {
    private boolean disponible= false;

    public synchronized String decirPing(){
        while(!disponible){
            try{
                wait();
            }catch(InterruptedException e){

            }

        }
        disponible = false;
        notify();
        return "Ping";
    }
    public synchronized String decirPong(){
        while(disponible){
            try{
                wait();
            }catch(InterruptedException e){
            }

        }
        disponible = true;
        notify();
        return "Pong";
    }

}
