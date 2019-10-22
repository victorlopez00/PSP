package CuentaBancaria_v1;

public class Persona extends Thread {
    String nombre;
    Cuenta cuenta;

    public Persona(String nombre, Cuenta cuenta) {
        this.nombre = nombre;
        this.cuenta = cuenta;
    }
    @Override
    public void run(){
        super.run();
        for(int i =0; i<2; i++) {
            double reinte = Math.random() * 1000 + 1;
            cuenta.reintegro(reinte);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("La persona"+nombre + " ha retirado " + reinte);
            System.out.println("La persona"+nombre + " tiene este salario actual: " + cuenta.obtenerSaldo());

            double ingre = Math.random() * 1000 + 1;
            cuenta.ingreso(ingre);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("La persona" +nombre + " ha ingresado " + ingre);
            System.out.println("La persona"+nombre + " tiene este salario actual " + cuenta.obtenerSaldo());

        }
    }
}
