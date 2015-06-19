/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.controllers;

import eventoscientificos.model.CP;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.SessaoTematica;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmSubmissaoState;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 *
 * @author Pedro
 */
public class DetetarConflitosControllerTest {
    
    public DetetarConflitosControllerTest() {
    }

    /**
     * Teste do método run, da classe DetetarConflitosController.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        Empresa empresa = new Empresa();
        SessaoTematica sessaoTematica = new SessaoTematica(
                            "#A9D24R",
                            "LAPR2",
                            new Data(2015, 5, 22),
                            new Data(2015, 5, 28),
                            new Data(2015, 6, 10),
                            new Data(2015, 6, 20),
                            new Data(2015, 6, 24),
                            new Data(2015, 6, 28),
                            new Data(2015, 6, 30));
        sessaoTematica.adicionarCP(new CP());
        sessaoTematica.setEstado(new SessaoTematicaEmSubmissaoState(sessaoTematica));
        DetetarConflitosController instance = new DetetarConflitosController(empresa, sessaoTematica);
        instance.run();
    }
    
}
