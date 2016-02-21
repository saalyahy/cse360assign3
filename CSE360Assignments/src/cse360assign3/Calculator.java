/** Description of OrderedIntList
 *  This class is c  calculator that add, subtract, multiply, or divide number, then return the answer if asked.
 *
 * @author Salman Alyahya
 * @pin 109
 * @version Feb 22, 2016.
 */

package cse360assign3;

public class Calculator {
	
	/** total: is an integer variable that hold the total of the calculations.
	 *  history: is a String to store the history of the calculation.
	 *  */
	private int total;
	private String history;
	
	/** This is the constructor of the class Calculator.
	 *  here the variable total get initializes to size 0
	 *  */
	public Calculator () {
		total = 0;  
		history = "0";
	}
	
	/**This method return the value in the variable total. 
	 * 
	 * @return total 			the total of the calculation.
	 * */
	public int getTotal () {
		return total;
	}
	
	/**This method add the given value to the private variable total. 
	 * 
	 * @param value 			the value to be added to the total.
	 * */
	public void add (int value) {
		total = total + value;
		history = history + " + " + value;
	}
	
	/**This method subtract the given value from the private variable total. 
	 * 
	 * @param value 			the value to be subtract from the total.
	 * */
	public void subtract (int value) {
		total = total - value;
		history = history + " - " + value;
	}
	
	/**This method multiply the given value to the private variable total. 
	 * 
	 * @param value 			the value to be multiplied to the total.
	 * */
	public void multiply (int value) {
		total = total * value;
		history = history + " * " + value;
	}
	
	/**This method divide the given value by the private variable total. 
	 * 
	 * @param value 			the value to be divided by the total.
	 * */
	public void divide (int value) {
		if(value == 0)
			total = 0;
		else
			total = total / value;
		history = history + " / " + value;
	}
	
	/**This method return a history of all actions as a String. . 
	 * 
	 * @return 			the history of all actions done so far.
	 * */
	public String getHistory () {
		return history;
	}
}