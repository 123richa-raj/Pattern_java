package Pattern;
import java.util.*;

public class Fibonacci_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        
		        int n = sc.nextInt();
		        int row = 1;
		        int a = 1;
		        int b = 1;
		       
		        while(row <= n) {

		            if (row == 1) {

		                System.out.print(0);

		            } else if(row == 2) {

		                 System.out.print("1 1");

		            }  else {

		                int i = row;
		                while (i-- > 0) {

		                    int ans = a + b; 
		                    System.out.print(ans + " ");

		                    a = b;
		                    b = ans;
		                }
		            }

		            row += 1;
		            System.out.println();
		        }
	}
}
