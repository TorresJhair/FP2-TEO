public class Empleado {
    private String nombre;
    private String apellido;
    private int edad;
    public static int totalEmpleados = 0;

    public Empleado(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        totalEmpleados++;
    }
    public Empleado(){
        this("Empleado", Integer.toString(totalEmpleados), (int)(Math.random() * 80 + 1));
    }
    public String toString(){
        return nombre + " " + apellido + " - " + edad;
    }

    //Setters y Getters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
