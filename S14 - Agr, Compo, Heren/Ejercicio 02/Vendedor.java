public class Vendedor extends Persona{
    private double ventas;

    public Vendedor(){
    }
    public Vendedor(String name){
        super(name);
    }


    public double getVentas() {
        return ventas;
    }
}
