class AlumnoEpis{
    private String nombre;
    private int edad;
    private int promedioPonderado;

    public AlumnoEpis(String nombre, int edad, int promedioPonderado) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedioPonderado = promedioPonderado;
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

    public String toString(){
        return "Nombre: " + nombre + 
               "\nEdad:" + edad + 
               "\nPromedio: " + promedioPonderado;
    }
}