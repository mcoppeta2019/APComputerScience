
public class JoyalPointTest {

	public static void main(String[] args) {
		Point p1 = new Point(2, 3);
		Point p2 = new Point(4, 5);
		
		System.out.println(p1.getX());
		System.out.println(p1.getY());
		
		System.out.println(p1.toString());
		
		p1.setX(3);
		p1.setY(2);
		
		System.out.println(p1.toString());
		
		p1.setLocation(1, 6);
		
		System.out.println(p1.toString());
		
		p1.translate(1, -2);
		
		System.out.println(p1.toString());
		
		System.out.println(p1.distance(p2));
		System.out.println(p1.equals(p2));
	}

}
