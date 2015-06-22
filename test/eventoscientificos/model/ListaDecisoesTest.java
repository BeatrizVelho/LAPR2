package eventoscientificos.model;

import eventoscientificos.model.state.submissao.SubmissaoRevistaState;
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
    
}
