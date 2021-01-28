import java.util.Scanner;
public class Main {
	static void Method(String uname,int uage) {
		if (uage > 18) {
			System.out.println("Welcome user: "+uname);
		}else {
			System.out.println(" Hello "+uname+" your not able to access this criedsial");
		}
		
		
	}
	
	public static void main (String[] args) {
	String username;
	int userage;
	Scanner  name =new Scanner(System.in);
	username= name.nextLine();
	Scanner age =new Scanner(System.in);
	userage=age.nextInt();
	Method(username,userage);
				
	}
}
