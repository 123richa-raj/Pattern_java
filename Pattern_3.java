package Pattern;
import java.util.*;

public class Pattern_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1;
		int star = n;
		while(row<=n) {
			//star
			int i = 1;
			while(i <= star) {
				System.out.print("* ");
				i++;
			}
			//next row Prep
			row++;
			star--;
			System.out.println();
		}
	}
}