class Contacto{
    String nombre;
    int edad;
    String estadoCivil;
    
    //Constructor
    public Contacto(String nombre, int edad, String estadoCivil) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }   

    public String toString(){
        return "Nombre: " + nombre + 
               "\tEdad: " + edad + 
               "\tEstado: " + estadoCivil + "\n";
    }
}

