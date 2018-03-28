package atividade6.questao2.b;

public class Carro extends Veiculo {

	private Veiculo veiculo;
	private int numPortas;
	private String placa;
	
	public String getModelo() {
		return veiculo.getModelo();
	}

	public void setModelo(String modelo) {
		veiculo.setModelo(modelo);;
	}

	public int getNumLugares() {
		return veiculo.getNumLugares();
	}

	public void setNumLugares(int numLugares) {
		veiculo.setNumLugares(numLugares);
	}

	public int getComprimento() {
		return veiculo.getComprimento();
	}

	public void setComprimento(int comprimento) {
		veiculo.setComprimento(comprimento);
	}

	public int getAno() {
		return veiculo.getAno();
	}

	public void setAno(int ano) {
		veiculo.setAno(ano);
	}

	public String getCor() {
		return veiculo.getCor();
	}

	public void setCor(String cor) {
		veiculo.setCor(cor);
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
