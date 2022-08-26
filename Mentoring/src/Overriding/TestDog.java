package Overriding;

public class TestDog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Animal a = new Animal();   // Animal reference and object
	      Animal b = new Dog();   // Animal reference but Dog object

	      a.move();   // runs the method in Animal class
	      b.move();   // runs the method in Dog class
	}

}
