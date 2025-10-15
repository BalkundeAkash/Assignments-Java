/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 10:55:26 pm
 * @use grade_calculator 
 * @2025
 */
public class Code_14_grade_calculator {

	public static void main(String[] args) {
		int marks = 85;
		String grade = (marks >= 90) ? "A+" : (marks >= 80) ? "A" : (marks >= 70) ? "B" : "C";
		System.out.println("Grade: " + grade);
	}
}
