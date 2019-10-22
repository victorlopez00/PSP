package CuentaBancaria_v1;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(20, 500);
        Persona p = new Persona("1",cuenta);

        p.start();

    }
}
