/***************************************************
 * The Sorted Linked List implementation.          *
 * @author: Vladimir Efros                         *
 * This program implements a Sorted  LinkedList.   *
 ***************************************************/

/**
 * The Test Drive of the Program.
 */
public class SortedLinkedList 
{
    public static void main(String[] args)
    {
        // Create a String LinkedList Object
        LinkedList<String> myList = new LinkedList<String>();
        
        int[] nums = {3, 2, 10, 5, 1, 6, 8};
        for(int i : nums)
            myList.add(i);
        
        System.out.println(myList);
    }
}
