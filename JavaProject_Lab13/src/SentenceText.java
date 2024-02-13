import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args) throws IOException {
		//Create Object for write data to file
		PrintStream writeFile = new PrintStream((new File("d://txtFile//sentence.txt")));
		
		//Create Object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next().toUpperCase();
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			//Save Data to File
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save!!");
		writeFile.close();
	}
}
