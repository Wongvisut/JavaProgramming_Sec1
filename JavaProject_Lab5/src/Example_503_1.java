import java.util.*;
import javax.swing.*;

public class Example_503_1 {

	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Input a sentence: ");
		while(!sentence.endsWith(".")) 
		{
			sentence = JOptionPane.showInputDialog("Input a sentence,again : ");
		}
		
		int spacebar = 0;
		for(int i = 0; i < sentence.length(); i++) 
		{
			if(sentence.charAt(i)== ' ') 
			{
				spacebar +=1;
			}
		}
		System.out.println("This sentence has "+ spacebar +"spacebar.");
		System.out.print("This sentence has "+ (spacebar+1) +"word.");
	}

}
