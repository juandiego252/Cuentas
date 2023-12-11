package clearminds.cuentas;

public class Cuenta {

	private String id;
	private String tipo = "A";
	private double saldo;

	public Cuenta(String id) {
		this.id = id;
	}

	public Cuenta(String id, String tipo, double saldo) {
		this.id = id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public String getId() {
		return id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void imprimir() {

		System.out.println("********************");
		System.out.println("CUENTA");
		System.out.println("********************");

		System.out.println("Número de Cuenta: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: USD  " + getSaldo());
	}

	public void imprimirConMiEstilo() {

		System.out.println("-*-*-*-*-*-*-*-*-*-*-*");
		System.out.println("\tCUENTA");
		System.out.println("-*-*-*-*-*-*-*-*-*-*-*");

		System.out.println("----------------------");
		System.out.println("Número de Cuenta: " + getId());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Saldo: USD  " + getSaldo());
		System.out.println("----------------------");
	}

}
