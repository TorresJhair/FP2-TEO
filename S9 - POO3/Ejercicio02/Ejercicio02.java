public class Ejercicio02 {
    public static void main(String [] args){
        Fraccion fr = new Fraccion (1, 8);
        Fraccion fr2 = new Fraccion(4, 5);
        System.out.println(Fraccion.suma(fr, fr2));
        System.out.println(resta(fr, fr2));
    }
    public static int mcd(Fraccion fr){
        int dividendo = Math.max(fr.getDenomirator(), fr.getNumerator());
        int divisor = Math.min(fr.getDenomirator(), fr.getNumerator());
        int resto;
        while(true){
            resto = dividendo % divisor;
            if(resto == 0)
                return divisor;
            else{
                dividendo = divisor;                
                divisor = resto;    
            }
        }
    }
    public static Fraccion simplificar(Fraccion fr1){
        int mcd = mcd(fr1);
        return new Fraccion(fr1.getNumerator() / mcd, 
                            fr1.getDenomirator() / mcd);
    }
    public static Fraccion suma(Fraccion fr1, Fraccion fr2){
        //X form
        int numerador = (fr1.getNumerator() * fr2.getDenomirator() + 
                          fr2.getNumerator() * fr1.getDenomirator());
        int denomina = (fr1.getDenomirator() * fr2.getDenomirator());
        Fraccion suma = new Fraccion(numerador, denomina);
        return simplificar(suma);
    } 
    public static Fraccion resta(Fraccion fr1, Fraccion fr2){
        int numerador = (fr1.getNumerator() * fr2.getDenomirator() - 
                          fr2.getNumerator() * fr1.getDenomirator());
        int denomina = (fr1.getDenomirator() * fr2.getDenomirator());
        Fraccion difference = new Fraccion(numerador, denomina);
        return simplificar(difference);
    }
    public static Fraccion multiplicar(Fraccion fr1, Fraccion fr2){
        Fraccion producto = new Fraccion(fr1.getNumerator() * fr2.getNumerator(),
                                         fr1.getDenomirator() * fr2.getDenomirator());
        return simplificar(producto);
    }
    public static Fraccion dividir(Fraccion fr1, Fraccion fr2){
        //Double C
        int numerador = fr1.getNumerator() * fr2.getDenomirator();
        int denomina = fr1.getDenomirator() * fr2.getNumerator();
        Fraccion cociente = new Fraccion(numerador, denomina);
        return simplificar(cociente);
    }
}
