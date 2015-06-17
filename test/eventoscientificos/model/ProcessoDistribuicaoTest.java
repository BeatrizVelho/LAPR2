/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Soraia
 */
public class ProcessoDistribuicaoTest {

    public ProcessoDistribuicaoTest() {
    }

    /**
     * Test of adicionarMecanismoDistribuicao method, of class
     * ProcessoDistribuicao.
     */
    @Test
    public void testAdicionarMecanismoDistribuicao() {
        System.out.println("adicionarMecanismoDistribuicao");
        MecanismoDistribuicao mecanismoDistribuicao = null;
        ProcessoDistribuicao instance = new ProcessoDistribuicao();
        boolean expResult = false;
        boolean result = instance.adicionarMecanismoDistribuicao(mecanismoDistribuicao);
        assertEquals(expResult, result);

    }

    /**
     * Test of distribuirRevisoes method, of class ProcessoDistribuicao.
     */
    @Test
    public void testDistribuirRevisoes() {
        System.out.println("distribuirRevisoes");
        Distribuivel distribuivel = null;
        ProcessoDistribuicao instance = new ProcessoDistribuicao();
        ListaRevisoes expResult = null;
        ListaRevisoes result = instance.distribuirRevisoes(distribuivel);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
