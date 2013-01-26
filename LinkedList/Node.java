/**
 * Node representation.
 */
 
public class Node
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
