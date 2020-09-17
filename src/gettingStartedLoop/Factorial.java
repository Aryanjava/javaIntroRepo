package gettingStartedLoop;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Enter the no. whose factorial u want ");
		
		int n =  sc.nextInt();
		
		int factorial = 1;
		
		for(int i = n ;i >= 1 ;i--) {
			factorial = factorial * i ;
			
		}
         System.out.println("factorial of given no. is " + factorial);
	}

}
