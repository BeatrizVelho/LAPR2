/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.controllers;

import eventoscientificos.model.Artigo;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import eventoscientificos.model.Revisor;
import eventoscientificos.model.SessaoTematica;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Utilizador;
import eventoscientificos.model.state.evento.EventoEmDistribuicaoState;
import eventoscientificos.model.state.evento.EventoEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmDistribuicaoState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author Tiago Ferreira
 */
public class DecidirSubmissoesArtigosControllerTest {
    
    private Empresa empresa;
    private Utilizador utilizador;
    private Evento evento;
    private SessaoTematica sessaoTematica;
    private Submissao submissao;
    private Revisor revisor;
    
    public DecidirSubmissoesArtigosControllerTest() {
        this.empresa = new Empresa();

        this.utilizador = new Utilizador("fatima", "ola@iml.com", "fafa", "1234");
        this.empresa.setUtilizadorAutenticado(utilizador);

        this.revisor = new Revisor(utilizador);

        this.evento = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 9, 10),
                            new Data(2016, 9, 11), new Data(2016, 10, 1),
                            new Data(2017, 6, 10));

        this.evento.novoOrganizador(utilizador);
        this.evento.setEstado(new EventoEmSubmissaoCameraReadyState(evento));

        this.sessaoTematica = new SessaoTematica(
                            "#123456", "Uma descrição", new Data(2016, 6, 9),
                            new Data(2016, 6, 21), new Data(2016, 7, 8),
                            new Data(2016, 7, 9), new Data(2017, 9, 24),
                            new Data(2017, 11, 28), new Data(2017, 12, 1));
        this.sessaoTematica.setEstado(new SessaoTematicaEmDistribuicaoState(sessaoTematica));
        this.sessaoTematica.novoProponente(utilizador);
        this.evento.getListaSessoesTematicas().adicionarSessaoTematica(sessaoTematica);
        Evento evento2 = new Evento("evento2", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 9, 10),
                            new Data(2016, 9, 11), new Data(2016, 10, 1),
                            new Data(2017, 6, 10));

        evento2.setEstado(new EventoEmDistribuicaoState(evento));
        evento2.novoOrganizador(utilizador);

        this.empresa.getRegistoEventos().adicionarEvento(evento);
        this.empresa.getRegistoEventos().adicionarEvento(evento2);

        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        submissao.setArtigoInicial(artigoInicial);
        submissao.setArtigoFinal(artigoFinal);
    }

    /**
     * Teste do método getListaDecidiveisOrganizadorProponente,
     * da classe DecidirSubmissoesArtigosController.
     */
    @Test
    public void testGetListaDecidiveisOrganizadorProponente() {
        System.out.println("getListaDecidiveisOrganizadorProponente");
        DecidirSubmissoesArtigosController instance = new DecidirSubmissoesArtigosController(empresa);
        boolean expResult = true;
        boolean result = instance.getListaDecidiveisOrganizadorProponente();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionarDefinivel method, of class DecidirSubmissoesArtigosController.
     */
    @Test (expected = NullPointerException.class)
    public void testSelecionarDefinivel() {
        System.out.println("selecionarDefinivel");
        int indice = 0;
        DecidirSubmissoesArtigosController instance = new DecidirSubmissoesArtigosController(empresa);
        boolean expResult = false;
        boolean result = instance.selecionarDefinivel(indice);
        assertEquals(expResult, result);
    }
    
}
