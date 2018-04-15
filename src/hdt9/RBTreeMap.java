package hdt9;

/**
 * @author sebdeveloper6952
 */
public class RBTreeMap<K extends Comparable<K>,V>
{
    protected BinarySearchTree<RBTEntry<K,V>> tree;
    
    public RBTreeMap()
    {
        tree = new BinarySearchTree<>();
    }
    
    public V put(K key, V value)
    {
        RBTEntry<K,V> prev = tree.add(new RBTEntry<>(key, value, true));
        // make the children of new node black
        tree.actionNode.left().setValue(new RBTEntry<>(null, null, false));
        tree.actionNode.right().setValue(new RBTEntry<>(null, null, false));
        // restructure tree
        insertRestructure(tree.actionNode);
        if(prev == null) return null;
        return prev.getValue();
    }
    
    public V remove(K key)
    {
        RBTEntry<K,V> prev = tree.remove(new RBTEntry<>(key, null, false));
        if(prev == null) return null;
        return prev.getValue();
    }
    
    public V get(K key)
    {
        RBTEntry<K,V> prev = tree.get(new RBTEntry<>(key, null, false));
        if(prev == null) return null;
        return prev.getValue();
    }
    
    public boolean contains(K key)
    {
        return get(key) == null;
    }
    
    protected void insertRestructure(BinaryTree<RBTEntry<K,V>> node)
    {
        // case 1 - color the root black
        if(node.parent() == null)
        {
            node.value().isRed = false;
            return;
        }
        // case 2 - no action taken
        if(!node.parent().value().isRed) return;
        // look for conditions
        BinaryTree<RBTEntry<K,V>> gp = node.parent().parent();
        BinaryTree<RBTEntry<K,V>> un = null;
        if(gp != null) // node has a grandparent, grab uncle
        {
            if(node.parent().isLeftChild()) un = gp.right();
            else un = gp.left();
        }
    }
    
    protected void insertCase3(BinaryTree<RBTEntry<K,V>> node)
    {
        
    }
    
    protected void insertCase4(BinaryTree<RBTEntry<K,V>> node)
    {
        
    }
    
    protected void insertCase5(BinaryTree<RBTEntry<K,V>> node)
    {
        
    }
}
