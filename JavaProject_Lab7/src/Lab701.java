import java.util.*;
public class Lab701 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] number = new int[7];
		
		for(int i = 0; i < number.length; i++) {
			System.out.print("Input number " + (i + 1) + " : ");
			number[i] = scan.nextInt();
		}
			
		int oddCount = 0;
			for(int _number : number) {
				if (_number % 2 == 1) {
					oddCount++;
				}
			}
			System.out.println();
			System.out.println("There are "+ oddCount + " of odd number.");
			System.out.print("List of odd number : ");
			for(int _number : number) {
				if (_number % 2 == 1) {
					System.out.print(_number + " ");
				}
			}
	}
}