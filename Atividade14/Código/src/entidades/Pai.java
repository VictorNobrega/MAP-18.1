package entidades;

import interfaces.IFamilia;

public class Pai implements IFamilia {
	
	private String nome;
	private int idade;
	
	@Override
	public String dados() {
		return "Nome: "+ this.nome  + ", Idade: " + this.idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String mostraDados() {
		return dados(); 
	}
	

}
