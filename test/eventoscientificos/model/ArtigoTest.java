package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ArtigoTest {

    /**
     *
     */
    private Artigo artigo;

    public ArtigoTest() {
        this.artigo = new Artigo("titulo", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre");
    }

    /**
     * Teste do método set e get Titulo, da classe Artigo.
     */
    @Test
    public void testSetAndGetTitulo() {
        System.out.println("setAndGetTitulo");
        Artigo instance = this.artigo;
        String expResult = "titulo1";
        instance.setTitulo(expResult);
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get Resumo, da classe Artigo.
     */
    @Test
    public void testSetAndGetResumo() {
        System.out.println("setAndGetResumo");
        Artigo instance = this.artigo;
        String expResult = "saude1";
        instance.setResumo(expResult);
        String result = instance.getResumo();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get ListaAutores, da classe Artigo.
     */
    @Test
    public void testGetListaAutores() {
        System.out.println("getListaAutores");
        Artigo instance = this.artigo;
        ListaAutores expResult = new ListaAutores();
        ListaAutores result = instance.getListaAutores();
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método setFicheiro, da classe Artigo.
     */
    @Test
    public void testSetFicheiro() {
        System.out.println("setFicheiro");
        String ficheiro = "getNome, getEmail, getInstituicaoAfiliacao1234";
        Artigo instance = this.artigo;
        instance.setFicheiro(ficheiro);
    }

    /**
     * Teste do método equals, da classe Artigo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.artigo;
        Artigo instance = this.artigo;
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método equals, da classe Evento.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new Artigo("titulo1234", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre");
        Artigo instance = this.artigo;
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

}
