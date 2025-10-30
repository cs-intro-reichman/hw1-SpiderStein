// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		double investedSum = Double.parseDouble(args[0]);
		double annualInterestRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = investedSum * Math.pow(1 + annualInterestRate / 100, years);
		System.out.printf("After %d years, $%.0f saved at %.1f%% will yield $%.0f%n", years, investedSum,
				annualInterestRate, Math.floor(futureValue));
	}
}