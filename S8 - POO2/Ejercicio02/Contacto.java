class Contacto{
    private String nombre;
    private int edad;
    private String estadoCivil;

    public Contacto(String nombre, int edad, String estadoCivil){
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
    }
    public Contacto(){
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    
}
