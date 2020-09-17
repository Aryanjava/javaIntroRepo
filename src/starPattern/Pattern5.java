package starPattern;
import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	   
	    System.out.println("enter the no. of rows");
	    
	   int n = sc.nextInt();
	   int l = 1;
	   for(int i = 1 ; i <= n ; i++) {
		   for(int j = 1 ; j <= n; j++) {
			   if (j > n-i) {
				   System.out.print(j%10+" ");
			   }else {
				   System.out.print("  ");
			   }
		   }// System.out.println();
			
		   for (int j =1; j < i ; j++) {
			   
			   System.out.print(n-j+" ");

	        
	    	  }
	      System.out.println();
	      }
	}

}
