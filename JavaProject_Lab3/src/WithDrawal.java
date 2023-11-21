import javax.swing.*;
import java.text.*;
import java.util.*;

import javax.swing.*;
public class WithDrawal {

	public static void main(String[] args) {
		DecimalFormat frm = new DecimalFormat("#,###.00");
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		
		int withdrawMoney = Integer.parseInt(
				JOptionPane.showInputDialog("Your balance : " + frm.format(balance)
					+ "\nInput money to withdraw: "));
		if (withdrawMoney > balance)
            JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than balance"
            		,"ERROR",JOptionPane.ERROR_MESSAGE);
		else if (withdrawMoney > 20000)
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw more than 20,000"
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		else if (withdrawMoney % 100 != 0)
			JOptionPane.showMessageDialog(null, "Error: Cannot withdraw 15 baht."
					,"ERROR",JOptionPane.ERROR_MESSAGE);
		int num1000 = withdrawMoney / 1000;
        int num500 = (withdrawMoney - num1000 * 1000) / 500;
        int num100 = (withdrawMoney - (num1000 * 1000)-(num500*500))/100;
        
        //display Withdraw
		JOptionPane.showMessageDialog(null, "You withdraw " + frm.format(withdrawMoney)+ " baht."
				+ "\n1,000 = " +num1000
				+ "\n500 = " +num500
				+ "\n100 = " +num100);
	}

}
