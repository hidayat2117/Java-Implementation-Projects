/**
 * A representation of a Node of A Generic LinkedList that accepts any type of parameter.
 */
class Node<AnyType>
{
    public AnyType value;
    public Node<AnyType> next;
    
    /**
     * The constructor method initializes a Node of the Generic LinkedList.
     * @param val Initializes the value with any type.
     * @param n Initializes the Node.
     */
    public Node(AnyType val, Node n)
    {
        value = val;
        next = n;
    }
    
    /**
     * The sister constructor method.
     * @param val Initializes the value with any type.
     */
    public Node(AnyType val)
    {
        this(val, null);
    }    
}
