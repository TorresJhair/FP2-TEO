import java.util.*;

class Seleccion{
    public static void main (String [] args){
        int [] arra = new int [10];
        rellenar(arra);
        System.out.println(Arrays.toString(arra));
        seleccion(arra);
        System.out.println(Arrays.toString(arra));

    }
    public static void seleccion(int [] a){
        for(int i = 0; i < a.length; i++){
            int minIndex = minValueIndex(a, i);
            int aux = a[minIndex];
            a[minIndex] = a[i];
            a[i] = aux;
        }
    }
    public static void rellenar(int [] a){
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
        }
    }
    public static int minValueIndex(int [] a, int limite){
        int minIndex = limite;
        for(int i = limite; i < a.length; i++){
            if(a[i] < a[minIndex]){
                minIndex = i;
            }
        }
        return minIndex;
    }
}