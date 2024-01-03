package Pattern;
import java.util.*;

public class Pattern_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int star=n;
		int space=n-2;
		for(int row=1;row<=n;row++) {
			if(row>1 && row<n) {
				System.out.print("* ");
				for(int i=1;i<=space;i++) {
					System.out.print("  ");
				}
				System.out.print("* ");
			}
			else {
				for(int i=1;i<=star;i++) {
					System.out.print("* ");
				}
				
			}
			System.out.println();
		}
	}
}