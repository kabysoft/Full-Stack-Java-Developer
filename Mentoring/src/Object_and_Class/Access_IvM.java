package Object_and_Class;

public class Access_IvM {
	
	int puppyAge;

	   public Access_IvM(String name) {
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name );
	   }

	   public void setAge( int age ) {
	      puppyAge = age;
	   }

	   public int getAge( ) {
	      System.out.println("Puppy's age is :" + puppyAge );
	      return puppyAge;
	   }

	   public static void main(String []args) {
	      /* Object creation */
		   Access_IvM myPuppy = new Access_IvM( "tommy" );

	      /* Call class method to set puppy's age */
	      myPuppy.setAge( 2 );

	      /* Call another class method to get puppy's age */
	      myPuppy.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPuppy.puppyAge );
	   }

}
