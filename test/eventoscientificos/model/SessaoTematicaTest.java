package eventoscientificos.model;

import eventoscientificos.model.state.sessaotematica.SessaoTematicaCPDefinidaState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaCriadaState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmDetecaoState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmLicitacaoState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaRegistadaState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class SessaoTematicaTest {

    private SessaoTematica sessaoTematica;
    private Utilizador utilizador;
    private Licitacao licitacao;
    private Submissao submissao;

    public SessaoTematicaTest() {
        this.sessaoTematica = new SessaoTematica(
                            "#A9D24R",
                            "LAPR2",
                            new Data(2015, 5, 22),
                            new Data(2015, 5, 28),
                            new Data(2015, 6, 10),
                            new Data(2015, 6, 20),
                            new Data(2015, 6, 24),
                            new Data(2015, 6, 28));
        this.utilizador = new Utilizador(
                            "Pedro", "1140781@isep.ipp.pt", "pedro", "1234");
        this.licitacao = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Submissao(), 0, null);
        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        this.submissao = new Submissao();
        submissao.setArtigoInicial(artigoInicial);
        submissao.setArtigoFinal(artigoFinal);
    }

    /**
     * Teste dos metodos set e get do código único, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetCodigoUnico() {
        System.out.println("setAndGetCodigoUnico");
        SessaoTematica instance = this.sessaoTematica;
        String expResult = "#123456";
        instance.setCodigoUnico(expResult);
        String result = instance.getCodigoUnico();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da descrição, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetDescricao() {
        System.out.println("setAndGetDescricao");
        SessaoTematica instance = this.sessaoTematica;
        String expResult = "uma descrição";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de submissão, da classe
     * SessaoTematica.
     */
    @Test
    public void testSetAndGetDataInicioSubmissao() {
        System.out.println("setAndGetDataInicioSubmissao");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 5, 23);
        instance.setDataInicioSubmissao(expResult);
        Data result = instance.getDataInicioSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de início de distribuição, da classe
     * SessaoTematica.
     */
    @Test
    public void testSetAndGetDataInicioDistribuicao() {
        System.out.println("setAndGetDataInicioDistribuicao");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 5, 29);
        instance.setDataInicioDistribuicao(expResult);
        Data result = instance.getDataInicioDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim de submissão, da classe
     * SessaoTematica.
     */
    @Test
    public void testSetAndGetDataFimSubmissao() {
        System.out.println("setAndGetDataFimSubmissao");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 5, 29);
        instance.setDataFimSubmissao(expResult);
        Data result = instance.getDataFimSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim submissão CameraReady, da
     * classe SessaoTematica.
     */
    @Test
    public void testSetAndGetDataFimSubmissaoCameraReady() {
        System.out.println("setAndGetDataFimSubmissaoCameraReady");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 6, 21);
        instance.setDataFimSubmissaoCameraReady(expResult);
        Data result = instance.getDataFimSubmissaoCameraReady();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetDataInicio() {
        System.out.println("setAndGetDataInicio");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 6, 25);
        instance.setDataInicio(expResult);
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetDataFim() {
        System.out.println("setAndGetDataFim");
        SessaoTematica instance = this.sessaoTematica;
        Data expResult = new Data(2016, 6, 29);
        instance.setDataFim(expResult);
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da CP, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetCP() {
        System.out.println("setAndGetCP");
        SessaoTematica instance = this.sessaoTematica;
        CP expResult = new CP();
        instance.setCP(expResult);
        assertEquals(expResult, instance.getCP());
    }

    /**
     * Teste do método setAndGetEstado, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetEstado() {
        System.out.println("setAndGetEstado");
        SessaoTematica instance = this.sessaoTematica;
        SessaoTematicaState estado
                            = new SessaoTematicaCriadaState(this.sessaoTematica);
        Class<? extends SessaoTematicaState> expResult = estado.getClass();
        Class<? extends SessaoTematicaState> result
                            = instance.getEstado().getClass();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaSubmissoes, da classe SessaoTematica.
     */
    @Test
    public void testGetListaSubmissoes() {
        System.out.println("getListaSubmissoes");
        SessaoTematica instance = this.sessaoTematica;
        ListaSubmissoes expResult = new ListaSubmissoes();
        ListaSubmissoes result = instance.getListaSubmissoes();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos métodos set e get ProcessoDetecao, da classe SessaoTematica.
     */
    @Test
    public void testSetAndGetProcessoDetecao() {
        System.out.println("setAndGetProcessoDetecao");
        SessaoTematica instance = this.sessaoTematica;
        instance.setProcessoDetecao(new ProcessoDetecao());
        ProcessoDetecao expResult = new ProcessoDetecao();
        ProcessoDetecao result = instance.getProcessoDetecao();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetCodigoUnicoEmpty() {
        System.out.println("setCodigoUnicoEmpty");
        SessaoTematica instance = this.sessaoTematica;
        String codigoUnico = "";
        instance.setCodigoUnico(codigoUnico);
    }

    /**
     * Teste do método setCodigoUnico, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDescricaoEmpty() {
        System.out.println("setDescricao");
        SessaoTematica instance = this.sessaoTematica;
        String descricao = "";
        instance.setDescricao(descricao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioSubmissaoNull() {
        System.out.println("setDataInicioSubmissaoNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataInicioSubmissao = null;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataFimSubmissao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoNull() {
        System.out.println("setDataFimSubmissaoNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataFimSubmissao = null;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataInicioDistribuicao, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioDistribuicaoNull() {
        System.out.println("setDataInicioDistribuicao");
        SessaoTematica instance = this.sessaoTematica;
        Data dataInicioDistribuicao = null;
        instance.setDataInicioDistribuicao(dataInicioDistribuicao);
    }

    /**
     * Teste do método setDataFimSubmissaoCameraReady, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoCameraReadyNull() {
        System.out.println("setDataFimSubmissaoCameraReadyNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataFimSubmissaoCameraReady = null;
        instance.setDataFimSubmissaoCameraReady(dataFimSubmissaoCameraReady);
    }

    /**
     * Teste do método setDataInicio, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioNull() {
        System.out.println("setDataInicioNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataInicio = null;
        instance.setDataInicio(dataInicio);
    }

    /**
     * Teste do método setDataFim, da classe SessaoTematica.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimNull() {
        System.out.println("setDataNull");
        SessaoTematica instance = this.sessaoTematica;
        Data dataFim = null;
        instance.setDataFim(dataFim);
    }

    /**
     * Teste do método equals, da classe SessaoTematica.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.sessaoTematica;
        SessaoTematica instance = this.sessaoTematica;
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe SessaoTematica.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new SessaoTematica("#1234", "Sem descrição",
                            new Data(2016, 1, 1), new Data(2016, 1, 7),
                            new Data(2016, 1, 9), new Data(2016, 1, 26),
                            new Data(2016, 2, 4), new Data(2016, 2, 6));
        SessaoTematica instance = this.sessaoTematica;
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoProponente, da classe SessaoTematica.
     */
    @Test
    public void testNovoProponente() {
        System.out.println("novoProponente");
        SessaoTematica instance = this.sessaoTematica;
        boolean expResult = true;
        boolean result = instance.novoProponente(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoProponente, da classe SessaoTematica.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoProponenteExists() {
        System.out.println("novoProponenteExists");
        SessaoTematica instance = this.sessaoTematica;
        instance.novoProponente(this.utilizador);
        instance.novoProponente(this.utilizador);
    }

    /**
     * Test of validarSessaoTematica method, of class SessaoTematica.
     */
    @Test
    public void testValidarSessaoTematica() {
        System.out.println("validarSessaoTematica");
        SessaoTematica instance = this.sessaoTematica;
        boolean expResult = true;
        boolean result = instance.validarSessaoTematica();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novaCP, da classe SessaoTematica.
     */
    @Test
    public void testNovaCP() {
        System.out.println("novaCP");
        SessaoTematica instance = this.sessaoTematica;
        CP expResult = new CP();
        CP result = instance.novaCP();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo adicionarCP, da classe SessaoTematica.
     */
    @Test
    public void testAdicionarCP() {
        System.out.println("adicionarCP");
        SessaoTematica instance = this.sessaoTematica;
        sessaoTematica.setEstado(
                            new SessaoTematicaRegistadaState(sessaoTematica));
        CP cp = new CP();
        boolean expResult = true;
        boolean result = instance.adicionarCP(cp);
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método setEmSubmissao, da classe SessaoTematica.
     */
    @Test
    public void testSetEmSubmissao() {
        System.out.println("setEmSubmissao");
        SessaoTematica instance = this.sessaoTematica;
        instance.setEstado(new SessaoTematicaCPDefinidaState(instance));
        boolean expResult = false;
        boolean result = instance.setEmSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isProponente, da classe SessaoTematica.
     */
    @Test
    public void testIsProponente() {
        System.out.println("isProponente");
        SessaoTematica instance = this.sessaoTematica;
        instance.novoProponente(this.utilizador);
        boolean expResult = true;
        boolean result = instance.isProponente(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaLicitacoes method, of class SessãoTematica.
     */
    @Test
    public void testGetListaLicitacoes() {
        System.out.println("getListaLicitacoes");
        SessaoTematica instance = this.sessaoTematica;
        ListaLicitacoes expResult = new ListaLicitacoes();
        ListaLicitacoes result = instance.getListaLicitacoes();
        assertEquals(expResult, result);
    }

    /**
     * Test of getConflitoRevisorSubmissao method, of class SessaoTematica.
     */
    @Test
    public void testGetConflitoRevisorSubmissao() {
        System.out.println("getConflitoRevisorSubmissao");
        Revisor revisor = new Revisor(new Utilizador(
                            "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        Submissao submissao = new Submissao();
        submissao.setArtigoFinal(new Artigo("titulo", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));
        submissao.setArtigoInicial(new Artigo("titulo1234", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));

        Conflito c = new Conflito(revisor, submissao, new ArrayList<>());
        SessaoTematica instance = this.sessaoTematica;
        instance.setProcessoDetecao(new ProcessoDetecao());
        instance.getProcessoDetecao().getListaConflito().add(c);

        Conflito expResult = c;
        Conflito result = instance.getConflitoRevisorSubmissao(revisor, submissao);
        assertEquals(expResult, result);
    }

    /**
     * Test of isStateValidoParaLicitar method, of class SessaoTematica.
     */
    @Test
    public void testIsStateValidoParaLicitarNot() {
        System.out.println("isStateValidoParaLicitarNot");
        this.sessaoTematica.setEstado(new SessaoTematicaCriadaState(sessaoTematica));
        SessaoTematicaState instance = this.sessaoTematica.getEstado();
        boolean expResult = false;
        boolean result = instance.isStateValidoParaLicitar();
        assertEquals(expResult, result);

    }

    /**
     * Test of isStateValidoParaLicitar method, of class SessaoTematica.
     */
    @Test
    public void testIsStateValidoParaLicitarValido() {
        System.out.println("isStateValidoParaLicitarValido");
        this.sessaoTematica.setEstado(new SessaoTematicaEmLicitacaoState(sessaoTematica));
        this.sessaoTematica.setCP(new CP());
        this.sessaoTematica.getCP().novoRevisor(this.utilizador);
        boolean expResult = true;
        boolean result = this.sessaoTematica.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);

    }

    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarEstadoInvalido() {
        System.out.println("isStateValidoParaLicitarValido");
        this.sessaoTematica.setEstado(new SessaoTematicaEmDetecaoState(sessaoTematica));
        this.sessaoTematica.setCP(new CP());
        this.sessaoTematica.getCP().novoRevisor(this.utilizador);
        boolean expResult = false;
        boolean result = this.sessaoTematica.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarComLicitacao() {
        System.out.println("isStateValidoParaLicitarValido");
        this.sessaoTematica.setEstado(new SessaoTematicaEmLicitacaoState(sessaoTematica));
        this.sessaoTematica.setCP(new CP());
        this.sessaoTematica.getCP().novoRevisor(this.utilizador);
        List<Licitacao> listaTeste = new ArrayList<>();
        listaTeste.add(licitacao);
        this.sessaoTematica.getListaLicitacoes().adicionarListaLicitacoesTemporaria(listaTeste);
        boolean expResult = true;
        boolean result = this.sessaoTematica.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);

    }
}
