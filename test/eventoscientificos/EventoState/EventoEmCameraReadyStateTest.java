/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.EventoState;

import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * Testa a classe EventoEmCameraReadyState
 *
 * @author G01
 */
public class EventoEmCameraReadyStateTest {

    /**
     * Instancia de evento
     */
    private Evento e;

    /**
     * Constroi instancia de EventoEmCameraReadyStateTest recebendo uma
     * instancia de evento
     */
    public EventoEmCameraReadyStateTest() {
        this.e = this.e = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10));
        e.setEstado(new EventoEmCameraReadyState(e));
    }

    /**
     * Teste do metodo setCriado, da classe EventoCriadoState.
     *
     */
    @Test
    public void testSetCriado() {
        System.out.println("setCriado");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCriado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setRegistado, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetRegistado() {
        System.out.println("setRegistado");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setRegistado();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetSessoesTematicasDefinidas, da classe
     * EventoEmCameraReadyState.
     */
    @Test
    public void testSetSessoesTematicasDefinidas() {
        System.out.println("setSessoesTematicasDefinidas");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetCPDefinida, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetCPDefinida() {
        System.out.println("setCPDefinida");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCPDefinida();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmSubmissao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmDetecao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmDetecao() {
        System.out.println("setEmDetecao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDetecao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmLicitacao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmLicitacao() {
        System.out.println("setEmLicitacao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmLicitacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmDistribuicao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmDistribuicao() {
        System.out.println("setEmDistribuicao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmRevisao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmRevisao() {
        System.out.println("setEmRevisao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetFaseDecisao, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetFaseDecisao() {
        System.out.println("setFaseDecisao");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setFaseDecisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetEmSubmissaoCameraReady, da classe
     * EventoEmCameraReadyState.
     */
    @Test
    public void testSetEmSubmissaoCameraReady() {
        System.out.println("setEmSubmissaoCameraReady");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setEmSubmissaoCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo SetCameraReady, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testSetCameraReady() {
        System.out.println("setCameraReady");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.setCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo valida, da classe EventoEmCameraReadyState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

}
