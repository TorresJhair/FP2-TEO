import java.util.*;

public class Ejercicio03{
    public static void main (String [ ]  args){
        Scanner sc = new Scanner(System.in);
        String continuar = "Y";
        List <Imaginario> imaginarios = new ArrayList<Imaginario>();
        while (continuar.equals("Y")){
            prntOptions();
            System.out.println("\nOpción a elegir:");
            int elecc = sc.nextInt();
            continuar = operaciones(elecc, imaginarios);
        }
    }
    public static void prntOptions(){
        System.out.println("\n1. Crear ArrayList de Imaginarios " + 
        "\n2. Mostrar todos los Imaginarios creados" + 
        "\n3. Realizar operaciones (de 2 primeros Imaginarios almacenados)" + 
        "\n4. Salir");
    }
    public static String operaciones(int elecc, List <Imaginario> img){
        if(elecc == 1){
            operacion1(img);
        }
        if(elecc == 2){
            operacion2(img);
        }
        if(elecc == 3){
            operacion3(img);
        }
        if(elecc == 4){
            return "N";
        }
        return "Y";
    }
    public static void operacion1 (List <Imaginario> img){
        Scanner sc = new Scanner(System.in);
        int conta = 0;
        while (true){
            System.out.print("INGRESAR LETRA PARA PARAR");
            System.out.println("\nNumero " + conta);
            System.out.println("Parte real");
            String realStr= sc.next().toLowerCase();
            if(realStr.charAt(0) <= 122 & realStr.charAt(0) >= 97)
                break;
            System.out.println("Parte imaginarria:");
            String imganStr = sc.next().toLowerCase();
            
            int realInt = Integer.parseInt(realStr);
            int imganInt = Integer.parseInt(imganStr);
            img.add(new Imaginario(realInt, imganInt));
        }
    }
    public static void operacion2(List <Imaginario> img){
        for(int i = 0; i < img.size(); i++){
            System.out.println("\nPosicion " + (i + 1));
            System.out.println(img.get(i));
        }
    }
    public static void operacion3(List <Imaginario> img){
        Imaginario img1 = img.get(0);
        Imaginario img2 = img.get(1);

        System.out.println("SUMA:");
        System.out.println(Imaginario.sumar(img1, img2));
        System.out.println("RESTA");
        System.out.println(Imaginario.restar(img1, img2));
        System.out.println("MULTIPLICACION:");
        System.out.println(Imaginario.multiplicar(img1, img2));

        System.out.println("MODULO 1:");
        System.out.println(Imaginario.modulo(img1));
        System.out.println("CONJUGADO 1:");
        System.out.println(Imaginario.conjugado(img1));
    }
}