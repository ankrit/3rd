
public interface ISwitch {
	String colour="white";
	boolean switchOn();
	boolean switchOff();
	default String getColour()
	{
		return colour;
		
	}
	
	
	
	
	

}
