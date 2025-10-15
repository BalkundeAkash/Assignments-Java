/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 9:10:05 pm
 * @use ShiftOperators @2025
 */
public class Code_04_ShiftOperators {

	public static void main(String[] args) {
		int num = 16; // Binary : 0010000
		System.out.println("Left Shift: " + (num << 2)); // Shifts bits left by 2 (Multiplies by 4)
		System.out.println("Right Shift: " + (num >> 2)); // Shifts bits right by 2 (Divides by 4)
	}
}
