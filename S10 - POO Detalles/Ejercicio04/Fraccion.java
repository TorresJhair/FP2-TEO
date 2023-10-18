class Fraccion {
    private int numerator;
    private int denomirator;

    //Constructores
    public Fraccion(int numerator, int denomirator){
        setNumerator(numerator);
        setDenomirator(denomirator);
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
        return numerator + " / " + denomirator + "\n" +
                (numerator * 1.0 / denomirator);

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
        if(denomirator == 0){
            System.out.println("DENOMINADOR 0 \n POR DEFECTO = 1");
            this.denomirator = 1;
        }
        else{
            this.denomirator = denomirator;
        }
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
        if(fr1.getNumerator() == 0){
            return new Fraccion(0); 
        }
        int mcd = mcd(fr1);
        return new Fraccion(fr1.getNumerator() / mcd, 
                            fr1.getDenomirator() / mcd);
    }
    
    //Metodos de instancia
    public Fraccion sumar(Fraccion fr1){
        //X form
        int numerador = (this.numerator * fr1.getDenomirator() + 
                          this.denomirator * fr1.getNumerator());
        int denomina = (this.denomirator * fr1.denomirator);
        Fraccion suma = new Fraccion(numerador, denomina);
        return simplificar(suma);
    }
    public Fraccion restar(Fraccion fr1){
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
    public Fraccion multiplicar(int num){
        int numerador = this.numerator * num;
        int denom = this.denomirator * num;
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
