package gettingStartedLoop;
import java.util.Scanner;

public class TableOfnthNo {

	public static void main(String[] args) {
		 
		Scanner sc = new Scanner(System.in);
		
	   System.out.println("enter the no. ");
	   
	   int n = sc.nextInt();
	   
	   for (int i = 1 ; i <= 10 ; i++) {
		   for (int j = 1 ; j <= n ; j++) {
			   System.out.print( i * j + "     ");
			   
		   }System.out.println();
	   }

	}

}
