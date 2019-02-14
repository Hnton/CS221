/**
 * Class to to see if a string is a palindrome or not.
 * Gets rid of non alpha-numeric values and converts all characters to lowercase
 * @author Mikael Hinton
 *
 */
public class Palindrome {

	/**
	 * String for a palidrome
	 */
	public static String palStr = "";
	
	/**
	 * Constructor
	 * @param newStr
	 */
	public Palindrome(String newStr) {
		
		palStr = newStr;
	}
	
	/**
	 * Creates a String, Queue and stack and puts each character
	 * from the string into the stack and queue and then removes them
	 * and if they are equal and the queue is empty afterwards then it
	 * returns true and otherwise returns false
	 * @return True - palindrome, false - if not palindrome
	 */
	public static boolean isPalindrome()
	{
		// Makes new string
		String s = new String();
		// Makes new Queue
		Queue queue = new Queue();
		//Makes new stack
		StackReferencedBased stack = new StackReferencedBased();
		
		// Gets rid of all non alpha-numeric values
		String nonStr = palStr.replaceAll("[^a-zA-Z0-9]", "");		
		// Converts all characters to lowercase
		String lowerStr = nonStr.toLowerCase();
		
		// Loops through string and adds it to queue and stack
		for(int i = 0; i < lowerStr.length(); i++)
		{
			s = "" + lowerStr.charAt(i);
			queue.add(s);
			stack.push(s);
		}
		
		// While queue is not empty, if the characters do not match each
		// return false other wise return true
		while(!queue.isEmpty())
		{
			if(!queue.poll().equals(stack.pop()))
			{
				return false;
			}
		}
	return true;
	}
}
