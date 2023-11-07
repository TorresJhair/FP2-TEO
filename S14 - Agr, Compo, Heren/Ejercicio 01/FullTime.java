class FullTime extends Employee {
    private double salary;

    public FullTime(){
    }
    public FullTime(String name, int id, double salary){
        super(name, id);
        this.salary = salary;
    }

    public void display(){
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}
