package EjercicioCuentaBancaria;

public class Cuenta {
    private  int saldo;
    private int valormax;
    public Cuenta (int saldo1, int vmax){
        saldo=saldo1;
        valormax=vmax;
    }
    public int getSaldo(){
        return this.saldo;
    }
    public synchronized void ingreso(int cantidad){
        if(this.saldo+cantidad>valormax){

            System.out.println("No puede ingresar más dinero ya que ha llegado al valor máximo");
        }else {


            this.saldo = saldo + cantidad;
        }

    }
    public synchronized void reintegro(int cantidad){
        if(this.saldo-cantidad<0){

            System.out.println("No puede retirar más dinero ya que sobrepasa el saldo");
        }else {
            this.saldo = saldo - cantidad;
        }

    }

}
