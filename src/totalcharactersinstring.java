
public class totalcharactersinstring {

	public static void main(String[] args) {

		String string = "WelC";
		int count = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) != ' ')
				count++;

		}
		System.out.println("total count is :" + count);

	}

}
