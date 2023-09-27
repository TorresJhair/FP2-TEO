import java.util.*;

public class Ejercicio01{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        List <String> people = new ArrayList<String>();
        ingresarNombres(people);
        while(people.size() < 1){

        }
    }
    public static void ingresarNombres(List <String> people){
        System.out.println("Ingrese los nombres:");
        System.out.println("Para parar ingrese un número:");
        Scanner sc = new Scanner(System.in);
        String nombre;
        do{
            nombre = sc.next();
            people.add(nombre);
        } while (nombre.charAt(0) <= 47 
                 && nombre.charAt(0) >= 58);
        
    }
    public static void 

}