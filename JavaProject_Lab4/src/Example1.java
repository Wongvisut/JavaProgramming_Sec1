import java.util.*;
public class Example1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//Display Message And Input Data First Number
		System.out.print("Input a number : ");
		int previousnumber = scan.nextInt();
		
		int currectnumber;
		
		//Loop for Input Second Number
		while(true) {
			System.out.print("Input a number : ");
			currectnumber = scan.nextInt();
			if(currectnumber < previousnumber) {
				System.out.println("BYE BYE");
				break;
			}
			previousnumber = currectnumber;
		}
	}

}
