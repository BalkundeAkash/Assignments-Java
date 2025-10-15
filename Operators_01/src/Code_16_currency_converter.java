/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:10:18 pm
 * @use currency_converter 
 * @2025
 */
public class Code_16_currency_converter {

	public static void main(String[] args) {
		double usd = 100; // Amount in USD
		double conversionRate = 74.85; // Conversion rate from USD to INR

		double inr = usd * conversionRate; // convert into INR
		System.out.println("Amount in INR: " + inr);

	}
}
