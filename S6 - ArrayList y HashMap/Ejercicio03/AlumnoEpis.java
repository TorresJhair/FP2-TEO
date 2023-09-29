class AlumnoEpis{
    private String nombre;
    private int edad;
    private int promedioPonderado;
    private int año;

    public AlumnoEpis(String nombre, int edad, int promedioPonderado, int año) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioPonderado = promedioPonderado;
        this.año = año;
    }

    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPromedioPonderado(int promedioPonderado) {
        this.promedioPonderado = promedioPonderado;
    }
    public void setAño(int año){
        this.año = año;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public int getPromedioPonderado() {
        return promedioPonderado;
    }
    public int getAño(){
        return año;
    }

    public String toString(){
        return "Nombre: " + nombre + 
               "\nEdad:" + edad + 
               "\nPromedio: " + promedioPonderado;
    }
}