public class Ejercicio02 {
    public static void main(String[] args){
        Car johnCar = new Car();
        Car stacyCar;
        johnCar.setMake("Honda");
        johnCar.setYear(2003);
        johnCar.setColor("silver");
        stacyCar = johnCar.makeCopy();
        stacyCar.setColor("blue");

        if(stacyCar.equals(johnCar)){
            System.out.println("Iguales");
        }
        else{
            System.out.println("Diff");
        }
    }
        
}
