import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		int index = fullname.indexOf(" ");
		
		if(index == -1) 
		{
			System.out.println("Incorrect Name");
		}
		
		else 
		{
			String firstName = fullname.substring(0, index);
			String lastName = fullname.substring(index + 1);
			
			System.out.println("First Name: " + firstName.toUpperCase());
			System.out.println("Last Name: " + lastName.toLowerCase());
		}
	}
}
