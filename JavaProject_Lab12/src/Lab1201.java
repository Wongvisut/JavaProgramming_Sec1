import java.util.Scanner;
import java.io.*;
public class Lab1201 {

	public static void main(String[] args)throws IOException {
        Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
        while(readFile.hasNext()) {
        	//read name from file
        	String fname = readFile.next();//read name
        	String lname = readFile.next().substring(0,1).toUpperCase();;//read last
        	readFile.next();
        	String email = readFile.next().toUpperCase();
        	System.out.println(lname+"."+fname+" "+"("+ email +")");
        }
        readFile.close();
	}
}