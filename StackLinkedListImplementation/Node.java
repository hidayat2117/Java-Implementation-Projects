/**
 * The Stack String LinkeList node representation.
 */
class Node
{
    public String value;
    public Node next;
    
    /**
     * The constructor method initializes the Stack String LinkeList node.
     * @param val The string value initialization.
     * @param n The Node next initialization.
     */
    public Node(String val, Node n)
    {
        value = val;
        next = n;
    }
}
