import java.util.*;

public class Ejercicio01{
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int [][] ciudad = genTabla();
        String continuar = "y";
        do{
            mostrarTabla(ciudad);
            System.out.println("\nLEYENDA:");
            mostrarLeyenda();
            preguntarPorTiempoVuelo(ciudad);

            System.out.println("¿Seguir calculando rutas? (Y/N)");
            continuar = sc.next().toLowerCase();
        } while (continuar.equals("y"));

    }
    public static void preguntarPorTiempoVuelo(int [][] ciudades){
        Scanner sc = new Scanner(System.in);
        System.out.println("Desde que ciudad desa partir?");
        int salida =  sc.nextInt();
        System.out.println("Hasta qué ciudad desea llegar?");
        int llegada = sc.nextInt();
        System.out.println("Tiempo de llegada: " + ciudades[salida - 1][llegada - 1]);

    }
    public static int [][] genTabla(){
        int [][] ciudades = {{0, 22, 30, 42, 57}, 
                             {23, 0, 15, 25, 58}, 
                             {31, 17, 0, 24, 30},
                             {45, 27, 25, 0, 95},
                             {59, 58, 30, 97, 0}};
        return ciudades;
    }
    public static void mostrarTabla(int [][] ciudad){
        Map <Integer, String> clavesCiudades = ciudadesClaves();
        for(int i = 0; i < ciudad.length; i++){
            System.out.print("\t" + clavesCiudades.get((i + 1)));
        }
        System.out.println();   
        for(int i = 0; i < ciudad.length; i++){
            System.out.print(clavesCiudades.get((i + 1)) + "\t");
            for(int j = 0; j < ciudad[i].length; j++){
                System.out.print(ciudad[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void mostrarLeyenda(){
        Map <Integer, String> clavesCiudades = ciudadesClaves();
        for(int i = 1; i <= clavesCiudades.size(); i++){
            System.out.println(clavesCiudades.get(i) + " = " + (i));
        }
    }
    public static Map <Integer, String> ciudadesClaves(){
        Map <Integer, String> ciudades = new HashMap<>();
        ciudades.put(1, "AQP"); 
        ciudades.put(2, "JUL");
        ciudades.put(3, "CUZ");
        ciudades.put(4, "TCQ");
        ciudades.put(5, "LIM");
        return ciudades;
    }
    
}