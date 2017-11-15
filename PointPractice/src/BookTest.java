/*
 * 	Book Test
 * 	Michael Coppeta
 * 
 * 	Tests the Book class
 */


public class BookTest {

	public static void main(String[] args){
		Book book1 = new Book(50, 2016, "The Name of the Book", "Vern", "Good Books");
		Book book2 = new Book("Another Book", "Springer");
		
		//tests accessors
		System.out.println("ACCESSOR");
		System.out.println("Book1:\n\tPages: " + book1.getPages() +
				"\t\t\tYear: " + book1.getYear() + "\n\tTitle: " + 
				book1.getTitle() + "\tAuthor: " + book1.getAuthor() + 
				"\n\tGenre: " + book1.getGenre());
		
		//tests mutators and toString
		System.out.println("\nMUTATORS AND TOSTRING");
		System.out.println(book2);
		book2.setPages(40);
		book2.setYear(2016);
		book2.setAuthor("Vern");
		book2.setTitle("The Name of the Book");
		book2.setGenre("Good Books");
		System.out.println(book2);
		
		//tests equals method
		System.out.println("\nEQUALS METHOD");
		System.out.println(book1.equals(book2)); //false
		book2.setPages(50);
		System.out.println(book1.equals(book2)); //true
	}
}
