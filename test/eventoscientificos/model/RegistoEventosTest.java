/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author Beatriz
 */
public class RegistoEventosTest {
    
    private Evento evento;
    
    public RegistoEventosTest() {
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                new Data(2016, 6, 8), new Data(2016, 6, 20),
                new Data(2016, 7, 7), new Data(2016, 8, 1),
                new Data(2017, 6, 10));
    }

    /**
     * Teste do método novoEvento, da classe RegistoEventos.
     */
    @Test
    public void testNovoEvento() {
        System.out.println("novoEvento");
        String titulo = "titulo";
        String descricao = "descricao";
        Local local = new Local("local");
        Data dataInicioSubmissao = new Data(2016, 6, 8);
        Data dataFimSubmissao = new Data(2016, 6, 20);
        Data dataInicioDistribuicao = new Data(2016, 7, 30);
        Data dataInicio = new Data(2016, 8, 1);
        Data dataFim = new Data(2017, 6, 10);
        RegistoEventos instance = new RegistoEventos();
        Evento expResult = this.evento;
        Evento result = instance.novoEvento(titulo, descricao, local, dataInicioSubmissao, dataFimSubmissao, dataInicioDistribuicao, dataInicio, dataFim);
        assertEquals(expResult, result);
    }

    /**
     *Teste do método validarEvento, da classe RegistoEventos.
     */
    @Test
    public void testValidarEvento() {
        System.out.println("validarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.validarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarEvento, da classe RegistoEventos.
     */
    @Test
    public void testAdicionarEvento() {
        System.out.println("adicionarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.adicionarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        RegistoEventos outroObjeto = new RegistoEventos();
        
        outroObjeto.adicionarEvento(this.evento);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new RegistoEventos();
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
}
