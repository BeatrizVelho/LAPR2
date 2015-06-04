/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Classe de teste criada testar a classe do Utilizador e os seus metodos
 *
 * @author G01
 */
public class RegistoUtilizadoresTest {

    /**
     * Construtor do registoUtilizador teste
     */
    public RegistoUtilizadoresTest() {
    }

    /**
     * Teste ao metodo novoUtilizador da classe RegistoUtilizadores.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        String nome = "Rita";
        String email = "rita_susana@email.com";
        String username = "rita";
        String password = "1234";
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador(nome, email, username, password);
        Utilizador result = instance.novoUtilizador(nome, email, username, password);
        assertEquals(expResult, result);

    }

    /**
     * Teste ao metodo AdicionarUtilizador da classe RegistoUtilizadores.
     *
     */
    @Test
    public void testAdicionaUtilizador() {
        System.out.println("adicionaUtilizador");
        Utilizador u = new Utilizador("Sususana", "email@gmail.com", "susus", "1234");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        boolean expResult = true;
        boolean result = instance.adicionaUtilizador(u);
        assertEquals(expResult, result);

    }
    
    /**
     * Teste ao metodo getUtilizador da classe RegistoUtilizadores.
     *
     */
    @Test
    public void testgetUtilizadorUsername() {
        System.out.println("getUtilizadorUsername");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador("Sususana", "email@gmail.com", "susus", "1234");
        instance.adicionaUtilizador(expResult);
        Utilizador result = instance.getUtilizador("susus");
        assertEquals(expResult, result);

    }
    
    /**
     * Teste ao metodo getUtilizador da classe RegistoUtilizadores.
     *
     */
    @Test
    public void testgetUtilizadorEmail() {
        System.out.println("getUtilizadorEmail");
        RegistoUtilizadores instance = new RegistoUtilizadores();
        Utilizador expResult = new Utilizador("Sususana", "email@gmail.com", "susus", "1234");
        instance.adicionaUtilizador(expResult);
        Utilizador result = instance.getUtilizador("email@gmail.com");
        assertEquals(expResult, result);

    }

}
