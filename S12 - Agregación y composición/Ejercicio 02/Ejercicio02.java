public class Ejercicio02{
    public static void main (String [] args){
        Direccion centroCiudad = new Direccion("Ugarte", "Lima", "Lima", "Peru");
        Estudiante alumno1 = new Estudiante(1, "Luis", centroCiudad);
        Estudiante alumno2 = new Estudiante(2, "Oscar", 
                                            new Direccion("Av. Bolognesi", 
                                                         "Arequipa", "Arequipa", "Peru"));

        System.out.println(alumno1);
        System.out.println();
        System.out.println(alumno2);
    }
}