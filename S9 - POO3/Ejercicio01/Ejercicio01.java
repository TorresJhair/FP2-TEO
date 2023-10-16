public class Ejercicio01{
    public static void main (String [] args){
        Coordenada punto1 = new Coordenada();
        Coordenada punto2 = new Coordenada(8);
        Coordenada punto3 = new Coordenada(3, 5);

        System.out.println("Distancia entre " + punto1 + "y " + punto3);
        System.out.println(distanciaPuntos(punto1, punto3));
        System.out.println(Coordenada.distancia(punto1, punto3));
        System.out.println(punto1.distancia(punto3));
    }

    public static double distanciaPuntos(Coordenada punto1, Coordenada punto2){
        return Math.sqrt(Math.pow(punto1.getEjeX() - punto2.getEjeX(), 2) + 
                         Math.pow(punto1.getEjeY() - punto2.getEjeY(), 2));
    } 
}