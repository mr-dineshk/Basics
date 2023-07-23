//Java Program to check whether input character is vowel or consonant
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the Letter: ");
		char c = scan.next().charAt(0);
		
		if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'||c == 'A'||c == 'E'||c == 'I'||c == 'O'||c == 'U') {
			System.out.print(c+" is a vowel.");
		}
		else {
			System.out.print(c+" is a consonant");
		}
			

	}

}
