import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashmapInitialization {
	public static Map<String, Integer> Marksmap;

	static {
		Marksmap = new HashMap<>();

		Marksmap.put("A", 100);
		Marksmap.put("B", 200);
	}

	public static void main(String args[]) {

		// 1.Using HashMap Class

		HashMap<String, String> map1 = new HashMap<>();
		Map<String, String> map2 = new HashMap<>();

		// 2. static way :static hashmap

		System.out.println(HashmapInitialization.Marksmap.get("A"));

		// 3. Immutable Map with only one Single entry
		Map<String, Integer> map3 = Collections.singletonMap("C", 100);
		System.out.println(map3.get("C"));
		// map3.put("D", 500);

		// .4 Jdk 8
		// Creating one 2D array of Strings and using Strings

		Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "AGrade" }, { "Harry", "BGrade" }, })
				.collect(Collectors.toMap(data -> data[0], data -> data[1]));
		System.out.println(map4.get("Tom"));
		

	}

}
