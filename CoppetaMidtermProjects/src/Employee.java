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
	private double earnings; //total amount of money an employee has earned
	private double vacationTime; //stores the amount of vacation time (in hours)
	
	//CONSTRUCTORS
	
	//this constructor takes first name, last name, salaried, and a wage as parameters
	public Employee(String newFirstName, String newLastName, 
			boolean newSalaried, double newWage){
		
		//stores the parameter values in their corresponding instance variables
		firstName = newFirstName;
		lastName = newLastName;
		salaried = newSalaried;
		wage = newWage;
		
		earnings = 0.0;
		vacationTime = 0.0;
	}
	
	//this constructor takes only the first name and last name as parameters
	public Employee(String newFirstName, String newLastName){
		
		//stores the parameter values in their corresponding instance variables
		firstName = newFirstName;
		lastName = newLastName;
		
		//these values are implied based on parameters
		salaried = false;
		wage = 11.0;
		
		earnings = 0.0;
		vacationTime = 0.0;
		
		//the method is the equivalent of calling:
		// this(newFirstName, newLastName, false, 11.0);
	}
	
	//this constructor takes first name, last name, and salaried as parameters
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
		
		earnings = 0.0;
		vacationTime = 0.0;
	}
	
	//ACCESSORS and MUTATORS
	
	//accessor for firstName
	public String getFirstName(){
		return firstName;
	}
	
	//mutator for firstName, takes new value
	public void setFirstName(String newFirstName){
		firstName = newFirstName;
	}
	
	//accessor for lastName
	public String getLastName(){
		return lastName;
	}
	
	//mutator for lastName, takes new value
	public void setLastName(String newLastName){
		lastName = newLastName;
	}
	
	//accessor for salaried
	public boolean getSalaried(){
		return salaried;
	}
	
	//mutator for salaried, takes new value
	public void setSalaried(boolean newSalaried){
		salaried = newSalaried;
	}
	
	//accessor for wage
	public double getWage(){
		return wage;
	}
	
	//mutator for wage, takes new value
	public void setWage(double newWage){
		wage = newWage;
	}
	
	//accessor for earnings
	public double getEarnings(){
		return earnings;
	}
	
	//mutator for earnings, takes new value
	public void setEarnings(double newEarnings){
		earnings = newEarnings;
	}
	
	//accessor for vacationTime
	public double getVacationTime(){
		return vacationTime;
	}
	
	//mutator for vacationTime, takes new value
	public void setVacationTime(double newVacationTime){
		vacationTime = newVacationTime;
	}
	
	//BEHAVIORS
	
	//this method returns the instance variables in the form of a String
	public String toString(){
		String toReturn; //initializes the variable
		toReturn = ("{Name: " + lastName + ", " + firstName + "; "); //adds names
		
		//adds appropriate term based on value of salaried
		if (salaried){ //if salaried
			toReturn += "salaried; $" + wage + "/yr; ";
		} else { //if hourly (not salaried)
			toReturn += "hourly; $" + wage + "/hr; ";
		}
		
		toReturn += "earnings: $" + earnings + "; vacation time: " +
					vacationTime + " hours}"; //adds remaining instance variables
		
		return toReturn; //returns string
	}
	
	//this method increases earnings depending on their salary type, and adds to vacation time
	//takes hours as a parameter
	public void pay(int hours) {
		int hoursOver = hours - 40; //hours over 40
		
		if (salaried) { //if they have a yearly salary
			earnings += (double) wage / 52;
		} else { //if they have an hourly wage
			
			if (hoursOver >= 0) { //if they work 40 or more hours in a week
				earnings += 40 * wage; //the regular wage for the first 40 hours
				earnings += hoursOver * wage * 1.5; //time and a half for remaining hours
		
			} else { //if they work less than 40 hours in a week
				earnings += wage * hours;
			}
		}
		
		vacationTime += 1.89; //adds to vacation time
	}
	
	//this method represents an employee taking vacation time, if it is possible
	//takes hours as a parameter
	public void takeVacation(int hours) {
		
		if (vacationTime >= hours) { //reduces vacationTime by hours if they have enough time
			vacationTime -= hours; 
		} else { //prints error message if employee doesn't have enough vacation time
			System.out.println("Employee does not have the desired amount of vacation time!");
		}
	}
}
