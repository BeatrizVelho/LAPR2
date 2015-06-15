/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testa a classe Lista Licitacoes
 *
 * @author G01
 */
public class ListaLicitacoesTest {

    private List<Licitacao> listaLicitacoes;

    public ListaLicitacoesTest() {
        ListaLicitacoes listaLicitacoes = new ListaLicitacoes();
        this.listaLicitacoes = new ArrayList<>();
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);
        this.listaLicitacoes.add(instance);

        listaLicitacoes.adicionarListaLicitacoesTemporaria(this.listaLicitacoes);
    }

    /**
     * Test of criarListaLicitacoesTemporaria method, of class ListaLicitacoes.
     */
    @Test
    public void testCriarListaLicitacoesTemporaria() {
        System.out.println("criarListaLicitacoesTemporaria");
        ListaLicitacoes instance = new ListaLicitacoes();
        List<Licitacao> expResult = new ArrayList<>();
        List<Licitacao> result = instance.criarListaLicitacoesTemporaria();
        assertEquals(expResult, result);
    }

    /**
     * Test of novaLicitacao method, of class ListaLicitacoes.
     */
    @Test
    public void testNovaLicitacao() {
        System.out.println("novaLicitacao");
        Revisor revisor = new Revisor(new Utilizador("Soraia", "freitas@mail.com", "fafa", "1234"));
        Artigo artigo = new Artigo();
        int grauInteresse = 0;
        List<Conflito> conflitos = new ArrayList<>();
        ListaLicitacoes instance = new ListaLicitacoes();
        Licitacao expResult = new Licitacao(revisor, artigo, grauInteresse, conflitos);
        Licitacao result = instance.novaLicitacao(revisor, artigo, grauInteresse, conflitos);
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarListaLicitacoesTemporaria method, of class
     * ListaLicitacoes.
     */
    @Test
    public void testAdicionarListaLicitacoesTemporaria() {
        System.out.println("adicionarListaLicitacoesTemporaria");
        Revisor revisor = new Revisor(new Utilizador("Soraia", "freitas@mail.com", "fafa", "1234"));
        Artigo artigo = new Artigo();
        int grauInteresse = 0;
        List<Conflito> conflitos = new ArrayList<>();
        List<Licitacao> listaTemporaria = new ArrayList<>();
        listaTemporaria.add(new Licitacao(revisor, artigo, grauInteresse, conflitos));
        ListaLicitacoes instance = new ListaLicitacoes();
        boolean expResult = true;
        boolean result = instance.adicionarListaLicitacoesTemporaria(listaTemporaria);
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarListaLicitacoesTemporaria method, of class
     * ListaLicitacoes.
     */
    @Test
    public void testAdicionarListaLicitacoesTemporariaNull() {
        System.out.println("adicionarListaLicitacoesTemporariaNull");
        List<Licitacao> listaTemporaria = null;
        ListaLicitacoes instance = new ListaLicitacoes();
        boolean expResult = false;
        boolean result = instance.adicionarListaLicitacoesTemporaria(listaTemporaria);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ListaLicitacoes.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjecto = new ListaLicitacoes();
        ((ListaLicitacoes) outroObjecto).adicionarListaLicitacoesTemporaria(listaLicitacoes);
        ListaLicitacoes instance = new ListaLicitacoes();
        instance.adicionarListaLicitacoesTemporaria(listaLicitacoes);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ListaLicitacoes.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjecto = new ListaLicitacoes();
        ListaLicitacoes instance = new ListaLicitacoes();
        instance.adicionarListaLicitacoesTemporaria(listaLicitacoes);
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    

}
