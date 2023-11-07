import java.util.ArrayList;

import javax.sound.midi.ShortMessage;

public class Concesionario {
    private String nombreEmpresa;
    private Gerente elGerente;
    private ArrayList<Vendedor> personal = new ArrayList<>();
    private ArrayList<Auto> autos = new ArrayList<>();

    public Concesionario(){
    }
    public Concesionario(String nombre, Gerente geren){
        this.nombreEmpresa = nombre;
        this.elGerente = geren;
    }

    public void addAuto(Auto auto){
        this.autos.add(auto);
    }
    public void addVendedor(Vendedor vend){
        this.personal.add(vend);
    }
    public void prntStatus(){
        System.out.println("Nombre empresa: " + nombreEmpresa);
        System.out.println("Gerente:" + elGerente.getNombre());
        System.out.println();
        System.out.println("Empleados:");
        for(int i = 0; i < this.personal.size(); i++){
            System.out.println(personal.get(i).getNombre());
        }
        System.out.println();
        System.out.println("Autos:");
        for(int i = 0; i < this.autos.size(); i++){
            System.out.println(autos.get(i).getMarca());
        }
    }
}
