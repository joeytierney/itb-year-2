/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class WalkieTalkie extends HandHeldDevice{
	
	private double rangeInKm;

	public WalkieTalkie(String manufacturer, int weight, double rangeInKm) {
		super(manufacturer, weight);
		this.rangeInKm = rangeInKm;
	}//end constructor
	
	public String toString(){
		return super.toString() + "Range in KM: " + rangeInKm;
	}//end toString

}//end class