class PennyJar {
    public static final int goal = 10000;
    private static int allPennies = 0;
    private int pennies = 0;
    private String nombre;

    public PennyJar(String nombre){
        this.nombre = nombre;
    }
    public PennyJar(){
        this(null);
    }



    public void addPenny(){
        this.pennies++;
        allPennies++;
        System.out.println("*Clinck*");
        if(allPennies >= goal)
            System.out.println("Hora de compras");
    }
    public int getPennies(){
        return this.pennies;
    }
    public static int getAllPennies(){
        return allPennies;
    }
    public String getNombre(){
        return nombre;
    }
}
