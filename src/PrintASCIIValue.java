import java.util.Scanner;

public class PrintASCIIValue {

	public static void main(String[] args) {
		
		
		System.out.print("Enter a character: ");
		Scanner sc =new Scanner(System.in);
		char ch3=sc.next().charAt(0);
		

		char ch = 'a';
		char ch1 = 'b';

		int asciivalue1 = ch;
		int asciivalue2 = ch1;
		System.out.println("The ASCII value of " + ch + " is: " + asciivalue1);
		System.out.println("The ASCII value of " + ch1 + " is: " + asciivalue2);
	}

}
