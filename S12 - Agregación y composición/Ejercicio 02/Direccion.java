public class Direccion {
    private String calle;
    private String ciudad;
    private String region;
    private String pais;

    public Direccion(String calle, String ciudad, String region, String pais) {
        this.calle = calle;
        this.ciudad = ciudad;
        this.region = region;
        this.pais = pais;
    }
    public Direccion(){
    }

    public String toString(){
        return "Calle: " + calle + "\n" + 
            "Ciudad: " + ciudad + "\n" + 
            "Region: " + region + "\n" + 
            "Pais: " + pais;
    }
}
