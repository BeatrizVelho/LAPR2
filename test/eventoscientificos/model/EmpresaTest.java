package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;
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
     * Testa o método set e get UtilizadorAutenticado, da classe Empresa.
     */
    @Test
    public void testSetAndGetUtilizadorAutenticado() {
        System.out.println("setAndGetUtilizadorAutenticado");
        Empresa instance = new Empresa();
        Utilizador utilizador = new Utilizador(
                            "Pedro Moreira", "1140781@isep.ipp.pt", "pedro", "1234");
        instance.setUtilizadorAutenticado(utilizador);
        Utilizador expResult = utilizador;
        Utilizador result = instance.getUtilizadorAutenticado();
        assertEquals(expResult, result);
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

    /**
     * Testa o metodo getRegistoTiposConflito da classe Empresa.
     */
    @Test
    public void testGetRegistoTiposConflito() {
        System.out.println("getRegistoTiposConflito");
        Empresa instance = new Empresa();
        RegistoTiposConflito expResult = new RegistoTiposConflito();
        RegistoTiposConflito result = instance.getRegistoTiposConflito();
        assertEquals(expResult, result);
    }

    /**
     * Testa o metodo testgetListaDistribuicao da classe Empresa.
     */
    @Test
    public void testgetListaDistribuicao() {
        System.out.println("getListaDistribuicao");
        Empresa instance = new Empresa();
        List<MecanismoDistribuicao> expResult
                            = new ArrayList<MecanismoDistribuicao>();
        List<MecanismoDistribuicao> result = instance.getListaDistribuicao();
        assertEquals(expResult, result);
    }
}
