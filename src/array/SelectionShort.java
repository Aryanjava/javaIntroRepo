package array;
import java.util.Scanner;
public class SelectionShort {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of element ");
		int n = sc.nextInt();
		int numbers[] = new int[n];
		System.out.println("enter the no. : ");
		for (int i = 0; i < n ; i++) {
			numbers[i] = sc.nextInt();
		}
		int temp = 0;
		for (int k = 0 ; k < n-1 ; k++) {
			int min = k;
			for (int j = k ; j < n; j++) {
				if(numbers[j] < numbers[min]) {
					min = j ;
				}
			}
					temp = numbers[k];
					numbers[k] = numbers[min];
					numbers[min] = temp;
				
			
		}
		for (int each : numbers) {
			System.out.print(each + " ");
		}
	}
}
