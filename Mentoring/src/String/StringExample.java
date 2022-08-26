package String;

public class StringExample {
	public static void main(String[] args) {
		String s1 = "abc"; 
		String s2 = new String("bcd"); 
		s1 = "bcd"; 
		s2 = "cde"; 
		String s3 = new String("cde");
		// ------------------------------

		String s11 = new String("Hello World");
		System.out.println(s11.length());

		String sub = new String("Welcome");
		System.out.println(sub.substring(2));

		String s12 = "Hello";
		String s13 = "Heldo";
		System.out.println(s12.equals(s13));

		System.out.println(s12.toUpperCase());

		// StrinbBuider - Non Synchronized - Good Performance
		//append(String str) method appends the specified string to this
		//character sequence. The characters of the String argument are appended, 
		//in order, increasing the length of this sequence by the length of the argument.
		
		int marks = 90;
		StringBuilder sb = new StringBuilder();
		sb.append("SALAH is");

		if (marks > 80) {
			sb.append(" a good programmer ");
		} else {
			sb.append(" a bad programmer ");
		}

		System.out.println(sb.toString());

		 
	}

}
