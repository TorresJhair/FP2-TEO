import java.util.*;

public class Aplicacion {
    public static void main (String [] args){
        Gerente elGerente = new Gerente("Julian Oxford", 45);
        Concesionario miEmpresa =  new Concesionario("Empresa X", elGerente);
        int elecc;
        do{
            elecc = prntMenu();
            if(elecc == 1){
                miEmpresa.addAuto();
            }
            if(elecc == 2){
                miEmpresa.addVendedor();
            }
            if(elecc == 3) {
                break;
            }

        }while(true);
        miEmpresa.prntStatus();
    }
    public static int prntMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Añadir auto");
        System.out.println("2. Añadir vendedor");
        System.out.println("3. Salir");
        System.out.println("SU ELECCION:");
        return sc.nextInt();
        
    }
}
