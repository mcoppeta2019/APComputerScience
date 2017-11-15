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
	public int getYear(){
		return year;
	}
	
	//mutator for year
	public void setYear(int newYear){
		year = newYear;
	}
	
	//accessor for author
	public String getAuthor(){
		return author;
	}
	
	//mutator for author
	public void setAuthor(String newAuthor){
		author = newAuthor;
	}
	
	//accessor for title
	public String getTitle(){
		return title;
	}
	
	//mutator for title
	public void setTitle(String newTitle){
		title = newTitle;
	}
	
	//accessor for genre
	public String getGenre(){
		return genre;
	}
	
	//mutator for genre
	public void setGenre(String newGenre){
		genre = newGenre;
	}
	
	//BEHAVIORS
	
	//toString method
	public String toString(){
		return("Title: " + title + "\nAuthor: " + author + "\nGenre: " +
				genre + "\nPages: " + pages + "\nYear: " + year);
	}
	
	//equals method
	public boolean equals(Book b){
		return (title.equals(b.title) && author.equals(b.author) &&
				genre.equals(b.genre) && pages == b.pages &&
				year == b.year);
	}
}
