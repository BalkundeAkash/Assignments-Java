/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 10:37:54 pm
 * @use electricity_bill_calculator
 * @2025
 */
public class Code_11_electricity_bill_calculator {

    public static void main(String[] args) {
        int units = 350; // Number of electricity units used
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.20;
        } else if (units <= 300) {
            bill = 100 * 1.20 + (units - 100) * 2.00;
        } else {
            bill = 100 * 1.20 + 200 * 2.00 + (units - 300) * 3.00;
        }

        System.out.println("Electricity Bill: $ " + bill);
    }
}
