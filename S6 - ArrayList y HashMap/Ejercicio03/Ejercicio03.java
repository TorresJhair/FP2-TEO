import java.util.*;

public class Ejercicio03 {
    public static void main (String [] args){
        List <ArrayList<AlumnoEpis>> episUnsa = new ArrayList<ArrayList<AlumnoEpis>>();
        ingresarAlumnos(episUnsa);
        promedioPorAño(episUnsa);
        promedioTotal(episUnsa);
        maxPromedioAño(episUnsa);
        minPromedioAño(episUnsa);
        maxPromedioTodos(episUnsa);
        rankPorAño(episUnsa);
        rankTotal(episUnsa);
    }
    public static void ingresarAlumnos(List <ArrayList<AlumnoEpis>> epis){
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre:");
            String name = sc.nextLine();
            //Si ingresa número (Ascii) salir
            if(name.charAt(0) >= 48 && name.charAt(0) <= 57)
                break;
            System.out.println("Edad: ");
            int edad = sc.nextInt();
            System.out.println("Promedio:");
            int promed = sc.nextInt();
            System.out.println("Año:");
            int año = sc.nextInt();
            epis.get(año - 1).add(new AlumnoEpis(name, edad, promed, año));
        }
    }
    public static void promedioPorAño(List<ArrayList<AlumnoEpis>> epis){
        int suma = 0;
        System.out.println("PROMEDIOS");
        for(int i = 0; i < epis.size(); i++){
            System.out.print("AÑO " + (i + 1) + ": ");
            for(int j = 0; j < epis.get(i).size(); j++){
                suma += epis.get(i).get(j).getPromedioPonderado();
            }
            System.out.println(Math.round(suma * 1.0 / epis.get(i).size()));
        }
    }
    public static void promedioTotal(List<ArrayList<AlumnoEpis>> epis){
        int suma = 0;
        int totalAlumnos = 0;
        System.out.println("Promedio total:");
        for(int i = 0; i < epis.size(); i++){
            for(int j = 0; j < epis.get(i).size(); j++){
                suma += epis.get(i).get(j).getPromedioPonderado();
            }
            totalAlumnos += epis.get(i).size();
        }
        System.out.println(Math.round(suma * 1.0 / totalAlumnos));
    }
    public static List<ArrayList<AlumnoEpis>> sortBurbujaPromedio(List<ArrayList<AlumnoEpis>> epis){
        //DE MENOR A MAYOR
        AlumnoEpis mayorProm;
        AlumnoEpis menorProm;
        for(int k = 0; k < epis.size(); k++){
            for(int i = 0; i < epis.get(k).size(); i++){
                for(int j = 0; j < epis.get(i).size() - i - 1; j++){
                    if(epis.get(k).get(j).getPromedioPonderado() > 
                       epis.get(k).get(j + 1).getPromedioPonderado()){
                        mayorProm = epis.get(k).get(j);
                        menorProm = epis.get(k).get(j + 1);
                        epis.get(k).set(j, menorProm);
                        epis.get(k).set(j + 1, mayorProm);
                       }
                }
            }
        }
        return epis;
    }
    public static void maxPromedioAño(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nMáximos promedios por año");
        for(int i = 0; i < episOrdenado.size(); i++){
            int alumnosPorAño = episOrdenado.get(i).size();
            System.out.println("Año " + (i + 1) + ":\n" + 
            episOrdenado.get(i).get(alumnosPorAño - 1));
        }
    }
    public static void minPromedioAño(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nMínimos promedios por año");
        for(int i = 0; i < episOrdenado.size(); i++){
            System.out.println("Año " + (i + 1) + ":\n" + episOrdenado.get(i).get(0));
        }
    }
    public static void maxPromedioTodos(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nMáximo promedio total:");
        int alumnosPorAño = episOrdenado.get(0).size();
        AlumnoEpis maxProm = episOrdenado.get(0).get(alumnosPorAño - 1);
        for(int i = 0; i < epis.size() - 1; i++){
            alumnosPorAño = episOrdenado.get(i).size();
            AlumnoEpis maxPromOtroAño = episOrdenado.get(i).get(alumnosPorAño - 1);
            if(maxProm.getPromedioPonderado() < 
               maxPromOtroAño.getPromedioPonderado()){
                maxProm = episOrdenado.get(i).get(alumnosPorAño - 1);
            }
        }
        System.out.println(maxProm);
    }
    public static void minPromedioTodos(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nMínimo promedio total:");
        AlumnoEpis minProm = episOrdenado.get(0).get(0);
        for(int i = 0; i < episOrdenado.size() - 1; i++){
            AlumnoEpis minPromOtroAño = episOrdenado.get(i).get(0);
            if(minProm.getPromedioPonderado() > 
               minPromOtroAño.getPromedioPonderado()){
               minProm = episOrdenado.get(i).get(0);
            }
        }
        System.out.println(minProm);
    }
    public static void rankPorAño(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nRanking por año");
        int alumnosPorAño;
        for(int i = 0; i < episOrdenado.size(); i++){
            System.out.println("\nAño " + (i + 1) + ":");
            int puesto = 1;
            alumnosPorAño = episOrdenado.get(i).size();
            for(int j = alumnosPorAño - 1; j > alumnosPorAño - 6; j--){
                System.out.println("Puesto " + puesto + ":");
                AlumnoEpis rankeado = episOrdenado.get(i).get(j);
                System.out.println(rankeado);
                System.out.println();
                puesto++;
            }
        }
    }
    public static void rankTotal(List<ArrayList<AlumnoEpis>> epis){
        List <ArrayList<AlumnoEpis>> episOrdenado = sortBurbujaPromedio(epis);
        System.out.println("\nRanking general");
        for(int i = 0; i < episOrdenado.size(); i++){
            int alumnosPorAño = episOrdenado.get(i).size();
            System.out.println("Puesto " + (i + 1) + ":");
            AlumnoEpis rankeado = epis.get(i).get(alumnosPorAño - 1);
            System.out.println(rankeado);
            System.out.println();
        }
    }
}
