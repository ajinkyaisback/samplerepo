import java.util.HashMap;
import java.util.Map;

public class Counttheoccurancestring {

	public static void getcharcount(String name) {

		Map<Character, Integer> charmap = new HashMap<Character, Integer>();
		char strArry[] = name.toCharArray();
		for (char c : strArry) {
			
			// Below If condition will remove the blank counts
			if (!String.valueOf(c).isBlank()) {
				if (charmap.containsKey(c)) {
					charmap.put(c, charmap.get(c) + 1);
				} else {
					charmap.put(c, 1);
				}
			}
		}
		System.out.println(name + " : " + charmap);
	}

	public static void main(String[] args) {

		getcharcount("Java Programming");

	}

}
