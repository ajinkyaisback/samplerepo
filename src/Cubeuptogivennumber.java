import java.util.Scanner;

public class Cubeuptogivennumber {

	public static void cube() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int len = s.nextInt();

		int cube = 0;
		for (int i = 1; i <= len; i++) {
			cube = i * i * i;
			System.out.println("Cube of " + i + " is : " + cube);

		}

	}

	public static void main(String[] args) {

		cube();

	}

}
