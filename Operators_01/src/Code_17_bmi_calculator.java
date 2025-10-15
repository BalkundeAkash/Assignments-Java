/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:14:57 pm
 * @use  bmi_calculator
 * @2025
 */
public class Code_17_bmi_calculator {

	public static void main(String[] args) {
		double weight = 86 ; //weight in Kg
		double height = 1.75; //Height in meters
		
		double bmi = weight / (height * height); //BMI formula : weight/height2
		System.out.println("BMI: " +bmi);
		
		
		//Categories BMI 
		String category = (bmi < 18.5) ? "underweight" : (bmi < 24.9) ? "normal" : (bmi < 29.9) ? "Overweight" : "Obese";
		System.out.println("Category:" + category);
	}
}
