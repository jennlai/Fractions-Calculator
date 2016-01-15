/** A class that performs mathematical computations of two fractions.
	
	@author Jennifer Lai
*/

public class Fractions implements FractionsInterface
{

	private int numer; // to hold a numerator
	private int denom; // to hold a denominator

	// Constructor: Sets up Fraction object with the specified numerator and denominator.
	public Fractions (int num, int de)
	{
		numer = num;
		denom = de;
	}

	/**
		The getNum method returns the numerator.
		@return The numerator.
	*/
	public int getNum()
	{
		return numer;
	}

	/**
		The getDenom method returns the denominator.
		@return The denominator.
	*/
	public int getDenom()
	{
		return denom;
	}

	/**
		The setNum method sets the numerator into a new value.
	 	@param newNum The new numerator.
	*/
	public void setNum(int newNum)
	{
		numer = newNum;
	}

	/**
		The setDenom method sets the denominator into a new value.
 		@param newDenom The new denominator.
	*/
	public void setDenom(int newDenom)
	{
		denom = newDenom;
	}

	/**
		 The add method adds two fractions together and returns the result.
		 @param f2 is the second fraction to be added.
		 @return temp is a fraction object that holds the sum.
	*/
	public Fractions add(Fractions f2)
	{
		int tempNum = numer * f2.getDenom() + f2.getNum() * denom;
		int tempDe = denom * f2.getDenom();
		Fractions temp = new Fractions (tempNum, tempDe);
		temp.simplify();
		return temp;
	}

	/**
	 The subtract method subtracts two fractions together and returns the result.
	 @param f2 is the second fraction to be subtracted.
	 @return temp is a fraction object that holds the result of the difference.
	*/
	public Fractions subtract(Fractions f2)
	{
		int tempNum = numer * f2.getDenom() - f2.getNum() * denom;
		int tempDe = denom * f2.getDenom();
		Fractions temp = new Fractions (tempNum, tempDe);
		temp.simplify();
		return temp;
	}

	/**
		 The multiply method multiplies two fractions together and returns the result.
		 @param f2 is the second fraction to be multiplied.
		 @return temp is a fraction object that holds the product.
	*/
	public Fractions multiply(Fractions f2)
	{
		int tempNum = numer * f2.getNum();
		int tempDe = denom * f2.getDenom();
		Fractions temp = new Fractions (tempNum, tempDe);
		temp.simplify();
		return temp;
	}

	/**
		 The divide method divides two fractions together and returns the result.
		 @param f2 is the second fraction to be divided.
		 @return temp is a fraction object that holds the quotient.
	*/
	public Fractions divide(Fractions f2)
	{
		if (denom == 0 || f2.getDenom() == 0)
		{
			denom = 0;
			f2.setDenom(0);
		}
		int tempNum = numer * f2.getDenom();
		int tempDe = denom * f2.getNum();
		Fractions temp = new Fractions (tempNum, tempDe);
		temp.simplify();
		return temp;	
	}	

	/** 
	 	The simplify method simplifies the fraction.
	*/
	public void simplify()
	{
		int greatestCommonFactor = 1;
		int endCount;

		if (numer < 1) {
			endCount = numer * -1;
		}
		else {
			endCount = numer;
		}

		for (int startCount = 1; startCount <= endCount; startCount++) {
			if (numer%startCount == 0 && denom%startCount == 0) {
				greatestCommonFactor = startCount;
			}
		}

		numer = numer/greatestCommonFactor;
		denom = denom/greatestCommonFactor;
	}

	/** 
	 	The signs method manages the sign of a fraction to be either positive or negative.
	*/
	public void signs()
	{
		if ((numer < 0 && denom < 0) || (numer > 0 && denom < 0))
		{
			numer = numer * -1;
			denom = denom * -1;
		}
	}

	/**
	 	The printFractions method prints out the fraction or "Undefined".
	*/
	public void printFractions()
	{
		signs();

		if (denom == 0)
		{
			System.out.println("Undefined");
		}
		else
		{
			System.out.println(numer + "/" + denom);
		}
	}
}
