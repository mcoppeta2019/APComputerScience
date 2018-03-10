//	HDTV
//	Michael Coppeta
//	This is a subclass of TV that implements Digital to represent an HDTV

public class HDTV extends TV implements Digital {

	public String connectHDMI() {
		return "HDMI cable connected";
	}

	public String tvType() {
		return "I'm a High Def 24 million color TV";
	}

}
