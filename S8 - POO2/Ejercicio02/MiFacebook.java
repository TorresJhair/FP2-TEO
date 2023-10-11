public class MiFacebook {
    public static void main (String [] args){
        Contacto c1;
        Comentario comt1;

        c1 = new Contacto();
        c1.setNombre("Ana");
        c1.setEdad(17);

        comt1 = new Comentario();
        comt1.setComentario("A casa");
        comt1.setStatus("Publico");
        comt1.setDueno(c1.getNombre());

        System.out.println(comt1.getDueno() + " comentó:");
        System.out.println(comt1.getComentario());
    }
}
