/**
 * A representation of the LinkedList that accepts any type of the parameter.
 */
class LinkedList<AnyType>
{
    private Node head;
    
    /**
     * The constructor method initializes the LinkedList with the first null Node.
     */
    public LinkedList()
    {
        head = null;
    }
    
    /**
     * The add method inserts a value in the first position of the LinkedList.
     * @param val The inserted value of any type.
     */
    public void add(AnyType val)
    {
        if(isEmpty())
            head = new Node(val);
        
        else
            head = new Node(val, head);
    }
    
    /**
     * The add method adds a value to the LinkedList at the specified location.
     * @param index The location where the value is added.
     * @param val The value of any type that is to be added to the LinkedList.
     */
    public void add(int index, AnyType val)
    {
        if(index < 0 || index > size())
            throw new IndexOutOfBoundsException();
        
        if(index == 0)
            head = new Node(val, head);
        else
        {
            Node pred = head;
            for(int i = 1; i <= index - 1; i++)
                pred = pred.next;
            pred.next = new Node(val, pred.next);
        }
    }
    
    /**
     * The remove method removes an element at the specified location.
     * @param index The specified position of the element that is to be removed.
     * @exception IndexOutOfBoundsException if the index is out of bounds.
     * @return The removed value.
     */
    public AnyType remove(int index)
    {
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException();
        
        if(index == 0)
        {
            AnyType temp = (AnyType) head.value;
            head = head.next;
            return temp;
        }
        
        else
        {
            Node pred = head;
            for(int i = 1; i <= index - 1; i++)
                pred = pred.next;
            AnyType temp = (AnyType) pred.next.value;
            pred.next = pred.next.next;
            return temp;
        }
    }
    
    /**
     * The remove method removes the specified value of any type from the LinkedLiist.
     * @param val The value that is to be removed.
     * @return true if the element is removed, otherwise return false.
     */
    public boolean remove(AnyType val)
    {
        if(isEmpty())
            return false;
        
        if(head.value == val)
        {
            head  = head.next;
            return true;
        }
        
        else
        {
            Node pred;
            for(pred = head; pred.next != null && ! pred.next.value.equals(val); pred = pred.next)
                pred = pred.next;
            if(pred.next == null)
                return false;
            else
            {
                pred.next = pred.next.next;
                return true;
            }
        }
    }
    
    public AnyType get(int index)
    {
        Node pred;
        int i;
        for(i = 0, pred = head; i < size(); i++, pred = pred.next)
            if(i == index)
                return (AnyType) pred.value;
        return null;
    }
    
    /**
     * The toString method returns the state of the object.
     */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("The elements of the LinkedList: ");
        for(Node ref = head; ref != null; ref = ref.next)
            builder.append(ref.value + " ");
        return builder.toString();
    }
    
    /**
     * The clear method clears all the elements of the LinkedList.
     */
    public void clear()
    {
        while(head != null)
            remove(0);
        head = null;
    }
    
    /**
     * The size method returns the size of the LinkedList.
     */
    public int size()
    {
        int count = 0;
        for(Node ref = head; ref != null; ref = ref.next)
            count++;
        return count;
    }
    
    /**
     * The isEmpty method true if the LinkedList is empty, otherwise returns false.
     */
    public boolean isEmpty()
    {
        return (head == null);
    }
    
    /**
     * The getIterator method returns the Iterator for the LinkedLink class.
     */
    public Iterator<AnyType> getIterator()
    {
        return new Iterator<AnyType>(this);
    }
    
    /**
     * The recRev method reverses the LinkedList recursively.
     */
    public void recRev()
    {
        recRev(head);
    }
    
    /**
     * The recRev method reverses the LinkedList recursively.
     * @param start The first node of the LinkedList.
     */
    private void recRev(Node start)
    {
        if(isEmpty())
            return;
        
        if(start.next == null)
        {
            head = start;
            return;
        }
        
        recRev(start.next);
        start.next.next = start;
        start.next = null;
    }
}

