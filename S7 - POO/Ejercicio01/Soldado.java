class Soldado {
    private String nombre;
    private int nivelVida;
    private int fila;
    private String columna;

    public Soldado(String nombre, int vida, int fila, String columna){
        this.nombre = nombre;
        this.nivelVida = vida;
        this.fila = fila;
        this.columna = columna;
    }
    public String toString(){
        return nombre + ", " + nivelVida + " => " + columna + fila; 
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNivelVida(int nivelVida) {
        this.nivelVida = nivelVida;
    }
    public void setFila(int fila) {
        this.fila = fila;
    }
    public void setColumna(String columna) {
        this.columna = columna;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNivelVida() {
        return nivelVida;
    }
    public int getFila() {
        return fila;
    }
    public String getColumna() {
        return columna;
    }

    
    
}
