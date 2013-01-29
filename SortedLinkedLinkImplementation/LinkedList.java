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
     * The add method inserts an integer value in an increasing order.
     * @param val The element that is to be inserted.
     */
    public void add(int val)
    {
        if(isEmpty() || head.value > val)
            head = new Node(val, head);
        else
        {
            Node pred = head;
            while(pred.next != null)
            {
                if(pred.next.value > val)
                    break;
                pred = pred.next;
            }
            pred.next = new Node(val, pred.next);
        }
    }
    
    /**
     * The toString method returns the state of the LinkedList object.
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
}
