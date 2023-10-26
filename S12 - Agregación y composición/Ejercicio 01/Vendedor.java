public class Vendedor {
    public String nombre;
    public int edad;
    public double ventas = 0;

    public Vendedor(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String toString(){
        return nombre + " - " + edad + "\n" + 
                "$ " + ventas + " vendidos";
    }
}
