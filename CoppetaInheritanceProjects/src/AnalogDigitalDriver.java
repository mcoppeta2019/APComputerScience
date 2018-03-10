import java.util.ArrayList;

//	Analog Digital Driver
//	Michael Coppeta
//	Uses loops to manipulate instances of TVs

public class AnalogDigitalDriver {

	public static void main(String[] args) {
		
		//creates instances of TVs
		BWTV bw = new BWTV(); //a BWTV
		HDTV hd = new HDTV(); //an HDTV
		
		//creates an ArrayList of TVs
		ArrayList<TV> tvs = new ArrayList<TV>();
		tvs.add(bw); //adds bw to arraylist
		tvs.add(hd); //adds hd to arraylist
		
		//loops through each TV
		for (TV obj : tvs) {
			//prints type and whether it is on or not
			System.out.println(obj.tvType() + "...Am I on? " + obj.getTVON());
		}
		
		//loops through each TV (normal for loop)
		for (int i = 0; i < tvs.size(); i++) {
			if (tvs.get(i).getTVON() == false) { //if the TV is off
				tvs.get(i).setTVON(true); //turn it on
			}
		}
		
		System.out.println("\n"); //two blank lines to match example output
		
		//loops through each TV
		for (TV obj : tvs) {
			//prints type and whether it is on or not
			System.out.println(obj.tvType() + "...Am I on? " + obj.getTVON());
		}
		
		//test subclass behaviors
		System.out.println(bw.rotateRabbitEars()); //tests BWTV rotateRabbitEars method
		System.out.println(hd.connectHDMI()); //tests HDTV connectHDMI method
		
	}
}
