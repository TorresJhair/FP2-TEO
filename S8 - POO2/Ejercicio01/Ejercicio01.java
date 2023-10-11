public class Ejercicio01 {
    public static void main (String [] args ){

        Cuenta ct1 = new Cuenta();
        ct1.depositar(500);
        ct1.mostrarSaldo();
        ct1.depositar(1000);
        ct1.mostrarSaldo();
        ct1.retirar(1500);
        ct1.mostrarSaldo();

        System.out.println();
        Cuenta ct2 = new Cuenta();
        ct2.mostrarSaldo();
        ct2.retirar(500);
        ct2.mostrarSaldo();
        ct2.depositar(1000);
        ct2.mostrarSaldo();
        ct2.retirar(500);
        ct2.mostrarSaldo();
    }
}
