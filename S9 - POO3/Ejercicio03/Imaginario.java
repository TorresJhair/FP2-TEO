class Imaginario{
    private int realPart;
    private int imaginaryPart;

    //Constructores
    public Imaginario(int real, int imaginario){
        this.realPart = real;
        this.imaginaryPart = imaginario;
    }
    public Imaginario(int real){
        this(real, 0);
    }
    public Imaginario(){
        this(1, 1);
    }

    public String toString(){
        return realPart + " + " + imaginaryPart + "i" + 
        "\n" + "(" + realPart + ", " + imaginaryPart + ")";     
    }

    //Getters y Setters
    public int getRealPart() {
        return realPart;
    }
    public void setRealPart(int realPart) {
        this.realPart = realPart;
    }
    public int getImaginaryPart() {
        return imaginaryPart;
    }
    public void setImaginaryPart(int imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }

    //Metodos de clase
    public static Imaginario sumar(Imaginario img1, Imaginario img2){
        int imaginaryPart = img1.getImaginaryPart() + img2.getImaginaryPart();
        int realPart = img1.getRealPart() + img2.getRealPart();
        return new Imaginario(realPart, imaginaryPart);
    }
    public static Imaginario restar(Imaginario img1, Imaginario img2){
        int imaginaryPart = img1.getImaginaryPart() - img2.getImaginaryPart();
        int realPart = img1.getRealPart() - img2.getRealPart();
        return new Imaginario(realPart, imaginaryPart);
    }
    public static Imaginario multiplicar (Imaginario img1, Imaginario img2){
        int imaginaryPart = (img1.getImaginaryPart() * img2.getRealPart()) + 
                            (img1.getRealPart() * img2.getImaginaryPart());
    int realPart = (img1.getRealPart() * img2.getRealPart()) + 
                    (img1. getImaginaryPart() * img2.getImaginaryPart());
        return new Imaginario(realPart, imaginaryPart);
    }
    public static double modulo (Imaginario img){
        int realPartPow = (int)Math.pow(img.getRealPart(), 2);
        int imgPartPow = (int)Math.pow(img.getImaginaryPart(), 2);
        return Math.sqrt(realPartPow + imgPartPow); 
    }
    public static Imaginario conjugado (Imaginario img){
        int conjugado = img.getImaginaryPart() * -1;
        return new Imaginario(img.getRealPart(), conjugado);
    }

    //Metodos de instancia
    public Imaginario sumar(Imaginario img){
        int imaginaryPart = this.getImaginaryPart() + img.getImaginaryPart();
        int realPart = this.getRealPart() + img.getRealPart();
        return new Imaginario(realPart, imaginaryPart);
    }
    public Imaginario restar(Imaginario img){
        int imaginaryPart = this.getImaginaryPart() - img.getImaginaryPart();
        int realPart = this.getRealPart() - img.getRealPart();
        return new Imaginario(realPart, imaginaryPart);
    }
    public Imaginario multiplicar (Imaginario img){
        int imaginaryPart = (this.getImaginaryPart() * img.getRealPart()) + 
                            (this.getRealPart() * img.getImaginaryPart());
    int realPart = (this.getRealPart() * img.getRealPart()) + 
                    (this. getImaginaryPart() * img.getImaginaryPart());
        return new Imaginario(realPart, imaginaryPart);
    }
    public double modulo (){
        int realPartPow = (int)Math.pow(this.getRealPart(), 2);
        int imgPartPow = (int)Math.pow(this.getImaginaryPart(), 2);
        return Math.sqrt(realPartPow + imgPartPow); 
    }
    public Imaginario conjugado (){
        int conjugado = this.getImaginaryPart() * -1;
        return new Imaginario(this.getRealPart(), conjugado);
    }
}