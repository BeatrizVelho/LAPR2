package eventoscientificos.model;

import eventoscientificos.model.state.submissao.SubmissaoRevistaState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ListaDecisoesTest {

    public ListaDecisoesTest() {

    }

    /**
     * Teste do método novaDecisao, da classe ListaDecisoes.
     */
    @Test
    public void testNovaDecisao() {
        System.out.println("novaDecisao");
        int classificacao = 0;
        Submissao submissao = new Submissao();
        submissao.setEstado(new SubmissaoRevistaState(submissao));
        ListaDecisoes instance = new ListaDecisoes();
        Decisao expResult = new Decisao(classificacao, submissao);
        Decisao result = instance.novaDecisao(classificacao, submissao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarDecisao, da classe ListaDecisoes.
     */
    @Test
    public void testAdicionarDecisao() {
        System.out.println("adicionarDecisao");
        int classificacao = 0;
        Submissao submissao = new Submissao();
        Decisao decisao = new Decisao(classificacao, submissao);
        ListaDecisoes instance = new ListaDecisoes();
        boolean expResult = true;
        boolean result = instance.adicionarDecisao(decisao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaDecisoes, da classe ListaDecisoes.
     */
    @Test
    public void testGetListaDecisoes() {
        System.out.println("getListaDecisoes");
        Submissao submissao = new Submissao();
        int classificacao = 1;
        Decisao decisao = new Decisao(classificacao, submissao);
        ListaDecisoes instance = new ListaDecisoes();
        instance.adicionarDecisao(decisao);
        List<Decisao> expResult = new ArrayList<>();
        expResult.add(decisao);
        List<Decisao> result = instance.getListaDecisoes();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método criarNotificacao, da classe ListaDecisoes.
     */
    @Test
    public void testCriarNotificacao() {
        System.out.println("criarNotificacao");
        ListaDecisoes instance = new ListaDecisoes();
        boolean expResult = true;
        boolean result = instance.criarNotificacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaDecisoes.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        int classificacao = 2;
        Submissao submissao = new Submissao();
        Decisao decisao = new Decisao(classificacao, submissao);

        Object outroObjecto = new ListaDecisoes();
        ListaDecisoes outraLista = (ListaDecisoes) outroObjecto;
        outraLista.adicionarDecisao(decisao);

        ListaDecisoes instance = new ListaDecisoes();
        instance.adicionarDecisao(decisao);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equalsNot, da classe ListaDecisoes.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equals");
        int classificacao = 2;
        Submissao submissao = new Submissao();
        Decisao decisao = new Decisao(classificacao, submissao);

        Object outroObjecto = new ListaDecisoes();
        ListaDecisoes outraLista = (ListaDecisoes) outroObjecto;
        outraLista.adicionarDecisao(decisao);

        ListaDecisoes instance = new ListaDecisoes();
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

}
