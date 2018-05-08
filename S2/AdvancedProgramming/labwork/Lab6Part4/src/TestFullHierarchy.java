/**
 * 
 */

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 04/03/2017 
 *
 */
public class TestFullHierarchy {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ElectronicDevice e1 = new Computer("Dell", 2, 8, 15.5);
		ElectronicDevice e2 = new LaptopComputer("HP", 2, 16, 12.5, "9 hours");
		ElectronicDevice e3 = new MobilePhone("iPhone", 3, "Meteor");
		ElectronicDevice e4 = new WalkieTalkie("Grimes", 5, 6);
		
		System.out.print(e1.toString());
		System.out.print(e2.toString());
		System.out.print(e3.toString());
		System.out.print(e4.toString());

	}//end main

}//end class