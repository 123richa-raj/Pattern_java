package Pattern;
import java.util.*;

public class Pattern_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row= 1;
		int space = n-1;
		int star = 1;
		int var=n;
		while(row<=n) {
			//space
			int j = 1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
			//star
			int i = 1;
			int p =var;
			while(i<=star) {
				if(i==star/2+1) {
					System.out.print("0"+" ");
				}
				else {
					System.out.print(p + " ");
				}
				if(i<=star/2) {
					p++;
				}
				else {
					p--;
				}
				i++;
			}
		row++;
		star+=2;
		space--;
		var--;
		System.out.println();
		}
	}
}