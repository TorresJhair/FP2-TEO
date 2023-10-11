class Cuenta{

	private String dueno;
	private double saldo;
	private int id;
	private String tipo;
	
	public Cuenta(String dueno, double saldo, int id, String tipo) {
		this.dueno = dueno;
		this.saldo = saldo;
		this.id = id;
		this.tipo = tipo;
	}
	public Cuenta() {
	}
	public String toString(){
		return "Saldo de la cuenta: " + saldo;
	}

	//Setters
	public void setDueno(String dueno) {
		this.dueno = dueno;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	//Getters
	public String getDueno() {
		return dueno;
	}
	public double getSaldo() {
		return saldo;
	}
	public int getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}

	//Metodos adicionales
	public void mostrarSaldo(){
		System.out.println(toString());
	}
	public void depositar(double dinero){
		this.saldo += dinero;
	}
	public void retirar(double dinero){
		if(this.saldo >= dinero)
			this.saldo -= dinero;
		else
			System.out.println("Saldo insuficiente");
	}
}
