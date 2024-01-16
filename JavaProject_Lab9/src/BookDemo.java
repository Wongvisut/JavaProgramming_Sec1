import java.util.*;
public class BookDemo {

	public static void main(String[] args) {
		Book b1 = new Book();
		Scanner scan = new Scanner(System.in);
		System.out.print("Input book title : ");
		String title = scan.nextLine();
		b1.setTitle(title);
		
		System.out.print("Input book price : "); 
		float price = scan.nextFloat();
		b1.setPrice(price);
		
		System.out.print("Input publish year : ");
		int publishyear = scan.nextInt();
		b1.setPublishyear(publishyear);
		
		System.out.println();
		System.out.println(b1);
	}
}
