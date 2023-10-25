import java.util.*;

public class Ejercicio02 {
    public static void main (String [] args){
        Map <Integer, PennyJar> jarros = new HashMap<Integer, PennyJar>();
        jarros.put(1, new PennyJar("Sala"));
        jarros.put(2, new PennyJar("Cocina"));

        for(int i = 1; i <= PennyJar.goal + 1; i++){
            int jarroElegido = printMenu(jarros);
            jarros.get(jarroElegido).addPenny();
        }
    }
    public static int printMenu(Map <Integer, PennyJar> jarros){
        Scanner sc = new Scanner(System.in);
        System.out.println("===JARROS===");
        prntPennies(jarros);
        System.out.println("Selecciona jarro:");
        return sc.nextInt();
    }
    public static void prntPennies(Map <Integer, PennyJar> jarros){
        for(int i = 1; i <= jarros.size(); i++){
            System.out.println(i + ": " +jarros.get(i).getNombre() + " - " + 
                                jarros.get(i).getPennies());
        }
        System.out.println("Monedas totales:");
        System.out.println(PennyJar.getAllPennies());
    }
}
