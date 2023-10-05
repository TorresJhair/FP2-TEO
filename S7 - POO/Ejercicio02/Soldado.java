public class Soldado {
    protected String name;
    protected int vida;
    
    public String toString(){
        return name + " " + vida;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
}
class Arquero extends Soldado{
    public Arquero(){
        this.name = "Arquero";
        //Vida entre 3 y 5
        this.vida = (int)(Math.random() * 3 + 3);
    }
}
class Espadachin extends Soldado{
    public Espadachin(){
        this.name = "Espadachin";
        //Vida entre 5 y 7
        this.vida = (int)(Math.random() * 3 + 5);
    }
}
class Caballero extends Soldado{
    public Caballero(){
        this.name = "Caballero";
        //Vida entre 7 - 9
        this.vida = (int)(Math.random() * 3 + 7);    
    }
}

