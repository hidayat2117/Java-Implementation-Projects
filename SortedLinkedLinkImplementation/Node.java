
/**
 * A representation of a Node of A Generic LinkedList that accepts any type of parameter.
 */
class Node
{
    public int value;
    public Node next;
    
    /**
     * The constructor method initializes a Node of the LinkedList.
     * @param val Initializes the integer value.
     * @param n Initializes the Node.
     */
    public Node(int val, Node n)
    {
        value = val;
        next = n;
    }
    
    /**
     * The sister constructor method.
     * @param val Initializes the integer value.
     */
    public Node(int val)
    {
        this(val, null);
    }    
}

