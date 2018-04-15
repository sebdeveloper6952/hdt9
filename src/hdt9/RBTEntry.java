/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

import java.util.Map.Entry;

/**
 *
 * @author sevic69
 */
public class RBTEntry<K extends Comparable<K>, V> implements Entry<K,V>
{
    protected K key;
    protected V value;
    protected boolean isRed;

    public RBTEntry(K k, V v)
    {
        key = k;
        value = v;
        isRed = true;
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
