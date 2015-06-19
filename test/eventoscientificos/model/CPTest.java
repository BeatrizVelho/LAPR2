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

    /**
     * Test of contains method, of class ListaLicitacoes.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        CP instance = new CP();
        instance.novoRevisor(new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));

        Utilizador utilizador = new Utilizador(
                "Tiago", "1131658@isep.ipp.pt", "tiago", "1234");
        boolean expResult = true;
        boolean result = instance.contains(utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRevisor method, of class CP.
     */
    @Test
    public void testGetRevisor() {
        System.out.println("getRevisor");
        Utilizador u = new Utilizador("Joao", "jotajota@gmail.com", "username", "password");
        CP instance = new CP();
        boolean criado = instance.novoRevisor(u);
        Revisor expResult = new Revisor(u);
        Revisor result = instance.getRevisor(u);
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método getNumeroRevisores, da classe CP.
     */
    @Test
    public void testGetNumeroRevisores() {
        System.out.println("getNumeroRevisores");
        Utilizador utilizador = new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234");
        CP instance = new CP();
        instance.novoRevisor(utilizador);
        int expResult = 1;
        int result = instance.getNumeroRevisores();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método getRevisorPeloIndice, da classe CP.
     */
    public void testGetRevisorPeloIndice() {
        System.out.println("getRevisorPeloIndice");
        Utilizador utilizador = new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234");
        CP instance = new CP();
        instance.novoRevisor(utilizador);
        int indice = 0;
        Revisor expResult = new Revisor(utilizador);
        Revisor result = instance.getRevisorPeloIndice(indice);
        assertEquals(expResult, result);
    }

}
