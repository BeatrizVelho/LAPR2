package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

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
     * Teste do método validarSubmissao, da classe ListaSubmissoes.
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
}
