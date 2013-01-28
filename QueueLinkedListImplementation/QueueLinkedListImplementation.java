/**
 * The test drive for the program.
 */
public class QueueLinkedListImplementation 
{
    public static void main(String[] args)
    {
        QueueLinkedList queue = new QueueLinkedList();
        
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
