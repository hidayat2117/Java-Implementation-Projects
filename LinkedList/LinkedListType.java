/**
 * Interface for The LinkedList Class.
 */
 
public interface LinkedListType
{
    public void add(String str);
    public void add(int index, String str);
    public String remove(int index);
    public void clear();
    public boolean isEmpty();
    public boolean remove(String str);
    public int size();
    public String get(int index);
    public Iterator getIterator();
}
