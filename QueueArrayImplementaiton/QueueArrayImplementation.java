/******************************************
 * The StringQueue Array implementation.  *
 * @author: Vladimir Efros                *
 * This program implements a Queue Array. *
 ******************************************/

/**
 * The queue array test driver.
 */
public class QueueArrayImplementation 
{
    public static void main(String[] args)
    {
        QueueArray queue = new QueueArray(4);
        
        String[] nums = {"One", "Two", "Three", "Four"};
        
        // Add the string elements to th queue
        for(String s : nums)
            queue.enqueue(s);
        
        // Display the top element of the queue
        System.out.println(queue.peek());
        
        // Display all the elements of the queue
        System.out.println(queue);
         
        // Remove two top elements
        queue.dequeue(); 
        queue.dequeue();
        
        // Display all the elements of the queue
        System.out.println(queue);
        
        // Add 1 string
        queue.enqueue("Five");
        
        // Display all the elements of the queue
        System.out.println(queue);
    }
}
