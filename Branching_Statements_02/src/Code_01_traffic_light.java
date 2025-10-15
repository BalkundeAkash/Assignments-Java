/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:44:21 pm
 * @use traffic_light 
 * @2025
 */
public class Code_01_traffic_light {
	public static void main(String[] args) {
		String color = "Green"; //Traffic light color 
		
		if(color.equalsIgnoreCase("Red")) {
			System.out.println("Stop!");
		}else if(color.equalsIgnoreCase("Yellow")) {
			System.out.println("Slow down!");
		}else if(color.equalsIgnoreCase("Green")) {
			System.out.println("Go!");
		}else {
			System.out.println("Invalid color .	");
		}
		
	}
}
