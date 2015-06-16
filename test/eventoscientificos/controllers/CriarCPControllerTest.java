package eventoscientificos.controllers;

import eventoscientificos.model.CP;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import eventoscientificos.model.Revisor;
import eventoscientificos.model.SessaoTematica;
import eventoscientificos.model.Utilizador;
import eventoscientificos.model.state.evento.EventoSessoesTematicasDefinidasState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author Tiago Ferreira
 */
public class CriarCPControllerTest {

    private Empresa emp;
    private Evento evento;
    private SessaoTematica st;
    private Utilizador u;

    public CriarCPControllerTest() {
        this.emp = new Empresa();
        CP cp = new CP();
        Revisor revisor = new Revisor(new Utilizador(
                "fatima", "ola@iml.com", "fafa", "1234"));

        this.u = new Utilizador(
                "fatima", "ola@iml.com", "fafa", "1234");
        cp.novoRevisor(u);

        this.evento = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 9, 10),
                new Data(2016, 9, 11), new Data(2016, 10, 1),
                new Data(2017, 6, 10));
        this.evento.novoOrganizador(u);
        this.evento.setEstado(new EventoSessoesTematicasDefinidasState(evento));
        this.evento.adicionarCP(cp);

        Evento evento2 = new Evento("Francisca", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 9, 10),
                new Data(2016, 9, 11), new Data(2016, 10, 1),
                new Data(2017, 6, 10));
        evento2.novoOrganizador(u);
        evento2.setEstado(new EventoSessoesTematicasDefinidasState(evento2));

        this.emp.setUtilizadorAutenticado(u);
        this.emp.getRegistoUtilizadores().adicionaUtilizador(u);
        this.emp.getRegistoEventos().adicionarEvento(evento);
        this.emp.getRegistoEventos().adicionarEvento(evento2);

    }

    /**
     * Teste do método getListaCPDefiniveisSemCPOrganizadorProponente, da classe
     * CriarCPController.
     */
    @Test
    public void testGetListaCPDefiniveisSemCPOrganizadorProponente() {
        System.out.println("getListaCPDefiniveisSemCPOrganizadorProponente");
        CriarCPController instance = new CriarCPController(emp);
        emp.setUtilizadorAutenticado(u);
        boolean expResult = true;
        boolean result = instance.getListaCPDefiniveisSemCPOrganizadorProponente();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método selecionarCPDefinivel, da classe CriarCPController.
     */
    @Test
    public void testSelecionarCPDefinivel() {
        System.out.println("selecionarCPDefinivel");
        int indice = 0;
        CriarCPController instance = new CriarCPController(emp);
        instance.getListaCPDefiniveisSemCPOrganizadorProponente();
        boolean expResult = true;
        boolean result = instance.selecionarCPDefinivel(indice);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoRevisor, da class CriarCPController.
     */
    @Test
    public void testNovoRevisor() {
        System.out.println("novoRevisor");
        Empresa emp = new Empresa();
        String id = "fafa";
        CriarCPController instance = new CriarCPController(this.emp);
        instance.getListaCPDefiniveisSemCPOrganizadorProponente();
        instance.selecionarCPDefinivel(0);
        boolean expResult = true;
        boolean result = instance.novoRevisor(id);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarCP, da classe CriarCPController.
     */
    @Test
    public void testValidarCP() {
        System.out.println("validarCP");
        CriarCPController instance =  new CriarCPController(this.emp);
        instance.getListaCPDefiniveisSemCPOrganizadorProponente();
        instance.selecionarCPDefinivel(0);
        instance.novoRevisor("fafa");
        boolean expResult = true;
        boolean result = instance.validarCP();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarCP, da classe CriarCPController.
     */
    @Test
    public void testAdicionarCP() {
        System.out.println("adicionarCP");
        CriarCPController instance = new CriarCPController(this.emp);
        instance.getListaCPDefiniveisSemCPOrganizadorProponente();
        instance.selecionarCPDefinivel(0);
        instance.novoRevisor("fafa");
        instance.validarCP();
        boolean expResult = true;
        boolean result = instance.adicionarCP();
        assertEquals(expResult, result);
    }

}
