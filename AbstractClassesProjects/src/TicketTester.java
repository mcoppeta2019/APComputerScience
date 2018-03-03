//	Ticket Tester
//	Michael Coppeta
//	This class tests the Ticket, AdvanceTicket, and WalkupTicket classes

public class TicketTester {

	public static void main(String[] args) {

		// Tests the WalkupTicket object
		WalkupTicket walk = new WalkupTicket(48);
		System.out.println(walk); //48, 50
		System.out.println(walk.getNumber() + "\n" + walk.getPrice()); //48, 50
		walk.setPrice(walk.getPrice()+1); //51
		System.out.println(walk); //48, 51
		walk.refundPolicy();
		
		// Tests the AdvanceTicket object
		AdvanceTicket a1 = new AdvanceTicket(4, 5); // <10 days
		AdvanceTicket a2 = new AdvanceTicket(8, 15); // >10 days
		
		System.out.println(a1 + "\n" + a2); //4, 40 \n 8, 30
		System.out.println(a1.getNumber() + "\n" + a1.getPrice()); //4, 40
		a1.setPrice(35); 
		System.out.println(a1.getPrice()); //35
		a1.refundPolicy(); a2.refundPolicy();
	
	}
}
