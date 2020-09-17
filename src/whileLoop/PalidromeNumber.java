package whileLoop;
import java.util.Scanner;

public class PalidromeNumber {

	public static  void  main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the no.");
		
	int n = sc.nextInt();
		int temp = n;
		int reverse = 0;
		
		while(temp > 0) {
		int a = temp % 10 ;
		reverse = reverse * 10 + a ;
		
		temp = temp / 10 ;
		//System.out.println(reverse+"  "+temp );
		}
		if (  reverse == n) {
		System.out.println("the given no. is palidrome");
		}else {
			System.out.println("the given no. is not a palidrome");
			
		}
	}
}
