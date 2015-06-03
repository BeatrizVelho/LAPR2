package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiago Ferreira
 */
public class CPTest {

    public CPTest() {
    }

    /**
     * Teste do método novoRevisor, da classe CP.
     */
    @Test
    public void testNovoRevisor() {
        System.out.println("novoRevisor");
        CP instance = new CP();
        boolean expResult = true;
        boolean result = instance.novoRevisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoRevisor, da classe CP.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoRevisorLista() {
        System.out.println("novoRevisorLista");
        CP instance = new CP();
        instance.novoRevisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));

        instance.novoRevisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
    }

    /**
     * Teste do método equals, da classe CP.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new CP();
        CP instance = new CP();
        boolean expResult = true;
        assertEquals(expResult, instance.equals(outroObjeto));
    }

    /**
     * Teste do método equals, da classe CP.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        CP outraCP = new CP();
        outraCP.novoRevisor(new Utilizador(
                "tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        CP instance = new CP();
        boolean expResult = false;
        assertEquals(expResult, instance.equals(outraCP));
    }

    /**
     * Teste do método validarCP, da classe CP.
     */
    @Test
    public void testValidarCP() {
        System.out.println("validarCPVazia");
        CP instance = new CP();
        instance.novoRevisor(new Utilizador(
                "tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        boolean expResult = true;
        boolean result = instance.validarCP();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarCPVazia, da classe CP.
     */
    @Test
    public void testValidarCPVazia() {
        System.out.println("validarCPVazia");
        CP instance = new CP();
        boolean expResult = false;
        boolean result = instance.validarCP();
        assertEquals(expResult, result);
    }
}
