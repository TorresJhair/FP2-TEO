class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void swapPerson(Person per){
        Person aux = new Person();
        aux.copyOf(this);
        this.copyOf(per);
        per.copyOf(aux);
    }
    public void copyOf(Person p){
        this.name = p.name;
    }
}
