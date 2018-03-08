package br.cesed.map.atividade2;

public class ContaCorrente {

	ContaBancaria conta;

	public ContaCorrente(String cpf) {
		this.conta = new ContaBancaria(cpf);
	}
	
	public void deposito(double valor) throws ValorInvalidoException {
		conta.deposito(valor);
	}
	
	public void saque(double valor) throws ValorInvalidoException {
		conta.saque(valor);
	}
	
	public double consultarSaldo() {
		return conta.consultarSaldo();
	}
}
