/**
 * A representation of the Node of the LinkedList.
 */
class Node
{
    public String value;
    public Node next;
    
    /**
     * An initialization of the Queue. 
     * @param val The stirng added to the LinkedList.
     * @param n Initializes the Node of the LinkedList.
     */
    public Node(String val, Node n)
    {
        value = val;
        next = n;
    }
}
