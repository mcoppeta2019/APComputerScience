/*
 * 	Book Class
 * 	Michael Coppeta
 * 
 * 	Creates class file for Book
 */

public class Book {

	//INSTANCE VARIABLES
	private int pages, year;
	private String title, author, genre;
	
	//CONSTRUCTORS
	
	//accepts all data
	public Book(int newPages, int newYear, String newTitle, 
			String newAuthor, String newGenre){
		
		pages = newPages;
		year = newYear;
		title = newTitle;
		author = newAuthor;
		genre = newGenre;
	}
	
	//accepts title, and author only
	public Book(String newTitle, String newAuthor){
		this(0, 0, newTitle, newAuthor, "");
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for pages
	public int getPages(){
		return pages;
	}
	
	//mutator for pages
	public void setPages(int newPages){
		pages = newPages;
	}
	
	//accessor for year
	
}
