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
}
