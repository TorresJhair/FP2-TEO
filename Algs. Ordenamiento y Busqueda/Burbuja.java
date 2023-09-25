import java.util.*;

class Burbuja{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int [] arra = new int [10];
        rellenar(arra);
        System.out.println(Arrays.toString(arra));
        burbuja(arra);
        System.out.println(Arrays.toString(arra));

    }
    public static void rellenar(int [] a){
        for(int i = 0; i < a.length; i++){
            a[i] = (int)(Math.random() * 100);
        }
    }
    public static void burbuja(int [] a){
        int aux;
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a.length - i - 1; j++){
                if(a[j] >= a[j + 1]){
                    aux = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = aux;
                }
            }
            System.out.println(Arrays.toString(a));
        }
    }
}