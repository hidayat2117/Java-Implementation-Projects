/*************************************************
 * The String ArrayList implementation.          *
 * @author: Vladimir Efros                       *
 * This program implements a String ArrayList.   *
 *************************************************/

/**
 * The program test drive.
 */
public class ArrayListImplementation 
{
    public static void main(String[] args)
    {
        // Create a new ArrayList Object
        ArrayList myList = new ArrayList();
        
        // Add the Strings to the String array
        String[] nums1 = {"Zero", "One", "Two", "Three", "Four", "Five", "Six"};
        for(String s : nums1)
            myList.add(s);
        
        // Display the String array elements
        displayList(myList);
        
        // Add the first and the last elements
        myList.add(0, "Very First!");
        myList.add(myList.size(), "Very Last!");  
                
        // Find the String in the String array
        if(myList.contains("Two"))
            System.out.println("Found!");
        else
            System.out.println("Not Found!");
        
        // Get the index of the String
        if(myList.indexOf("Five") < 0)
            System.out.println("Not found!");
        else
            System.out.println(myList.indexOf("Five"));
        
        // Remove the element from the String array
        myList.remove("One");
        
         // Display the String array elements
        displayList(myList);
        
        // Remove the String element by the index
        myList.remove(3);
        
        // Replace the String by specifying index
        myList.set(0, "VERY FIRST!");
        myList.set(myList.size() - 1, "VERY LAST!");
        
        // Delete all the element in the String array
        myList.clear();
        System.out.println(myList.size());
        
        // Display the String array elements
        displayList(myList);
        
            	// ~ An Iterator Test Drive~ 
    
		// Add three Strings to the String LinkedList
		String[] nums2 = {"One", "Two", "Three"};
		for(String s : nums2)
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
    
    public static void displayList(StringArrayList theList)
    {
        for(int index = 0; index < theList.size(); index++)
            System.out.print(theList.get(index) + " ");
        System.out.println();
    }
}
