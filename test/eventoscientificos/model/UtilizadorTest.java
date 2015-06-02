package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class UtilizadorTest {

    public UtilizadorTest() {
    }

    /**
     * Teste dos metodos set e get do nome, da classe Utilizador.
     */
    @Test
    public void testSetAndGetNome() {
        System.out.println("SetAndGetNome");
        Utilizador instance = new Utilizador("Pedro", "email@gmail.com", "username", "password");
        String expResult = "Susana";
        instance.setNome(expResult);
        assertEquals(expResult, instance.getNome());
    }

    /**
     * Teste dos metodos set e get do email, da classe Utilizador.
     */
    @Test
    public void testSetAndGetEmail() {
        System.out.println("SetAndGetEmail");
        Utilizador instance = new Utilizador("Pedro", "email@gmail.com", "username", "password");
        String expResult = "freitas.soraia@gmail.com";
        instance.setEmail(expResult);
        assertEquals(expResult, instance.getEmail());
    }

    /**
     * Teste dos metodos set e get do username, da classe Utilizador.
     */
    @Test
    public void testSetAndGetUsername() {
        System.out.println("SetAndGetUsername");
        Utilizador instance = new Utilizador("Pedro", "email@gmail.com", "username", "password");
        String expResult = "frafra";
        instance.setUsername(expResult);
        assertEquals(expResult, instance.getUsername());
    }

    /**
     * Teste dos metodos set e get do password, da classe Utilizador.
     */
    @Test
    public void testSetAndGetPassword() {
        System.out.println("SetAndGetPassword");
        Utilizador instance = new Utilizador("Pedro", "email@gmail.com", "username", "password");
        String expResult = "1234";
        instance.setPassword(expResult);
        assertEquals(expResult, instance.getPassword());
    }

    /**
     * Teste do metodo set do nome, quando este esta vazio, da classe
     * Utilizador.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetNomeEmpty() {
        System.out.println("SetNome");
        Utilizador instance = new Utilizador();
        String expResult = "";
        instance.setNome(expResult);
    }

    /**
     * Teste do metodo set do email, quando este esta vazio, da classe
     * Utilizador.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetEmailEmpty() {
        System.out.println("SetEmail");
        Utilizador instance = new Utilizador();
        String expResult = "";
        instance.setEmail(expResult);
    }

    /**
     * Teste do metodo set do username, quando este esta vazio, da classe
     * Utilizador.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetUsernameEmpty() {
        System.out.println("SetUsername");
        Utilizador instance = new Utilizador();
        String expResult = "";
        instance.setUsername(expResult);
    }

    /**
     * Teste do metodo set do password, quando este esta vazio, da classe
     * Utilizador.
     *
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetPasswordEmpty() {
        System.out.println("SetPassword");
        Utilizador instance = new Utilizador();
        String expResult = "";
        instance.setPassword(expResult);
    }

    /**
     * Teste do método toString, da classe Utilizador.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Utilizador instance = new Utilizador("Soraia", "freitas.soraia@gmal.com", "frafra", "1234");
        String expResult = "O utlizador esta registado com os seguintes dados: nome Soraia, username frafra, o email freitas.soraia@gmal.com e as password 1234";
        assertEquals(expResult, instance.toString());
    }

    /**
     * Teste do método equals, da classe Utilizador.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new Utilizador("Soraia", "freitas.soraia@gmal.com", "frafra", "1234");
        Utilizador instance = new Utilizador("Soraia", "freitas.soraia@gmal.com", "frafra", "1234");
        boolean expResult = true;
        assertEquals(expResult, instance.equals(outroObjeto));
    }

    /**
     * Teste do método equals, da classe Utilizador, para utilizadores
     * diferentes.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new Utilizador("Soraia", "freitas.soraia@gmal.fcom", "ffrafra", "1234");
        Utilizador instance = new Utilizador("Soraia", "freitas.soraia@gmal.com", "frafra", "1234");
        boolean expResult = false;
        assertEquals(expResult, instance.equals(outroObjeto));
    }

    /**
     * Teste do método validaUtilizador, da classe Utilizador, serve para
     * veificar se o utilizador esta completamente preenchido
     */
    @Test
    public void testValidaUtilizador() {
        System.out.println("validaUtilizador");
        Utilizador instance = new Utilizador("susana", "freitas@gmail.com", "susu", "12345");
        boolean expResult = true;
        boolean result = instance.validaUtilizador();
        assertEquals(expResult, result);

    }

}
