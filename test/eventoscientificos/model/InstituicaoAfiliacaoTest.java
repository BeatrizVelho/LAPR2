package eventoscientificos.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class InstituicaoAfiliacaoTest {

    public InstituicaoAfiliacaoTest() {
    }

    /**
     * Teste do método setAndGetNomeInstituicaoAfiliacao, da classe
     * InstituicaoAfiliacao.
     */
    @Test
    public void testSetAndGetNomeInstituicaoAfiliacao() {
        System.out.println("getNomeInstituicaoAfiliacao");
        InstituicaoAfiliacao instance = new InstituicaoAfiliacao("ISEP");
        String expResult = "porto ISEP";
        instance.setNomeInstituicaoAfiliacao(expResult);
        String result = instance.getNomeInstituicaoAfiliacao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setNomeInstituicaoAfiliacao, da classe InstituicaoAfiliacao.
     */
    @Test(expected = NullPointerException.class)
    public void testSetNomeInstituicaoAfiliacaoNull() {
        System.out.println("setNomeInstituicaoAfiliacaoNull");
        String local = null;
        InstituicaoAfiliacao instance = new InstituicaoAfiliacao("isep");
        instance.setNomeInstituicaoAfiliacao(local);
    }

    /**
     * Teste do método toString, da classe InstituicaoAfiliacao.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        InstituicaoAfiliacao instance = new InstituicaoAfiliacao("regua");
        String expResult = "regua";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
