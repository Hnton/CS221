/**
 * Implementing the interface ISortedLinkedList
 * @author Mikael Hinton
 *
 */

public class SortedListRefBased implements SortedLinkedListADT {

/****************************VARIABLES***********************************/

	private int size;	// Size of the list
	private Node head;	// Head node of the list
	private Node curr;  // Current node in the list
	
/****************************CONSTRUCTOR METHOD***********************************/

	/**
	 * Creates an empty list
	 */
	public SortedListRefBased()
	{
		size = 0;
		head = null;
	}//End of constructor
	
/****************************PUBLIC METHODS***********************************/
	
	/**
	 * Determine if list is empty
	 * @return bool
	 */
	@Override
	public boolean isEmpty() 
	{
		return(head == null);
	}//End of isEmpty

	/**
	 * Determine number of items in list
	 * @return size
	 */
	@Override
	public int size() 
	{
		return size;
	}//End of size
	
	
	
	
	
	/**
	 * Add an item to list
	 * @param item
	 *  
	 */
	@Override
	public void insert(Integer item) 
	{	
		if(find(item) == true)
		{
			System.out.println(item + " is already in list");
		}
		else
		{
			Node newNode =  new Node(item);
			if(head == null)
			{
				head = newNode;
				size++;
				return;
			}
			else if(item.compareTo(head.getItem()) < 0)
			{
				newNode.next = head;
				head = newNode;
				size++;
			}
			else
			{
				Node after = head.next;
				Node before = head;
				while(after != null)
				{
					if(item.compareTo(after.item) < 0)
					{
						break;
					}
				before = after;
				after = after.next;
				}
			newNode.next = before.next;
			before.next = newNode;
			size++;
			}
		}
	}//End of insert

	/**
	 * Remove an item in list
	 * @param item
	 */
	@Override
	public void remove(Integer item) 
	{
		if(head.item.compareTo(item) == 0)
		{
			head = head.next;
		}
		else
		{
			Node tmp = head;
			Node dummy = null;
			while(tmp.next != null)
			{
				if(tmp.next.item.equals(item))
				{
					tmp.next = tmp.next.next;
					break;
				}
				else
				{
					dummy = tmp.next;
					tmp = tmp.next;
				}
			dummy.next = null;
			}
		}
	size--;
	}//End of remove

	/**
	 * Remove all items from list
	 */
	@Override
	public void removeAll() 
	{
		if(head == null)
		{
			return;
		}
		head = head.next;
		removeAll();
		size --;
	}//End of removeAll

	/**
	 * To see if an item is in the list
	 * @param item
	 * @return bool
	 */
	@Override
	public boolean contains(Integer item) 
	{
		while(head != null)
		{
			if(item.equals(head.item))
			{
				return true;
			}
			else
			{
				head = head.getNext();
				contains(item);
			}
		}
		return false;
	}//End of contains
	
	/**
	 * Returns an array that contains all of the elements in the list.
	 */
	@Override
	public Integer[] getAll() {

		int count;
		Node newNode;
		Integer[] list;
		
		count = 0;
		newNode = head;
		
		while(newNode != null)
		{
			count++;
			newNode = newNode.next;
		}
		
		list = new Integer[count];
		newNode = head;
		count = 0;
		while(newNode != null)
		{
			list[count] = newNode.item;
			count++;
			newNode = newNode.next;
		}
		
		return list;
	}
	
	/**
	 * Helper method to print list as an array
	 */
	public void printArray()
	{
		for(int i = 0; i < getAll().length; i++)
		{
			System.out.print(getAll()[i] + " ");
		}
	}
	
	/**
	 * Helper method to print list to screen
	 */
	public void printList()
	{
		if(head != null)
		{
			curr = head;
			while(curr != null)
			{
				System.out.println(curr.getItem());
				curr = curr.getNext();
			}
		}
	}
	
/****************************PRIVATE METHODS***********************************/
	/**
	 * See if the item is in the list
	 * @param item
	 * @return
	 */
	private boolean find(Integer item)
	{		
		Node newNode = head;
		
		while(newNode != null)
		{
			if(newNode.item.equals(item))
			{
				return true;
			}
		newNode = newNode.next;
		}
	return false;
	}//End of traverse
}//EOF
