package Pattern;
import java.util.*;

public class Pattern_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
						Scanner sc = new Scanner(System.in);
						int n = sc.nextInt();
						int row = 1;
						int star = n;
						int space = 0;
						while (row <= 2*n-1) {
							// space
							int i = 1;
							while (i <= space) {
								System.out.print("  ");
								i++;
							}
							// star
							int j = 1;
							while (j <= star) {
								System.out.print("* ");
								j++;
							}
							if(row<n) {
								space+=2;
								star--;
							}
							else {
								space-=2;
								star++;
							}

							// next Row
							System.out.println();
							row++;
						}
	}
}