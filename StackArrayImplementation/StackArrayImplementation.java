/***************************************************
 * The Stack String Array Implementation.          *
 * @author: Vladimir Efros                         *
 * This program implements a Stack String Array.   *
 ***************************************************/

/**
 * Program Test Driver.
 */
public class StackArrayImplementation 
{
    public static void main(String[] args)
    {
        // Create a new StackArray Object
        StackArray stack = new StackArray(3);
        
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
