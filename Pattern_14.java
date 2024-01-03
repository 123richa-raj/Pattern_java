package Pattern;
import java.util.*;

public class Pattern_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int row = 1;
				int star = 1;
				int space = n-1;
				
				while (row <= 2 * n - 1) {
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
					if (row < n) {
						star++;
						space--;
					} else {
						star--;
						space++;
					}
					row++;
					System.out.println();
				}
	}
}