import java.util.*;
import java.io.*;
public class EmployeeInfo {

	public static void main(String[] args) throws IOException {
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		String choice,department;
		System.out.print("Insert or Read Data? :");
		choice = input.next().toLowerCase();
		
		while(!(choice.equals("insert")) && !(choice.equals("read"))){
			System.out.print("Please type insert or read Data? :");
			choice = input.next().toLowerCase();
		}
		SaveandOpen obj = new SaveandOpen();
		if(choice.equals("insert")) {
			obj.insert(); //call insert() method from SaveandOpen class
		}
		else if(choice.equals("read")) {
			System.out.print("\nEnter dept: ");
			department = input.next();
			obj.setDept(department); //sent department to setDept() method from Employee
			obj.read(); // call read() method from SaveandOpen class
		}
	}
}
