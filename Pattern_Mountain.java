package Pattern;
import java.util.*;

public class Pattern_Mountain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int row = 1;
				int space = 2*n-3;
				int star = 1;
				
				while(row<=n) {
					int i = 1;
					int var=1;
					while(i<=star) {
						System.out.print(var+"\t");
						i++;
						var++;
					}
					int j = 1;
					
					while(j<=space) {
						System.out.print(" \t");
						j++;
						
					}
					int k = 1;
					 var=row;
					 if(row==n) {
						 var=n-1;
					 }
					if(row == n) {
						k=2;
					}
					while(k<=star) {
						System.out.print(var+"\t");
						k++;
						var--;
						
					}
					row++;
					star++;
					space-=2;
					System.out.println();
				}
	}
}