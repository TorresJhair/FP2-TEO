public class Ejercicio04{
    public static void main (String [] args){
        Fraccion f1 = new Fraccion(1, 4);
        Fraccion f2 = new Fraccion(1, 2);
        Fraccion ola = f1.sumar(f2);
        System.out.println(ola);
        ola = f1.restar(f2).multiplicar(2);
        System.out.println(ola);
        ola = f1.dividir(f1);
        System.out.println(ola);
    }
}