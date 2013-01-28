/********************************************************
 * The Stack String LinkeList Implementation.           *
 * @author: Vladimir Efros                              *
 * This program implements a Stack String LinkeList.    *
 ********************************************************/

/**
 * Program Test Driver.
 */
public class StackLinkedListImplementation
{
    public static void main(String[] args)
    {
        // Create a new StackLinkedList Object
        StackLinkedList stack = new StackLinkedList();
        
        // Push three string to the stack
        String[] nums = {"One", "Two", "Three"};
        for(String s : nums)
            stack.push(s);
        
        // Display the stack
        System.out.println(stack);
        
        // Pop one string from the stack
        stack.pop();
        
        // Display the stack
        System.out.println(stack);
    }
}
