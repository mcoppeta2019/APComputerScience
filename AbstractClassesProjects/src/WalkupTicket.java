//	Walk Up Ticket Class
//	Michael Coppeta
//	This class is a subclass of Ticket

public class WalkupTicket extends Ticket {

	//constructor
	public WalkupTicket(int newNumber) {
		super(newNumber);
		super.setPrice(50);
	}
	
	//method prints the refund policy
	public void refundPolicy() {
		System.out.println("You cannot refund a walkup ticket.");
	}
}
