import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylistiteration {

	public static void main(String[] args) {

		ArrayList<String> tvseries = new ArrayList<String>();
		tvseries.add("Game of thrones");
		tvseries.add("Prison break");
		tvseries.add("Breaking bad");

		// 1. With using Java 8 for each and lambda expression
		System.out.println(" Print with using Java 8 for each and lambda expression");
		tvseries.forEach(shows -> {
			System.out.println(shows);
		});

		// 2. using iterator
		System.out.println(" using iterator");
		Iterator<String> it = tvseries.iterator();

		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// 3. using iterator and Java 8 forEachRemianing Method
		System.out.println(" Print using iterator and Java 8 forEachRemianing Method");

		it = tvseries.iterator();
		it.forEachRemaining(shows -> {
			System.out.println(shows);
		});

		// 4. using forEach loop
		System.out.println(" using forEach loop");
		for (String shows : tvseries) {
			System.out.println(shows);
		}

		// 5. Using for loop with order/Index
		System.out.println("------Using for loop with order/Index-----");
		for (int i = 0; i < tvseries.size(); i++) {
			System.out.println(tvseries.get(i));
		}

		// 6. Using listIterator by traversing in Both the directions

		System.out.println("Using listIterator by traversing in Both the directions");
		ListIterator<String> tvseriesListIterator = tvseries.listIterator();
		while (tvseriesListIterator.hasPrevious()) {
			String tv = tvseriesListIterator.previous();
			System.out.println(tv);
		}
	}

}
