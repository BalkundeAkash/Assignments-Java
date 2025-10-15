/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:02:26 pm
 * @use simple_interest_calculator 
 * @2025
 */
public class Code_15_simple_interest_calculator {

	public static void main(String[] args) {
		double principle = 1000;
		double rate = 5;
		int time = 3;

		double simpleInterest = (principle * rate * time) / 100; // Simple interest formula
		System.out.println("Simple Interest: $" + simpleInterest);
	}
}
