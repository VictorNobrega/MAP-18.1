package br.cesed.map.atividade2;

public class ContaBancaria {

	private String nomeProprietario;
	private String cpf;
	private double saldo;
	
	public ContaBancaria(String cpf) {
		this.cpf = cpf;
	}
	
	public void deposito(double valor) throws ValorInvalidoException {
		if(saldo <= 0) {
			throw new ValorInvalidoException();
		}
		
		saldo += valor;
	}
	
	public double consultarSaldo() {
		return saldo;
	}
	
	public void saque(double valor) throws ValorInvalidoException {
		if(saldo <= 0) {
			throw new ValorInvalidoException();
		}
		
		saldo -= valor;
	}
}
