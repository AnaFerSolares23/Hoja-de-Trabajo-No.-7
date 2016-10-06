// Ana Fernanda Solares, 13125
// Jose Rosales, 12576
package hoja7;

/**
 *
 * 
 */
public interface PriorityQueue {
    /**
     * pre: !isEmpty()
     * post: returns the minimum value in the priority queue
     * @return first element
     */
    public Bloque getFirst();
    
    /**
     * pre: !isEmpty()
     * post: returns and removes minimum value from queue
     * @return maxVal
     */
    public Bloque remove();
    
    /**
     * pre: value is non-null comparable
     * post: value is added to priority queue
     * @param value 
     */
    public void add(Bloque value);
    
    /**
     * @return false if it is empty or true if not.
     */
    public boolean isEmpty();
}
