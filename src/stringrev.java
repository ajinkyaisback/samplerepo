
public class stringrev {

	public static void main(String args[]) {

		String st = " THIS ";

		int len = st.length();

		System.out.println(len);
		String rev = " ";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev+ st.charAt(i);
		}

		System.err.println(rev.trim());

	}
}
