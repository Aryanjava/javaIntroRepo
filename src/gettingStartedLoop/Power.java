package gettingStartedLoop;
import java.util.Scanner;

public class Power {

	public static void main(String[] args) {
	  
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" enter the value of x");
		
	   int x = sc.nextInt();
	     System.out.println("enter the power");
	     
	     int y = sc.nextInt();
	     
	     int answer = 1;
	     
	     for(int i = 1 ; i <= y ; i++) {
	    	 
	    	 answer = answer * x ;
	    	 
	    	 
	    			 
	    	 
	     }
			
        System.out.println(answer);
	}

}
