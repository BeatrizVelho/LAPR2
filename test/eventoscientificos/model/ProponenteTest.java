package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ProponenteTest {
    
    public ProponenteTest() {
    }

    /**
     * Teste do método validarProponente, da classe Proponente.
     */
    @Test
    public void testValidarProponente() {
        System.out.println("validarProponente");
        Proponente instance = new Proponente(new Utilizador());
        boolean expResult = true;
        boolean result = instance.validarProponente();
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método validarProponente, quando não é válido, da classe 
     * Proponente.
     */
    @Test(expected = NullPointerException.class)
    public void testValidarProponenteNot() {
        System.out.println("validarProponenteNot");
        Proponente instance = new Proponente(null);
        instance.validarProponente();
    }
    
}
