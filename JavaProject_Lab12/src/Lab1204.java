import java.util.*;
import java.io.*;
public class Lab1204 {

	public static void main(String[] args) throws IOException{
		BufferedReader scan = new BufferedReader(new FileReader("D://txtFile//BookData.txt"));
		Scanner input = new Scanner(System.in);
		String temp = "";
		System.out.print("Enter rating of books: ");
		double ratingBook = input.nextDouble();
		int i=1,count=0;
		System.out.println("-------------------------------------------");
		while((temp=scan.readLine())!=null) {
			String [] data = temp.split("\t");
			double rating = Double.parseDouble(data[2]);
			if(rating>=ratingBook) {
			System.out.println("Book "+i+":"+data[0]+" write by "+data[1]+" ("+data[3]+") reviews");
			count++;
			}
			i++;
		}
		scan.close();
		System.out.println("-------------------------------------------");
		System.out.println("There are "+count+" book get rating more than "+ratingBook);
	}
}