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
public class RegistoUtilizadorTest {

    /**
     * Construtor do registoUtilizador teste
     */
    public RegistoUtilizadorTest() {
    }

    /**
     * Teste ao metodo novoUtilizador da classe RegistoUtilizador.
     */
    @Test
    public void testNovoUtilizador() {
        System.out.println("novoUtilizador");
        String nome = "Rita";
        String email = "rita_susana@email.com";
        String username = "rita";
        String password = "1234";
        RegistoUtilizador instance = new RegistoUtilizador();
        Utilizador expResult = new Utilizador(nome, email, username, password);
        Utilizador result = instance.novoUtilizador(nome, email, username, password);
        assertEquals(expResult, result);

    }

    /**
     * Teste ao metodo AdicionarUtilizador da classe RegistoUtilizador.
     *
     */
    @Test
    public void testAdicionaUtilizador() {
        System.out.println("adicionaUtilizador");
        Utilizador u = new Utilizador("Sususana", "email@gmail.com", "susus", "1234");
        RegistoUtilizador instance = new RegistoUtilizador();
        boolean expResult = true;
        boolean result = instance.adicionaUtilizador(u);
        assertEquals(expResult, result);

    }

}
