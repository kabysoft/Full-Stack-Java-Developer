package Overriding;

public class Animal {
	public void move() {
	      System.out.println("Animals can move");
	   }
	}

	class Dog extends Animal {
	   public void move() {
	      System.out.println("Dogs can walk and run");
	   }
	
	
}
