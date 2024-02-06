import java.io.*;
import java.util.Scanner;
import java.util.Scanner.*;
public class Lab1205 {

	public static void main(String[] args) throws IOException {
		Scanner readFile = new Scanner(new File("d://txtFile//student.txt"));
		Header();
		int i=1;
		while(readFile.hasNext()) {
			String id = readFile.next();
			readFile.next();
			String fname = readFile.next().substring(0,1).toUpperCase();
			String lname = readFile.next();
			double grade = readFile.nextDouble();
			readFile.next();
			System.out.println(i+"."+"\t"+id+"\t"+Level(id)+"\t"+fname+"."+lname+"\t"+grade
					+"\t"+Status(grade));
			i++;
		}
		readFile.close();
	}
	public static String Level(String id) {
		int level = 22-Integer.parseInt(id.substring(0, 2));
		return level+"th";
	}
	
	public static String Status(double grade) {
		if (grade >= 2.00) {
            return "Pass";
        } else if (grade >= 1.00 && grade <= 2.00) {
            return "Critical";
        } else {
            return "Retired";
        }
	}
	public static void Header() {
		System.out.println("No.\tID\t\tLevel\tName\t\tGrade\tStatus");
		System.out.println("*****************************************************************************");
	}
}