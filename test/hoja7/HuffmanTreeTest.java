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
public class HuffmanTreeTest {
    
    public HuffmanTreeTest() {
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
     * Test of getTree method, of class HuffmanTree.
     */
    @Test
    public void testGetTree() {
        System.out.println("getTree");
        HuffmanTree instance = null;
        BinaryTree expResult = null;
        BinaryTree result = instance.getTree();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCodes method, of class HuffmanTree.
     */
    @Test
    public void testSetCodes() {
        System.out.println("setCodes");
        HuffmanTree instance = null;
        instance.setCodes();
    }
    
}
