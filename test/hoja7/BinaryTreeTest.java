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
public class BinaryTreeTest {
    
    public BinaryTreeTest() {
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
     * Test of setLeft method, of class BinaryTree.
     */
    @Test
    public void testSetLeft() {
        System.out.println("setLeft");
        BinaryTree newLeft = null;
        BinaryTree instance = new BinaryTree();
        instance.setLeft(newLeft);
    }

    /**
     * Test of setRight method, of class BinaryTree.
     */
    @Test
    public void testSetRight() {
        System.out.println("setRight");
        BinaryTree newRight = null;
        BinaryTree instance = new BinaryTree();
        instance.setRight(newRight);
    }

    /**
     * Test of setParent method, of class BinaryTree.
     */
    @Test
    public void testSetParent() {
        System.out.println("setParent");
        BinaryTree newParent = null;
        BinaryTree instance = new BinaryTree();
        instance.setParent(newParent);
    }

    /**
     * Test of left method, of class BinaryTree.
     */
    @Test
    public void testLeft() {
        System.out.println("left");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.left();
        assertEquals(expResult, result);
    }

    /**
     * Test of right method, of class BinaryTree.
     */
    @Test
    public void testRight() {
        System.out.println("right");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.right();
        assertEquals(expResult, result);
    }

    /**
     * Test of parent method, of class BinaryTree.
     */
    @Test
    public void testParent() {
        System.out.println("parent");
        BinaryTree instance = new BinaryTree();
        BinaryTree expResult = null;
        BinaryTree result = instance.parent();
        assertEquals(expResult, result);
    }

    /**
     * Test of value method, of class BinaryTree.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        BinaryTree instance = new BinaryTree();
        Bloque expResult = null;
        Bloque result = instance.value();
        assertEquals(expResult, result);
    }

    /**
     * Test of setValue method, of class BinaryTree.
     */
    @Test
    public void testSetValue() {
        System.out.println("setValue");
        Bloque value = null;
        BinaryTree instance = new BinaryTree();
        instance.setValue(value);
    }

    /**
     * Test of isEmpty method, of class BinaryTree.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        BinaryTree instance = new BinaryTree();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }
    
}
