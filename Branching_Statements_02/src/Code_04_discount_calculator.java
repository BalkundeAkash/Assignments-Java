/**
 * @author Akash D Balkunde
 * @date 16-Oct-2025
 * @time 12:06:34 am
 * @use discount_calculator 
 * @2025
 */
public class Code_04_discount_calculator {
	public static void main(String[] args) {
		double purchaeAmount = 200.0;
		double discount;

		if (purchaeAmount > 100) {
			discount = 0.10;
		} else if (purchaeAmount > 50) {
			discount = 0.05;
		} else {
			discount = 0.0;
		}
		double finalAmount = purchaeAmount - (purchaeAmount * discount);
		System.out.println("Final Amount after discount: $" + finalAmount);
	}
}
