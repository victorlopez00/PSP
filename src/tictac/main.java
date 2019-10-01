package tictac;

public class main {

        public static void main(String[] args) {
            Tic tic = new Tic();
            Tac tac = new Tac();
            while(true){
                tic.run();
                tac.run();
            }
        }
    }

