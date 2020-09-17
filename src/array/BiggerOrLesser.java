package array;
import java.util.Scanner;
public class BiggerOrLesser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of element:");
		int n = sc.nextInt();
		int [] numbers = new int[n];
		System.out.println(" enter the numbers :");
		
		for(int i = 0 ; i < n; i++) {
			numbers[i] = sc.nextInt();
			
		}
	     int big = numbers[0];
	     for(int i = 0; i < n ;i++) {
	    	 if(numbers[i] > numbers[0]) {
	    		 big = numbers[i];
	    	 }else {
	    	 big = numbers[0];
	    	 }		 
	    	 
	     }System.out.println("Bigest n0. is :" +big);
	   
	}
}
