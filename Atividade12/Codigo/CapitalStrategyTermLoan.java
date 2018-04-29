
public class CapitalStrategyTermLoan extends CapitalStrategy {

	@Override
	protected double calcStrategyCapital(Loan loan) {
		return loan.getCommitment() * duration(loan) * super.riskFactorFor(loan);
	}
	
	@Override
	public double duration(Loan loan) {
		return 0;	
	}
}
