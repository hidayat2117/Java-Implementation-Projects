/***************************************************
 * The Linked List implementation.                 *
 * @author: Vladimir Efros                         *
 * This program implements a String LinkedList.    *
 ***************************************************/

/**
 * The Program test driver.
 */
public class LinkedListImplementation 
{
    public static void main(String[] args)
    {
        LinkedList myList = new LinkedList();
        
        // Add three Strings to the String LinkedList
        String[] nums = {"One", "Two", "Three"};
        for(String s : nums)
            myList.add(s);

		// Display the result
        System.out.println(myList);
	
		// Display the size of the array
		System.out.println(myList.size());
	
		for(int i = 0; i < myList.size(); i++)
            System.out.println("The String \"" + myList.get(i) + "\" at the position " + i);
        
        // Remove three Strings from the String LinkedList
        myList.remove("One");
        myList.remove("Two");
        myList.remove("Three");

		// Display the result
        System.out.println(myList);
        
        // Add three Strings to the String LinkedList at the specified location
        myList.add("Zero");
        myList.add(1, "newOne"); 
        myList.add(2, "NewTwo"); 

		// Display the result
        System.out.println(myList);
        
		// Remove two Strings from the String LinkedList at the specified location
        myList.remove(0);
        myList.remove(1);

		// Display the result
        System.out.println(myList);
        
		// Delete all the Strings from the String LinkedList
        myList.clear();

		// Display the result
        System.out.println(myList);
        
    	// ~ An Iterator Test Drive~ 
    
		// Add three Strings to the String LinkedList
		String[] nums1 = {"One", "Two", "Three"};
		for(String s : nums)
		    myList.add(s);
    	
		// Display the result
        System.out.println(myList);
        
        // Create three new Object Iterator
        Iterator iterator1 = myList.getIterator();
        Iterator iterator2 = myList.getIterator();
        Iterator iterator3 = myList.getIterator();
        
        System.out.print ("Printing using the Iterator: ");
        // Iterate through the LinkedList and get the elemenents of the LinkedList
        while(iterator1.hasNext())
        	System.out.print(iterator1.next() + " ");
        System.out.println();
        
        // Iterate through the LinkedList and remove all the elemenents of the LinkedList
        while(iterator2.hasNext())
        {
        	iterator2.next();
        	iterator2.remove();
        }
        
        // Check the result with the toString method
        System.out.println(myList);
                        
        System.out.print ("Printing using the Iterator: ");
        // Iterate through the LinkedList and get the elemenents of the LinkedList
        while(iterator3.hasNext())
        	System.out.print(iterator3.next() + " ");
        System.out.println();
    }
}
