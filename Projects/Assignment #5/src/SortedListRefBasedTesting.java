/**
 * Testing SortedListRefBased
 * @author Mikael Hinton
 *
 */
public class SortedListRefBasedTesting {
	
/****************************MAIN METHOD***********************************/

	public static void main(String[] args) {

		System.out.println("\t++++++++++++++++++++++++++++++++++++++");
		System.out.println("\t|     Testing SortedListRefBased     |");
		System.out.println("\t++++++++++++++++++++++++++++++++++++++");

		testingIsEmpty();
		testingSize();
		testingInsert();
		testingRemove();
		testingRemoveAll();
		testingContains();
		testingGetAll();
	}//EOM

/****************************TEST METHODS***********************************/
		
	
	/*
	 * Testing isEmpty
	 */
	public static void testingIsEmpty()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing isEmpty*");
		
		System.out.println("\nIf list is empty:");
		System.out.println("Expected:\ntrue");
		System.out.println("Actual:\n" + list.isEmpty());
		
		System.out.println("\nIf list is not empty:");
		list.insert(new Integer(123456));
		System.out.println("Expected:\nfalse");
		System.out.println("Actual:\n" + list.isEmpty());
	}//End of testingIsEmpty
	
	/*
	 * Testing size
	 */
	public static void testingSize()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing size*");
		
		System.out.println("When list is empty:");
		System.out.println("Expected:\n0");
		System.out.println("Actual:\n" + list.size());
		
		System.out.println("\nWhen list has objects in it:");
		System.out.println("Expected:\n1");
		list.insert(new Integer(2));
		
		System.out.println("Actual:\n" + list.size());
	}//End of testingSize
	
	/*
	 * Testing insert
	 */
	public static void testingInsert()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing insert*");
		
		System.out.println("Inserting 2,5,3,4,1:");
		System.out.println("Expected:\n1\n2\n3\n4\n5");
		System.out.println("Actual:");
		list.insert(new Integer(2));
		list.insert(new Integer(5));
		list.insert(new Integer(3));
		list.insert(new Integer(4));
		list.insert(new Integer(1));
		list.printList();
		System.out.println("\nInserting a number that is already in the list:");
		list.printList();;
		System.out.println("Inserting: 4");
		System.out.print("Output: ");
		list.insert(new Integer(4));
		
		
			
	}//End of testingInsert
	
	/*
	 * Testing remove
	 */
	public static void testingRemove()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing remove*");
		list.insert(new Integer(5));
		list.insert(new Integer(4));
		list.insert(new Integer(3));
		list.insert(new Integer(2));
		list.insert(new Integer(1));
		System.out.println("Removing first number out of the list:");
		System.out.println("Before:");
		list.printList();
		System.out.println("After:");
		list.remove(1);
		list.printList();
		
		System.out.println("Removing random number out of the list:");
		System.out.println("Before:");
		list.printList();
		System.out.println("After:");
		list.remove(3);
		list.printList();
		
		System.out.println("Removing last number out of the list:");
		System.out.println("Before:");
		list.printList();
		System.out.println("After:");
		list.remove(5);
		list.printList();
		
	}//End of testingRemove
	
	/*
	 * Testing removeAll
	 */
	public static void testingRemoveAll()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing removeAll*");

		System.out.println("Removing all numbers in list:");
		list.insert(new Integer(5));
		list.insert(new Integer(4));
		list.insert(new Integer(3));
		list.insert(new Integer(2));
		list.insert(new Integer(1));
		System.out.println("Before:\nSize: " + list.size());
		list.printList();
		list.removeAll();
		System.out.println("After:\nSize: " + list.size());
		list.printList();
	}//End of testingRemoveAll
	
	/*
	 * Testing contains
	 */
	public static void testingContains()
	{
		SortedListRefBased list = new SortedListRefBased();

		System.out.println("\n\t*Testing contains*");

		list.insert(new Integer(2));
		list.insert(new Integer(1234));
		list.insert(new Integer(123));
		list.insert(new Integer(12));
		list.insert(new Integer(1));
		
		System.out.println("If the number(2) is in the list:");
		System.out.println("Expected:\ntrue");
		System.out.println("Actual:\n" + list.contains(2));
		
		System.out.println("\nIf the number(12222) is in the list:");
		System.out.println("Expected:\nfalse");
		System.out.println("Actual:\n" + list.contains(12222));	
	}//End of testingContains
	
	public static void testingGetAll()
	{
		SortedListRefBased list = new SortedListRefBased();
		
		System.out.println("\n\t*Testing getAll*");
		
		list.insert(new Integer(2));
		list.insert(new Integer(1234));
		list.insert(new Integer(123));
		list.insert(new Integer(12));
		list.insert(new Integer(1));
		System.out.println("Printed as list:");
		list.printList();
		System.out.println("Printed as array:");
		list.printArray();

	}
}//EOF
