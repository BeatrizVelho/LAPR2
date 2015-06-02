package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class LocalTest {
    
    public LocalTest() {
    }

    /**
     * Teste dos métodos set e get do atributo nome do local, da classe Local.
     */
    @Test
    public void testSetAndGetLocal() {
        System.out.println("SetAndGetgetLocal");
        Local instance = new Local("Régua");
        String expResult = "Régua";
        instance.setNomeLocal(expResult);
        assertEquals(expResult, instance.getNomeLocal());
    }

    /**
     * Teste do método toString, da classe Local.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Local instance = new Local("Régua");
        String expResult = "Régua";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
