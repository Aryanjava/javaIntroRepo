package gettingStartedLoop;
import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
      
      System.out.println("enter the value of n");
      
      int n = sc.nextInt();
     
      double sum = 0 ;
   
      for (float i = 1 ; i <= n; i++ ) {// here we r taking float because 1/i gives a decimal value
    	      sum += 1/i;
    	   
      }
       System.out.println(sum);

	}

}
