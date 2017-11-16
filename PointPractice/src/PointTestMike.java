/*
 * 	Point Test
 * 	Michael Coppeta
 * 
 * 	Tests the Point class
 */

public class PointTestMike {
	
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
		
		p3.setLocation(-9.0, -12.0);
		p1.setLocation(-1.0, 1.0);
		//tests quadrant()
		System.out.println("\nquadrant\n" + p1.quadrant() + "\n" +
				p2.quadrant() + "\n" + p3.quadrant() + "\n" + p4.quadrant());
		//2, 1, 3, 4
		
		//tests toString() and equals()
		System.out.println("\ntoString and equals");
		System.out.println(p1 + "\n" + p2 + "\n" + p3 + "\n" + p4);
		System.out.println("\n" + p1.equals(p2));
		System.out.println(p2.equals(p3)); //f, f
		
		//isVertical
		System.out.println("\nisVertical");
		System.out.println(p1.isVertical(p2));
		p2.setX(p1.getX());
		System.out.println(p1.isVertical(p2));
		
		//rotate
		p1.setLocation(2, 2);
		p1.rotate(Math.PI/2, 0, 0);
		System.out.println("\nRotate\n" + p1);
		
		//manhattan distance and slope
		System.out.println("\nmanhattanDistance\n" + p2 + " " + p3 + "\n" + p2.manhattanDistance(p3));
		System.out.println("\nslope\n" + p2.slope(p3));
		
		//collinear
		System.out.println("\nisCollinear\n" + p1.isCollinear(p2, p3)); //f, t
		p1.setLocation(0, 0);
		p2.setLocation(1, 1);
		p3.setLocation(2, 2);
		System.out.println(p1.isCollinear(p2, p3));
	
	}
	
	
	
}
