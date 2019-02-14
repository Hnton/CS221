/**
 * Node Class
 * @author Mikael Hinton
 *
 */
public class Node {
	
	Object item;
	Node next;
	
	/*
	 * Constructor
	 */
	protected Node(Object newItem)
	{
		item = newItem;
		next = null;
	}//End of node
	
	/*
	 * Constructor
	 */
	protected Node(Object newItem, Node nextNode)
	{
		item = newItem;
		next = nextNode;
	}//End of node
	
	/*
	 * Getter next
	 */
	protected Node getNext()
	{
		return next;
	}//End of getNext
	
	/*
	 * Getter item
	 */
	protected Object getItem()
	{
		return item;
	}//End of getItem
	
	/*
	 * Setter next
	 */
	protected void setNext(Node nextNode)
	{
		next = nextNode;
	}//End of setNext
	
	/*
	 * Setter item
	 */
	protected void setItem(Object newItem)
	{
		item = newItem;
	}//End of setItem
}//EOF
