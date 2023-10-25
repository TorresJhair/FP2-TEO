import java.util.*;

class Ejercicio01 {
    public static void main (String [] args){
        List <Empleado> planilla = new ArrayList<Empleado>();
        int random = (int)(Math.random() * 10 + 1);
        for(int i = 0; i < random; i++){
            planilla.add(new Empleado());
        }
        System.out.println(planilla);
        System.out.println("Total empleados:");
        System.out.println(Empleado.totalEmpleados);
    }
}
