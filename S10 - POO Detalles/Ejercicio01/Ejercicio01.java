public class Ejercicio01 {
    public static void main(String[] args){
        Car johnCar = new Car();
        Car stacyCar;
        johnCar.setMake("Honda");
        johnCar.setYear(2003);
        johnCar.setColor("silver");
        stacyCar = johnCar.makeCopy();
        stacyCar.setColor("peach");

        System.out.println(stacyCar);
        System.out.println(johnCar);
    }
        
}
