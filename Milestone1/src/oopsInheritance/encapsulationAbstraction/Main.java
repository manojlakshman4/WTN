package oopsInheritance.encapsulationAbstraction;

public class Main {
	public static void main(String[] args) {
		Author author=new Author("Manoj", "manoj@gmail.com","Male");
		Book B=new Book("OOPS",author,100,4);
		B.getBookDetails();
	}
}
