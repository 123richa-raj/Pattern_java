package Pattern;
import java.util.*;

public class Pattern_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						Scanner sc = new Scanner(System.in);
						int n = sc.nextInt();
						int row = 1;
						int star = 1;
						int space = n-4;
						
						while (row <= n) {
							// star
							int i = 1;
							while (i <= space) {
								System.out.print("  ");
								i++;
							}
							int j = 1;
							while(j<= star) {
								System.out.print("* ");
								j++;
							}
							
							// next Row
							// mirror Concept
							if (row < n-3) {
								star+=2;
								space--;
							} else {
								star-=2;
								space++;
							}
							row++;
							System.out.println();
						}
	}
}
