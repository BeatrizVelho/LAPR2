package eventoscientificos.model;

import eventoscientificos.state.submissao.SubmissaoAceiteState;
import eventoscientificos.state.submissao.SubmissaoCriadaState;
import eventoscientificos.state.submissao.SubmissaoEmSubmissaoState;
import eventoscientificos.state.submissao.SubmissaoState;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @author G01
 */
public class SubmissaoTest {

    private Artigo artigoInicial;
    private Artigo artigoFinal;
    private Utilizador utilizador;

    public SubmissaoTest() {
        this.artigoInicial = new Artigo();
        this.artigoFinal = new Artigo();
        this.utilizador = new Utilizador("nome", "1140587@isep.ipp.pt", "username", "password");
    }

    /**
     * Teste do método set e get ArtigoInicial, da classe Submissao.
     */
    @Test
    public void testSetGetArtigoInicial() {
        System.out.println("setAndGetArtigoInicial");
        Submissao instance = new Submissao();
        Artigo expResult = this.artigoInicial;
        instance.setArtigoInicial(expResult);
        Artigo result = instance.getArtigoInicial();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get ArtigoFinal, da classe Submissao.
     */
    @Test
    public void testSetAndGetArtigoFinal() {

        System.out.println("setAndGetArtigoFinal");
        Submissao instance = new Submissao();
        Artigo expResult = this.artigoFinal;
        instance.setArtigoFinal(expResult);
        Artigo result = instance.getArtigoFinal();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get AutorCorrespondente, da classe Submissao.
     */
    @Test
    public void testSetAndGetAutorCorrespondente() {
        System.out.println("setAndGetAutorCorrespondente");
        Submissao instance = new Submissao();
        AutorCorrepondente expResult = new AutorCorrepondente(this.utilizador,
                new InstituicaoAfiliacao("ISEP"));
        instance.setAutorCorrespondente(expResult);
        AutorCorrepondente result = instance.getAutorCorrespondente();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get AutorSubmissorInicial, da classe Submissao.
     */
    @Test
    public void testGetAutorSubmissorInicial() {
        System.out.println("setAndGetAutorSubmissorInicial");
        Submissao instance = new Submissao();
        Autor expResult = new Autor(this.utilizador,
                new InstituicaoAfiliacao("ISEP"));
        instance.setAutorSubmissorInicial(expResult);
        Autor result = instance.getAutorSubmissorInicial();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get AutorSubmissorFinal, da classe Submissao.
     */
    @Test
    public void testSetAndGetAutorSubmissorFinal() {
        System.out.println("setAndgetAutorSubmissorFinal");
        Submissao instance = new Submissao();
        Autor expResult = new Autor(this.utilizador,
                new InstituicaoAfiliacao("ISEP"));
        instance.setAutorSubmissorFinal(expResult);
        Autor result = instance.getAutorSubmissorFinal();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método set e get Estado method, da classe Submissao.
     */
    @Test
    public void testSetAndGetEstado() {
        System.out.println("setAndGetEstado");
        Submissao instance = new Submissao();
        System.out.println(instance.getEstado());
        SubmissaoState expResult = new SubmissaoAceiteState(instance);
        instance.setEstado(expResult);
        SubmissaoState result = instance.getEstado();
        System.out.println(instance.getEstado());
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarSubmissao, da classe Submissao.
     */
    @Test
    public void testValidarSubmissao() {
        System.out.println("validarSubmissao");
        Submissao instance = new Submissao();
        boolean expResult = true;
        boolean result = instance.validarSubmissao();
        System.out.println(instance.getEstado());
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarArtigo, da classe Submissao.
     */
    @Test
    public void testAdicionarArtigoInicial() {
        System.out.println("adicionarArtigoInicial");
        Artigo artigo = this.artigoInicial;
        Submissao instance = new Submissao();
        boolean expResult = true;
        boolean result = instance.adicionarArtigo(artigo);
        System.out.println(instance.getEstado());
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarArtigo, da classe Submissao.
     */
    @Test
    public void testAdicionarArtigoFinal() {
        System.out.println("adicionarArtigoFinal");
        Artigo artigo = this.artigoFinal;
        Submissao instance = new Submissao();
        instance.setEstado(new SubmissaoAceiteState(instance));
        System.out.println(instance.getEstado());
        boolean expResult = true;
        boolean result = instance.adicionarArtigo(artigo);
        System.out.println(instance.getEstado());
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe Submissao.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjecto = new Submissao();
        Submissao outraSubmissao = (Submissao) outroObjecto;
        outraSubmissao.setArtigoInicial(this.artigoInicial);
        outraSubmissao.setArtigoFinal(this.artigoFinal);
        Submissao instance = new Submissao();
        instance.setArtigoInicial(this.artigoInicial);
        instance.setArtigoFinal(this.artigoFinal);
        boolean expResult = true;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe Submissao.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjecto = new Submissao();
        Submissao instance = new Submissao();
        instance.setArtigoInicial(this.artigoInicial);
        instance.setArtigoFinal(this.artigoFinal);
        boolean expResult = false;
        boolean result = instance.equals(outroObjecto);
        assertEquals(expResult, result);
    }
}
