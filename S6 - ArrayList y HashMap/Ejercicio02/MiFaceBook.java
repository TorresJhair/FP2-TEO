import java.util.*;

public class MiFaceBook {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        List <Contacto> misContactos = new ArrayList<Contacto>();

        llenarContacto(misContactos);
        System.out.println("LISTA DE CONTACTOS:\n" + misContactos);

        System.out.println("Nombre a buscar:");
        String nombreBuscar = sc.next();
        Contacto amigo = busquedaNombreBinaria(misContactos, nombreBuscar);
        System.out.println(amigo);
    }
    public static void llenarContacto(List <Contacto> contatos){
        System.out.println("//Para parar ingrese un número en el nombre");
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nombre:");
            String name = sc.next();
            if(name.charAt(0) >= 48 && name.charAt(0) <= 57)
                break;
            System.out.println("Edad:");
            int age = sc.nextInt();
            System.out.println("Estado civil");
            String civilStatus = sc.next(); 
            contatos.add(new Contacto(name, age, civilStatus));
        }
    }
    public static Contacto busquedaNombreBinaria(List <Contacto> contactos, String nombre){
        ordenarPorNombreBurbuja(contactos);
        int alto = contactos.size() - 1,
            bajo = 0;
        while(bajo <= alto){
            int medio = (int)((bajo + alto) / 2);
            if(contactos.get(medio).getNombre().equals(nombre)){
                return contactos.get(medio);
            }
            else{
                if(nombre.charAt(0) < contactos.get(medio).getNombre().charAt(0)){
                    alto = medio - 1;
                }
                else{
                    bajo = medio + 1;
                }
            }
        }
        return new Contacto("NO ENCONTRADO", 0, "");
    }
    public static void ordenarPorNombreBurbuja(List <Contacto> contactos){
        Contacto aux;
        for(int i = 0; i < contactos.size(); i++){
            for(int j = 0; j < contactos.size() - i - 1; j++){
                if(contactos.get(j).getNombre().charAt(0) > 
                   contactos.get(j + 1).getNombre().charAt(0)){
                    aux = contactos.get(j);
                    contactos.set(j, contactos.get(j + 1));
                    contactos.set(j + 1, aux);
                   }
            }
        }
    }
}