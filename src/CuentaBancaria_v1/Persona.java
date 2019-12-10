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
            double reintegrar = Math.random() * 200 + 1;
            cuenta.reintegro(reintegrar);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


            System.out.println("La persona"+nombre + " ha retirado " + reintegrar);
            System.out.println("La persona"+nombre + " tiene este salario actual: " + cuenta.obtenerSaldo());

            double ingresar = Math.random() * 200 + 1;
            cuenta.ingreso(ingresar);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("La persona" +nombre + " ha ingresado " + ingresar);
            System.out.println("La persona"+nombre + " tiene este salario actual " + cuenta.obtenerSaldo());

        }
    }
}
