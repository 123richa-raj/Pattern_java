package Pattern;
import java.util.*;

public class Pattern_Hourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int star = 2*n+1;
				int space = 0;
				int val = n;
				int row = 1;
				while(row<=2*n+1) {
					int i = 1;
					while(i<=space) {
						System.out.print("  ");
						i++;
					}
					int j = 1;
					int curr = val;
					while(j<=star) {
						System.out.print(curr+" ");
						if(j<star/2+1) {
							curr--;
						}
						else {
							curr++;
						}
						j++;
					}
					i = 1;
					while(i <= space) {
						System.out.print("  ");
						i++;
					}
					if(row<n+1) {
						val--;
						star -= 2;
						space++;
					} else {
						val++;
						star += 2;
						space--;
					}
					row++;
					System.out.println();
				}
	}
}
