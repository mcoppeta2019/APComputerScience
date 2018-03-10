//	TV
//	Michael Coppeta
//	Defines the abstract class TV

public abstract class TV {

	private boolean tvON; //determiens whether tv is on or off
	
	//accessor for tvON
	public boolean getTVON() {
		return tvON;
	}
	
	//mutator for tvON
	public void setTVON(boolean newTVON) {
		tvON = newTVON;
	}
	
	//abstract method tvType to be determined later
	abstract public String tvType();
	
}
