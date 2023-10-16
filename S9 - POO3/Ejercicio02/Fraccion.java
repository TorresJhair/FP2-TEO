class Fraccion {
    private int numerator;
    private int denomirator;

    //Constructores
    public Fraccion(int numerator, int denomirator){
        this.numerator = numerator;
        this.denomirator = denomirator;
    }
    public Fraccion(Fraccion frac){
        this(frac.getNumerator(), frac.getDenomirator());
    }
    public Fraccion(int num){
        this(num, 1);
    }
    public Fraccion(){
        this(1, 1);
    }

    public String toString(){
        return numerator + " / " + denomirator;
    }

    //Setters y getters
    public int getNumerator() {
        return numerator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }
    public int getDenomirator() {
        return denomirator;
    }
    public void setDenomirator(int denomirator) {
        this.denomirator = denomirator;
    }

    //Metodos de clase 
    public static int mcd(Fraccion fr){
        int dividendo = Math.max(fr.getDenomirator(), fr.getNumerator());
        int divisor = Math.min(fr.getDenomirator(), fr.getNumerator());
        int resto;
        while(true){
            resto = dividendo % divisor;
            if(resto == 0)
                return divisor;
            else{
                dividendo = divisor;                
                divisor = resto;    
            }
        }
    }
    public static Fraccion simplificar(Fraccion fr1){
        int mcd = mcd(fr1);
        return new Fraccion(fr1.getNumerator() / mcd, 
                            fr1.getDenomirator() / mcd);
    }
    public static Fraccion suma(Fraccion fr1, Fraccion fr2){
        //X form
        int numerador = (fr1.getNumerator() * fr2.getDenomirator() + 
                          fr2.getNumerator() * fr1.getDenomirator());
        int denomina = (fr1.getDenomirator() * fr2.getDenomirator());
        Fraccion suma = new Fraccion(numerador, denomina);
        return simplificar(suma);
    } 
    public static Fraccion resta(Fraccion fr1, Fraccion fr2){
        int numerador = (fr1.getNumerator() * fr2.getDenomirator() - 
                          fr2.getNumerator() * fr1.getDenomirator());
        int denomina = (fr1.getDenomirator() * fr2.getDenomirator());
        Fraccion difference = new Fraccion(numerador, denomina);
        return simplificar(difference);
    }
    public static Fraccion multiplicar(Fraccion fr1, Fraccion fr2){
        Fraccion producto = new Fraccion(fr1.getNumerator() * fr2.getNumerator(),
                                         fr1.getDenomirator() * fr2.getDenomirator());
        return simplificar(producto);
    }
    public static Fraccion dividir(Fraccion fr1, Fraccion fr2){
        //Double C
        int numerador = fr1.getNumerator() * fr2.getDenomirator();
        int denomina = fr1.getDenomirator() * fr2.getNumerator();
        Fraccion cociente = new Fraccion(numerador, denomina);
        return simplificar(cociente);
    }

    
    //Metodos de instancia
    public Fraccion suma(Fraccion fr1){
        //X form
        int numerador = (this.numerator * fr1.getDenomirator() + 
                          this.denomirator * fr1.getNumerator());
        int denomina = (this.denomirator * fr1.denomirator);
        Fraccion suma = new Fraccion(numerador, denomina);
        return simplificar(suma);
    }
    public Fraccion resta(Fraccion fr1){
        //X form
        int numerador = (this.numerator * fr1.getDenomirator() - 
                          this.denomirator * fr1.getNumerator());
        int denomina = (this.denomirator * fr1.denomirator);
        Fraccion suma = new Fraccion(numerador, denomina);
        return simplificar(suma);
    }
    public Fraccion multiplicar(Fraccion fr){
        int numerador = this.numerator * fr.getNumerator();
        int denom = this.denomirator * fr.getDenomirator();
        Fraccion producto = new Fraccion(numerador, denom);
        return simplificar(producto);
    }
    public Fraccion dividir(Fraccion fr){
        //Double C
        int numerador = this.numerator * fr.getDenomirator();
        int denomina = this.denomirator * fr.getNumerator();
        Fraccion cociente = new Fraccion(numerador, denomina);
        return simplificar(cociente);
    }
    public Fraccion simplificar(){
        int mcd = mcd(this);
        return new Fraccion(this.numerator / mcd, 
                            this.denomirator / mcd);
    }
}
