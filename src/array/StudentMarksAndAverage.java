package array;
import java.util.Scanner;
public class StudentMarksAndAverage {

	public static void main(String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no. of student : ");
		
		int n = sc.nextInt();
		System.out.println("Now enter the marks : ");
		
		int [] marks = new int[n];
		for (int i = 0 ; i < n ; i ++) {
			marks[i] = sc.nextInt();
			
		}
		int sumOfMarks = 0 ;
		for (int i = 0 ; i< n ; i ++) {
			sumOfMarks += marks[i];
			
		}
		float average = sumOfMarks / n ; 
		System.out.println("Average marks of the student: "+ average);
	}
}
