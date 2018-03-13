//	HDTV
//	Michael Coppeta
//	This is a subclass of TV that implements Digital to represent an HDTV

public class HDTV extends TV implements Digital {

	
	//connectHDMI method returns a message unique to the type of TV
	public String connectHDMI() {
		return "HDMI cable connected";
	}

	//returns the type of TV
	public String tvType() {
		return "I'm a High Def 24 million color TV";
	}

}
