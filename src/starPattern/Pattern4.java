package starPattern;
import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no. of row");
        
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			for(int j = n-i ; j >= 0 ; j--) {
				System.out.print("  ");
			}for(int k = 1; k <= (2*i)-1; k++) {
			       if(k == 1 || k == (2*i)-1) {
			    	   System.out.print(i+" ");
			       }else {
			    	   System.out.print("0 ");
			       }
			}System.out.println();
		}
	}

}
