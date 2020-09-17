package array;
import java.util.Scanner;
public class ReverseOfArray {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of element : ");
		
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("enter the element");
		
		for (int i = 0; i < n; i++ ) {
			array [i] = sc.nextInt();
			
		}
		System.out.println("Reverse of the array :");
		
		for (int i = n-1 ; i >= 0; i--) {
			System.out.println(array[i]);
		}
    }
	
}
