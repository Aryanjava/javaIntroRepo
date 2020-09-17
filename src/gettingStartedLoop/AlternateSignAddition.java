package gettingStartedLoop;
import java.util.Scanner;

public class AlternateSignAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the no. ");
		
		int n = sc.nextInt();
		
		double sum = 0;
		for(double i = 1; i <= n ; i++) {
			 
			if (i == 1) {
				sum +=i;
			
			}else if (i%2 == 0) {
				sum -= 1/i;
			}else {
				sum += 1/i;
			}
			
		}
		  System.out.println(sum);
	}

}
