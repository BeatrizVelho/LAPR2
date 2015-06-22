/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import eventoscientificos.model.state.submissao.SubmissaoAceiteState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste à classe ListaRevisoes.
 *
 * @author G01
 */
public class ListaRevisoesTest {

    private Revisor revisor;
    private Submissao submissao;
    private Revisao revisao;
    private Revisao r;
    private Utilizador u;
    private List<Revisao> listaRevisoes;

    public ListaRevisoesTest() {
        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        this.u = new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "username",
                            "password");
        this.submissao.setArtigoInicial(artigoInicial);
        this.submissao.setArtigoFinal(artigoFinal);
        this.revisor = new Revisor(new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "username",
                            "password"));
        this.revisao = new Revisao(submissao, revisor);
        this.r = new Revisao(submissao, revisor);
        r.setAdequacaoArtigo(5);
        r.setConfiancaRevisor(4);
        r.setOriginalidadeArtigo(3);
        r.setQualidadeArtigo(4);
        r.setRecomendacaoGlobal(2);
        r.setTextoJustificativo("ola");
        this.listaRevisoes = new ArrayList<>();
        listaRevisoes.add(revisao);
        listaRevisoes.add(r);
    }

    /**
     * Test of novaRevisao method, of class ListaRevisoes.
     */
    @Test
    public void testNovaRevisao() {
        System.out.println("novaRevisao");
        Submissao submissao = this.submissao;
        Revisor revisor = this.revisor;
        ListaRevisoes instance = new ListaRevisoes();
        Revisao expResult = new Revisao(submissao, revisor);
        Revisao result = instance.novaRevisao(submissao, revisor);
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarRevisao method, of class ListaRevisoes.
     */
    @Test
    public void testAdicionarRevisao() {
        System.out.println("adicionarRevisao");
        Revisao revisao = new Revisao(submissao, revisor);
        ListaRevisoes instance = new ListaRevisoes();
        boolean expResult = true;
        boolean result = instance.adicionarRevisao(revisao);
        assertEquals(expResult, result);

    }

    /**
     * Teste do método equals, da classe ListaRevisoes.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjecto = new ListaRevisoes();
        ListaRevisoes outraLista = (ListaRevisoes) outroObjecto;
        outraLista.adicionarRevisao(revisao);
        ListaRevisoes instance = new ListaRevisoes();
        instance.adicionarRevisao(revisao);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaRevisoes.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjecto = new ListaRevisoes();
        ListaRevisoes outraLista = (ListaRevisoes) outroObjecto;
        outraLista.adicionarRevisao(revisao);
        ListaRevisoes instance = new ListaRevisoes();
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Test of getRevisoesRevisor method, of class ListaRevisoes.
     */
    @Test
    public void testGetRevisoesRevisor() {
        System.out.println("getRevisoesRevisor");
        Utilizador u = this.u;
        ListaRevisoes instance = new ListaRevisoes();
        instance.adicionarRevisao(revisao);
        instance.adicionarRevisao(r);
        int expResult = 1;
        int result = instance.getRevisoesRevisor(u).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getValoresTotaisParaEstatisticaEvento method, of class
     * ListaRevisoes.
     */
    @Test
    public void testGetValoresTotaisParaEstatisticaEvento() {
        System.out.println("getValoresTotaisParaEstatisticaEvento");
        int nSubmissoes = 2;

        revisao.setAdequacaoArtigo(5);
        revisao.setConfiancaRevisor(4);
        revisao.setOriginalidadeArtigo(3);
        revisao.setQualidadeArtigo(4);
        revisao.setRecomendacaoGlobal(2);
        revisao.setTextoJustificativo("Fafa");

        this.r.getSubmissao().setEstado(new SubmissaoAceiteState(submissao));
        this.revisao.getSubmissao().setEstado(new SubmissaoAceiteState(submissao));

        ListaRevisoes instance = new ListaRevisoes();
        instance.adicionarRevisao(revisao);
        instance.adicionarRevisao(r);
        float[] result = instance.getValoresTotaisParaEstatisticaEvento(nSubmissoes);
        float[] expResult = {1f, 5f, 4f, 3f, 4f, 2f};
        Assert.assertArrayEquals(result, expResult, 0.00f);

    }

}
