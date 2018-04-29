
public class CapitalStrategyRevolver extends CapitalStrategy {

	@Override
	protected double calcStrategyCapital(Loan loan) {
		return loan.outstandingRiskAmount() * super.duration(loan) * super.riskFactorFor(loan)
				+ (loan.unusedRiskAmount() * super.duration(loan) * unusedRiskFactory(loan));
	}

	private double unusedRiskFactory(Loan loan) {
		return 0;
	}
}
