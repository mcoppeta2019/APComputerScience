
public class JoyalCircleTest {

	public static void main(String[] args) {
		Point p1 = new Point(3, 5);
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(2);
		Circle c3 = new Circle(p1);
		Circle c4 = new Circle(2, p1);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		System.out.println(c4.getRadius());
		System.out.println(c4.getCenter());
		
		c4.setRadius(5);
		c4.setCenter(new Point(4, 3));
		
		System.out.println(c4);
		System.out.println(c4.inCircle(p1));
	}

}
