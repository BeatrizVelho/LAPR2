/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.controllers;

import eventoscientificos.model.Artigo;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.ListaRevisoes;
import eventoscientificos.model.Local;
import eventoscientificos.model.ProcessoDistribuicao;
import eventoscientificos.model.Revisao;
import eventoscientificos.model.Revisor;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Utilizador;
import eventoscientificos.model.state.evento.EventoEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.submissao.SubmissaoAceiteState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *Teste à classe GerarEstatisticasEventoController
 * @author G01
 */
public class GerarEstatisticasEventoControllerTest {

    private Empresa empresa;
    private Evento evento;
    private Submissao submissao;
    private Utilizador utilizador;
    private Revisor revisor;
    private Revisao r;
    private Revisao revisao2;

    public GerarEstatisticasEventoControllerTest() {
        this.utilizador = new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234");
        this.revisor = new Revisor(utilizador);
        this.empresa = new Empresa();
        this.empresa.setUtilizadorAutenticado(utilizador);
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 9, 10),
                            new Data(2016, 9, 11), new Data(2016, 10, 1),
                            new Data(2017, 6, 10));
        this.evento.setEstado(new EventoEmSubmissaoCameraReadyState(evento));
        this.evento.novoOrganizador(utilizador);

        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        this.submissao.setEstado(new SubmissaoAceiteState(submissao));

        Submissao sub = new Submissao();
        sub.setArtigoInicial(artigoInicial);
        sub.setArtigoFinal(artigoFinal);
        sub.setEstado(new SubmissaoAceiteState(submissao));

        submissao.setArtigoInicial(artigoInicial);
        submissao.setArtigoFinal(artigoFinal);
        this.evento.getListaSubmissoes().adicionarSubmissao(submissao);

        this.evento.getListaSubmissoes().adicionarSubmissao(sub);

        this.revisao2 = new Revisao(submissao, new Revisor(utilizador));
        revisao2.setAdequacaoArtigo(5);
        revisao2.setConfiancaRevisor(4);
        revisao2.setOriginalidadeArtigo(3);
        revisao2.setQualidadeArtigo(4);
        revisao2.setRecomendacaoGlobal(2);
        revisao2.setTextoJustificativo("Nana");

        Submissao sb = new Submissao();
        sb.setEstado(new SubmissaoAceiteState(submissao));
        sb.setArtigoFinal(artigoFinal);
        sb.setArtigoInicial(artigoInicial);

        this.r = new Revisao(sub, revisor);
        r.setAdequacaoArtigo(5);
        r.setConfiancaRevisor(4);
        r.setOriginalidadeArtigo(3);
        r.setQualidadeArtigo(4);
        r.setRecomendacaoGlobal(2);
        r.setTextoJustificativo("Fafa");

        ProcessoDistribuicao pd = new ProcessoDistribuicao();
        this.evento.adicionarProcessoDistribuicao(pd);
        ListaRevisoes lr = this.evento.getProcessoDistribuicao().getListaRevisoes();
        lr.adicionarRevisao(revisao2);
        lr.adicionarRevisao(r);

        this.empresa.getRegistoEventos().adicionarEvento(evento);
    }

    /**
     * Test of getListaEventosOrganizadorDecididos method, of class
     * GerarEstatisticasEventoController.
     */
    @Test
    public void testGetListaEventosOrganizadorDecididos() {
        System.out.println("getListaEventosOrganizadorDecididos");
        GerarEstatisticasEventoController instance = new GerarEstatisticasEventoController(empresa);
        boolean expResult = true;
        boolean result = instance.getListaEventosOrganizadorDecididos();
        assertEquals(expResult, result);
    }

    /**
     * Test of selecionarEventosEGerarEStatisticas method, of class
     * GerarEstatisticasEventoController.
     */
    @Test
    public void testSelecionarEventosEGerarEstatisticas() {
        System.out.println("selecionarEventosEGerarEstatisticas");
        int indice = 0;
        GerarEstatisticasEventoController instance = new GerarEstatisticasEventoController(empresa);
        boolean expResult = true;
        instance.getListaEventosOrganizadorDecididos();
        boolean result = instance.selecionarEventosEGerarEstatisticas(indice);
        assertEquals(expResult, result);
    }

}