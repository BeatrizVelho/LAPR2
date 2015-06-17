/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste à classe Revisao
 *
 * @author G01
 */
public class RevisaoTest {

    private Revisor revisor;
    private Submissao submissao;

    public RevisaoTest() {
        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        this.submissao.setArtigoInicial(artigoInicial);
        this.submissao.setArtigoFinal(artigoFinal);
        this.revisor = new Revisor(new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "username",
                            "password"));
    }

    /**
     * Teste do método equals, da classe Submissao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjecto = new Revisao(this.submissao, this.revisor);
        Revisao outraRevisao = (Revisao) outroObjecto;
        Revisao instance = new Revisao(this.submissao, this.revisor);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe Submissao.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjecto = new Revisao(this.submissao, this.revisor);
        Revisao outraRevisao = (Revisao) outroObjecto;

        Revisor r2 = new Revisor(new Utilizador("nome",
                            "1140587@isep.ipp.pt",
                            "fifi",
                            "password"));
        Revisao instance = new Revisao(this.submissao, r2);
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }
}
