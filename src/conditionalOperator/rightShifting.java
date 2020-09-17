package conditionalOperator;
import java.util.Scanner;

public class rightShifting {

	public static void main(String[] args) {
		// right shifting operator divide the value by 2
      Scanner sc = new Scanner(System.in);
      
      int a = sc.nextInt();
      int n = sc.nextInt();
      
      int b =  a >> n;
      
      System.out.println(b);
	}

}
