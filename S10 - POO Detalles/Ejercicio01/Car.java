class Car{
    private String make;
    private int year;
    private String color;

    //Constrcutores
    public Car(String make, int year, String color){
        this.make = make;
        this.year =  year;
        this.color = color;
    }
    public Car(){
    }

    public String toString(){
        return make + " " + year + " " + color;
    }
    //Setters y getters
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }    

    //Adicionals
    public Car makeCopy(){
        Car copyCar = new Car();
        copyCar.make = this.make;
        copyCar.year = this.year;
        copyCar.color = this.color;

        return copyCar;
    }
}