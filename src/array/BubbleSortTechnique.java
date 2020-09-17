package array;
import java.util.Scanner;
public class BubbleSortTechnique {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no. of element : ");
		int n = sc.nextInt();
		int element[] = new int[n];
		System.out.println("enter the element : ");
		for (int k = 0 ; k < n ; k++) {
			element[k] = sc.nextInt();
			
		}
	//	int element[] = {5,8,2,4,6};
	//	int n = element.length;
		
		int temp = 0;
		for(int i = 0; i < n-1 ; i++) {
			 boolean sorted = true ;
			for (int j = 0; j < n-1-i ; j++) {
				if (element[j] > element[j+1]) {
					temp = element[j+1] ;
					element[j+1] = element[j];
					element[j] = temp;
					sorted	= false ;	
				}
			} if (sorted  ) break;
			}
		for (int item : element) {
			System.out.print(item+ " ");
		}
	}
}
