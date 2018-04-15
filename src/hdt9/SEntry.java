package hdt9;

import java.util.Map.Entry;

/**
 *
 * @author sebdeveloper6952
 */
public class SEntry<K extends Comparable<K>,V> implements Entry<K,V>
{
        protected K key;
        protected V value;
        protected boolean isRed;
        
        public SEntry(K k, V v, boolean isRed)
        {
            key = k;
            value = v;
            this.isRed = isRed;
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
        
        public void setRed() { isRed = true; }
        public void setBlack() { isRed = false; }
        public boolean isRed() { return isRed; }
}
