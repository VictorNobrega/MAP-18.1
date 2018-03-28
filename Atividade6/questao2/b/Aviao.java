package atividade6.questao2.b;

public class Aviao {

	private Veiculo veiculo;
	private String prefixo;
	private int numTurbinas;

	public String getModelo() {
		return veiculo.getModelo();
	}

	public void setModelo(String modelo) {
		veiculo.setModelo(modelo);
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

	public String getPrefixo() {
		return prefixo;
	}

	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}

	public int getNumTurbinas() {
		return numTurbinas;
	}

	public void setNumTurbinas(int numTurbinas) {
		this.numTurbinas = numTurbinas;
	}
}
