package EjercicioCuentaBancaria;

public class Main {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta (1, 2);
        Persona1 p1 = new Persona1(cuenta,"1","ingreso");
        Persona2 p2 = new Persona2(cuenta,"2","reintegro");
        p1.start();
        p2.start();
    }
}
