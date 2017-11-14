/*
 * 	Circle Test
 * 	Michael Coppeta
 * 
 * 	Tests the Circle class
 */

public class CircleTest {

	public static void main(String[] args){
		//creates objects to test constructors
		Point p1 = new Point(4, 4); //p1 4,4
		Point p2 = new Point(12,10); //p2 12,10
		Circle c1 = new Circle(); //1 0,0
		Circle c2 = new Circle(4);//4 0,0
		Circle c3 = new Circle(p1);//1 4,4
		Circle c4 = new Circle(8, p1);//8 4,4 
		
		System.out.println("\nACCESSORS\nc1 - R: " + c1.getRadius() + " Center: \n" + c1.getCenter());//1 0,0
		System.out.println("c1 - R: " + c2.getRadius() + " Center: \n" + c2.getCenter());//4 0,0
		System.out.println("c1 - R: " + c3.getRadius() + " Center: \n" + c3.getCenter());//1 4,4
		System.out.println("c1 - R: " + c4.getRadius() + " Center: \n" + c4.getCenter());//8 4,4
		
		System.out.println("\nMUTATOR\n");
		c1.setRadius(16); //c1 16 4,4
		c1.setCenter(p1);
		System.out.println(c1.toString());
		
		System.out.println("\ninCIRCLE\n");
		System.out.println(c4.inCircle(p1)); //true
		System.out.println(c4.inCircle(p2)); //?
		
		System.out.println("\ntoSTRING\n");
		System.out.println(c1 + " \n" + c2 + " \n" + c3 + " \n" + c4);
		//16 4,4
		//4 0,0
		//1 4,4
		//8 4,4
	}
}
