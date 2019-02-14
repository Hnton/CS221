/**
 * Determine if string is a prefix expression and evaluate it 
 * @author Mikael Hinton
 *
 */

public class PrefixExpressions implements IPrefixExpressionsADT {
		
	/****************************VARIABLES***********************************/

	public String strExp;	// String expression of prefix
	private int size;		// Size of the strExp
	private int firstEnd;	// First End of the strExp
	
	/**
	 * Default constructor that passes in the string
	 * @param newStrExp
	 */
	public PrefixExpressions(String newStrExp)
	{
		strExp = newStrExp;
		size = strExp.length();
	}
	
	/****************************PUBLIC METHODS***********************************/

	/**
	 * Determine whether the string expression in this class is a prefix expression
	 * @return
	 */
	public boolean isPrefix()
	{
		// Preconditions: The class has a data field  strExp that
		// has been initialized with a string expression that 
		// contains no blank characters.
		// Postconditions: Returns true if the expression is in
		// prefix form, otherwise returns false
		
		int lastChar = endPrefix(0, size - 1);
		if(lastChar >= 0 && lastChar == size - 1)
		{
			return true;
		}
		else
		{
			return false;
		}	
	}// End of isPrefix
	
	/**
	 * Evaluates the prefix expression of strExp 
	 * @param strExp
	 * @return
	 */
	public double evaluatePrefix()
	{
		// Evaluates the prefix expression strExp
		// Preconditions: strExp is a string consisting of a valid
		//		prefix expression containing no blanks
		// Postconditions: Returns the value of the prefix expression
	
		char ch = strExp.charAt(0);
		strExp = strExp.substring(1);
		int chNum = Character.getNumericValue(ch);
		
		if(chNum >= 10 && chNum <= 35)
		{	
			return chNum;
		}
		else
		{
			double operand1 = evaluatePrefix();
			double operand2 = evaluatePrefix();

			if(ch == '+')
			{
				return operand1 + operand2;
			}
			else if(ch == '-')
			{
				return operand1 - operand2;
			}
			else if(ch == '*')
			{
				return operand1 * operand2;
			}
			else if(ch == '/')
			{
				return operand1 / operand2;
			}
		}
		return -1;
	}// End of evaluatePrefix
	
	
	/****************************PRIVATE METHODS***********************************/

	/**
	 * Find the end of a prefix expression, if one exists
	 * @param first
	 * @param last
	 * @return
	 */
	private int endPrefix(int first, int last)
	{
		// Finds the end of a prefix expression, if one exists
		// Preconditions: The substring of strExp from index first
		//      Through last contains no blank characters
		// Postconditions: Returns the index of the last character
		//		in strExp that begins at index first, if one exists, or
		//		returns -1 if no such prefix expression exists.

		if(first < 0 || first > last)
		{
			return -1;
		}
		
		char ch = strExp.charAt(first);
		int chNum = Character.getNumericValue(ch);
		
		if(chNum >= 10 && chNum <= 35)
		{	
			return first;
		}
		else if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
		{
			firstEnd = endPrefix(first + 1, last);
			
			if(firstEnd > -1)
			{
				return endPrefix(firstEnd + 1, last);
			}
			else
			{
				return -1;
			}
		}
		else
		{
			return -1;
		}	  
	}// End of endPrefix
}//EOF
