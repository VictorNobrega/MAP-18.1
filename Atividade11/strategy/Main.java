
public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Cargo.DESENVOLVEDOR, 2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());

		Funcionario outroFuncionario = new Funcionario(Cargo.DBA, 1700, 1);
		System.out.println(outroFuncionario.calcularGratificacao());

		Funcionario umFuncionario2 = new Funcionario(Cargo.DESENVOLVEDOR, 2100, 2);
		System.out.println(umFuncionario.calcularGratificacao());

		Funcionario outroFuncionario2 = new Funcionario(Cargo.DBA, 1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());

		Funcionario funcionarioLider = new Funcionario(Cargo.LIDER, 2500, 1);
		System.out.println(funcionarioLider.calcularGratificacao());

		Funcionario funcionarioGerente = new Funcionario(Cargo.GERENTE, 3000, 1);
		System.out.println(funcionarioGerente.calcularGratificacao());

		Funcionario funcionarioLider2 = new Funcionario(Cargo.LIDER, 2500, 2);
		System.out.println(funcionarioLider.calcularGratificacao());

		Funcionario funcionarioGerente2 = new Funcionario(Cargo.GERENTE, 3000, 2);
		System.out.println(funcionarioGerente.calcularGratificacao());
	}
}
