import javax.swing.*;
public class Lab_Example702 {

	public static void main(String[] args) {
		int[] validValues = { 101, 108, 201, 213, 266, 304, 311, 409, 411, 412 };
		double[] price = { 0.89, 1.23, 3.50, 0.69, 5.79, 3.19, 0.99, 0.89, 1.26, 8.00 };

		double ItemPrice = 0.0;
		boolean validItem = false;
		int ItemOrder = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Enter item number to order"));
		
		for(int i = 0; i < validValues.length; i++ ) {
			if(ItemOrder == validValues[i]) {
				validItem = true;
				ItemPrice = price[i];
			}
		}
		if(validItem==true) {
			System.out.print("Item "+ ItemOrder + " is "+ ItemPrice);
		} else {
			System.out.print("Invalid Item");
		}
	}
}
