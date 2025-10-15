/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:59:09 pm
 * @use student_grade_evaluation 
 * @2025
 */
public class Code_03_student_grade_evaluation {
	public static void main(String[] args) {
		int score = 70;

		if (score >= 90) {
			System.out.println("Grade: A");
		} else if (score >= 80) {
			System.out.println("Grade: B");
		} else if (score >= 70) {
			System.out.println("Grade: C");
		} else if (score >= 60) {
			System.out.println("Grade: D");
		} else {
			System.out.println("Grade: F");
		}
	}
}
