import javax.swing.*;
public class Lab705 {
 
	static String odd="",even="";
	public static void main(String[] args) {
		int[] nums = new int[5];
		for(int i = 0; i < nums.length; i++) 
		{
			nums[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter item number "+ (i + 1) + " : "));
		}
		ShowEven(nums);
		ShowOdd(nums);
	}
	
	public static void ShowEven(int[]nums) {
		for(int _nums:nums) 
		{
			if(_nums % 2 == 0) 
			{
				even+= _nums+" ";
        		
			}
		}	
		JOptionPane.showMessageDialog(null, "List of even number : "
				+ "\n"+ even);
	}
	
	public static void ShowOdd (int[]nums) {
		for(int _nums:nums) 
		{
			if(_nums %2==1) 
			{
				odd+= _nums+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number : "
				+ "\n"+ odd);
	}
}