/** An interface that describes the operations of fractions.

	@author Jennifer Lai
 */

public interface FractionsInterface 
{
	/**
	  	Gets the numerator of the fraction.
	  	@return The numerator.
	 */
	public int getNum();

	/**
	 * Gets the denominator of the fraction.
	 * @return The denominator.
	 */
	public int getDenom();

	/**
	 	Sets the numerator with a new value.
	 	@param newNum The new value the numerator will hold.
	*/
	public void setNum(int newNum);

	/**
	 	Sets the denominator with a new value.
	 	@param newDenom The new value the denominator will hold.
	*/
	public void setDenom(int newDenom);

	/**
		Adds two fractions together.
	 	@param f2 The second fraction to be added.
	 	@return The result of the addition.
	*/
	public Fractions add (Fractions f2);

	/**
	 	Subtracts two fractions together.
	 	@param f2 The second fraction to be subtracted.
		@return The result of the subtraction.
	*/
	public Fractions subtract (Fractions f2);

	/**
	 	Multiplies two fractions together.
	 	@param f2 The second fraction to be multiplied.
	 	@return The result of the multiplication.
	*/
	public Fractions multiply (Fractions f2);

	/**
	 	Divides two fractions together.
	 	@param f2 The second fraction to be divided.
	 	@return The result of the division.
	*/
	public Fractions divide (Fractions f2);
	
	/**
	 	Simplifies the fraction.
	*/
	public void simplify();
	
	/**
	 	Manages the sign of the fraction.
	*/
	public void signs();
	
	/**
		Prints the fraction or "Undefined".
	*/
	public void printFractions();
}