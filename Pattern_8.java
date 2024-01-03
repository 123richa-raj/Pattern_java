package Pattern;
import java.util.*;

public class Pattern_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		int space1=0;
		int space2=n-2;
		for(int row=1;row<=n;row++) {
			for(int i=1;i<=space1;i++) {
				System.out.print("  ");
			}
			System.out.print("* ");
			
			for(int i =1;i<=space2;i++) {
				System.out.print("  ");
			}
			if(row!=n/2+1) {
				System.out.print("* ");
			}
			if(row<=n/2) {
				space1++;
				space2-=2;
			}
			else {
				space1--;
				space2+=2;
			}
			System.out.println();
		}
	}
}