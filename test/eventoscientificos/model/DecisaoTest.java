package eventoscientificos.model;

import eventoscientificos.model.state.submissao.SubmissaoEmCameraReadyState;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author G01
 */
public class DecisaoTest {
    
    private int classificacao;
    
    public DecisaoTest() {
        this.classificacao = 1;
    }

    /**
     * Teste do método equals, da classe Decisao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Submissao submissao = new Submissao();
        Object outroObjecto = new Decisao(this.classificacao, submissao);
        Decisao outraDecisao = (Decisao) outroObjecto;
        Decisao instance = new Decisao(this.classificacao, submissao);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método equalsNot, da classe Decisao.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Submissao submissao = new Submissao();
        Object outroObjecto = new Decisao(this.classificacao, submissao);
        Decisao outraDecisao = (Decisao) outroObjecto;       
        this.classificacao = 2;
        Decisao instance = new Decisao(this.classificacao, submissao);
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }
    
}
