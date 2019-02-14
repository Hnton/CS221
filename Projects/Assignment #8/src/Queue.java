import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements IQueue<E>{

	// Queue is a generic array
	private E[] items;
	// Number of items in queue
	private int currentSize;
	// Index of first item in queue
	private int front;
	// Index of last item in queue
	private int back;
	// Max size of queue array
	private final int MAX_SIZE = 50;
	
	/**
	 * Constructor 
	 */
	@SuppressWarnings("unchecked")
	public Queue()
	{
		items = (E[]) new Object[MAX_SIZE];
		currentSize = 0;
		front = 0;
		back = 0;
	}// End of constructor
	
	@SuppressWarnings("unchecked")
	@Override
	public boolean add(Object arg0) {
		if(currentSize == MAX_SIZE)
		{
			return false;
		}
		else
		{
			items[back] = (E) arg0;
			back = (back + 1) % items.length;
			++currentSize;
			return true;
		}
	}// End of add
	
	@Override
	public boolean offer(Object e) {
		
		return add(e);
	}// End of offer
	
	@Override
	public E remove() throws NoSuchElementException {
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else
		{
			E removed = items[front];
			front = (front + 1) % MAX_SIZE;
			--currentSize;
			return removed;
		}
	}// End of remove
	
	@Override
	public E poll() {
		
		return remove();
	}// End of poll

	@Override
	public E element() throws NoSuchElementException {
		
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}
		else
		{
			return items[front];
		}
	}// End of element
	
	@Override
	public E peek() {
		
		return element();
	}// End of peek
	
	@Override
	public boolean isEmpty() {

		return currentSize == 0;
	}// End of isEmpty
	
	@Override
	public int size() {
		
		return currentSize;
	}// End of size
	
	@Override
	public void clear() {
		for(int i = 0; i <= currentSize; i++)
		{
			items[i] = null;
		}
		front = 0;
		back = 0;
		currentSize = 0;
	}// End of clear
	
	@Override
	public boolean contains(Object arg0) {

		for(int i = 0; i < currentSize; i++)
		{
			if(items[i].equals(arg0))
			{
				return true;
			}
		}
	return false;
	}// End of contains
	
	
	
	
	/**
	 * Rest of methods are implementing by Collections
	 * but are not needed.
	 */
	
	@Override
	public boolean addAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}// End of allAll

	@Override
	public boolean containsAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}// End of containsAll

// Bonus
	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}// End of iterator

// Research
	@Override
	public boolean remove(Object arg0) {
		// TODO Auto-generated method stub
		return false;
	}// End of remove

// Research
	@Override
	public boolean removeAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}// End of removeAll

	@Override
	public boolean retainAll(Collection arg0) {
		// TODO Auto-generated method stub
		return false;
	}// End of retainAll

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}// End of toArray

	@Override
	public Object[] toArray(Object[] arg0) {
		// TODO Auto-generated method stub
		return null;
	}// End of toArray
}//EOF