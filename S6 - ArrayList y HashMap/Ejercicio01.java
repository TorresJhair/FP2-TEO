import java.util.*;

public class Ejercicio01{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        List <String> people = new ArrayList<String>();
        ingresarNombres(people);
        System.out.println("Grupo completo:\n" + people + "\n");
        while(people.size() > 1){
            eliminarNombre(people);
            mostrarSupervivientes(people);
        }
        System.out.println("GANADOR:");
        System.out.println(people);
    }
    public static void ingresarNombres(List <String> people){
        System.out.println("Ingrese los nombres:");
        System.out.println("Para parar ingrese un número:");
        Scanner sc = new Scanner(System.in);
        String nombre;
        do{
            nombre = sc.next();
            people.add(nombre);
            //Código ASCII
        } while (nombre.charAt(0) <= 47 
                 || nombre.charAt(0) >= 58);  
        people.remove(people.size() - 1); 
    }
    public static void eliminarNombre(List <String> people){
        String eliminado = people.remove((int)(Math.random() * people.size() - 1));
        System.out.println("Eliminado: " + eliminado);
    }
    public static void mostrarSupervivientes(List <String> people){
        System.out.println(people);
    }
}