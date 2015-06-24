/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils.codificador.aritmetico;

import eventoscientificos.model.Empresa;
import java.io.IOException;
import java.util.List;
import nayuki.arithcode.FrequencyTable;
import nayuki.arithcode.SimpleFrequencyTable;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.CSVParser;

/**
 *
 * @author Soraia
 */
public class CATest {

    public CATest() throws IOException {
    }

    /**
     * Test of codificar method, of class CA.
     */
    @Test
    public void testCodificar() throws IOException {
        System.out.println("codificar");
        CA instance = new CA();
        int tabela = 0;
        String password = "o";
        String expResult = "0.02";
        String result = instance.codificar(password, tabela);
        assertEquals(expResult, result);
    }

    /**
     * Test of getSizeListaTabelasFreq method, of class CA.
     */
    @Test
    public void testGetSizeListaTabelasFreq() throws IOException {
        System.out.println("getSizeListaTabelasFreq");
        CA instance = new CA();
        int expResult = 4;
        int result = instance.getSizeListaTabelasFreq();
        assertEquals(expResult, result);
    }

}
