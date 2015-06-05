package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ListaAutoresTest {

    private Autor autor;

    public ListaAutoresTest() {
        this.autor = new Autor("Beatriz", "1140587@isep.ipp.pt",
                new InstituicaoAfiliacao("ISEP"));
    }

    /**
     * Teste do método novoAutor, da classe ListaAutores.
     */
    @Test
    public void testNovoAutor() {
        System.out.println("novoAutor");
        String nome = "Beatriz";
        String email = "1111111@isep.ipp.pt";
        InstituicaoAfiliacao instituicaoAfiliacao = new InstituicaoAfiliacao("isep");
        ListaAutores instance = new ListaAutores();
        boolean expResult = true;
        boolean result = instance.novoAutor(nome, email, instituicaoAfiliacao);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaAutoresRegistados, da classe ListaAutores.
     */
    @Test
    public void testGetListaAutoresRegistados() {
        System.out.println("getListaAutoresRegistados");
        ListaAutores instance = new ListaAutores();
        List<Autor> expResult = new ArrayList<>();
        List<Autor> result = instance.getListaAutoresRegistados();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaAutores.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new ListaAutores();
        ListaAutores instance = new ListaAutores();
        instance.adicionarAutor(this.autor);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe ListaAutores.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = new ListaAutores();
        ListaAutores instance = new ListaAutores();
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarAutor, da classe ListaAutores.
     */
    @Test
    public void testValidarAutor() {
        System.out.println("validarAutor");
        Autor autor = this.autor;
        ListaAutores instance = new ListaAutores();
        boolean expResult = true;
        boolean result = instance.validarAutor(autor);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método validarAutor, da classe ListaAutores.
     */
    @Test
    public void testValidarAutorNot() {
        System.out.println("validarAutorNot");
        Autor autor = this.autor;
        ListaAutores instance = new ListaAutores();
        instance.adicionarAutor(this.autor);
        boolean expResult = false;
        boolean result = instance.validarAutor(autor);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarAutor, da classe ListaAutores.
     */
    @Test
    public void testAdicionarAutor() {
        System.out.println("adicionarAutor");
        Autor autor = this.autor;
        ListaAutores instance = new ListaAutores();
        boolean expResult = true;
        boolean result = instance.adicionarAutor(autor);
        assertEquals(expResult, result);
    }

}
