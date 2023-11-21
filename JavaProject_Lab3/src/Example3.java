import java.text.*;
import javax.swing.*;
public class Example3 {

	public static void main(String[] args) {
		//input and convert weight and height from string to double
		DecimalFormat frm = new DecimalFormat("#,###.00");
		double weight = Double.parseDouble(
				JOptionPane.showInputDialog("InputWeight:"));
		double height = Double.parseDouble(
				JOptionPane.showInputDialog("InputHeight:"));
		//convert height from cm. to m.
		height = height/100;
		//calculate BMI
		double bmi = weight/(height*height);
		String bmiCategory;
		if(bmi < 18.5) bmiCategory = "Underweight";
        else if(bmi <= 24.9) bmiCategory = "Normal-weight";
        else if(bmi <= 29.9) bmiCategory = "Overweight";
        else bmiCategory = "Obesity";
		
		//display BMI from dialog box
		JOptionPane.showMessageDialog(null,"BMI = " +String.format("%.1f",bmi)
				+"\nYou're "+ bmiCategory, "BMI",JOptionPane.WARNING_MESSAGE);
		
	}
}
