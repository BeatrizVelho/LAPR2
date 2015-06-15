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
 * Teste à classe Processo Deteção
 *
 * @author G01
 */
public class ProcessoDetecaoTest {

    private Conflito conflito;

    public ProcessoDetecaoTest() {
        Revisor r = new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234"));
        Submissao s = new Submissao();
        s = new Submissao();
        s.setArtigoFinal(new Artigo("titulo", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));
        s.setArtigoInicial(new Artigo("titulo1234", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));
        this.conflito = new Conflito(r, s, new ArrayList<TipoConflito>());

    }

    /**
     * Test of getListaConflito method, of class ProcessoDetecao.
     */
    @Test
    public void testGetListaConflito() {
        System.out.println("getListaConflito");
        ProcessoDetecao instance = new ProcessoDetecao();
        List<Conflito> listaConflitos = instance.getListaConflito();
        listaConflitos.add(conflito);
        int expResult = 1;
        int result = instance.getListaConflito().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ProcessoDetecao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");

        Object outroObjecto = new ProcessoDetecao();
        List<Conflito> listaConflitos1 = ((ProcessoDetecao) outroObjecto).getListaConflito();
        listaConflitos1.add(conflito);
        ProcessoDetecao instance = new ProcessoDetecao();
        List<Conflito> listaConflitos = instance.getListaConflito();
        listaConflitos.add(conflito);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class ProcessoDetecao.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");

        Object outroObjecto = new ProcessoDetecao();
        Revisor revisor = new Revisor(new Utilizador(
                            "Fernando", "ola@iml.com", "fafa", "1234"));
        Submissao s = new Submissao();
        Conflito conflito1 = new Conflito(revisor, s, new ArrayList<TipoConflito>());
        List<Conflito> listaConflitos1 = ((ProcessoDetecao) outroObjecto).getListaConflito();
        listaConflitos1.add(conflito1);
        ProcessoDetecao instance = new ProcessoDetecao();
        List<Conflito> listaConflitos = instance.getListaConflito();
        listaConflitos.add(conflito);
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);

    }

}
