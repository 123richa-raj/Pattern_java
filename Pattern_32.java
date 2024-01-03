package Pattern;
import java.util.*;

public class Pattern_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = 1;
		int space = 2*n-2;
		while(row<=2*n-1) {
			//star
			int i = 1;
			while(i<=star) {
				if(i%2==0) {
					System.out.print("* "+"\t");
				}
				else {
				System.out.print(row+"\t");
				}
				i++;
			}
			//space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//mirroring
			if(row<n) {
				star+=2;;
				space-=2;
			}
			else {
				star-=2;
				space+=2;
			}
			row++;
			System.out.println();
		}
	}
}