package conditionalOperator;
import java.util.Scanner;

public class TernaryOperatorTwo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float a = sc.nextFloat();
		
		float b = sc.nextFloat();
		
		float c = sc.nextFloat();
		
		float greater = a > b ? a > c ? a : c :b > c ? b : c;
		
		System.out.println( greater + " is greater");

	}

}
