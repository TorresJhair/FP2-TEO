public class Ejericio01 {
    public static void main (String [] args){
        Object figura2D;
        figura2D = new Triangulo(3, 4.5);
        System.out.println(figura2D);
        figura2D = new Rectangulo(2.5, 8);
        System.out.println(figura2D);
        figura2D = new Circulo(3);
        System.out.println(figura2D);
    }
}

class Triangulo{
    private double base;
    private double altura;
    private double area;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        this.area = base * altura / 2;
    }

    public String toString(){
        return "Base: " + base + "\n" +
                "Altura: " + altura + "\n" + 
                "Area: " + area; 
    }
}

class Rectangulo{
    private double base;
    private double altura;
    private double area;

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        area = base * altura;
    }

    public String toString(){
        return "Base: " + base + "\n" +
                "Altura: " + altura + "\n" + 
                "Area: " + area; 
    }
}

class Circulo{
    private double radio;
    private double area;
    private double perimetro;

    public Circulo(double radio){
        this.radio = radio;
        area = Math.PI * Math.pow(radio, 2);
        perimetro = 2 * Math.PI * radio; 
    }

    public String toString(){
        return "Radio: " + radio + "\n" +
                "Perimetro: " + perimetro + "\n" + 
                "Area: " + area; 
    }
}
