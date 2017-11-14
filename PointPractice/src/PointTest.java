/*
 * 	Point Test
 * 	Michael Coppeta
 * 
 * 	Tests the Point class
 */

public class PointTest {
	
	//Main method to test Point Class
	public static void main(String[] args){
		
		//tests constructors
		Point p1 = new Point(); //origin
		Point p2 = new Point(3,4); //+ +
		Point p3 = new Point(p2);
		Point p4 = new Point(-3, -4); //- -
		Point p5 = new Point(p4);
		
		//tests accessors
		System.out.println("Accessors");
		System.out.println(p1.getX() + " " + p1.getY());
		System.out.println(p2.getX() + " " + p2.getY());
		System.out.println(p3.getX() + " " + p3.getY());
		System.out.println(p4.getX() + " " + p4.getY());
		System.out.println(p5.getX() + " " + p5.getY());
		
		//tests mutators
		System.out.println("\nMutators");
		p2.setX(6);
		p2.setY(8);
		System.out.println(p2.getX() + " " + p2.getY()); //6.0 8.0
		
		//tests distance()
		System.out.println("\nDistance");
		System.out.println(p1.distance(p2)); //10.0
		System.out.println(p1.distance(p3)); //5.0
		System.out.println(p4.distance(p1)); //5.0
		System.out.println(p1.distance(p4)); //5.0
		
		//tests translate() and setLocation()
		p2.translate(3,4); //9.0 12.0
		p4.translate(10, -10); //7.0 -14.0
		p3.setLocation(9,12);
		
		System.out.println("\nTranslate and setLocation");
		System.out.println(p2.getX() + " " + p2.getY()); //9.0 12.0
		System.out.println(p3.getX() + " " + p3.getY()); //9.0 12.0
		System.out.println(p4.getX() + " " + p4.getY()); //7.0 -14.0
	}
}
