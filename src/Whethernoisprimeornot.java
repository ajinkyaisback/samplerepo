
public class Whethernoisprimeornot {

	public static void main(String[] args) {
		int num = 8;
		int temp = 0;

		for (int i = 2; i <= num; i++) {
			if (num % 2 == 0) {
				temp = temp + 1;

			}
		}
		if (temp > 1) {
			System.out.println("Number is not prime");
		} else {
			System.out.println("Number is Prime");
		}

	}
}
