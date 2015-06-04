package eventoscientificos.model;

import eventoscientificos.model.StateSessaoTematica.SessaoTematicaCriadaState;
import eventoscientificos.model.StateSessaoTematica.SessaoTematicaRegistadaState;
import eventoscientificos.model.StateSessaoTematica.SessaoTematicaState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class SessaoTematicaTest {

    private SessaoTematica sessaoTematica;
    private Utilizador utilizador;

    public SessaoTematicaTest() {
        this.sessaoTematica = new SessaoTematica(
                "#A9D24R",
                "LAPR2",
                new Data(2016, 5, 22),
                new Data(2016, 5, 28));
        this.utilizador = new Utilizador(
                "Pedro", "1140781@isep.ipp.pt", "pedro", "1234");
    }

    /**
     * Teste dos metodos set e get do código único, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetCodigoUnico() {
        System.out.println("setAndGetCodigoUnico");
        SessaoTematica instance = this.sessaoTematica;
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
        SessaoTematica instance = this.sessaoTematica;
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
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 5, 23);
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
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 5, 29);
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
        SessaoTematica instance = this.sessaoTematica;
        CP expResult = new CP();
        instance.setCp(expResult);
        assertEquals(expResult, instance.getCP());
    }

    /**
     * Teste do método setAndGetEstado, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetEstado() {
        System.out.println("setAndGetEstado");
        SessaoTematica instance = this.sessaoTematica;
        SessaoTematicaState estado
                = new SessaoTematicaCriadaState(this.sessaoTematica);
        Class<? extends SessaoTematicaState> expResult = estado.getClass();
        Class<? extends SessaoTematicaState> result
                = instance.getEstado().getClass();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCodigoUnicoEmpty() {
        System.out.println("setCodigoUnicoEmpty");
        SessaoTematica instance = this.sessaoTematica;
        String codigoUnico = "";
        instance.setCodigoUnico(codigoUnico);
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDescricaoEmpty() {
        System.out.println("setDescricao");
        SessaoTematica instance = this.sessaoTematica;
        String descricao = "";
        instance.setDescricao(descricao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioSubmissaoNull() {
        System.out.println("setDataInicioSubmissaoNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataInicioSubmissao = null;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioSubmissaoDatePassed() {
        System.out.println("setDataInicioSubmissaoDatePassed");
        SessaoTematica instance = this.sessaoTematica;
        Data dataInicioSubmissao = new Data(2015, 5, 22);
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoNull() {
        System.out.println("setDataFimSubmissaoNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataFimSubmissao = null;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataFimSubmissaoDateInferior() {
        System.out.println("setDataFimSubmissaoDateInferior");
        SessaoTematica instance = this.sessaoTematica;
        Data dataFimSubmissao = new Data(2015, 05, 22);
        instance.setDataInicioSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método equals, da classe SessaoTematica.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.sessaoTematica;
        SessaoTematica instance = this.sessaoTematica;
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
                new Data(2016, 1, 1), new Data(2016, 1, 7));
        SessaoTematica instance = this.sessaoTematica;
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
        SessaoTematica instance = this.sessaoTematica;
        boolean expResult = true;
        boolean result = instance.novoProponente(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoProponente, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoProponenteExists() {
        System.out.println("novoProponenteExists");
        SessaoTematica instance = this.sessaoTematica;
        instance.novoProponente(this.utilizador);
        instance.novoProponente(this.utilizador);
    }

    /**
     * Test of validarSessaoTematica method, of class SessaoTematica.
     */
    @Test
    public void testValidarSessaoTematica() {
        System.out.println("validarSessaoTematica");
        SessaoTematica instance = this.sessaoTematica;
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
        SessaoTematica instance = this.sessaoTematica;
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
        SessaoTematica instance = this.sessaoTematica;
        sessaoTematica.setEstado(
                new SessaoTematicaRegistadaState(sessaoTematica));
        CP cp = new CP();
        boolean expResult = true;
        boolean result = instance.adicionarCP(cp);
        assertEquals(expResult, result);
    }

}
