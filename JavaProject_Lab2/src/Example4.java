import java.text.*;
import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		//2. input data from dialog box
		String productName = JOptionPane.showInputDialog("Input product Name : ");
		
		String strUnit = JOptionPane.showInputDialog("Input product Unit : ");
		//convert string to int
		int productUnit = Integer.parseInt(strUnit);
		
		//input price per unit from dialog box
		String strPrice = JOptionPane.showInputDialog("Input price per Unit : ");
		float pricePerUnit = Float.parseFloat(strPrice);
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		
		//show data to dialog box
		double vat = totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null, "Total Price is "
				+frm.format(totalPrice) + " baht." + "\nAdd VAT 7% is " +frm.format(vat) + " baht.");
	}

}
