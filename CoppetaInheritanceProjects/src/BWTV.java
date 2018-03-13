//	BWTV
//	Michael Coppeta
//	This is a subclass of TV that implements Analog to represent a BWTV

public class BWTV extends TV implements Analog {

	//rotateRabbitEars method returns a message unique to the type of TV
	public String rotateRabbitEars() {
		return "Rabbit ears rotated 45 degrees";
	}

	//returns the type of TV
	public String tvType() {
		return "I'm a black and white TV";
	}

}
