/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:27:40 pm
 * @use discount_calculator 
 * @2025
 */
public class Code_19_discount_calculator {
	public static void main(String[] args) {
		double price = 250;
		double discount = 20; // Discount in Percentage

		double discountedPrice = price - (price * discount / 100); // Calculate discounted price
		System.out.println("Discounted Price: $" + discountedPrice);

	}
}
