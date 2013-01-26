/**
 * Represents an Iterator for ArrayList Class.
 */

class Iterator
{
	private ArrayList theList;
	private boolean canRemove;
	private int prev;
		
	/*
	 * The constructor method initializes the Iterator object.
	 * @param list The object that will be iterated.
	 */
	public Iterator(ArrayList list)
	{
		theList = list;
		canRemove = false;
		prev = -1;
	}
		
	/**
 	 * The hasNext method returns true if the next String of 
 	 * the theList object exists, otherwise return false.
 	 */
	public boolean hasNext()
	{
		return (prev + 1 < theList.size());
	}
	
	/**
	 * The next method returns the Strings of the specified 
	 * location, otherwise returns false.
	 */
	public String next()
	{
		if(hasNext())
		{
			prev++;
			canRemove = true;
			return theList.get(prev);
		}
		else
			return null;
	}
	
	/**
	 * The remove method removes the String at the 
	 * specified location.
     */
	public void remove()
	{
		theList.remove(prev);
		prev--;
		canRemove = false;
	}
}	
