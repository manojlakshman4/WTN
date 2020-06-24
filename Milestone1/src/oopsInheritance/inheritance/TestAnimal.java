package oopsInheritance.inheritance;

public class TestAnimal {
	public static void main(String[] args) {
		Animal A=new Animal();
		Bird B=new Bird();
		A.eat();
		A.sleep();
		B.fly();
		B.sleep();
		B.eat();
	}
}
