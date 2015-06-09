/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.state.evento;

import eventoscientificos.model.state.evento.EventoState;
import eventoscientificos.model.state.evento.EventoCriadoState;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * Testa a classe EventoCriadoState
 *
 * @author G01
 */
public class EventoCriadoStateTest {

    /**
     * Instancia de evento
     */
    private Evento e;

    /**
     * Constroi instancia de EventoCriadoStateTest recebendo uma instancia de
     * evento
     */
    public EventoCriadoStateTest() {
        this.e = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10));
        e.setEstado(new EventoCriadoState(e));
    }

    /**
     * Teste do metodo setCriado, da classe EventoCriadoState.
     */
    @Test
    public void testSetCriado() {
        System.out.println("setCriado");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.setCriado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setRegistado, da classe EventoCriadoState.
     */
    @Test
    public void testSetRegistado() {
        System.out.println("setRegistado");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.setRegistado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetSessoesTematicasDefinidas, da classe
     * EventoCriadoState.
     */
    @Test
    public void testSetSessoesTematicasDefinidas() {
        System.out.println("setSessoesTematicasDefinidas");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetCPDefinida, da classe EventoCriadoState.
     */
    @Test
    public void testSetCPDefinida() {
        System.out.println("setCPDefinida");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setCPDefinida();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmSubmissao, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmDetecao, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmDetecao() {
        System.out.println("setEmDetecao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmDetecao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmLicitacao, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmLicitacao() {
        System.out.println("setEmLicitacao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmLicitacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmDistribuicao, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmDistribuicao() {
        System.out.println("setEmDistribuicao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmRevisao, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmRevisao() {
        System.out.println("setEmRevisao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetFaseDecisao, da classe EventoCriadoState.
     *
     */
    @Test
    public void testSetFaseDecisao() {
        System.out.println("setFaseDecisao");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setFaseDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmSubmissaoCameraReady, da classe EventoCriadoState.
     */
    @Test
    public void testSetEmSubmissaoCameraReady() {
        System.out.println("setEmSubmissaoCameraReady");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setEmSubmissaoCameraReady();
        assertEquals(expResult, result);

    }

    /**
     * Teste do metodo SetCameraReady, da classe EventoCriadoState.
     */
    @Test
    public void testSetCameraReady() {
        System.out.println("setCameraReady");
        EventoCriadoState instance = new EventoCriadoState(e);
        boolean expResult = false;
        boolean result = instance.setCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo validarEstado, da classe EventoCriadoState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.validarEstado();
        assertEquals(expResult, result);
    }

}