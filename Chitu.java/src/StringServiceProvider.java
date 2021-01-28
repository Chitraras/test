import java.util.Scanner;
public class StringServiceProvider {
	static String Method1(String text) {
		String lsearch;
		for(int i=text.length();i>0;i--) {
			System.out.println(text.charAt(i-1));
		}
		
		for(int j=0;j<text.length();j++) {
			System.out.println(text.charAt(j));
			char x=text.charAt(j);
			
		return text;
	}
	
	public static void main(String[] args) {
		String givenString;
		Scanner string =new Scanner(System.in);
		givenString=string.nextLine();
		Method1(givenString);
		
			
	}




	
	

	
}
