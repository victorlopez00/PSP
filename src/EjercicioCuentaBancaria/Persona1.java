package EjercicioCuentaBancaria;

public class Persona1 extends Thread {
    Cuenta cuenta;
    String nombre;
    String movimiento;

    public Persona1(Cuenta cuenta, String nombre, String movimiento) {
        this.cuenta = cuenta;
        this.nombre = nombre;
        this.movimiento=movimiento;

    }

    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 2; i++) {
            if (movimiento.equalsIgnoreCase("ingreso")) {
                int cantidad = (int) (Math.random()*200)+1;
                cuenta.ingreso(cantidad);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("La persona"+nombre+" ha ingresado "+cantidad);
                System.out.println("El salario actual de "+nombre+" es de "+cuenta.getSaldo());

            } else {
                int cantidad1= (int) (Math.random()*200)+1;
                cuenta.reintegro(cantidad1);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("La persona"+nombre+" ha sacado "+cantidad1);
                System.out.println("El salario actual de "+nombre+" es de "+cuenta.getSaldo());
            }

        }
    }
}
