package br.cesed.map.atividade2;

public class App {

	public static void main(String[] args) {

		ContaCorrente contaC = new ContaCorrente("123.456.789-12");

		try {
			contaC.deposito(100.00);
		} catch (ValorInvalidoException e) {
			System.out.println(e);
		}

		System.out.println(contaC.consultarSaldo());

		ContaPoupanca contaP = new ContaPoupanca("234.567.891-23");

		try {
			contaP.deposito(50.00);
		} catch (ValorInvalidoException e) {
			System.out.println(e);
		}

		System.out.println(contaP.consultarSaldo());
	}
}
