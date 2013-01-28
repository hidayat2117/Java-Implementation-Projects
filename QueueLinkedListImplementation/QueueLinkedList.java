/**
 * A representation of the String Queue LinkedList.
 */
class QueueLinkedList
{
    private Node rear = null;
    private Node front = null;
    
	/**
	 * The enqueue method adds a String to the String Queue LinkedList.
	 * @param val The String added to the String Queue LinkedList.
	 */
    public void enqueue(String val)
    {
        if(rear != null)
        {
            rear.next = new Node(val, null);
            rear = rear.next;
        }
        else
        {
            rear = new Node(val, null);
            front = rear;
        }
    }
    
	/**
	 * The peek method returns the front value of the String Queue LinkedList.
	 */
    public String peek()
    {
        String temp = null;
        if(isEmpty()) 
            temp = null;
        else
            temp = front.value;
        return temp;
    }
    
	/**
	 * The dequeue method removes the front value of the String Queue LinkedList.
	 */
    public String dequeue()
    {
        String temp = null;
        if(isEmpty())
            temp = null;
        else
        {
            temp = front.value;
            front = front.next;
            if(front == null)
                rear = null;
        }
        return temp;
    }
    
	/**
	 * The isEmpty method returns true if the Queue LinkedList is empty.
	 */
    public boolean isEmpty()
    {
        return (front == null);
    }
    
	/**
	 * The toString method returns all the elements of the Queue LinkedList.
	 */
    public String toString()
    {
        StringBuilder builder = new StringBuilder();
        builder.append("The content of the Queue LinkedList: ");
        for(Node ref = front; ref != null; ref = ref.next)
            builder.append(ref.value + " ");
        return builder.toString();
    }
}
