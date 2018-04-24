
public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,
				1700, 1);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario umFuncionario2 = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 2);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario2 = new Funcionario(Funcionario.DBA,
				1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario funcionarioLider = new Funcionario(Funcionario.LIDER,
				2500, 1);
		System.out.println(funcionarioLider.calcularGratificacao());
		
		Funcionario funcionarioGerente = new Funcionario(Funcionario.GERENTE,
				3000, 1);
		System.out.println(funcionarioGerente.calcularGratificacao());
		
		Funcionario funcionarioLider2 = new Funcionario(Funcionario.LIDER,
				2500, 2);
		System.out.println(funcionarioLider.calcularGratificacao());
		
		Funcionario funcionarioGerente2 = new Funcionario(Funcionario.GERENTE,
				3000, 2);
		System.out.println(funcionarioGerente.calcularGratificacao());
	}
}
