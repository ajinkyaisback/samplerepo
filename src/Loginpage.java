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
		
