package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author G01
 */
public class ListaSessoesTematicasTest {

    private Evento evento;
    private ListaSessoesTematicas listaSessoesTematicas;
    private SessaoTematica sessaoTematica;

    public ListaSessoesTematicasTest() {
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 5, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10));
        this.listaSessoesTematicas = new ListaSessoesTematicas(this.evento);
        this.sessaoTematica = new SessaoTematica(
                            "#123456", "Uma descrição", new Data(2016, 5, 9),
                            new Data(2016, 6, 21), new Data(2016, 7, 8),
                            new Data(2016, 9, 24), new Data(2017, 5, 28));
    }

    /**
     * Teste do método novaSessaoTematica, of class ListaSessoesTematicas.
     */
    @Test
    public void testNovaSessaoTematica() {
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
        System.out.println("novaSessaoTematica");
        SessaoTematica expResult = this.sessaoTematica;
        SessaoTematica result = instance.novaSessaoTematica(
                            "#123456", "Uma descrição", new Data(2015, 5, 22),
                            new Data(2015, 5, 28), new Data(2015, 6, 20),
                            new Data(2015, 6, 24), new Data(2015, 6, 28));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarSessaoTematica, da classe ListaSessoesTematicas.
     */
    @Test
    public void testAdicionarSessaoTematica() {
        System.out.println("adicionarSessaoTematica");
        SessaoTematica sessaoTematica = this.sessaoTematica;
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
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
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
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
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
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
        Object outroObject = new ListaSessoesTematicas(this.evento);
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
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
        Object outroObject = new ListaSessoesTematicas(this.evento);
        ListaSessoesTematicas instance = this.listaSessoesTematicas;
        instance.adicionarSessaoTematica(this.sessaoTematica);
        boolean expResult = false;
        boolean result = instance.equals(outroObject);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método temSessoesTematicasDefinidasPreenchida, da classe
     * ListaSessoesTematicas.
     */
    @Test
    public void testTemSessoesTematicasDefinidasPreenchida() {
        System.out.println("temSessoesTematicasDefinidasPreenchida");
        ListaSessoesTematicas instance = new ListaSessoesTematicas(this.evento);
        instance.adicionarSessaoTematica(sessaoTematica);
        boolean expResult = true;
        boolean result = instance.temSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método temSessoesTematicasDefinidasVazia, da classe
     * ListaSessoesTematicas.
     */
    @Test
    public void testTemSessoesTematicasDefinidasVazia() {
        System.out.println("temSessoesTematicasDefinidasVazia");
        ListaSessoesTematicas instance = new ListaSessoesTematicas(this.evento);
        boolean expResult = false;
        boolean result = instance.temSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }
}
