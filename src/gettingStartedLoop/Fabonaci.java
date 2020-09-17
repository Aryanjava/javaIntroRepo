package gettingStartedLoop;
import java.util.Scanner;

public class Fabonaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int a = 0 ;
		int b = 1 ;
		 
		System.out.println("fabonaci no. " +a);
		System.out.println("fabonaci no. " +b);
	 for(int i = 0 ; i < n-2 ; i++) {
		 
		 int c = a + b ;
		 System.out.println("fabonaci no. " + c);
		 
		 a = b;
		 b = c;		 
	 }
       //System.out.println("fabonaci no." + fabonaci);
	}

}
