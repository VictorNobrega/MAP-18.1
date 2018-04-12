
public class Parentes implements Decorador {

	private Decorador decorado;
	
	public Parentes(Decorador decorado) {
		this.decorado = decorado;
	}
	
	@Override
	public String getDecorator() {
		// TODO Auto-generated method stub
		return "(" + decorado.getDecorator() + ")";
	}
}
