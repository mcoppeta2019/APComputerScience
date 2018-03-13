//	Analog Digital Driver
//	Michael Coppeta
//	Uses loops to manipulate instances of TVs

import java.util.ArrayList; //import necessary for lists

public class AnalogDigitalDriver {

	public static void main(String[] args) {
		
		//creates instances of TVs
		BWTV bw = new BWTV(); //a BWTV
		BWTV bw2 = new BWTV(); //another BWTV
		HDTV hd = new HDTV(); //an HDTV
		HDTV hd2 = new HDTV(); //another HDTV
		HDTV hd3 = new HDTV(); //another HDTV
		
		//creates an ArrayList of TVs
		ArrayList<TV> tvs = new ArrayList<TV>();
		tvs.add(bw); //adds bw to arraylist
		tvs.add(bw2); //adds bw2 to arraylist
		tvs.add(hd); //adds hd to arraylist
		tvs.add(hd2); //adds hd2 to arraylist
		tvs.add(hd3); //ads hd3 to arraylist
		
		//loops through each TV - #3a
		for (TV obj : tvs) {
			//prints type and whether it is on or not
			System.out.println(obj.tvType() + "...Am I on? " + obj.getTVON());
		}
		
		//loops through each TV (normal for loop) #3b
		for (int i = 0; i < tvs.size(); i++) {
			if (tvs.get(i).getTVON() == false) { //if the TV is off
				tvs.get(i).setTVON(true); //turn it on
			}
		}
		
		System.out.println("\n"); //two blank lines to match example output
		
		//loops through each TV - #3c
		for (TV obj : tvs) {
			//prints type and whether it is on or not
			System.out.println(obj.tvType() + "...Am I on? " + obj.getTVON());
		}
		
		//test subclass behaviors
		System.out.println(bw.rotateRabbitEars()); //tests BWTV rotateRabbitEars method - #3d "for a BWTV" 
		System.out.println(bw2.rotateRabbitEars()); //same test for bw2
		System.out.println(hd.connectHDMI()); //tests HDTV connectHDMI method - #3e "for a HDTV"
		System.out.println(hd2.connectHDMI()); //same test for hd2
		System.out.println(hd3.connectHDMI()); //same test for hd3
		
	}
}
