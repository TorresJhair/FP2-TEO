public class Estudiante {
    private int numLista;
    private String nombre;
    private Direccion domicilio;

    public Estudiante(int numLista, String nombre, Direccion domicilio) {
        this.numLista = numLista;
        this.nombre = nombre;
        this.domicilio = domicilio;
    }
    
    public String toString(){
        return "Nombre: " + nombre + "\n" + 
                "Orden: " + numLista + "\n" + 
                "Direccion\n" + domicilio;
    }
}
