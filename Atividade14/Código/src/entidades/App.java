package entidades;

public class App {

	public static void main(String[] args) {
		
		Pai pai = new Pai();
		Filho filho = new Filho();
		
		pai.setNome("Fernando");
		pai.setIdade(51);
		
		filho.setPai(pai);
		filho.setNome("Victor");
		filho.setIdade(23);
		filho.setEmail("victor@gmail.com");
		
		System.out.println(pai.mostraDados());
		System.out.println(filho.mostraDados());
	}
}
