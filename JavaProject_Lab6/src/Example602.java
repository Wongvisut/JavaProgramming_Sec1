import javax.swing.*;
public class Example602 {

	public static void main(String[] args) {
		int inputYear = Integer.parseInt(JOptionPane.showInputDialog(""
				+ "Input Year"));
		while(!(checkYear(inputYear))) {
			inputYear = Integer.parseInt(JOptionPane.showInputDialog(""
					+ "Please input year between 1000-3000,\nInput year again"));
		}
		JOptionPane.showMessageDialog(null,
				isLeapYear(inputYear)
				?inputYear+"is Leap Year"
						:inputYear+"is not Leap Year");
	}
	public static boolean isLeapYear(int year) {
		if((year%4==0)&&((year%100!=0)||(year%400==0))) {
			return true;
		}
		else return false;
	}
	public static boolean checkYear(int year) {
		if(year>=1000&&year<=3000) {
			return true;
		}
		else return false;
	}
}