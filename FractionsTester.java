import java.util.Scanner; // Needed for user input.

/** A client class that asks for the user to make two
  	fractions and prints out the results of the computations.

	@author Jennifer Lai
*/

public class FractionsTester 
{

	public static void main (String[] args)
	{
	
		int num1, num2, de1, de2; // To hold 2 numerators and 2 denominators.
			
		//Create a Scanner object to read user input.
		Scanner keyboard = new Scanner(System.in);
			
		// Ask the user to input an integer for a numerator.
		System.out.print("Enter an integer for a numerator: ");
			
		num1 = keyboard.nextInt();

		// Ask the user to input an integer for a denominator.
		System.out.print("Enter an integer for a denominator: ");

		de1 = keyboard.nextInt();

		// Ask the user to input an integer for a second numerator.
		System.out.print("Enter an integer for another numerator: ");

		num2 = keyboard.nextInt();

		// Ask the user to input an integer for a second denominator
		System.out.print("Enter another integer for another denominator: ");
		
		de2 = keyboard.nextInt();
		
		// Creates two fraction objects that use the numerators and denominators entered by the user.
		Fractions f1 = new Fractions(num1, de1);
		Fractions f2 = new Fractions(num2, de2);
		
		// Prints out the first fraction.
		System.out.print("First fraction: ");
		f1.printFractions();
		
		// Prints out the second fraction.
		System.out.print("Second fraction: ");
		f2.printFractions();
		
		// Adds and prints out the sum of the two fractions.
		System.out.print("Addition of the two fractions: ");
		Fractions result = f1.add(f2);
		result.printFractions();
		
		// Subtracts and prints out the difference of the two fractions.
		System.out.print("Subtraction of the two fractions: ");
		Fractions result2 = f1.subtract(f2);
		result2.printFractions();
		
		// Multiplies and prints out the product of the two fractions.
		System.out.print("Multiplication of the two fractions: ");
		Fractions result3 = f1.multiply(f2);
		result3.printFractions();
		
		// Divides and prints out the quotient of the two fractions.
		System.out.print("Division of the two fractions: ");
		Fractions result4 = f1.divide(f2);
		result4.printFractions();		
	}
}
