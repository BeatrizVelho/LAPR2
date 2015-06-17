package eventoscientificos.controllers;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ModeloListaPapelTest {

    public ModeloListaPapelTest() {
    }

    /**
     * Teste do método getSize, da classe ModeloListaPapel.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ModeloListaPapel instance = new ModeloListaPapel<String>();
        instance.addElement("123");
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getElementAt, da classe ModeloListaPapel.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        int index = 0;
        ModeloListaPapel instance = new ModeloListaPapel<String>();
        instance.addElement("123");
        Object expResult = "123";
        Object result = instance.getElementAt(index);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método addElement, da classe ModeloListaPapel.
     */
    @Test
    public void testAddElement() {
        System.out.println("addElement");
        String elemento = "123";
        ModeloListaPapel instance = new ModeloListaPapel();
        boolean expResult = true;
        boolean result = instance.addElement(elemento);
        assertEquals(expResult, result);
    }

}
