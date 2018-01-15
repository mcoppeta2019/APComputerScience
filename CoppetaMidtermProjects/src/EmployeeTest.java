
public class EmployeeTest {

	public static void main(String[] args) {
		//test constructors
		Employee testA = new Employee("Michael", "Coppeta", true, 400000.0);
		Employee testA2 = new Employee("Michael", "Coppta", false, 25);
		Employee testB = new Employee("Joseph", "Coppeta");
		Employee testC = new Employee("Natalie", "Coppeta", true);
		Employee testC2 = new Employee("Natalie", "Coppeta", false);
		
		//test mutator and accessor
		System.out.println("ACCESSORS and MUTATORS\n\ttestA:" + 
							"\n\t" + testA.getFirstName() + //Michael
							"\n\t" + testA.getLastName() + //Coppeta
							"\n\t" + testA.getSalaried() + //true
							"\n\t" + testA.getWage() + //400000
							"\n\t" + testA.getEarnings() + //0
							"\n\t" + testA.getVacationTime() + //0
							"\n\ttestB:" +
							"\n\t" + testB.getEarnings() + //0
							"\n\t" + testB.getVacationTime() + //0
							"\n\ttestC:" + 
							"\n\t" + testC2.getEarnings() + //0
							"\n\t" + testC2.getVacationTime()); //0
		System.out.println("\ntoString: " +
							"\n" + testA + "\n" + testA2 + "\n" +
							testB + "\n" + testC + "\n" + testC2);
		
		//mutator
		testC2.setFirstName("Spinky");
		testC2.setLastName("Beter");
		testC2.setEarnings(499);
		testC2.setSalaried(true);
		testC2.setVacationTime(1000000);
		testC2.setWage(45);
		
		System.out.println("testC2 Mutated" + "\n" + testC2);
		
		testA.pay(100);
		testB.pay(30);
		System.out.println("pay:\n" + testA.getEarnings() + "\n" + testA.getVacationTime() +
				"\n" + testB.getEarnings() + "\n" + testB.getVacationTime());
		//7692.3, 1.89, 330, 1.89, 1760
		testB.pay(100);
		System.out.println(testB.getEarnings());
		System.out.println(testA + "\n" + testB);
		
		System.out.println("vacation:"); //1.89, 3.78 hrs
		testA.setVacationTime(50);
		testA.takeVacation(10);
		System.out.println(testA); //40 
		testB.takeVacation(400); //error
		System.out.println(testB); //3.78 hrs
		
	}
}
