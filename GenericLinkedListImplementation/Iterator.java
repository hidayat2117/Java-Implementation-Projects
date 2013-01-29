/**
 * The representation of the Iterator for the LinkedList class.
 */
class Iterator<AnyType>
{
    private LinkedList theList;
    private int prev;
    private boolean canRemove;
    
    /**
     * The constructor method initializes the LinkedList Iterator.
     * @param l The initialization of the LinkedList object.
     */
    public Iterator(LinkedList l)
    {
        theList = l;
        prev = -1;
        canRemove = false;
    }
    
    /**
     * The hasNext method returns true if theList object 
     * has next element, otherwise returns false.
     */
    public boolean hasNext()
    {
        return (prev + 1 < theList.size());
    }
    
    /**
     * The next method returns the element of any type, otherwise returns null.
     */
    public AnyType next()
    {
        if(hasNext())
        {
            prev++;
            canRemove = true;
            return (AnyType) theList.get(prev);
        }
        return null;
    }
    
    /**
     * The delete method deletes a specified element from the LinkedList.
     */
    public void delete()
    {
        if(canRemove)
        {
            theList.remove(prev);
            prev--;
            canRemove = false;
        }
        else
            return;
    }
}
