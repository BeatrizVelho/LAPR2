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
 * @author G01
 */
public class EmpresaTest {

    /**
     * Construtor da empresa teste
     */
    public EmpresaTest() {
    }

    /**
     * Testa o metodo getRegistoUtilizadores da classe Empresa.
     */
    @Test
    public void testGetRegistoUtilizador() {
        System.out.println("getRegistoUtilizador");
        Empresa instance = new Empresa();
        RegistoUtilizadores expResult = new RegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);
    }

}
