package starPattern;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no. of row");

		int n = sc.nextInt();
		
		for(int i = 0; i <= n/2 ; i++) {
			for(int j = 0 ; j < n; j++) {
				if(j < n/2 - i  || j > n/2 +-- i ) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
		for(int i = 1; i<= n/2 ; i++) {
			for(int j = 1; j <= n; j++) {
			if (j <= i || j > n-i) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}System.out.println();
		}
	}
//only for odd no.
}
