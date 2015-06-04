package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author G01
 */
public class ListaSessoesTematicasTest {

    public ListaSessoesTematicasTest() {
    }

    /**
     * Teste do método novaSessaoTematica, of class ListaSessoesTematicas.
     */
    @Test
    public void testNovaSessaoTematica() {
        ListaSessoesTematicas instance = new ListaSessoesTematicas();
        System.out.println("novaSessaoTematica");
        String codigoUnico = "#123456";
        String descricao = "Uma descrição";
        Data dataInicioSubmissao = new Data(2016, 05, 22);
        Data dataFimSubmissao = new Data(2017, 05, 22);
        SessaoTematica expResult = new SessaoTematica(
                codigoUnico,
                descricao,
                dataInicioSubmissao,
                dataFimSubmissao);
        SessaoTematica result = instance.novaSessaoTematica(
                codigoUnico,
                descricao,
                dataInicioSubmissao,
                dataFimSubmissao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarSessaoTematica, da classe ListaSessoesTematicas.
     */
    @Test
    public void testAdicionarSessaoTematica() {
        System.out.println("adicionarSessaoTematica");
        SessaoTematica sessaoTematica = new SessaoTematica(
                "#123456",
                "Uma descrição",
                new Data(2016, 05, 22),
                new Data(2017, 05, 22));
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
        SessaoTematica sessaoTematica = new SessaoTematica(
                "#123456",
                "Uma descrição",
                new Data(2016, 05, 22),
                new Data(2017, 05, 22));
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
        SessaoTematica sessaoTematica = new SessaoTematica(
                "#123456",
                "Uma descrição",
                new Data(2016, 05, 22),
                new Data(2017, 05, 22));
        instance.adicionarSessaoTematica(sessaoTematica);
        boolean expResult = false;
        boolean result = instance.validarSessaoTematica(sessaoTematica);
        assertEquals(expResult, result);
    }

}
