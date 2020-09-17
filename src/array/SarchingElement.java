package array;
import java.util.Scanner;
public class SarchingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the no. u want location");
		int g = sc.nextInt();
		for (int i = 0; i < n ; i++) {
			arr[i] = sc.nextInt();
		}
		int loc = sc.nextInt();
		for(int i = 0 ; i < arr.length; i ++) {
			if (arr[i] == g) {
				loc = i  ;
			}
		}
		System.out.println(loc);
	}
}
