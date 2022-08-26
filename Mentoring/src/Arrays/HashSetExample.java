package Arrays;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> list = new HashSet<>();

		list.add("Salah");
		list.add("Mustapha");
		list.add("Sigrid");
		list.add("Hylda");

		
		for (String data : list) {
			System.out.println(data);
		}

	}
}
