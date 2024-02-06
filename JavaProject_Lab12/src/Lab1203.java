import java.io.*;
public class Lab1203 {

	public static void main(String[] args) throws IOException {
		// Using BufferedReader Class for read data from file
		BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//Bookdata.txt"));
		String tmp="";
		int countbook = 0,i=1;
		while((tmp=readFile.readLine()) != null) {
			String[] data = tmp.split("\t");
			System.out.println(data[0]+" ("+ data[1]+"), Rating "+data [2]+
					" publish on "+ data[5]);
			countbook++;
			i++;
		}
		System.out.println("================================================================");
		System.out.println("Total Book = "+ countbook);
		readFile.close();
	}

}
