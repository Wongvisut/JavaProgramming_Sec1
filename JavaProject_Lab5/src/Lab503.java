import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		
		int index = message.toLowerCase().indexOf("nichi");
		if( index >= 0) 
		{
			System.out.println("Nichi is a sentence");
		}
		
		else
		{
			System.out.println(message);
		}
	}
}