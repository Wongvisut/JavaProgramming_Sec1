import java.io.*;
import java.util.Scanner;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		//input data from keyboard(console)
		System.out.print("Input Section: ");
		int section = input.nextInt();
		Header(section);
		ShowListStudent(section);
	}
		public static void ShowListStudent(int sectionInput) throws IOException {
			BufferedReader readFile = new BufferedReader(new FileReader("d://txtFile//List107.txt"));
			String tmp = "";
			while((tmp= readFile.readLine()) != null) {
				String[] data = tmp.split("\t");
				//read midtem and final score from file to display
				double midtemScore = Double.parseDouble(data[4]);
				double finalScore = Double.parseDouble(data[5]);
				int sectionFile = Integer.parseInt(data[3]);
				
				if(sectionFile==sectionInput) {
					System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScore
							+"\t"+finalScore+findResult(midtemScore,finalScore));
				}
			}
			readFile.close();
		}
		public static String findResult(double midtemscore,double finalscore) {
			double totalScore = midtemscore + finalscore;
		 /* if(totalScore<=40) return "Fail";
			else return "Pass"; */
			return "";
		}
		public static void Header(int sec) {
			System.out.println("*********************************************************");
			System.out.println("\t\tList of Data for Section "+ sec);
			System.out.println("*********************************************************");
		}
}
