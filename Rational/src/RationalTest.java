/*
 * 	Rational Test
 * 	Michael Coppeta
 * 	Tests the Rational Class
 */

public class RationalTest {

	public static void main(String[] args){
		Rational a = new Rational(2,10);
		Rational b = new Rational(4,12);
		Rational d = new Rational(8,24);
		Rational c = new Rational(8);
		
		System.out.println("toString\n" + a + "\n" + b + "\n" + c + "\n" + d);
		System.out.println("equals: \n\t" + d.equals(b) + "\n\t" + a.equals(b));
		System.out.println("reciprocal: \n\t1/3 == " + b.reciprocal());
		
		System.out.println("add:\n\t1/3 + 1/3\t" + d.add(b) + "\n\t1/5 + 8/1\t" + c.add(a)); // 2/3 41/5
		System.out.println("subtract:\n\t1/3 - 1/3\t" + d.subtract(b) + "\n\t8/1 - 1/5\t" + c.subtract(a)); // 0 39/5
		System.out.println("multiply:\n\t1/3 * 1/3\t" + d.multiply(b) + "\n\t1/5 * 8/1\t" + c.multiply(a)); // 1/9 8/5
		System.out.println("divide:\n\t1/3 / 1/3\t" + d.divide(b) + "\n\t1/5 / 8/1\t" + a.divide(c)); // 1 1/40
		
	}
}

