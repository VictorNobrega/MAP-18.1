
public class App {

	public static void main(String[] args) {
		
		NumeroUm numero = new NumeroUm();
		
		Decorador decoradorDoNumero = new NumeroDecorator(numero);
		
		decoradorDoNumero = new Parentes(decoradorDoNumero);
		System.out.println(decoradorDoNumero.getDecorator());
		
		decoradorDoNumero = new Colchetes(decoradorDoNumero);
		System.out.println(decoradorDoNumero.getDecorator());
		
		decoradorDoNumero = new Chaves(decoradorDoNumero);
		System.out.println(decoradorDoNumero.getDecorator());
		
	}
}
