package Pattern;
import java.util.*;

public class Hollow_Diamond_Pattern {
	public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int row = 1;
			int star=n/2 + 1;
			int space=-1;
			while(row<=n) {
				int i = 1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				int k = 1;
				while(k<=space) {
					System.out.print("  ");
					k++;
				}
				int j = 1;
				if(row==1 || row==n) {
					j=2;
				}
				while(j<=star) {
					System.out.print("* ");
					j++;
				}
				if(row<=n/2) {
					star--;
					space+=2;
				}else {
					star++;
					space-=2;
				}
				row++;
				System.out.println();
			}
	}
}