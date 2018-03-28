package atividade6.questao2.a;

public class Carro extends Veiculo {

	private int numPortas;
	private String placa;
	
	public String getModelo() {
		return super.getModelo();
	}

	public void setModelo(String modelo) {
		super.setModelo(modelo);;
	}

	public int getNumLugares() {
		return super.getNumLugares();
	}

	public void setNumLugares(int numLugares) {
		super.setNumLugares(numLugares);
	}

	public int getComprimento() {
		return super.getComprimento();
	}

	public void setComprimento(int comprimento) {
		super.setComprimento(comprimento);
	}

	public int getAno() {
		return super.getAno();
	}

	public void setAno(int ano) {
		super.setAno(ano);
	}

	public String getCor() {
		return super.getCor();
	}

	public void setCor(String cor) {
		super.setCor(cor);
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}
}
