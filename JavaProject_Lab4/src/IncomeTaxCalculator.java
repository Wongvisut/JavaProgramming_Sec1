import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		 // Declare Constants First (Variables May Use These Constants) 
		 final double TAX_RATE_ABOVE_20K = 0.1;
		 final double TAX_RATE_ABOVE_40K = 0.2;
		 final double TAX_RATE_ABOVE_60K = 0.3;
		 // Declare Variables
		 int taxableIncome;
		 double taxPayable;
		 
		 //Assume Input For TaxableIncome
		 taxableIncome = 85000;
		 
		 // Compute Tax Payable In 4 Cases
		 if(taxableIncome<20000) { //[0-20000]
			 taxPayable = 0;
		 }
		 else if(taxableIncome<=40000) { //[20001-40000]
			 taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
		 }
		 else if(taxableIncome<=60000) { //[40001-60000]
			 taxPayable = 20000* TAX_RATE_ABOVE_20K+(taxableIncome-40000) * TAX_RATE_ABOVE_40K;
		 }
		 else { //[60001,]
			 taxPayable = (20000*TAX_RATE_ABOVE_20K) + (20000* TAX_RATE_ABOVE_40K) +
					 (taxableIncome-60000) * TAX_RATE_ABOVE_60K;
		 }
		 
		 //Print Tax Payable Rounded To 2 decimal Places
		 System.out.printf("The income tax payable is: %.2f", taxPayable);
	}

}
