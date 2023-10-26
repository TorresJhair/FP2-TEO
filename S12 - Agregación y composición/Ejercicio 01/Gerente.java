public class Gerente {
    public String nombre;
    public int edad;
    public String carrera;

    public Gerente (String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }
    public Gerente(String nombre, int edad){
        this(nombre, edad, null);
    }

    public String toString(){
        return nombre + " - " + edad; 
    }
}
