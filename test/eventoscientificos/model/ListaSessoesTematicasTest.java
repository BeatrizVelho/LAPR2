package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author G01
 */
public class ListaSessoesTematicasTest {
    
    private SessaoTematica sessaoTematica;

    public ListaSessoesTematicasTest() {
        this.sessaoTematica = new SessaoTematica(
                "#123456",
                "Uma descrição",
                new Data(2016, 05, 22),
                new Data(2017, 05, 22));
    }

    /**
     * Teste do método novaSessaoTematica, of class ListaSessoesTematicas.
     */
    @Test
    public void testNovaSessaoTematica() {
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        System.out.println("novaSessaoTematica");
        SessaoTematica expResult = this.sessaoTematica;
        SessaoTematica result = instance.novaSessaoTematica(
                "#123456",
                "Uma descrição",
                new Data(2016, 05, 22),
                new Data(2017, 05, 22));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarSessaoTematica, da classe ListaSessoesTematicas.
     */
    @Test
    public void testAdicionarSessaoTematica() {
        System.out.println("adicionarSessaoTematica");
        SessaoTematica sessaoTematica = this.sessaoTematica;
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        boolean expResult = true;
        boolean result = instance.adicionarSessaoTematica(sessaoTematica);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarSessaoTematica, da classe ListaSessoesTematicas.
     */
    @Test
    public void testValidarSessaoTematica() {
        System.out.println("validarSessaoTematica");
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        SessaoTematica sessaoTematica = this.sessaoTematica;
        boolean expResult = true;
        boolean result = instance.validarSessaoTematica(sessaoTematica);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarSessaoTematica, da classe ListaSessoesTematicas.
     */
    @Test
    public void testValidarSessaoTematicaNot() {
        System.out.println("validarSessaoTematicaNot");
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        SessaoTematica sessaoTematica = this.sessaoTematica;
        instance.adicionarSessaoTematica(sessaoTematica);
        boolean expResult = false;
        boolean result = instance.validarSessaoTematica(sessaoTematica);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaSessoesTematicas.
     */
    @Test
    public void testEquals() {
        Object outroObject = new ListaSessoesTematicas();
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        boolean expResult = true;
        boolean result = instance.equals(outroObject);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método equals, da classe ListaSessoesTematicas.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObject = new ListaSessoesTematicas();
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        instance.adicionarSessaoTematica(this.sessaoTematica);
        boolean expResult = false;
        boolean result = instance.equals(outroObject);
        assertEquals(expResult, result);
    }

}
