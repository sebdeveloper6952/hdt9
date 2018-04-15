package hdt9;

import java.util.Map.Entry;

/**
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Areans 14470
 */
public class SplayTreeMap<K extends Comparable<K>,V>
{
    protected SplayTree<SEntry<K,V>> tree;
    
    public SplayTreeMap()
    {
        tree = new SplayTree<>();
    }
    
    public V put(K key, V value)
    {
        SEntry<K,V> old = tree.add(new SEntry<>(key, value));
        if(old == null) return null;
        return old.getValue();
    }
    
    public V remove(K key)
    {
        SEntry<K,V> temp = tree.remove(new SEntry<>(key, null));
        if(temp == null) return null;
        return temp.getValue();
    }
    
    public boolean contains(K key)
    {
        SEntry<K,V> temp = tree.get(new SEntry<>(key, null));
        if(temp == null) return false;
        return temp.getValue() != null;
    }
    
    public V get(K key)
    {
        SEntry<K,V> temp = tree.get(new SEntry<>(key, null));
        if(temp == null) return null;
        return temp.getValue();
    }
    
    /**
     * Clase utilizada internamente.
     * @param <K>
     * @param <V> 
     */
    protected static class SEntry<K extends Comparable<K>,V> 
            implements Entry<K,V>, Comparable<SEntry<K,V>>
    {
        protected K key;
        protected V value;
        
        public SEntry(K k, V v)
        {
            key = k;
            value = v;
        }
        
        @Override
        public K getKey() 
        {
            return key;
        }

        @Override
        public V getValue() 
        {
            return value;
        }

        @Override
        public V setValue(V value) 
        {
            V temp = value;
            this.value = value;
            return temp;
        }

        @Override
        public int compareTo(SEntry<K, V> o) 
        {
            return key.compareTo(o.getKey());
        }
    }
}
