/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 10:40:11 pm
 * @use  LoanEMI
 * @2025
 */
public class Code_12_LoanEMI {

	public static void main(String[] args) {
		double principle = 5000 ; //Loan Amount
		double rate = 0.05; //Monthly interest rate (5% annual)
		int months = 24;
		
		
		//EMI formula
		double emi = (principle * rate * Math.pow(1 + rate , months))/(Math.pow(1 + rate, months)-1);
		System.out.println("Monthly EMI: $" + emi);
	}
}
