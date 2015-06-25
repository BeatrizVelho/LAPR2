package eventoscientificios.view;

import eventoscientificos.model.Autor;
import eventoscientificos.model.InstituicaoAfiliacao;
import eventoscientificos.model.ListaAutores;
import eventoscientificos.model.Utilizador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class ModeloListaAutoresTest {
    
    private ListaAutores listaAutores;
    
    public ModeloListaAutoresTest() {
        ListaAutores listaAutores = new ListaAutores();
        listaAutores.novoAutor(
                new Utilizador("Pedro Moreira", "1140781@isep.ipp.pt", "pedro", "1234"),
                new InstituicaoAfiliacao("ISEP"));
        
        this.listaAutores = listaAutores;
    }

    /**
     * Teste do método getSize, da classe ModeloListaAutores.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        ModeloListaAutores instance = new ModeloListaAutores(listaAutores);
        int expResult = 1;
        int result = instance.getSize();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getElementAt, da classe ModeloListaAutores.
     */
    @Test
    public void testGetElementAt() {
        System.out.println("getElementAt");
        int index = 0;
        ModeloListaAutores instance = new ModeloListaAutores(listaAutores);
        Autor expResult = new Autor(
                new Utilizador("Pedro Moreira", "1140781@isep.ipp.pt", "pedro", "1234"),
                new InstituicaoAfiliacao("ISEP"));
        Autor result = instance.getElementAt(index);
        assertEquals(expResult, result);
    }
    
}
