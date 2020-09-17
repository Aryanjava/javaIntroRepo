package starPattern;
import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
            
		Scanner sc  = new Scanner(System.in);
		 
		System.out.println("enter the no. of row");
		
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n-i; j>0 ; j--) {
				System.out.print("  ");
			}for (int k = 1; k <= (2*i)-1; k++) {
				System.out.print(k+" ");
			}System.out.println();
		}

	}

}
