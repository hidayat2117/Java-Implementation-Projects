/***************************************************
 * The Generic Linked List implementation.         *
 * @author: Vladimir Efros                         *
 * This program implements a Generic LinkedList.   *
 ***************************************************/

/**
 * The Test Drive of the Program.
 */
public class GenericLinkedList 
{
    public static void main(String[] args)
    {
        // Create a String LinkedList Object
        LinkedList<String> myStringList = new LinkedList<String>();
        
        // Add three elements to the Generic LinkedList
        String[] nums = {"One", "Two", "Three", "Four", "Five"};
        for(String i : nums)
            myStringList.add(i);
        
        System.out.println();
        
        System.out.println(myStringList);
        myStringList.recRev();
        System.out.println(myStringList);
        
        // Add two elements at the specified position
        myStringList.add(0, "Hi");
        myStringList.add(6, "Bye");
        
        // Display all the elements using the get method
        System.out.print("The get method: ");
        for(int i = 0; i < myStringList.size(); i++)
            System.out.print(myStringList.get(i) + " ");
        System.out.println();
        
        // Create two iterator objects
        Iterator iterator1 = myStringList.getIterator();
        Iterator iterator2 = myStringList.getIterator();
        
        // Display all the elements using the get method
        System.out.print("The iterator method: ");
        while(iterator1.hasNext())
            System.out.print(iterator1.next() + " ");
        System.out.println();
        
        // Remove an element from the LinkedList using an iterator delete method
        while(iterator2.hasNext())
            if(iterator2.next().equals("Three"))
                iterator2.delete();
        System.out.println();
        System.out.println(myStringList);
        
        // Remove an element at the specified position
        myStringList.remove(4);
        
        // Remove an element from the LinkedList
        if(myStringList.remove("One"))
            System.out.println("Removed");
        
        System.out.println(myStringList);
        
        // Create an Integer LinkedList Object
        LinkedList<Integer> myIntList = new LinkedList<Integer>();
        int[] num = {1, 2, 3};
        for(int i : num)
            myIntList.add(i);
        
        System.out.println(myIntList);
        
        // Reverse the LinkedList
        myIntList.recRev();
        
        System.out.println(myIntList);
        
    }
}
