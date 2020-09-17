package gettingStartedLoop;
import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the no. ");
       
       int n = sc.nextInt();
       int cout = 0 ;
       
       for (int i = 2; i < n; i++) {// there is one thing more happen if we want less looping according to math 
    	   if (n%i == 0) {      //according to math logic if a no. is not a prime no. thn its factor will be in 
    		                //in b/w 0<factor<root n so we can also write for(int i=1;i*i<n;i++)
    		   
    		  cout++;
    	   }
       }
       if (cout == 0) {
    		  // System.out.println(" given no. is not a prime ");
    		   System.out.println(" its a prime no.");
    	   }else {
    		  // System.out.println(" its a prime no.");
    		   System.out.println(" given no. is not a prime ");
    	   }
       
	}

}
