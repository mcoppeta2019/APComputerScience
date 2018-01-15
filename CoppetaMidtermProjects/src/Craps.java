//	Craps.java
// 	Michael Coppeta
//
//	This program simulates a simplified game of Craps

public class Craps {

	//the main method initiates and runs the game 
	public static void main(String[] args) {
		
		boolean keepGoing = true; //boolean to keep game running
		int currentRound; //int for the sum of the current round
		int point = -1; //declares variable to hold point value
		
		//main loop for game
		while(keepGoing) {
			currentRound = round(); //rolls a round and stores sum
			
			if (point == -1) { //if there's no point value yet
				
				//if the currentRound has a valid point value
				if (currentRound <= 10 && currentRound >= 4 && currentRound != 7) {
					point = currentRound; //point is given the value of the current sum
					
					System.out.println(point + " is now the established POINT.");
				}
				
			} else { //if a point has already been established
				
				if(currentRound == 7) { //if roll is 7, it displays a YOU LOSE message
					System.out.println("YOU LOSE");
					keepGoing = false;
				}
				
				if(currentRound == point) { //if it rolls the point value again, it displays a win message
					System.out.println("YOU WIN");
					keepGoing = false;
				}
			}
		}
	}
	
	//this method represents one round of the game
	//it rolls twice, prints the results, and returns the sum
	public static int round() {
		int die1, die2, sum; //declares two dice values, and a sum
		
		die1 = roll(); //die1 gets a roll
		die2 = roll(); //die2 gets a roll
		sum = die1 + die2; //sum of dice rolls
		
		//prints the results of the computer rolls
		System.out.println("Computer rolls a " + die1 + " and a " + die2 + 
							", for a total of " + sum + ".");
		
		return sum; //returns the sum
		
	}
	
	//this method return the value of a dice roll, 1-6
	public static int roll() { 
		return randInt(1, 6);
	}
	
	//returns a random integer between a and b, inclusive
	public static int randInt(int a, int b) {
		return a + (int)((b - a + 1) * Math.random());
	}
}
