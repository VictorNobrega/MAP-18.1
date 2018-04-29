
public abstract class CapitalStrategy {

	public double capital(Loan loan) {
		return calcStrategyCapital(loan);
	}

	protected abstract double calcStrategyCapital(Loan loan);

	public double duration(Loan loan) {
		return 0;
	}

	protected double riskFactorFor(Loan loan) {
		return 0;
	}
}
