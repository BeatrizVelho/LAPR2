package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tiago Ferreira
 */
public class RevisorTest {

    public RevisorTest() {
    }

    /**
     * Teste do método getUtilizador, da classe Revisor.
     */
    @Test
    public void testGetUtilizador() {
        System.out.println("getUtilizador");
        Revisor instance = new Revisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        Utilizador expResult = new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234");
        Utilizador result = instance.getUtilizador();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarProponente, da classe Revisor.
     */
    @Test
    public void testValidarRevisor() {
        System.out.println("validarRevisor");
        Revisor instance = new Revisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        boolean expResult = true;
        boolean result = instance.validarRevisor();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarProponente, quando não é válido, da classe
     * Revisor.
     */
    @Test(expected = NullPointerException.class)
    public void testValidarRevisorNot() {
        System.out.println("validarRevisor");
        Revisor instance = new Revisor(null);
        instance.validarRevisor();

    }


}
