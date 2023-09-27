import java.util.*;

public class Insercion{
    public static void main (String [] args){
        int [] arra = new int [10];
        rellenar(arra);
        System.out.println(Arrays.toString(arra));
        insercion(arra);
        System.out.println(Arrays.toString(arra));
    }
    public static void insercion(int [] a){
        for(int i = 1; i < a.length; i++){
            if (a[i] < a[i - 1]){
                
            }
        }
    }
    public static void rellenar(int [] a){
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
        }
    }
}