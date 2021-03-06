package hdt9;

/**
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Areans 14470
 */
public class RBTEntry<K extends Comparable<K>,V>
        implements Comparable<RBTEntry<K,V>>
{
    protected K key;
    protected V value;
    protected boolean isRed;

    public RBTEntry(K key, V value, boolean isRed)
    {
        this.key = key;
        this.value = value;
        this.isRed = isRed;
    }

    public void setKey(K key) { this.key = key; }
    public K getKey() { return key; }
    public void setValue(V value) { this.value = value; }
    public V getValue() { return value; }
    public void setRed() { isRed = true; }
    public void setBlack() { isRed = false; }
    public boolean isRed() { return isRed; }

    @Override
    public int compareTo(RBTEntry<K, V> o) 
    {
        return key.compareTo(o.getKey());
    }
}
