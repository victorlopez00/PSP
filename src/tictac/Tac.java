package tictac;

public class Tac extends Thread{
    public void run() {
        super.run();
        System.out.println("TAC");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
