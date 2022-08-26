package Polymorphism_1;



	class A {
		
		void test() {
			System.out.println("Parent class test method");
		}
	}

	class B extends A {
		
		void test() {
			System.out.println("Child class test method");
		}
	}

	abstract class Vehicle {
		
		abstract void drive();
		
		void petrol() {
			System.out.println("");
		}
	}

	class Toyota extends Vehicle{
		void drive() {
			System.out.println("Toyota - Child class");
		}
	

}
