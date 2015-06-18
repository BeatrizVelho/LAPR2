/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;
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
        this.listaRevisoes = new ArrayList<>();
        listaRevisoes.add(revisao);
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
        int expResult = 1;
        int result = instance.getRevisoesRevisor(u).size();
        assertEquals(expResult, result);
    }
}
