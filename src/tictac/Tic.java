package tictac;

public class Tic extends Thread {
    public void run(){
        System.out.println("TIC");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
