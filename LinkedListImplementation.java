/**************************************************
 * The Linked List implementation.                *
 * @author: Vladimir Efros                        *
 * This program implements a String LinkedList.   *
 *************************************************/

interface LinkedListType
{
    public void add(String str);
    public void add(int index, String str);
    public String remove(int index);
    public void clear();
    public boolean isEmpty();
    public boolean remove(String str);
    public int size();
}

/**
 * Node representation.
 */
class Node
{
    public String value;
    public Node next;
    
    /**
     * The constructor method.
     * @param val Stores the String data.
     * @param n Stores th reference to the Node next.
     */
    public Node(String val, Node n)
    {
        value = val;
        next = n;
    }
    
     /**
     * The constructor method.
     * @param val Stores the String data.
     */
    public Node(String val)
    {
        this(val, null);
    }
}

/**
 * The LinkedList implementation.
 */
class LinkedList implements LinkedListType
{
    private Node first;
    private Node last;
    
    /**
     * The constructor method initializes the LinkedList object.
     */
    public LinkedList()
    {
        first = null; 
        last = null;
    }
    
    /**
     * The add method adds a String to a LinkedList.
     * @param str The string that is to be added to the LinkedList.
     */
    public void add(String str)
    {
        if(str == null || str.length() <= 0)
            return;
        if(isEmpty())
        {
            first = new Node(str);
            last = first;
        }
        else
        {
            last.next = new Node(str);
            last = last.next;
        }
    }
    
    /**
     * The add method adds a String at the specified index location.
     * @param index The location where a string will be added.
     * @exception IndexOutOfBoundsException if the index is out of the range.
     * @param str The string that is to be added to the linked list.
     */
    public void add(int index, String str)
    {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        
        if(str == null || str.length() <= 0)
            return;
        
        if(index == 0)
        {
            first = new Node(str, first);
            if(first == null)
                last = first;
        }
        else
        {
            Node pred = first;
            for(int i = 1; i <= index - 1; i++)
                pred = pred.next;
            pred.next = new Node(str, pred.next);
            if(pred.next.next == null)
                last = pred.next;
        }
    }
    
    /**
     * The remove method removes the string at the specified location.
     * @param index The location where the string is removed.
     * @exception IndexOutOfBoundsException if the index is out of the range.
     * @return a String value if the String is removed, otherwise returns a null.
     */
    public String remove(int index)
    {
        String temp = null;
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        
        else if(isEmpty())
            temp = null;
        
        else if(index == 0)
        {
            temp = first.value;
            first = first.next;
            if(first == null)
                last = null;
        }
        else
        {
            Node pred = first;
            for(int i = 1; i <= index - 1; i++)
                pred = pred.next;
            temp = pred.next.value;
            pred.next = pred.next.next;
            if(pred.next == null)
                last = pred;
        }
        return temp;
    }
    
    /**
     * The clear method deletes all the elements of the LinkedList and 
     * sets the the first and last value to null. 
     */
    public void clear()
    {
        Node ref = first;
        while(first != null)  // Alternatively,
        {                     // while(first != null) { remove(0); }
            ref = ref.next;
            remove(0);
        }
            
        if(first == null)
            last = null;
    }
    
    /**
     * The remove method removes the specified string from the LinkedList.
     * @param str The string that is to be removed.
     * @return true if the string was removed, otherwise false.
     */
    public boolean remove(String str)
    {
        if(str == null || str.length() < 1)
            return false;

        if(first.value.equals(str))
        {
            first = first.next;
            if(first == null)
                last = null;
            return true;
        }
        else
        {
            Node pred;
            for(pred = first; pred.next != null && !(pred.next.value.equals(str)); pred = pred.next)
                pred = pred.next;
            if(pred.next == null)
                return false;
            else
            {
                pred.next = pred.next.next;
                if(pred.next == null)
                    last = pred;
                return true;
            }
        }
    }

    /**
     * The get method gets the String at the specified location.
     * @param index THe location of the String that is to be returned.
     * @return The String at the specified location.
     */
    public String get(int index)
    {
	if(index < 0 || index > size())
	    throw new IndexOutOfBoundsException();
	else
            {
		Node ref = first;
		for(int i = 0; i < size(); i++, ref = ref.next)
	    	    if(i == index)
			return ref.value;
	    }
	return null;
    }
    
    /**
     * @return true if the string is empty.
     */
    public boolean isEmpty()
    {
        return (first == null);
    }
    
    /**
     * @return The amount of elements in the list.
     */
    public int size()
    {
        int count = 0;
        for(Node ref = first; ref != null; ref = ref.next)
            count++;
        return count;
    }

    /*
     * The getIterator method returns a new Iterator.
     */
    public Iterator getIterator()
    {
    	return new Iterator(this);
    }
    
    /**
     * @return The elements of the LinkedList and convert is to string.
     */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("The LinkedList Items: ");
        for(Node ref = first; ref != null; ref = ref.next)
            builder.append(ref.value + " ");
        return builder.toString();
    }
}

/**
 * The LinkedList Iterator implementation.
 */
class Iterator
{
    private LinkedList theList;
    private boolean canRemove;
    private int prev;
	
    /**
     * The constructor method initializes the LinkedList Iterator.
     * @param list Initializes the LinkedList Object that will be iterated.
     */
    public Iterator(LinkedList list)
    {
	theList = list;
	canRemove = false;
	prev = -1;
    }
    
    /**
     * The hasNext method returns true if the LinkedList element 
     * is in the boundaries, otherwise returns false.
     */
    public boolean hasNext()
    {
    	return (prev + 1 < theList.size());
    }
    
    /**
     * The next method uses the get method of the LinkedList class 
     * to obtain the value of the String of the LinkedList at the specified location.
     * @return the String at the specified location.
     */
    public String next()
    {
    	if(hasNext())
    	{
    		canRemove = true;
    		prev++;
    		return theList.get(prev);
    	}
    	
    	else
    		return null;
    }
    
    public void remove()
    {
    	if(canRemove)
    	{
    		theList.remove(prev);
    		canRemove = false;
    		prev--;
    	}
    	else
    		return;
    }    
}

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
