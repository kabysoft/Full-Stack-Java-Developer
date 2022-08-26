package Hello_World;

public class All_Operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int a = 10;
         int b = 20;
         int c = 25;
         int d = 25;

         System.out.println("a + b = " + (a + b) );
         System.out.println("a - b = " + (a - b) );
         System.out.println("a * b = " + (a * b) );
         System.out.println("b / a = " + (b / a) );
         System.out.println("b % a = " + (b % a) );
         System.out.println("c % a = " + (c % a) );
         System.out.println("a++   = " +  (a++) );
         System.out.println("a-- = " + (a--) );

         // Check the difference in d++ and ++d
         System.out.println("d++   = " +  (d++) ); //Increment that variable by 1  and assign it
         System.out.println("++d   = " +  (++d) ); //// Increment that variable and assign back to a

	}

}
