package userInput;
import java.util.Scanner;
public class Speed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int distance = sc.nextInt();
		float time = sc.nextFloat();
        
		float speed = distance / time ;
		
		System.out.println("speed is "+ speed);
		
		
		
	}

}
