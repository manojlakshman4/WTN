package oopsInheritance.inheritance;

class Animal {
	void eat() {
		System.out.println("Eat");
	}
	void sleep() {
		System.out.println("Sleep");
	}
}

class Bird extends Animal{
	void fly() {
		System.out.println("Fly");
	}
}