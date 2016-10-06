// Ana Fernanda Solares, 13125
// Jose Rosales, 12576
package hoja7;

/**
 *
 * 
 */
public class BinaryTree {
    protected Bloque val; // value associated with node
    protected BinaryTree parent; // parent of node
    protected BinaryTree left, right; // children of node

    public BinaryTree(){
    // post: constructor that generates an empty node
        val = null;
        parent = null; left = right = this;
    }
    
    public BinaryTree(Bloque value){
    // post: returns a tree referencing value and two empty subtrees
        val = value;
        right = left = new BinaryTree();
        setLeft(left);
        setRight(right);
    }
    
    public BinaryTree(Bloque value, BinaryTree left, BinaryTree right){
        // post: returns a tree referencing value and two subtrees
        //Assert.pre(value != null, "Tree values must be non-null.");
        val = value;
        if (left == null) { 
            left = new BinaryTree(); 
        }
        setLeft(left);
        if (right == null) { 
            right = new BinaryTree(); 
        }
        setRight(right);
    }
    
    public void setLeft(BinaryTree newLeft){
        // post: sets left subtree to newLeft
        // re-parents newLeft if not null
        if (isEmpty()) return;
        if (left != null && left.parent() == this) left.setParent(null);
        left = newLeft;
        left.setParent(this);
    }
    
    public void setRight(BinaryTree newRight){
        // post: sets right subtree to newRight
        // re-parents newRight if not null
        if (isEmpty()) return;
        if (right != null && right.parent() == this) right.setParent(null);
        right = newRight;
        right.setParent(this);
    }
            
    protected void setParent(BinaryTree newParent){
    // post: re-parents this node to parent reference, or null
        if (!isEmpty()) {
            parent = newParent;
        }
    }
    
    public BinaryTree left(){
    // post: returns reference to (possibly empty) left subtree
        return left;
    }
    
    public BinaryTree right(){
    // post: returns reference to (possibly empty) left subtree
        return right;
    }
    
    public BinaryTree parent(){
    // post: returns reference to parent node, or null
        return parent;
    }
                
    public Bloque value(){
    // post: returns value associated with this node
        return val;
    }
    
    public void setValue(Bloque value){
    // post: sets the value associated with this node
        val = value;
    }
    
    public boolean isEmpty(){
        if (parent != null){
            return false;
        }else{
            return true;
        }
    }
}
