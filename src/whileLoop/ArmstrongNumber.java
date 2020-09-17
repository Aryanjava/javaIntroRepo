package whileLoop;
import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String [] args ) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the no. ");
		
		int n = sc.nextInt();
		
		int temp = n;
		int sum = 0;
		
		
		while(temp > 0) {
			int a = temp%10;
			int c = a*a*a;
			
			sum = sum + c ; 
			temp = temp / 10 ;
			//System.out.println(a+ " "+c+" "+temp+" "+sum);
		}if(n == sum) {
			System.out.println("the no. is armstrong");
		}else {
			System.out.println("the no. is not a amstrong no.");
		}
	}
}
