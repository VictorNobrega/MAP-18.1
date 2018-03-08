package br.cesed.map.atividade2;

public class ContaPoupanca {

	private ContaBancaria conta;
	
	public ContaPoupanca(String cpf) {
		this.conta = new ContaBancaria(cpf);
	}
	
	public void deposito(double valor) throws ValorInvalidoException {
		conta.deposito(valor += valor * 0.1);
	}
	
	public void saque(double valor) throws ValorInvalidoException {
		conta.saque(valor);
	}
	
	public double consultarSaldo() {
		return conta.consultarSaldo();
	}
}
