import java.text.*;
import java.util.*; //1.import for input data from keyboard 
public class Example3 {

	public static void main(String[] args) {
	//2. Create class Scanner for input data from keyboard
	DecimalFormat frm = new DecimalFormat("#,###.00");
	Scanner input = new Scanner(System.in);
	//3. display and input data
	System.out.print("Input product name : ");
	String productName = input.nextLine();
	System.out.print("Input product unit : ");
	int productUnit = input.nextInt();
	System.out.print("Input price per unit : ");
	float priceperUnit = input.nextFloat();
	System.out.println(); //เว้น
	float totalPrice = productUnit * priceperUnit;
	System.out.println("Total Price is "+frm.format(totalPrice) + " baht.");
	double vat = totalPrice + (totalPrice*7/100);
	System.out.println("Add Vat 7%  is "+frm.format(vat) + " baht.");
	}

}
