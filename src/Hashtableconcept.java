import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class Hashtableconcept {

	public static void main(String[] args) {
		// It is similar to hashmap ,but it is synchronized
		// Stores value based on the Key Value Pair
		// Key -> Object -- Hashcode --> Value

		Hashtable h1 = new Hashtable();
		h1.put("A", "Naveen");
		h1.put("B", "TOM");
		h1.put("C", "JAVA");

		// Create a Clone copy/Shallow Copy

		Hashtable h2 = new Hashtable();
		h2 = (Hashtable) h1.clone();

		System.out.println(h1);
		System.out.println(h2);

		h1.clear();
		System.out.println(h1);
		System.out.println(h2);

		// Contains Value

		Hashtable st = new Hashtable();
		st.put("A", "Naveen");
		st.put("B", "TOM");
		st.put("C", "JAVA");

		if (st.containsValue("TOM")) {
			System.out.println("Value is found");
		}

		Enumeration e = st.elements();

		System.out.println("Print Values from ST");

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());

			// Print all the values from ST using entryset
			System.out.println("Print all the values from ST using entryset ");
			Set s = st.entrySet();
			System.out.println(s);
			
			System.out.println("The hashcode value of the ST " +st.hashCode());

		}

	}

}
