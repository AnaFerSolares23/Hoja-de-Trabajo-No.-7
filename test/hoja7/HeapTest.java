// Ana Fernanda Solares, 13125
// Jose Rosales, 12576

package hoja7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * 
 */
public class HeapTest {
    
    public HeapTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of parent method, of class Heap.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        int i = 0;
        int expResult = 0;
        int result = Heap.parent(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of left method, of class Heap.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        int i = 0;
        int expResult = 0;
        int result = Heap.left(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of right method, of class Heap.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        int i = 0;
        int expResult = 0;
        int result = Heap.right(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of percolateUp method, of class Heap.
     */
    @Test
    public void testPercolateUp() {
        System.out.println("percolateUp");
        int leaf = 0;
        Heap instance = new Heap();
        instance.percolateUp(leaf);
    }

    /**
     * Test of add method, of class Heap.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Bloque value = null;
        Heap instance = new Heap();
        instance.add(value);
    }

    /**
     * Test of pushDownRoot method, of class Heap.
     */
    @Test
    public void testPushDownRoot() {
        System.out.println("pushDownRoot");
        int root = 0;
        Heap instance = new Heap();
        instance.pushDownRoot(root);
    }

    /**
     * Test of remove method, of class Heap.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Heap instance = new Heap();
        Bloque expResult = null;
        Bloque result = instance.remove();
        assertEquals(expResult, result);
    }

    /**
     * Test of get method, of class Heap.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int i = 0;
        Heap instance = new Heap();
        Bloque expResult = null;
        Bloque result = instance.get(i);
        assertEquals(expResult, result);
    }

    /**
     * Test of getFirst method, of class Heap.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        Heap instance = new Heap();
        Bloque expResult = null;
        Bloque result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of size method, of class Heap.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        Heap instance = new Heap();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
    }

    /**
     * Test of isEmpty method, of class Heap.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Heap instance = new Heap();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
}
