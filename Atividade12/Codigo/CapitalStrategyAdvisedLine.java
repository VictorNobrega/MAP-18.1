
public class CapitalStrategyAdvisedLine extends CapitalStrategy {

	@Override
	protected double calcStrategyCapital(Loan loan) {
		return loan.getCommitment() * loan.getUnusedPercentage() * super.duration(loan)
				* super.riskFactorFor(loan);	
	}
}
