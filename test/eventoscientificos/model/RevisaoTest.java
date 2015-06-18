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

    /**
     * Test of setAdequacaoArtigo method, of class Revisao.
     */
    @Test
    public void testSetAdequacaoArtigo() {
        System.out.println("setAdequacaoArtigo");
        int adequacaoArtigo = 5;

        Revisao instance = new Revisao(submissao, revisor);
        instance.setAdequacaoArtigo(adequacaoArtigo);

    }

    /**
     * Test of setAdequacaoArtigo method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetAdequacaoArtigoNOT() {
        System.out.println("setAdequacaoArtigoNOT");
        int adequacaoArtigo = -3;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setAdequacaoArtigo(adequacaoArtigo);
    }

    /**
     * Test of setConfiancaRevisor method, of class Revisao.
     */
    @Test
    public void testSetConfiancaRevisor() {
        System.out.println("setConfiancaRevisor");
        int confiancaRevisor = 0;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setConfiancaRevisor(confiancaRevisor);
    }

    /**
     * Test of setConfiancaRevisor method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetConfiancaRevisorNOT() {
        System.out.println("setConfiancaRevisorNOT");
        int confiancaRevisor = -1;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setConfiancaRevisor(confiancaRevisor);
    }

    /**
     * Test of setOriginalidadeArtigo method, of class Revisao.
     */
    @Test
    public void testSetOriginalidadeArtigo() {
        System.out.println("setOriginalidadeArtigo");
        int originalidadeArtigo = 5;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setOriginalidadeArtigo(originalidadeArtigo);
    }

    /**
     * Test of setOriginalidadeArtigo method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetOriginalidadeArtigoNOT() {
        System.out.println("setOriginalidadeArtigoNOT");
        int originalidadeArtigo = -4;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setOriginalidadeArtigo(originalidadeArtigo);
    }

    /**
     * Test of setQualidadeArtigo method, of class Revisao.
     */
    @Test
    public void testSetQualidadeArtigo() {
        System.out.println("setQualidadeArtigo");
        int qualidadeArtigo = 0;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setQualidadeArtigo(qualidadeArtigo);
    }

    /**
     * Test of setQualidadeArtigo method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetQualidadeArtigoNOT() {
        System.out.println("setQualidadeArtigoNOT");
        int qualidadeArtigo = -4;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setQualidadeArtigo(qualidadeArtigo);
    }

    /**
     * Test of setRecomendacaoGlobal method, of class Revisao.
     */
    @Test
    public void testSetRecomendacaoGlobal() {
        System.out.println("setRecomendacaoGlobal");
        int recomendacaoGlobal = -2;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setRecomendacaoGlobal(recomendacaoGlobal);
    }

    /**
     * Test of setRecomendacaoGlobal method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetRecomendacaoGlobalNOT() {
        System.out.println("setRecomendacaoGlobalNOT");
        int recomendacaoGlobal = -3;
        Revisao instance = new Revisao(submissao, revisor);
        instance.setRecomendacaoGlobal(recomendacaoGlobal);
    }

    /**
     * Test of setTextoJustificativo method, of class Revisao.
     */
    @Test
    public void testSetTextoJustificativo() {
        System.out.println("setTextoJustificativo");
        String textoJustificativo = "eseseses";
        Revisao instance = new Revisao(submissao, revisor);
        instance.setTextoJustificativo(textoJustificativo);
    }

    /**
     * Test of setTextoJustificativo method, of class Revisao.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTextoJustificativoNOT() {
        System.out.println("setTextoJustificativoNOT");
        String textoJustificativo = "";
        Revisao instance = new Revisao(submissao, revisor);
        instance.setTextoJustificativo(textoJustificativo);
    }

    /**
     * Test of criarCloneRevisao method, of class Revisao.
     */
    @Test
    public void testCriarCloneRevisao() {
        System.out.println("criarCloneRevisao");
        Revisao instance = new Revisao(submissao, revisor);
        Revisao expResult = new Revisao(submissao, revisor);
        Revisao result = instance.criarCloneRevisao();
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarDadosRevisao method, of class Revisao.
     */
    @Test
    public void testAdicionarDadosRevisao() {
        System.out.println("adicionarDadosRevisao");
        int adequacao = 0;
        int confianca = 0;
        int originalidade = 0;
        int qualidade = 0;
        int recomendacao = 0;
        String textoJustificativo = "sesese";
        Revisao instance = new Revisao(submissao, revisor);
        boolean expResult = true;
        boolean result = instance.adicionarDadosRevisao(adequacao, confianca, originalidade, qualidade, recomendacao, textoJustificativo);
        assertEquals(expResult, result);
    }

    /**
     * Test of adicionarResultadoRevisao method, of class Revisao.
     */
    @Test
    public void testAdicionarResultadoRevisao() {
        System.out.println("adicionarResultadoRevisao");
        Revisao revisao = new Revisao(submissao, revisor);
        revisao.setAdequacaoArtigo(0);
        revisao.setConfiancaRevisor(0);
        revisao.setQualidadeArtigo(0);
        revisao.setOriginalidadeArtigo(0);
        revisao.setRecomendacaoGlobal(0);
        revisao.setTextoJustificativo("sesese");
        Revisao instance = new Revisao(submissao, revisor);
        boolean expResult = true;
        boolean result = revisao.adicionarResultadoRevisao(instance);
        assertEquals(expResult, result);
    }

    /**
     * Test of validarRevisao method, of class Revisao.
     */
    @Test
    public void testValidarRevisao() {
        System.out.println("validarRevisao");
        Revisao revisao = new Revisao(submissao, revisor);
        revisao.setAdequacaoArtigo(0);
        revisao.setConfiancaRevisor(0);
        revisao.setQualidadeArtigo(0);
        revisao.setOriginalidadeArtigo(0);
        revisao.setRecomendacaoGlobal(0);
        revisao.setTextoJustificativo("sesese");
        boolean expResult = false;
        boolean result = revisao.validarRevisao();
        assertEquals(expResult, result);

    }
}
