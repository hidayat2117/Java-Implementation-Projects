/**
 * The LinkedList Iterator implementation.
 */
 
public class Iterator implements IteratorType
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
