package eventoscientificos.model.state.evento;

import eventoscientificos.model.state.evento.EventoState;
import eventoscientificos.model.state.evento.EventoEmLicitacaoState;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * Testa a classe EventoEmLicitacaoState
 *
 * @author G01
 */
public class EventoEmLicitacaoStateTest {

    /**
     * Instancia de evento
     */
    private Evento e;

    /**
     * Constroi instancia de EventoEmLicitacaoStateTest recebendo uma instancia
     * de evento
     */
    public EventoEmLicitacaoStateTest() {
        this.e = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10));
        e.setEstado(new EventoEmLicitacaoState(e));
    }

    /**
     * Teste do metodo setCriado, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setRegistado, da classe EventoEmLicitacaoState.
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
     * EventoEmLicitacaoState.
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
     * Teste do metodo setCPDefinida, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setEmSubmissao, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setEmDetecao, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setEmLicitacao, da classe EventoEmLicitacaoState.
     */
    @Test
    public void testSetEmLicitacao() {
        System.out.println("setEmLicitacao");
        EventoState instance = e.getEstado();
        boolean expResult = true;
        boolean result = instance.setEmLicitacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setEmDistribuicao, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setEmRevisao, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setFaseDecisao, da classe EventoEmLicitacaoState.
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
     * Teste do metodo setEmSubmissaoCameraReady da classe
     * EventoEmLicitacaoState.
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
     * Teste do metodo setCameraReady, da classe EventoEmLicitacaoState.
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
     * Teste ao metodo validarEstado, da classe EventoEmLicitacaoState.
     */
    @Test
    public void testValida() {
        System.out.println("valida");
        EventoState instance = e.getEstado();
        boolean expResult = false;
        boolean result = instance.validarEstado();
        assertEquals(expResult, result);
    }

}
