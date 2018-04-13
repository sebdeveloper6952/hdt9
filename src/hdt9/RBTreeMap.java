/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hdt9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author sevic69
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
        return null;
    }
    
    public V get(K key)
    {
        return super.get(key);
    }
}
