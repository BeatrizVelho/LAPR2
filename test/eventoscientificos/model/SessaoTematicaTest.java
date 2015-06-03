package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class SessaoTematicaTest {

    public SessaoTematicaTest() {
    }

    /**
     * Teste dos metodos set e get do código único, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetCodigoUnico() {
        System.out.println("setAndGetCodigoUnico");
        SessaoTematica instance = new SessaoTematica();
        String expResult = "#123456";
        instance.setCodigoUnico(expResult);
        String result = instance.getCodigoUnico();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da descrição, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetDescricao() {
        System.out.println("setAndGetDescricao");
        SessaoTematica instance = new SessaoTematica();
        String expResult = "uma descrição";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de submissão, da classe
     * SessaoTematica.
     */
    @Test
    public void testSetAndGetDataInicioSubmissao() {
        System.out.println("setAndGetDataInicioSubmissao");
        SessaoTematica instance = new SessaoTematica();
        Data expResult = new Data();
        instance.setDataInicioSubmissao(expResult);
        Data result = instance.getDataInicioSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim de submissão, da classe
     * SessaoTematica.
     */
    @Test
    public void testSetAndGetDataFimSubmissao() {
        System.out.println("setAndGetDataFimSubmissao");
        SessaoTematica instance = new SessaoTematica();
        Data expResult = new Data();
        instance.setDataFimSubmissao(expResult);
        Data result = instance.getDataFimSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da CP, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetCP() {
        System.out.println("setAndGetCP");
        SessaoTematica instance = new SessaoTematica();
        CP expResult = new CP();
        instance.setCp(expResult);
        assertEquals(expResult, instance.getCP());
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCodigoUnicoEmpty() {
        System.out.println("setCodigoUnicoEmpty");
        String codigoUnico = "";
        SessaoTematica instance = new SessaoTematica();
        instance.setCodigoUnico(codigoUnico);
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDescricaoEmpty() {
        System.out.println("setDescricao");
        String descricao = "";
        SessaoTematica instance = new SessaoTematica();
        instance.setDescricao(descricao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioSubmissaoNull() {
        System.out.println("setDataInicioSubmissaoNull");
        Data dataLimiteSubmissao = null;
        SessaoTematica instance = new SessaoTematica();
        instance.setDataInicioSubmissao(dataLimiteSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioSubmissaoDatePassed() {
        System.out.println("setDataInicioSubmissaoDatePassed");
        Data dataLimiteSubmissao = new Data(1, 1, 1);
        SessaoTematica instance = new SessaoTematica();
        instance.setDataInicioSubmissao(dataLimiteSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoNull() {
        System.out.println("setDataFimSubmissaoNull");
        Data dataLimiteSubmissao = null;
        SessaoTematica instance = new SessaoTematica();
        instance.setDataFimSubmissao(dataLimiteSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataFimSubmissaoDatePassed() {
        System.out.println("setDataFimSubmissaoDatePassed");
        Data dataFimSubmissao = new Data(1, 1, 1);
        SessaoTematica instance = new SessaoTematica();
        instance.setDataInicioSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método equals, da classe SessaoTematica.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new SessaoTematica();
        SessaoTematica instance = new SessaoTematica();
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe SessaoTematica.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new SessaoTematica("#1234", "Sem descrição",
                new Data(), new Data());
        SessaoTematica instance = new SessaoTematica();
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoProponente, da classe SessaoTematica.
     */
    @Test
    public void testNovoProponente() {
        System.out.println("novoProponente");
        SessaoTematica instance = new SessaoTematica();
        boolean expResult = true;
        boolean result = instance.novoProponente(new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234"));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoProponente, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoProponenteExists() {
        System.out.println("novoProponenteExists");
        SessaoTematica instance = new SessaoTematica();
        instance.novoProponente(new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234"));
        instance.novoProponente(new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234"));
    }

    /**
     * Test of validarSessaoTematica method, of class SessaoTematica.
     */
    @Test
    public void testValidarSessaoTematica() {
        System.out.println("validarSessaoTematica");
        SessaoTematica instance = new SessaoTematica(
                "#123456", "Uma descrição",
                new Data(2016, 05, 22), new Data(2016, 05, 22));
        boolean expResult = true;
        boolean result = instance.validarSessaoTematica();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novaCP, da classe SessaoTematica.
     */
    @Test
    public void testNovaCP() {
        System.out.println("novaCP");
        SessaoTematica instance = new SessaoTematica();
        CP expResult = new CP();
        CP result = instance.novaCp();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo adicionarCP da classe SessaoTematica.
     */
    @Test
    public void testAdicionarCP() {
        System.out.println("adicionarCP");
        SessaoTematica instance = new SessaoTematica();
        CP cp = new CP();
        boolean expResult = true;
        boolean result = instance.adicionarCP(cp);
        assertEquals(expResult, result);
    }

}
