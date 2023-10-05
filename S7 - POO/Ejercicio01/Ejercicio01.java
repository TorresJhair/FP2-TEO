import java.util.*;

public class Ejercicio01{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        List <Soldado> ejercito = new ArrayList<Soldado>();
        
        for(int i = 0; i <= 1; i++){
            System.out.println("Soldado " + (i + 1));
            System.out.println("Nombre");
            String name = sc.next();
            System.out.println("Fila");
            int fila = sc.nextInt();
            System.out.println("Columna");
            String colum = sc.next();
            int vida = (int)(Math.random() * 5 + 1);
            System.out.println();

            ejercito.add(new Soldado(name, vida, fila, colum));
        }
        prntEjercito(ejercito);
    }

    public static void prntEjercito(List <Soldado> ejercito){
        for(int i = 0; i < ejercito.size(); i++){
            System.out.println(ejercito.get(i));
        }
    }
}
