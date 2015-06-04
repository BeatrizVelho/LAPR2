package eventoscientificos.model.StateSessaoTematica;

import eventoscientificos.model.CP;
import eventoscientificos.model.SessaoTematica;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class SessaoTematicaRegistadaStateTest {

    private SessaoTematica sessaoTematica;

    public SessaoTematicaRegistadaStateTest() {
        SessaoTematica sessaoTematica = new SessaoTematica(
                "#A9D24R",
                "LAPR2",
                new Data(2016, 5, 22),
                new Data(2016, 5, 28));
        sessaoTematica.setEstado(
                new SessaoTematicaRegistadaState(sessaoTematica));
        sessaoTematica.adicionarCP(new CP());
        
        this.sessaoTematica = sessaoTematica;
    }

    /**
     * Teste do método setCriada, da classe SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetCriada() {
        System.out.println("setCriada");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setCriada();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setRegistada, da classe SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetRegistada() {
        System.out.println("setRegistada");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = true;
        boolean result = instance.setRegistada();
        assertEquals(expResult, result);
    }

    /**
     * Test do método setCPDefinida, da classe SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetCPDefinida() {
        System.out.println("setCPDefinida");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = true;
        boolean result = instance.setCPDefinida();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setEmSubmissao, da classe 
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmDetecao method, of class SessaoTematicaCriadaState.
     */
    @Test
    public void testSetEmDetecao() {
        System.out.println("setEmDetecao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDetecao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do méotodo setEmLicitacao, da classe 
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetEmLicitacao() {
        System.out.println("setEmLicitacao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmLicitacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setEmDistribuicao, da classe 
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetEmDistribuicao() {
        System.out.println("setEmDistribuicao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setEmRevisao, da classe SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetEmRevisao() {
        System.out.println("setEmRevisao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setFaseDecisao, da classe
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetFaseDecisao() {
        System.out.println("setFaseDecisao");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setFaseDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setEmSubmissaoCameraReady, da classe
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetEmSubmissaoCameraReady() {
        System.out.println("setEmSubmissaoCameraReady");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmSubmissaoCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setCameraReady, da classe
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testSetCameraReady() {
        System.out.println("setCameraReady");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.setCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarEstado, da classe
     * SessaoTematicaRegistadaStateTest.
     */
    @Test
    public void testValidarEstado() {
        System.out.println("validarEstado");
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = true;
        boolean result = instance.validarEstado();
        assertEquals(expResult, result);
    }

}