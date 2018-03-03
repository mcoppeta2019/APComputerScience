//	Ticket Class
//	Michael Coppeta
//	This class is at the top of the ticket hierarchy

public abstract class Ticket {

	//instance variables
	private int number;
	private double price;
	
	//constructor
	public Ticket(int newNumber) {
		number = newNumber;
	}
	
	//method returns the number instance variable
	public int getNumber() {
		return number;
	}
	
	//method returns the price instance variable
	public double getPrice() {
		return price;
	}
	
	//method sets the price instance variable to the parameter
	public void setPrice(double newPrice) {
		price = newPrice;
	}
	
	//abstract method will be finished in subclasses
	abstract void refundPolicy();
	
	//toString method prints instance variables
	public String toString() {
		return "Ticket Number: " + number + "\nTicket Price: " + price;
	}
}
