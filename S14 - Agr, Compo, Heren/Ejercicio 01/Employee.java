class Employee extends Person{
    private int id;

    public Employee(){
    }
    public Employee(String name, int codigo){
        super(name);
        this.id = codigo;
    }

    //Setters y getters
    public void display(){
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.id);
    }
}