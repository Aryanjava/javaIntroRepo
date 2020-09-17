package switchBreak;
import java.util.Scanner;

public class PluseMinusCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		
		float y = sc.nextFloat();
		
		int choice = sc.nextInt();
		
		float result = 0 ;
		
	  switch(choice) {
	  
	  case 1 : 
		   result = x + y ;
		   break;
	  
	  case 2 : 
		   result = x - y ;
		   break;
	  
	  case 3 : 
	  case 4 : 
		  result = x * y;
		  result = x / y;
		  break;
	  
	  default :
		 System.out.println(" Sorry I can't reach your given choice ");
	  
          
	  }
        System.out.println("the result is " + result);
	    
	}}     
	
