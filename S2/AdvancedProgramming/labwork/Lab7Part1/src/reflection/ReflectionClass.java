/**
 * 
 */
package reflection;

/**
 * @author Joseph Tierney
 * @studentNo B00092923
 * @date 08/03/2017
 *
 */
public class ReflectionClass {
	
	public static String classTester = "relfection.ReflectionClass";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReflectionClass c1 = new ReflectionClass();
		System.out.print(c1.getClass());
		
		Class<ReflectionClass> c2 = ReflectionClass.class;
		System.out.print("\n" + c2);
		
		try{
			Class<?> c3 = Class.forName(classTester);
			System.out.print("\n" + c3.getName());
		}//end try
		catch(ClassNotFoundException e){
			e.printStackTrace();
		}//end catch

	}//end main

}//end class
