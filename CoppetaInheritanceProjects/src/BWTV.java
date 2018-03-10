//	BWTV
//	Michael Coppeta
//	This is a subclass of TV that implements Analog to represent a BWTV

public class BWTV extends TV implements Analog {

	public String rotateRabbitEars() {
		return "Rabbit ears rotated 45 degrees";
	}

	public String tvType() {
		return "I'm a black and white TV";
	}

}
