package oopsInheritance.overridingPolymorphism;

public class FruitMain {
	public static void main(String[] args) {
		Fruit a=new Apple("Apple","Sweet","L");
		Fruit o=new Orange("Orange","Sour","M");
		a.eat();
		o.eat();
	}
}
