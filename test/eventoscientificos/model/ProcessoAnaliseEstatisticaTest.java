/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.submissao.SubmissaoAceiteState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author G01
 */
public class ProcessoAnaliseEstatisticaTest {

    private Evento evento;
    private Utilizador utilizador;
    private SessaoTematica st;
    private Revisao revisao;
    private ListaSubmissoes listaSubmissao;
    private ListaRevisoes listaRev;

    public ProcessoAnaliseEstatisticaTest() {
        String titulo = "sem titulo";
        String descricao = "descricao";
        Local local = new Local("local");
        Data dataInicioSubmissao = new Data(2016, 6, 8);
        Data dataFimSubmissao = new Data(2016, 6, 20);
        Data dataInicioDistribuicao = new Data(2016, 7, 30);
        Data dataFimRevisao = new Data(2016, 8, 15);
        Data dataFimSubmissaoCameraReady = new Data(2016, 8, 30);
        Data dataInicio = new Data(2016, 10, 9);
        Data dataFim = new Data(2017, 6, 10);
        RegistoEventos instance = new RegistoEventos();
        this.evento = new Evento(titulo, descricao, local, dataInicioSubmissao,
                            dataFimSubmissao, dataInicioDistribuicao, dataFimRevisao,
                            dataFimSubmissaoCameraReady, dataInicio, dataFim);
        this.evento.setEstado(new EventoEmSubmissaoCameraReadyState(evento));

        ProcessoDistribuicao pd = new ProcessoDistribuicao();

        this.utilizador = new Utilizador(
                            "pedro", "1140781@isep.ipp.pt", "pedro", "12345");
        Utilizador utilizador2 = new Utilizador(
                            "fatima", "susana@isep.ipp.pt", "susana", "12345");

        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        Submissao submissao = new Submissao();
        submissao.setEstado(new SubmissaoAceiteState(submissao));
        submissao.setArtigoInicial(new Artigo());
        submissao.setArtigoFinal(artigoFinal);

        Submissao submissao2 = new Submissao(submissao);
        submissao2.setEstado(new SubmissaoAceiteState(submissao));

        this.revisao = new Revisao(submissao, new Revisor(utilizador));
        revisao.setAdequacaoArtigo(5);
        revisao.setConfiancaRevisor(4);
        revisao.setOriginalidadeArtigo(3);
        revisao.setQualidadeArtigo(4);
        revisao.setRecomendacaoGlobal(2);
        revisao.setTextoJustificativo("ola");

        Revisao revisao2 = new Revisao(submissao, new Revisor(utilizador2));
        revisao2.setAdequacaoArtigo(5);
        revisao2.setConfiancaRevisor(4);
        revisao2.setOriginalidadeArtigo(3);
        revisao2.setQualidadeArtigo(4);
        revisao2.setRecomendacaoGlobal(2);
        revisao2.setTextoJustificativo("mimi");

        Revisao revisao3 = new Revisao(submissao2, new Revisor(utilizador));
        revisao3.setAdequacaoArtigo(5);
        revisao3.setConfiancaRevisor(4);
        revisao3.setOriginalidadeArtigo(3);
        revisao3.setQualidadeArtigo(4);
        revisao3.setRecomendacaoGlobal(2);
        revisao3.setTextoJustificativo("fafa");

        Revisao revisao4 = new Revisao(submissao2, new Revisor(utilizador2));
        revisao4.setAdequacaoArtigo(5);
        revisao4.setConfiancaRevisor(4);
        revisao4.setOriginalidadeArtigo(3);
        revisao4.setQualidadeArtigo(4);
        revisao4.setRecomendacaoGlobal(2);
        revisao4.setTextoJustificativo("tatat");

        listaRev = new ListaRevisoes();
        listaRev.getListaRevisoes().add(revisao);
        listaRev.getListaRevisoes().add(revisao2);
        listaRev.getListaRevisoes().add(revisao3);
        listaRev.getListaRevisoes().add(revisao4);

        listaSubmissao = new ListaSubmissoes();
        listaSubmissao.adicionarSubmissao(submissao);
        listaSubmissao.adicionarSubmissao(submissao2);

        CP cp = new CP();
        cp.novoRevisor(utilizador);
        cp.novoRevisor(utilizador2);
        this.evento.adicionarCP(cp);
    }

    /**
     * Test of getValoresEstatistica method, of class
     * ProcessoAnaliseEstatistica.
     */
    @Test
    public void testGetValoresEstatistica() {
        System.out.println("getValoresEstatistica");

        ProcessoAnaliseEstatistica instance = new ProcessoAnaliseEstatistica(listaRev, listaSubmissao, this.evento.getCP());
        instance.getValoresEstatistica();
    }

}
