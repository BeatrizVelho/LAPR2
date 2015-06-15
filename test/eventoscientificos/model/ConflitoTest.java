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
 * Testa a classe conflito
 *
 * @author G01
 */
public class ConflitoTest {

    /**
     * Instancia de revisor do conflito
     */
    private Revisor revisor;
    /**
     * Instancia de submissao do conflito.
     */
    private Submissao submissao;

    public ConflitoTest() {
        this.revisor = new Revisor(new Utilizador(
                            "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        this.submissao = new Submissao();

    }

    /**
     * Test of getRevisor method, of class Conflito.
     */
    @Test
    public void testGetRevisor() {
        System.out.println("getRevisor");
        Conflito instance = new Conflito(revisor, submissao, new ArrayList<>());
        Revisor expResult = this.revisor;
        Revisor result = instance.getRevisor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getSubmissao method, of class Conflito.
     */
    @Test
    public void testGetSubmissao() {
        System.out.println("getSubmissao");
        Conflito instance = new Conflito(revisor, submissao, null);
        Submissao expResult = this.submissao;
        Submissao result = instance.getSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaTipoConflito method, of class Conflito.
     */
    @Test
    public void testGetListaTipoConflito() {
        System.out.println("getListaTipoConflito");
        Conflito instance = new Conflito(revisor, submissao, new ArrayList<>());
        List<TipoConflito> expResult = new ArrayList<>();
        List<TipoConflito> result = instance.getListaTipoConflito();
        assertEquals(expResult, result);
    }

}
