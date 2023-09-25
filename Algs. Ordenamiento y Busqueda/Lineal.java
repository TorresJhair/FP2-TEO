import java.util.*;

public class Lineal{
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        int [] arra = {5, 12, 17, 23, 38, 45, 77, 84, 90};

        System.out.println("Item a buscar");
        int elemento = sc.nextInt();
        System.out.println(binaria(arra, elemento));

    }
    public static int binaria(int [] arra, int elem){
        int bajo = 0,
            alto = arra.length - 1, 
            medio = 0;
            do{
                medio = (int)((bajo + alto) / 2);
                System.out.println(medio);
                if(arra[medio] == elem){
                    return medio;
                }
                else{
                    if(elem < arra[medio]){
                        alto = medio - 1;
                    }
                    if(elem > arra[medio]){
                        bajo = medio + 1;
                    }
                }
            } while(bajo <= alto);
            return -1;
    }
}