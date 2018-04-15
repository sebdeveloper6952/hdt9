package hdt9;

import java.util.Map.Entry;

/**
 * @author Sebastian Arriola 11463
 * @author Fernando Figueroa 14175
 * @author Jose Andres Areans 14470
 */
public class SEntry<K extends Comparable<K>,V> implements Entry<K,V>
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
}
