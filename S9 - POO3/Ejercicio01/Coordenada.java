class Coordenada {
    private double ejeX;
    private double ejeY;

    //Constructor
    public Coordenada(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    public Coordenada(int ejeX){
        this(ejeX, 0);
    }
    public Coordenada(){
        this(0, 0);
    }

    public String toString(){
        return "(" + ejeX + ", " + ejeY + ")";
    }


    //Settes y Getters
    public double getEjeX() {
        return ejeX;
    }
    public void setEjeX(double ejeX) {
        this.ejeX = ejeX;
    }
    public double getEjeY() {
        return ejeY;
    }
    public void setEjeY(double ejeY) {
        this.ejeY = ejeY;
    }

    //Metodos adicionales
    public static double distancia(Coordenada punto1, Coordenada punto2){
        return Math.sqrt(Math.pow(punto1.getEjeX() - punto2.getEjeX(), 2) + 
                         Math.pow(punto1.getEjeY() - punto2.getEjeY(), 2));
    }
    public double distancia(Coordenada punto){
        return Math.sqrt(Math.pow(punto.getEjeX() - this.getEjeX(), 2) + 
                         Math.pow(punto.getEjeY() - this.getEjeY(), 2));
    }
    
}
