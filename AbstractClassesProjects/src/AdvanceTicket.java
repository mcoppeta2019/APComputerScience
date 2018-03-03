//	Advance Ticket Class
//	Michael Coppeta
//	This class is a subclass of Ticket

public class AdvanceTicket extends Ticket {

	//instance variables
	private int advanceDays;
	
	//constructor
	public AdvanceTicket(int newNumber, int newAdvanceDays) {
		super(newNumber); //sets number to super's instance variable
		advanceDays = newAdvanceDays; //sets instance variable
		
		if (advanceDays >= 10) { //	10 or more days in advance
			super.setPrice(30.00);  
		} else { //	less than 10 days in advance
			super.setPrice(40.00);
		}
	}
	
	//method prints the refund policy
	public void refundPolicy() {
		System.out.println("Tickets refuded 10 days before event will get full refund."
				+ "\nTickets refunded later get half the price refunded.");
	}
}
