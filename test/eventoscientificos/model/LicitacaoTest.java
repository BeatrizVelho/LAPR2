
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Testa a classe Licitação
 *
 * @author G01
 */
public class LicitacaoTest {

    /**
     * Revisor que licita.
     */
    private Revisor revisor;
    /**
     * Artigo a licitar.
     */
    private Artigo artigo;
    /**
     * Grau de interesse em rever.
     */
    private int grauInteresse;
    /**
     * Lista de conflitos de interesse entre o revisor e o artigo a rever
     */
    private List<Conflito> listaConflitos;

    /**
     * Constrói uma instancia de LicitacaoTest.
     */
    public LicitacaoTest() {
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);
    }

    /**
     * Test of setGrauInteresse method, of class Licitacao.
     */
    @Test
    public void testSetGrauInteresse() {
        System.out.println("setGrauInteresse");
        int grauInteresse = 3;
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);

        instance.setGrauInteresse(grauInteresse);
    }

    /**
     * Test of setListaConflitos method, of class Licitacao.
     */
    @Test
    public void testSetListaConflitos() {
        System.out.println("setListaConflitos");
        List<Conflito> listaConflitos = null;
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);
        instance.setListaConflitos(listaConflitos);

    }

    /**
     * Test of validarLicitacao method, of class Licitacao.
     */
    @Test
    public void testValidarLicitacao() {
        System.out.println("validarLicitacao");
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);
        boolean expResult = true;
        boolean result = instance.validarLicitacao();
        assertEquals(expResult, result);

    }

    /**
     * Test of equals method, of class Licitacao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);;
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);;
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);

    }
/**
     * Test of equals method, of class Licitacao.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);;
        Licitacao instance = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "fifi@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);;
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);

    }
}
