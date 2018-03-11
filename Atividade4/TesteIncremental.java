package atividade4;

class Incremental {
	private static Incremental incremental = new Incremental();
	private static int count = 0;
	private static int numero;

	private Incremental() {
	}
	
	public static Incremental getIncremental() {
		numero = ++count;
		return incremental;
	}

	public String toString() {
		return "Incremental " + numero;
	}
}

public class TesteIncremental {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Incremental inc = Incremental.getIncremental();
			System.out.println(inc);
		}
	}
}
