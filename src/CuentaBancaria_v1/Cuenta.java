package CuentaBancaria_v1;

public class Cuenta {
    double saldo;
    int valorMaximo;



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setValorMaximo(int valorMaximo) {
        this.valorMaximo = valorMaximo;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getValorMaximo() {
        return valorMaximo;
    }


    public  Cuenta(int saldo, int valorMaximo){
        this.saldo = saldo;
        this.valorMaximo = valorMaximo;
    }

    public synchronized double obtenerSaldo(){
        return this.saldo;
    }
    public synchronized void ingreso(double ingreso){
        if(ingreso+saldo > valorMaximo){
            System.out.println("No se puede ingresar esa cantidad, ya que supera el valor maximo");
        }else {
            this.saldo = saldo + ingreso;
            }
        }
    public synchronized void reintegro(double reintegro){
        if((saldo-reintegro) < 0){
            System.out.println("No se puede retirar esa cantidad de dinero ya que no hay saldo suficiente");
        }else {
            this.saldo = saldo - reintegro;
        }
    }
}
