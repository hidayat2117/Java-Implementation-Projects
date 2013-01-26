/**
 * Interface for the ArrayList Class.
 */

interface StringArrayList
{
    public void add(String str);
    public void add(int index, String str);
    public boolean remove(String str);
    public String remove(int index);
    public String set(int index, String str);
    public String get(int index);
    public int size();
    public void clear();
    public boolean contains(String str);
    public boolean isEmpty();
    public boolean isFull();
    public Iterator getIterator();
}
