package Polymorphism_1;

public class RuntimePolymorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		b.test();
		
		
		A a = new A();
		a.test();
		
		
		A a1 = new B();
		a1.test();
		
		
		//Vehicle v = new Vehicle();
		
		
		Vehicle v = new Toyota();
		v.drive();
		
	}

	

}
