// Ana Fernanda Solares, 13125
// Jose Rosales, 12576
import java.util.Vector;

public class Heap implements PriorityQueue {
    
    protected Vector data;   // the data, kept in heap order
    
    /**
     * post: constructs a new priority queue
     */
    public Heap(){
        data = new Vector();
    }
    
    /**
     * constructs a new priority queue from an unordered vector
     * @param vector 
     */
    public Heap(Vector v){
        int i;
        data = new Vector(v.size()); //we know ultimate size
        for (i = 0; i < v.size(); i++){
            //add elements to heap
            add((Bloque)v.get(i));
        }
    }
    
    /**
     * pre: 0 <= i < size
     * post: returns parent of node at location i
     * @param i integer
     * @return parent of node at location i
     */
    protected static int parent(int i){
        return (i-1)/2;
    }
    
    /**
     * pre: 0 <= i < size
     * post: returns index of left child of node at location i
     * @param i integer
     * @return index of left child of node at location i
     */
    protected static int left(int i){
        return 2*i+1;
    }
    
    /**
     * pre: 0 <= i < size
     * post: returns index of right child of node at location i
     * @param i integer
     * @return index of right child of node at location i
     */
    protected static int right(int i){
        return 2*(i+1);
    }
    /**
     * pre: 0 <= leaf < size
     * post: moves node at index leaf up to appropriate position
     * @param leaf 
     */
    protected void percolateUp(int leaf){
        int parent = parent(leaf);
        Bloque value = (Bloque)data.get(leaf);
        while (leaf > 0 && (value.compareTo(data.get(parent)) > 0)){
            data.set(leaf,data.get(parent));
            leaf = parent;
            parent = parent(leaf);
        }
        data.set(leaf,value);
    }
    
    public void add(Bloque value){
        data.add(value);
        percolateUp(data.size()-1);
    }    
    
    /**
     * pre: 0 <= root < size
     * post: moves node at index root down to appropriate position in subtree
     * @param root 
     */
    protected void pushDownRoot(int root){
        int heapSize = data.size();
        Bloque value = (Bloque)data.get(root);
        while (root < heapSize) {
            int childpos = left(root);
            if (childpos < heapSize)
            {
                if ((right(root) < heapSize) && (((Bloque)data.get(childpos+1)).compareTo((Bloque)data.get(childpos)) > 0)){
                    childpos++;
                }
                // Assert: childpos indexes smaller of two children
                if (((Bloque)data.get(childpos)).compareTo(value) > 0){
                    data.set(root,data.get(childpos));
                    root = childpos; // keep moving down
                } else { // found right location
                    data.set(root,value);
                    return;
                }
            } else { // at a leaf! insert and halt
                data.set(root,value);
                return;
            }
        }
    }
    
    public Bloque remove(){
        Bloque maxVal = getFirst();
        data.set(0,data.get(data.size()-1));
        data.setSize(data.size()-1);
        if (data.size() > 1) pushDownRoot(0);
        return maxVal;
    }
    
     /**
     * pre: !isEmpty()
     * post: returns the ith value in the priority queue
     * @return ith element
     */
    protected Bloque get(int i){
        return (Bloque)data.get(i);
    }
    
    public Bloque getFirst(){
        return (Bloque)get(0);
    }
    
    /**
     * 
     * @return size of the vector.
     */
    protected int size(){
        return data.size();
    }
    
    public boolean isEmpty(){
        if(size() == 0){
            return true;
        }else{
            return false;
        }
    }   
}
