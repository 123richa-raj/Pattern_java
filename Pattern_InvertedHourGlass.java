package Pattern;
import java.util.*;

public class Pattern_InvertedHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int row=1;
				int star=1;
				int space=2*n-1;
				int var=n;
				while(row<=2*n+1) {
					int i =1;
					int p=n;
					while(i<=star) {
						System.out.print(p+" ");
						i++;
						p--;
					}
					int j =1;
					while(j<=space) {
						System.out.print("  ");
						j++;
					}
					int k =1;
					int m = var;
					if(row==n+1) {
						k=2;
						m=1;
					}
					while(k<=star) {
						System.out.print(m+" ");
						k++;
						m++;
					
						
					}
					if(row<=n) {
						star++;
						space-=2;
						var--;
					}else {
						star--;
						space+=2;
						var++;
					}
					row++;
					
					System.out.println();
				}
	}
}
