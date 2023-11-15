import java.util.*;

public class Ejercicio02 {
    public static void main (String [] args){
        ArrayList <Figuras2D> graphic = new ArrayList<>();

        graphic.add(new Rectangulo(3.5, 2));
        graphic.add(new Triangulo(3, 4.5));
        graphic.add(new Circulo(8));
        System.out.println(graphic);
    }
}
