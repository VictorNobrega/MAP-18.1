
public class Chaves implements Decorador {

	private Decorador decorado;

	public Chaves(Decorador decorado) {
		this.decorado = decorado;
	}

	@Override
	public String getDecorator() {
		return "{" + decorado.getDecorator() + "}";
	}
}
