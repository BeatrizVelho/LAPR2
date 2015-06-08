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
 * Testa a classe EventoEmRevisaoStateTest
 *
 * @author G01
 */
public class EventoEmRevisaoStateTest {

    /**
     * Instancia de evento
     */
    private Evento e;

    /**
     * Constroi instancia de EventoEmRevisaoStateTest recebendo uma instancia de
     * evento
     */
    public EventoEmRevisaoStateTest() {
        this.e = this.e = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 5, 8), new Data(2016, 6, 02),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10));
        e.setEstado(new EventoEmRevisaoState(e));
    }

    /**
     * Teste do metodo setCriado, da classe EventoEmRevisaoState..
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
     * Teste do metodo setRegistado, da classe EventoEmRevisaoState.
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
     * Teste do metodo setSessoesTematicasDefinidas, da classe
     * EventoEmRevisaoState.
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
     * Teste do metodo setCPDefinida, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmSubmissao, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmDetecao, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmLicitacao, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmDistribuicao, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmRevisao, da classe EventoEmRevisaoState.
     */
    @Test
    public void testSetEmRevisao() {
        System.out.println("setEmRevisao");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.setEmRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setFaseDecisao, da classe EventoEmRevisaoState.
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
     * Teste do metodo setEmSubmissaoCameraReady da classe EventoEmRevisaoState.
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
     * Teste do metodo setCameraReady, da classe EventoEmRevisaoState.
     */
    @Test
    public void testSetCameraReady() {
        System.out.println("setCameraReady");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.setCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo valida, da classe EventoEmRevisaoState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.valida();
        assertEquals(expResult, result);
    }

}
