package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class EmpresaTest {

    /**
     * Construtor da empresa teste.
     */
    public EmpresaTest() {
    }

    /**
     * Testa o metodo getRegistoUtilizadores da classe Empresa.
     */
    @Test
    public void testGetRegistoUtilizadores() {
        System.out.println("getRegistoUtilizadores");
        Empresa instance = new Empresa();
        RegistoUtilizadores expResult = new RegistoUtilizadores();
        RegistoUtilizadores result = instance.getRegistoUtilizadores();
        assertEquals(expResult, result);
    }
    
    /**
     * Testa o metodo getRegistoEventos da classe Empresa.
     */
    @Test
    public void testGetRegistoEventos() {
        System.out.println("getRegistoEventos");
        Empresa instance = new Empresa();
        RegistoEventos expResult = new RegistoEventos();
        RegistoEventos result = instance.getRegistoEventos();
        assertEquals(expResult, result);
    }
    
}
