import java.util.Iterator;
/**
 * A dictionary using an array of nodes with key-value pair and makes use of hasing for indexing.
 *
 * @author Daniel J. Norment
 * @version 1.0
 */
public class DictionaryHashTable<K extends Comparable<? super K>, V> implements DictionaryInterface<K, V>
{
    private Node<K, V>[] dict;
    private int numOfItems;
    
    public DictionaryHashTable()
    {
        this(5); //default to 5
    }
    
    public DictionaryHashTable(int size)
    {
        @SuppressWarnings("unchecked")
        Node<K, V>[] tempDict = (Node<K, V>[])new Object[size];
        numOfItems = 0;
    }
    
     /** Adds a new entry to this dictionary. If the given search key already
       exists in the dictionary, replaces the corresponding value.
       @param key    An object search key of the new entry.
       @param value  An object associated with the search key.
       @return  Either null if the new entry was added to the dictionary
                or the value that was associated with key if that value
                was replaced. */
     public V add(K key, V value)
     {
        return null; //todo
     }
   
     /** Removes a specific entry from this dictionary.
       @param key  An object search key of the entry to be removed.
       @return  Either the value that was associated with the search key
                or null if no such object exists. */
     public V remove(K key)
     {
        return null; //todo
     }
   
     /** Retrieves from this dictionary the value associated with a given
       search key.
       @param key  An object search key of the entry to be retrieved.
       @return  Either the value that is associated with the search key
                or null if no such object exists. */
     public V getValue(K key)
     {
         return null; //todo
     }
   
     /** Sees whether a specific entry is in this dictionary.
       @param key  An object search key of the desired entry.
       @return  True if key is associated with an entry in the dictionary. */
     public boolean contains(K key)
     {
         return true; //todo
     }
   
     /** Creates an iterator that traverses all search keys in this dictionary.
       @return  An iterator that provides sequential access to the search
                keys in the dictionary. */
     public Iterator<K> getKeyIterator()
     {
        return null; //todo
     }
   
     /** Creates an iterator that traverses all values in this dictionary.
       @return  An iterator that provides sequential access to the values
                in this dictionary. */
     public Iterator<V> getValueIterator()
     {
        return null; //todo
     }
   
     /** Sees whether this dictionary is empty.
       @return  True if the dictionary is empty. */
     public boolean isEmpty()
     {
         return numOfItems == 0;
     }
   
     /** Gets the size of this dictionary.
       @return  The number of entries (key-value pairs) currently
                in the dictionary. */
     public int getSize()
     {
         return numOfItems;
     }
   
     /** Removes all entries from this dictionary. */
     public void clear()
     {
         
     }
}