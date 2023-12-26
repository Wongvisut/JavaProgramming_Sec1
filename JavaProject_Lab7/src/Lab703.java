import java.util.*;
public class Lab703 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num[] = {78, 36, 58, 41, 25, 92, 75};
		int number;
		System.out.print("Input index of array : ");
		number = scan.nextInt();
		while(number<0||number>=num.length) {
			System.out.print("Input index of array, again : ");
			number = scan.nextInt();
		}
		System.out.println();
		System.out.println("Value in current index is "+num[number]);
		if(number==(num.length-1)) 
		{
			System.out.println("Sorry, "+number+" is the last index in array.");
		}
		else System.out.println("Value in next    index is "+num[number+1]);
	}
}