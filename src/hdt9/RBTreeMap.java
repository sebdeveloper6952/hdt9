package hdt9;

/**
 * @author sebdeveloper6952
 */
public class RBTreeMap<K extends Comparable<K>,V> extends BinarySearchTree<K,V>
{
    protected final int RED = 0;
    protected final int BLACK = 1;
    
    public V put(K key, V value)
    {
        V old = super.put(key, value);
        return old;
    }
    
    public V remove(K key)
    {
        V removed = super.remove(key);
        return removed;
    }
    
    public V get(K key)
    {
        return super.get(key);
    }
}
