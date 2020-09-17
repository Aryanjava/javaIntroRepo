package starPattern;
import java.util.Scanner;

public class Pattern7 {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no. of row");
		
		int n = sc.nextInt();
		
		for (int i = 1 ; i <= n ; i++) {
			for (int j = n-i ; j >=1 ; j--) {
				System.out.print("  ");
			}
			for (int k = 1; k <= i; k++) {
				if(k == 1 || k == i || i == n) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
			}
	}
}
