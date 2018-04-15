/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

/**
 *
 * @author sevic69
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
