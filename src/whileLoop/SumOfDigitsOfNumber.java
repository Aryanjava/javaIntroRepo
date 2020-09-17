package whileLoop;
import java.util.Scanner;

public class SumOfDigitsOfNumber {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println(" enter the no.  ");
	     
	     int n = sc.nextInt();
	     
	     int temp = n;
	     int a = 0 ;
	     int sum = 0 ;
	     
	     while(temp > 0) {
	    	 a = temp%10 ;
	    	 sum = sum + a;
	    	 
	         temp =	temp /10 ;
	    	 }
	     System.out.println("sum the digit of " + n + " is " +sum);

	}

}
