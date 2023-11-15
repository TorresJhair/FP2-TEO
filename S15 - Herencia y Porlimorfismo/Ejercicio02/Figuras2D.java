public class Figuras2D {
    private double area;
    private String nombre;

    public Figuras2D(double area){
        this.area = area;
    }
    public Figuras2D(){
    }

    public void setArea(double area){
        this.area = area;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String toString(){
        return  "\nNombre: " + nombre + "\n" +
                "Area: " + area + "\n";
    }
}


class Rectangulo extends Figuras2D{
    private double alto;
    private double ancho;

    public Rectangulo(double alto, double ancho){
        this.alto = alto;
        this.ancho = ancho;
        setArea(alto * ancho);
        setNombre("Cuadrado");
    }

    public String toString(){
        return super.toString() +
                "Alto: " + alto + "\n" + 
                "Ancho: " + ancho + "\n";
                
    }
}
class Triangulo extends Figuras2D{
    private double alto;
    private double base;

    public Triangulo(double alto, double base){
        this.alto = alto;
        this.base = base;
        setArea(alto * base / 2.0);
        setNombre("Triangulo");
    }

    public String toString(){
        return super.toString() +
                "Alto: " + alto + "\n" + 
                "Base: " + base + "\n";
    }
}
class Circulo extends Figuras2D{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
        setArea(Math.PI * Math.pow(radio, 2));
        setNombre("Triangulo");
    }

    public String toString(){
        return super.toString() + 
                "Radio: " + radio + "\n";
    }
}
