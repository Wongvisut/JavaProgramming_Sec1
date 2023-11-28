import java.util.*;
public class Lab401 {

	public static void main(String[] args) {
		
		int x, y, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Input vaule of X : ");
        x = scanner.nextInt();

        System.out.print("Input vaule of Y : ");
        y = scanner.nextInt();
        
        while (y <= x) {
        System.out.print("Input vaule of Y, again : ");
        y = scanner.nextInt();
        
        }
        System.out.println();
        
		while(x<y) {
			x++;
			int total = sum+x;
			System.out.println(sum+" + "+x+" = "+total);
			sum=total;
		}
	}

}
