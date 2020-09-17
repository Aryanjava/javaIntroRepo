package conditionalOperator;
import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int b = sc.nextInt();
		
		int greater = a > b ? a : b;
		
		System.out.println(greater + " is greater" );

	}

}
