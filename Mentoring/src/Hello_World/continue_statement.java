package Hello_World;

public class continue_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numbers = {10, 20, 30, 40, 50};

	      for(int x : numbers ) {
	         if( x == 30 ) {
	            continue;
	         }
	         System.out.print( x );
	         System.out.print("\n");
	      }

	}

}
