import java.util.*;

public class Ejercicio03 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        Raton mouse1 = new Raton();
        System.out.println("Tasa de crecimiento raton 1 (en %): ");
        double tasa1 = sc.nextDouble();
        mouse1.setTasaCrecimiento(tasa1);
        System.out.println("Dias en evolución: ");
        int dias1 = sc.nextInt();
        simularCrecimiento(mouse1, dias1);

        Raton mouse2 = new Raton();
        System.out.println("Tasa de crecimiento raton 1 (en %): ");
        double tasa2 = sc.nextDouble();
        mouse2.setTasaCrecimiento(tasa2);
        System.out.println("Dias en evolución: ");
        int dias2 = sc.nextInt();
        simularCrecimiento(mouse2, dias2);
        
    }
    public static void simularCrecimiento(Raton rt1, int dias){
        for(int i = 1; i <= dias; i++){
            rt1.crecerPorDias(i);
            System.out.println(rt1);
            System.out.println();
        }
    }
}
