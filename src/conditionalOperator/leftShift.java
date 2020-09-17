package conditionalOperator;
import java.util.Scanner;

public class leftShift {

	public static void main(String[] args) {
		// leftshift operator multiply the value into 2
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int n = sc.nextInt();
		
		int c = a << n;
		
		System.out.println(c);
		
	}

}
