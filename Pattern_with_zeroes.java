package Pattern;
import java.util.*;
public class Pattern_with_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int row = 1;
			int star = 1;
			int val = 1;
			while(row<=n) {
				int i = 1;
				while(i<=star) {
					if(i==1||i==row) {
					System.out.print(val + "\t");
				}
				else {
					System.out.print("0"+"\t");
					}
					i++;
				}
				row++;
				star++;
				val++;
				System.out.println();
			}
	}
}
