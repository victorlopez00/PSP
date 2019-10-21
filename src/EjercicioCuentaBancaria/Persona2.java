package EjercicioCuentaBancaria;

public class Persona2 extends Thread{
    Cuenta cuenta;
    String nombre;
    String movimiento;
    public Persona2(Cuenta cuenta, String nombre, String movimiento){
        this.cuenta=cuenta;
        this.nombre=nombre;
        this.movimiento=movimiento;
    }
    @Override
    public void run(){
        super.run();
        for (int i=0;i<2;i++){
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

            }else {
                int cantidad = (int) (Math.random()*200)+1;
                cuenta.reintegro(cantidad);
                try {
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("La persona"+nombre+" ha sacado "+cantidad);
                System.out.println("El salario actual de "+nombre+" es de "+cuenta.getSaldo());
            }
            }
        }
    }


