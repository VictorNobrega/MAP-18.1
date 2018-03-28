package atividade6.questao2.a;

public class Aviao extends Veiculo {

	private String prefixo;
	private int numTurbinas;

	public String getModelo() {
		return super.getModelo();
	}

	public void setModelo(String modelo) {
		super.setModelo(modelo);
		;
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
