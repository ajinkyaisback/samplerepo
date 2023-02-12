
public class PracticeAlgo {

	public static void main(String args[]) {
		String str = "welcom";
		String revstring = "";
		int StrLen = str.length();

		for (int i = StrLen - 1; i > 0; i--) {
			revstring = revstring + str.charAt(i);
		}
System.out.println(revstring);
	}
}
