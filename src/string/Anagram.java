package string;
import java.util.Scanner;
public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = "tata";
		String b = "atta";
		boolean anagram = true ;
		int ab[] = new int[256];
		for (char c : a.toCharArray()) {
			int index = (int) c ;
			ab[index]++;
		}
		for (char c : b.toCharArray()) {
			int index = (int) c;
			ab[index]--;
			
		}
		for (int i =0 ; i < 256; i++) {
		if (	ab[i] != 0) {
			anagram = false;
			break;
			
		}
			
		}
		if (anagram) {
			System.out.println(" its anagram");
		}else {
			System.out.println("its not anagram");
		}
			
	}
}
