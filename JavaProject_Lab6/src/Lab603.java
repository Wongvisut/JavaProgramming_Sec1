import java.util.*;
public class Lab603 {

	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {  
		System.out.print("Please enter your name, separated by a space. "
				+ "\n:");
		String fullname = scan.nextLine();
		System.out.println(abbreviatName(fullname));    
	}

	public static String abbreviatName(String fullname) {
		String firstName = fullname.substring(0, fullname.indexOf(' '));
		String middleName = fullname.substring(fullname.indexOf(' ') + 1, fullname.indexOf(' ')+ 2);
		String lastName = fullname.substring(fullname.lastIndexOf(' ')+ 1,fullname.lastIndexOf(' ')+ 2);
		return middleName + "." + lastName + "." + firstName;
	}
}