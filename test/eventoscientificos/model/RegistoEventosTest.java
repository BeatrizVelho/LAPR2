package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoRegistadoState;
import eventoscientificos.model.state.evento.EventoSessoesTematicasDefinidasState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaRegistadaState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class RegistoEventosTest {

    private Evento evento;
    private Utilizador utilizador;

    public RegistoEventosTest() {
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 1),
                new Data(2017, 6, 10));
        this.utilizador = new Utilizador(
                "pedro", "1140781@isep.ipp.pt", "pedro", "12345");
    }

    /**
     * Teste do método novoEvento, da classe RegistoEventos.
     */
    @Test
    public void testNovoEvento() {
        System.out.println("novoEvento");
        String titulo = "titulo";
        String descricao = "descricao";
        Local local = new Local("local");
        Data dataInicioSubmissao = new Data(2016, 6, 8);
        Data dataFimSubmissao = new Data(2016, 6, 20);
        Data dataInicioDistribuicao = new Data(2016, 7, 30);
        Data dataInicio = new Data(2016, 8, 1);
        Data dataFim = new Data(2017, 6, 10);
        RegistoEventos instance = new RegistoEventos();
        Evento expResult = this.evento;
        Evento result = instance.novoEvento(
                titulo, descricao, local, dataInicioSubmissao, dataFimSubmissao,
                dataInicioDistribuicao, dataInicio, dataFim);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarEvento, da classe RegistoEventos.
     */
    @Test
    public void testValidarEvento() {
        System.out.println("validarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.validarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarEvento, da classe RegistoEventos.
     */
    @Test
    public void testAdicionarEvento() {
        System.out.println("adicionarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.adicionarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        RegistoEventos outroObjeto = new RegistoEventos();

        outroObjeto.adicionarEvento(this.evento);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new RegistoEventos();
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaEventosOrganizador, da classe RegistoEventos.
     */
    @Test
    public void testGetListaEventosOrganizador() {
        this.evento.setEstado(new EventoRegistadoState(this.evento));
        this.evento.novoOrganizador(this.utilizador);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        List<Evento> expResult = new ArrayList();
        expResult.add(this.evento);
        List<Evento> result
                = instance.getListaEventosOrganizador(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaCPDefiniveisSemCPOrganizadorProponente, da classe
     * RegistoEventos.
     */
    @Test
    public void testGetListaCPDefiniveisSemCPOrganizadorProponente() {
        System.out.println("getListaCPDefiniveisSemOrganizadorProponente");
        Evento evento = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 1),
                new Data(2017, 6, 10));
        evento.setEstado(new EventoSessoesTematicasDefinidasState(evento));
        evento.novoOrganizador(this.utilizador);
        SessaoTematica sessao = new SessaoTematica(
                "#A9D24R",
                "LAPR2",
                new Data(2016, 5, 22),
                new Data(2016, 5, 28));
        sessao.setEstado(new SessaoTematicaRegistadaState(sessao));
        sessao.novoProponente(this.utilizador);
        evento.getListaSessoesTematicas().adicionarSessaoTematica(sessao);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        int expResult = 2;
        int result = (instance.getListaCPDefiniveisSemCPOrganizadorProponente(this.utilizador)).size();
        assertEquals(expResult, result);
    }

}
