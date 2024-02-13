import java.util.*;
import java.io.*;
public class AddProduct {
	
	public static void main(String[] args) throws IOException {
		//Create Object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		
		//Create Object for write data to file Use PrintWriter Class
		/* FileWriter filename = new FileWriter("d://txtFile//product.txt",true);
		PrintWriter writeFile = new PrintWriter(filename); */
		
		PrintWriter writeFile = new PrintWriter(new FileWriter("d://txtFile//product.txt"));
		
		System.out.print("Product Id: ");
		String productId = input.next();
		System.out.print("Product Name: ");
		String productName = input.next();
		System.out.print("Product Unit: ");
		int productUnit = input.nextInt();
		System.out.print("Product Price: ");
		float productPrice = input.nextFloat();
		
		//Insert(Save) all data to File(after the previous data)
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("Write file already...");
		
		writeFile.close();
	}
}
