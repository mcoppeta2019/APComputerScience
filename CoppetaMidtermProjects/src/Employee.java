//	Employee.java
//	Michael Coppeta
//
//	This class represents an employee and has methods that 
//	manage his or her payment and vacation time	

//class represents an employee
public class Employee {

	//INSTANCE VARIABLES
	private String firstName;
	private String lastName;
	private boolean salaried; //true if salaried, false if hourly
	private double wage; //yearly pay if salaried, hourly pay if hourly
	private double earnings = 0.0; //total amount of money an employee has earned
	private double vacationTime = 0.0; //stores the amount of vacation time (in hours)
	
	//CONSTRUCTORS
	
	//this constructor takes first name, last name, salaried, and a wage
	public Employee(String newFirstName, String newLastName, 
			boolean newSalaried, double newWage){
		
		//stores the parameter values in their corresponding instance variables
		firstName = newFirstName;
		lastName = newLastName;
		salaried = newSalaried;
		wage = newWage;
	}
	
	//this constructor takes only the first name and last name
	public Employee(String newFirstName, String newLastName){
		
		//stores the parameter values in their corresponding instance variables
		firstName = newFirstName;
		lastName = newLastName;
		
		//these values are implied based on parameters
		salaried = false;
		wage = 11.0;
		
		//the method is the equivalent of calling:
		// this(newFirstName, newLastName, false, 11.0);
	}
	
	//this constructor takes first name, last name, and salaried
	public Employee(String newFirstName, String newLastName, 
			boolean newSalaried){
		
		//stores parameter values in their corresponding instance variables
		firstName = newFirstName;
		lastName = newLastName;
		salaried = newSalaried;
		
		//determines the wage depending on the value of salaried
		if(salaried){	//if it is a salary pay
			wage = 50000.0; 
		} else {	//if salaried is false, and the pay is hourly
			wage = 11.0;
		}
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for firstName
	public String getFirstName(){
		return firstName;
	}
	
	//mutator for firstName
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	
	//accessor for lastName
	public String getLastName(){
		return lastName;
	}
	
	//mutator for lastName
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	
	//accessor for salaried
	public boolean getSalaried(){
		return salaried;
	}
	
	//mutator for salaried
	public void setSalaried(boolean newSalaried){
		salaried = newSalaried;
	}
	
	//accessor for wage
	public double getWage(){
		return wage;
	}
	
	//mutator for wage
	public void setWage(double newWage){
		wage = newWage;
	}
	
	//accessor for earnings
	public double getEarnings(){
		return earnings;
	}
	
	//mutator for earnings
	public void setEarnings(double newEarnings){
		earnings = newEarnings;
	}
	
	//accessor for vacationTime
	public double getVacationTime(){
		return vacationTime;
	}
	
	//mutator for vacationTime
	public void setVacationTime(double newVacationTime){
		vacationTime = newVacationTime;
	}
	
	//BEHAVIORS
	
	//this method returns the instance variables in the form of a String
	public String toString(){
		String toReturn; //initializes the variable
		toReturn = ("{" + lastName + ", " + firstName + "; "); //adds names
		
		//adds appropriate term based on value of salaried
		if (salaried){ //if salaried
			toReturn += "salaried; $" + wage + "/yr; ";
		} else { //if hourly (not salaried)
			toReturn += "hourly; $" + wage + "/hr; ";
		}
		
		toReturn += "earnings: $" + earnings + "; vacation time: " +
					vacationTime + " hours";
		
		FINISH AND CHECK
		
		
	}
}
