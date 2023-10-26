import java.util.*;

class Concesionario{
    private String nombreEmpresa;
    private Gerente elGerente;
    private ArrayList<Vendedor> planilla = new ArrayList<>();
    private ArrayList<Auto> autos = new ArrayList<>();

    public Concesionario(String nombre, Gerente geren){
        this.nombreEmpresa = nombre;
        this.elGerente = geren;
    }
    public void addAuto(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Marca");
        String model = sc.next();
        System.out.println("Año");
        int year = sc.nextInt();
        addAuto(new Auto(model, year));
    }
    public void addAuto(Auto auto){
        autos.add(auto);
    }   
    public void addVendedor(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre");
        String name = sc.next();
        System.out.println("Edad");
        int edad = sc.nextInt();
        Vendedor nuevoVendedor = new Vendedor(name, edad);
        addVendedor(nuevoVendedor);
    }
    public void addVendedor(Vendedor vend){
        planilla.add(vend);
    }
    public void prntStatus(){
        System.out.println("Nombre Empresa \t\t Nombre gerente");
        System.out.println(nombreEmpresa + "\t\t" + elGerente);
        System.out.println();
        System.out.println("Vendedores");
        for(Vendedor person: planilla){
            System.out.println(person);
        }
        System.out.println("Autos");
        for(Auto car: autos){
            System.out.println(car);
        }
    }
}