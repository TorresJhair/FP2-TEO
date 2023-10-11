class Raton {
    private double peso;
    private int edadDias;
    private double tasaCrecimiento;

    public Raton(){
        this.peso = 0;
        this.edadDias = 0;
    }
    public String toString(){
        return "Edad: " + edadDias + " dias" +
                "\nPeso: " + peso + " gramos";
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getEdadDias() {
        return edadDias;
    }
    public void setEdadDias(int edadDias) {
        this.edadDias = edadDias;
    }
    public double getTasaCrecimiento() {
        return tasaCrecimiento;
    }
    public void setTasaCrecimiento(double tasaCrecimiento) {
        this.tasaCrecimiento = tasaCrecimiento / 100;
    }
    
    //Metodos adicionales
    public void crecerPorDias(int dias){
        this.edadDias++;
        this.peso = aumentarPesoDias(dias);   
    }
    public double aumentarPesoDias(int dias){
        if(dias == 0){
            return 1;
        }
        return aumentarPesoDias(dias - 1) + 
               (0.1 * dias * getTasaCrecimiento());
    }
    
}
