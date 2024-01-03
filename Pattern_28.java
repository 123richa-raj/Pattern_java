package Pattern;
import java.util.*;

public class Pattern_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int row = 1;
				int star = 1;
				int space = n - 1;
				int val = 1;
				while (row <= n) {
					// space
					int i = 1;
					while (i <= space) {
						System.out.print("  ");
						i++;
					}
					// star
					int j = 1;
					int p=val;
					while (j <= star) {
						System.out.print(p + " ");
						if (j <= star/2) {
							System.out.print("0");
						} 
						else {
						p--;
						}
						
						j++;
					}
					if(row<=n) {
						star+=2;
						space--;
						val++;
					}
					// next Row Prep
					System.out.println();
					row++;
				}
	}
}