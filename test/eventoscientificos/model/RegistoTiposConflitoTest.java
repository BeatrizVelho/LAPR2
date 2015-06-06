package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class RegistoTiposConflitoTest {

    private TipoConflito tipoConflito;
    private RegistoTiposConflito registoTiposConflito;
    
    public RegistoTiposConflitoTest() {
        this.tipoConflito = new TipoConflito("Um tipo de conflito");
        RegistoTiposConflito registoTiposConflito = new RegistoTiposConflito();
        this.registoTiposConflito = registoTiposConflito;
    }

    /**
     * Teste do método novoTipoConflito, da classe RegistoTiposConflito.
     */
    @Test
    public void testNovoTipoConflito() {
        System.out.println("novoTipoConflito");
        RegistoTiposConflito instance = this.registoTiposConflito;
        TipoConflito expResult = this.tipoConflito;
        TipoConflito result = instance.novoTipoConflito("Um tipo de conflito");
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarTipoConflito, da classe RegistoTiposConflito.
     */
    @Test
    public void testAdicionarTipoConflito() {
        System.out.println("adicionarTipoConflito");
        TipoConflito tipoConflito = this.tipoConflito;
        RegistoTiposConflito instance = this.registoTiposConflito;
        boolean expResult = true;
        boolean result = instance.adicionarTipoConflito(tipoConflito);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoTiposConflito.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.registoTiposConflito;
        RegistoTiposConflito instance = new RegistoTiposConflito();
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }
    
    /**
     * Teste do método equals, da classe RegistoTiposConflito.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = this.registoTiposConflito;
        RegistoTiposConflito instance = new RegistoTiposConflito();
        instance.adicionarTipoConflito(this.tipoConflito);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    
    
}
