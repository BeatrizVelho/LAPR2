package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste à classe ProcessoDecisao.
 * 
 * @author G01
 */
public class ProcessoDecisaoTest {
    
    private Submissao submissao;
    private Revisor revisor;
    
    public ProcessoDecisaoTest() {
        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        
        this.revisor = new Revisor(new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "username",
                            "password"));
    }

    /**
     * Teste do método adicionarMecanismoDecisao, da classe ProcessoDecisao.
     */
    @Test (expected = IllegalArgumentException.class)
    public void testAdicionarMecanismoDecisao() {
        System.out.println("adicionarMecanismoDecisao");
        MecanismoDecisao mecanismoDecisao = null;
        ProcessoDecisao instance = new ProcessoDecisao();
        boolean expResult = false;
        boolean result = instance.adicionarMecanismoDecisao(mecanismoDecisao);
        assertEquals(expResult, result);
    }

//    /**
//     * Teste do método equals, da classe ProcessoDecisao.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object outroObjecto = null;
//        ProcessoDecisao instance = new ProcessoDecisao();
//        boolean expResult = false;
//        boolean result = instance.equals(outroObjecto);
//        assertEquals(expResult, result);
//    }
   
}
