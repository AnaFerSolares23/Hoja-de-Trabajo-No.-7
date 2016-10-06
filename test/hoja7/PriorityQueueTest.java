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
public class PriorityQueueTest {
    
    public PriorityQueueTest() {
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
     * Test of getFirst method, of class PriorityQueue.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        PriorityQueue instance = new PriorityQueueImpl();
        Bloque expResult = null;
        Bloque result = instance.getFirst();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class PriorityQueue.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        PriorityQueue instance = new PriorityQueueImpl();
        Bloque expResult = null;
        Bloque result = instance.remove();
        assertEquals(expResult, result);
    }

    /**
     * Test of add method, of class PriorityQueue.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Bloque value = null;
        PriorityQueue instance = new PriorityQueueImpl();
        instance.add(value);
    }

    /**
     * Test of isEmpty method, of class PriorityQueue.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        PriorityQueue instance = new PriorityQueueImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    public class PriorityQueueImpl implements PriorityQueue {

        public Bloque getFirst() {
            return null;
        }

        public Bloque remove() {
            return null;
        }

        public void add(Bloque value) {
        }

        public boolean isEmpty() {
            return false;
        }
    }
    
}
