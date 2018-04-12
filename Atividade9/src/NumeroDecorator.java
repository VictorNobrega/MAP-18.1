
public class NumeroDecorator implements Decorador {

	private NumeroUm numero;

	public NumeroDecorator(NumeroUm numero) {
		this.numero = numero;
	}
	
	public String getDecorator() {
		return this.numero.toString();
	}
	
	
}
