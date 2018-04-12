
public class Colchetes implements Decorador {

	private Decorador decorado;

	public Colchetes(Decorador decorado) {
		this.decorado = decorado;
	}

	@Override
	public String getDecorator() {
		return "[" + decorado.getDecorator() + "]";
	}
}
