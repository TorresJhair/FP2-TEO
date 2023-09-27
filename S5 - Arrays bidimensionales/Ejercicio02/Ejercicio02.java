public class Ejercicio02 {
    public static void main (String [] args){
        final int años = 5;
        final int alumnosPorAño = 100;
        AlumnoEpis [][] episUnsa = new AlumnoEpis[años][alumnosPorAño];
        genAlumnos(episUnsa);
        promedioPorAño(episUnsa);
        promedioTotal(episUnsa);
        maxPromedioAño(episUnsa);
        minPromedioAño(episUnsa);
        maxPromedioTodos(episUnsa);
        rankPorAño(episUnsa);
        rankTotal(episUnsa);
    }
    public static void genAlumnos(AlumnoEpis [][] epis){
        for(int i = 0; i < epis.length; i++){
            for(int j = 0; j < epis[i].length; j++){
                epis[i][j] = new AlumnoEpis("Alumno" + " " + (i + 1) + " - "  + j, 
                             (int)(Math.random() * 13 + 18),
                             (int)(Math.random() * 21));
            }
        }
    }
    public static void promedioPorAño(AlumnoEpis [][] epis){
        for(int i = 0; i < epis.length; i++){
            int suma = 0;
            System.out.print("Año " + (i + 1) + ": ");
            for(int j = 0; j < epis[i].length; j++){
                suma += epis[i][j].getPromedioPonderado();
            }
            System.out.println((Math.round(suma / epis[i].length)));
        }
    }
    public static void promedioTotal(AlumnoEpis [][] epis){
        int suma = 0;
        System.out.println("Promedio total:");
        for(int i = 0; i < epis.length; i++){
            for(int j = 0; j < epis[i].length; j++){
                suma += epis[i][j].getPromedioPonderado();
            }
        }
        System.out.println((Math.round(suma / (epis[0].length * epis.length))));
    }
    public static AlumnoEpis [][] sortBurbujaPromedio(AlumnoEpis [][] epis){
        AlumnoEpis aux;
        for(int k = 0; k < epis.length; k++){
            for(int i = 0; i < epis[k].length; i++){
                for(int j = 0; j < epis[k].length - i -1; j++){
                    if(epis[k][j].getPromedioPonderado() > 
                       epis[k][ j +1].getPromedioPonderado()){
                        aux = epis[k][j];
                        epis[k][j] = epis[k][j + 1];
                        epis[k][j + 1] = aux;
                       }
                }
            }
        }
        return epis;
    }
    public static void maxPromedioAño(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nMáximos promedios por año");
        for(int i = 0; i < orden.length; i++){
            System.out.println("Año " + (i + 1) + ":\n" + orden[i][99]);
        }
    }
    public static void minPromedioAño(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nMínimos promedios por año");
        for(int i = 0; i < orden.length; i++){
            System.out.println("Año " + (i + 1) + ":\n" + orden[i][0]);
        }
    }
    public static void maxPromedioTodos(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nMáximo promedio total:");
        AlumnoEpis maxProm = orden[0][99];
        for(int i = 0; i < orden.length - 1; i++){
            if(maxProm.getPromedioPonderado() < orden[i][99].getPromedioPonderado()){
                maxProm = orden[i][99];
            }
        }
        System.out.println(maxProm);
    }
    public static void minPromedioTodos(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nMínimo promedio total:");
        AlumnoEpis minProm = orden[0][0];
        for(int i = 0; i < orden.length - 1; i++){
            if(minProm.getPromedioPonderado() > orden[i][0].getPromedioPonderado()){
               minProm = orden[i][0];
            }
        }
        System.out.println(minProm);
    }
    public static void rankPorAño(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nRanking por año");
        for(int i = 0; i < orden.length; i++){
            System.out.println("\nAño " + (i + 1) + ":");
            int puesto = 1;
            for(int j = 99; j > 94; j--){
                System.out.println("Puesto " + puesto + ":");
                System.out.println(orden[i][j]);
                System.out.println();
                puesto++;
            }
        }
    }
    public static void rankTotal(AlumnoEpis [][] epis){
        AlumnoEpis [][] orden = sortBurbujaPromedio(epis);
        System.out.println("\nRanking general");
        for(int i = 0; i < orden.length; i++){
            System.out.println("Puesto " + (i + 1) + ":");
            System.out.println(orden[i][99]);
            System.out.println();
        }
    }
}
