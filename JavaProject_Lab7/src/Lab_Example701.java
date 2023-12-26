public class Lab_Example701 {

	public static void main(String[] args) {
		int[] nums = {12, 50, 93, 45, 75, 52, 80};
		for (int i = 0; i < nums.length; i++) {
			System.out.println("nums[" + i + "] = " + nums[i]);
		}
		
		System.out.println("Using foreach to display value of array");
		int j = 0;
		for(int _nums:nums) {
			System.out.println("num[" + j + "] = " +_nums);
			j++;
		}
		printArrayNumber(nums);
	}
	
	public static void printArrayNumber(int[] number) {
		System.out.println("Using method to display value of array");
		for(int i = 0; i < number.length; i++) {
			System.out.println("num[" + i + "] = " + number[i]);
		}
	}
}
