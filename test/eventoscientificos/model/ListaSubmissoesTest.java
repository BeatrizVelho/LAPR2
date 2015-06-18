package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.submissao.SubmissaoCriadaState;
import eventoscientificos.model.state.submissao.SubmissaoEmSubmissaoState;
import eventoscientificos.model.state.submissao.SubmissaoRemovidaState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class ListaSubmissoesTest {

    private Submissao submissao;

    public ListaSubmissoesTest() {
        this.submissao = new Submissao();
        this.submissao.setArtigoInicial(new Artigo());
        this.submissao.setArtigoFinal(new Artigo());
    }

    /**
     * Teste do método novaSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testNovaSubmissao() {
        System.out.println("novaSubmissao");
        ListaSubmissoes instance = new ListaSubmissoes();
        Submissao expResult = this.submissao;
        Submissao result = instance.novaSubmissao();
        result.setArtigoInicial(new Artigo());
        result.setArtigoFinal(new Artigo());
        assertEquals(expResult, result);
    }

    /**
     * Teste do método alterarEstadoSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testValidarSubmissao() {
        System.out.println("validarSubmissao");
        Submissao submissao = this.submissao;
        ListaSubmissoes instance = new ListaSubmissoes();
        boolean expResult = true;
        boolean result = instance.validarSubmissao(submissao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testAdicionarSubmissao() {
        System.out.println("adicionarSubmissao");
        Submissao submissao = this.submissao;
        ListaSubmissoes instance = new ListaSubmissoes();
        boolean expResult = true;
        boolean result = instance.adicionarSubmissao(submissao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaSubmissoes.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new ListaSubmissoes();
        ListaSubmissoes instance = new ListaSubmissoes();
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaSubmissoes.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new ListaSubmissoes();
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(this.submissao);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaSubmissoes method, of class ListaSubmissoes.
     */
    @Test
    public void testGetListaSubmissoes() {
        System.out.println("getListaSubmissoes");
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(submissao);
        List<Submissao> expResult = new ArrayList<>();
        expResult.add(submissao);
        List<Submissao> result = instance.getListaSubmissoes();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaSubmissoesUtilizador, da classe ListaSubmissoes.
     */
    @Test
    public void testGetListaSubmissoesUtilizador() {
        System.out.println("getListaSubmissoesUtilizador");
        Artigo artigo = new Artigo();
        artigo.getListaAutores().novoAutor(new Utilizador(
                "pedro", "1140781@isep.ipp.pt", "pedro", "12345"),
                new InstituicaoAfiliacao("ISEP"));

        Utilizador utilizador
                = new Utilizador("pedro", "1140781@isep.ipp.pt", "pedro", "12345");
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(this.submissao);
        int expResult = 1;
        int result = instance.getListaSubmissoesUtilizador(utilizador).size();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarCloneSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testValidarCloneSubmissaoTrue() {
        System.out.println("validarCloneSubmissao");
        Submissao submissao = this.submissao;
        Submissao submissaoClone = submissao.criarCloneSubmissao();
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(submissao);
        boolean expResult = true;
        boolean result = instance.validarCloneSubmissao(submissao, submissaoClone);
        assertEquals(expResult, result);
    }

   /**
     * Teste do método validarCloneSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testValidarCloneSubmissaoFalse() {
        System.out.println("validarCloneSubmissao");
        Submissao submissao = this.submissao;
        Submissao submissaoClone = submissao.criarCloneSubmissao();
        Submissao submissao1 = new Submissao();
        Artigo artigo = new Artigo();
        artigo.setTitulo("Ananás");
        submissao1.setArtigoInicial(artigo);
        submissao1.setArtigoFinal(artigo);
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(submissao);
        instance.adicionarSubmissao(submissao1);
        boolean expResult = false;
        boolean result = instance.validarCloneSubmissao(submissao1, submissaoClone);
        assertEquals(expResult, result);
    } 

    /**
     * Teste do método isUtilizadorUmAutorSubmissao, da classe ListaSubmissoes.
     */
    @Test
    public void testIsUtilizadorUmAutorSubmissao() {
        System.out.println("isUtilizadorUmAutorSubmissao");
        Utilizador utilizador = new Utilizador(
                "Susana", "email@gmail.com", "susus", "1234");
        Autor autor = new Autor(utilizador, new InstituicaoAfiliacao("ISEP"));
        Submissao submissao = new Submissao();        
        submissao.setEstado(new SubmissaoEmSubmissaoState(submissao));
        submissao.setArtigoInicial(new Artigo());
        submissao.getArtigoInicial().getListaAutores().adicionarAutor(autor);
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(submissao);
        boolean expResult = true;
        boolean result = instance.isUtilizadorUmAutorSubmissao(utilizador);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método temSubmissoesRetiradas, da classe ListaSubmissoes.
     */
    @Test
    public void testTemSubmissoesRetiradasNot() {
        System.out.println("temSubmissoesRetiradasNot");
        ListaSubmissoes instance = new ListaSubmissoes();
        this.submissao.setEstado(new SubmissaoCriadaState(submissao));
        instance.adicionarSubmissao(submissao);
        
        boolean expResult = false;
        boolean result = instance.temSubmissoesRetiradas();
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método temSubmissoesRetiradas, da classe ListaSubmissoes.
     */
    @Test
    public void testTemSubmissoesRetiradas() {
        System.out.println("temSubmissoesRetiradas");
        ListaSubmissoes instance = new ListaSubmissoes();
        this.submissao.setEstado(new SubmissaoRemovidaState(submissao));
        instance.adicionarSubmissao(submissao);
        boolean expResult = true;
        boolean result = instance.temSubmissoesRetiradas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaSubmissoesRetiradas, da classe ListaSubmissoes.
     */
    @Test
    public void testGetListaSubmissoesRetiradas() {
        System.out.println("getListaSubmissoesRetiradas");
        Submissao submissao = new Submissao();
        submissao.setEstado(new SubmissaoRemovidaState(submissao));
        ListaSubmissoes instance = new ListaSubmissoes();
        instance.adicionarSubmissao(submissao);
        instance.getListaSubmissoesRetiradas();
        int expResult = 1;
        int result = (instance.getListaSubmissoesRetiradas()).size();
        assertEquals(expResult, result);
    }
}
