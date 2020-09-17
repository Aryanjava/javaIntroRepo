package userInput;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float radius = sc.nextFloat();
		
		float pi = 3.14f;
		
		float areaOfCircle = radius * pi * pi;
		
		System.out.println("area of circle"+ areaOfCircle);

	}

}
