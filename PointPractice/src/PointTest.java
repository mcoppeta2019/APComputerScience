
public class PointTest {
	
	//Main method to test Point Class
	public static void main(String[] args){
		
		//tests constructors
		Point p1 = new Point();
		Point p2 = new Point(3,4);
		Point p3 = new Point(p2);
		
		//tests accessors
		System.out.println(p1.getX() + " " + p1.getY());
		System.out.println(p2.getX() + " " + p2.getY());
		System.out.println(p3.getX() + " " + p3.getY());
		
		
		//tests mutators
		p2.setX(6);
		p2.setY(8);
		System.out.println(p2.getX());
		System.out.println(p2.getY());
		
		//tests distance()
		System.out.println(p1.distance(p2));
		System.out.println(p1.distance(p3));
		
		//tests translate() and setLocation()
		p2.translate(3,4);
		p3.setLocation(9,12);
		
		System.out.println(p2.getX() + " " + p2.getY());
		System.out.println(p3.getX() + " " + p3.getY());
	}
}
