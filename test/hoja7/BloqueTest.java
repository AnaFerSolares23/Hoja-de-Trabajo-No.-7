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
public class BloqueTest {
    
    public BloqueTest() {
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
     * Test of getLetra method, of class Bloque.
     */
    @Test
    public void testGetLetra() {
        System.out.println("getLetra");
        Bloque instance = null;
        Object expResult = null;
        Object result = instance.getLetra();
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrecuencia method, of class Bloque.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        Bloque instance = null;
        int expResult = 0;
        int result = instance.getFrecuencia();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFrecuencia method, of class Bloque.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        int frequency = 0;
        Bloque instance = null;
        instance.setFrecuencia(frequency);
    }

    /**
     * Test of compareTo method, of class Bloque.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object other = null;
        Bloque instance = null;
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of setCode method, of class Bloque.
     */
    @Test
    public void testSetCode() {
        System.out.println("setCode");
        String cod = "";
        Bloque instance = null;
        instance.setCode(cod);
    }

    /**
     * Test of getCode method, of class Bloque.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        Bloque instance = null;
        String expResult = "";
        String result = instance.getCode();
        assertEquals(expResult, result);
    }
    
}
