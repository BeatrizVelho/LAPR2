/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste à classe ProcessoDistribuicao
 *
 * @author G01
 */
public class ProcessoDistribuicaoTest {

    private Submissao submissao;
    private Revisor revisor;

    public ProcessoDistribuicaoTest() {
        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();

        this.revisor = new Revisor(new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "username",
                            "password"));
    }

    /**
     * Test of adicionarMecanismoDistribuicao method, of class
     * ProcessoDistribuicao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testAdicionarMecanismoDistribuicao() {
        System.out.println("adicionarMecanismoDistribuicao");
        MecanismoDistribuicao mecanismoDistribuicao = null;
        ProcessoDistribuicao instance = new ProcessoDistribuicao();
        boolean expResult = false;
        boolean result = instance.adicionarMecanismoDistribuicao(mecanismoDistribuicao);
        assertEquals(expResult, result);

    }

//    /**
//     * Test of distribuirRevisoes method, of class ProcessoDistribuicao.
//     */
//    @Test
//    public void testDistribuirRevisoes() {
//        System.out.println("distribuirRevisoes");
//        Distribuivel distribuivel = null;
//        ProcessoDistribuicao instance = new ProcessoDistribuicao();
//        ListaRevisoes expResult = null;
//        ListaRevisoes result = instance.distribuirRevisoes(distribuivel);
//        assertEquals(expResult, result);
//    }
    /**
     * Test of getListaRevisoes method, of class ProcessoDistribuicao.
     */
    @Test
    public void testGetListaRevisoes() {
        System.out.println("getListaRevisoes");
        ProcessoDistribuicao instance = new ProcessoDistribuicao();
        ListaRevisoes expResult = null;
        ListaRevisoes result = instance.getListaRevisoes();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of equals method, of class ProcessoDistribuicao.
//     */
//    @Test
//    public void testEquals() {
//        System.out.println("equals");
//        Object outroObjecto = null;
//        ProcessoDistribuicao instance = new ProcessoDistribuicao();
//        boolean expResult = false;
//        boolean result = instance.equals(outroObjecto);
//        assertEquals(expResult, result);
//    }
}
