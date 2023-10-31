import java.util.*;

public class Aplicacion {
    public static void main (String [] args){
        List <Person> planilla = new ArrayList<>();

        Employee employee1 = new FullTime("Juan", 12345, 123.45);
        Employee employee2 = new Employee("Zaria", 54321);
        Person boss = new Person("Adeleth");
        planilla.add(boss);
        planilla.add(employee1);
        planilla.add(employee2);
        
        System.out.println("Jefe: ");
        System.out.println(boss.getName());
        System.out.println();
        System.out.println("Empleados:");
        employee1.display();
        employee2.display();
    }
}
