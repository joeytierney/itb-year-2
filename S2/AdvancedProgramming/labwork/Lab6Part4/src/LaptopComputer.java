/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class LaptopComputer extends Computer{
	
	private String batterylife;

	public LaptopComputer(String manufacturer, int speed, int memory,
			double scrsize, String batterylife) {
		super(manufacturer, speed, memory, scrsize);
		this.batterylife = batterylife;
	}//end constructor
	
	public String toString(){
		return super.toString() + "\nBattery Life: " + batterylife + "\n";
	}//end toString

}//end class