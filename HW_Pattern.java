package Pattern;
import java.util.*;

public class HW_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						Scanner sc = new Scanner(System.in);
						int n = sc.nextInt();
						int row = 1;
						int star = 1;
						int space = n+3;
						while (row <= n) {
							// space
							int i = 1;
							while (i <= space) {
								System.out.print("  ");
								i++;
							}
							// star
							int j = 1;
							while (j <= star) {
								System.out.print("* ");
								j++;
							}

							// next Row
							System.out.println();
							row++;
							space -= 2;// space = space-2;
							star++;
						}
	}
}