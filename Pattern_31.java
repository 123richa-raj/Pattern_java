package Pattern;

import java.util.Scanner;

public class Pattern_31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		int val = n;
		while (row <= n) {
			// star
			int i = 1;
			int p = n;
			while (i <= star) {
				if(i==val) {
					System.out.print("* ");
				}
				else {
					System.out.print(p+" ");
				}
				i++;
				p--;
				
			}
			// next row Prep
			row++;
			val--;
			System.out.println();
		}
	}
}