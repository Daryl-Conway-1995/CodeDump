/*
 * this code is a simple reverse factorial function. 
 * made by Daryl Conway & Tibor Gazsovics
 * */
public class FactorialOperator {
	public String reversingNumber(int input)
	{
		double remainder = input;
		int division = 1;
		//check to see if the number is bigger than 1
		while (remainder > 1 )
		{
			//if it is, slowly divide by increasing numbers
			division++;
			remainder = remainder / division;
			
		}
		//if remainder = 1 then it is a factorial. return the largest number divided by.
		if (remainder == 1)
		{
			return division + "!";
		}
		//if not 1 (decimal places) then it is not a factorial. return none.
		else
		{
			return "NONE";
		}
	}
}
