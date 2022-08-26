package Arrays;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<>();
		v.add("SALAH");
		v.add("MUSTAPHA");
		v.add("SIGRID");
		v.add("HYLDA");

		for (String data : v) {
			System.out.println(data);
		}

		

	}

}
