/**
 * @author Akash D Balkunde
 * @date 15-Oct-2025
 * @time 11:52:04 pm
 * @use login system
 * @2025
 */
public class Code_02_login_system {

	public static void main(String[] args) {
		String username = "admin";
		String password = "admin123";
		
		if(username.equals("admin") && password.equals("admin123")) {
			System.out.println("Login Successfully");
		}else {
			System.out.println("Login Failed");
		}
	}
}
