public class Auto {
    private String marca;
    private int year;
    private String color;

    public Auto(String marca, int year, String color){
        this.marca = marca;
        this.year = year;
        this.color = color;
    }
    public Auto(String marca, int year){
        this(marca, year, null);
    }
    public String toString(){
        return marca + " - " + year;
    }
}
