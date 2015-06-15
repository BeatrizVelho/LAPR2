package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoCriadoState;
import eventoscientificos.model.state.evento.EventoEmDetecaoConflitos;
import eventoscientificos.model.state.evento.EventoEmLicitacaoState;
import eventoscientificos.model.state.evento.EventoRegistadoState;
import eventoscientificos.model.state.evento.EventoSessoesTematicasDefinidasState;
import eventoscientificos.model.state.evento.EventoState;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class EventoTest {

    private Evento evento;
    private Utilizador utilizador;
    private Licitacao licitacao;

    public EventoTest() {
        this.evento = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 9, 10),
                            new Data(2016, 10, 1), new Data(2017, 6, 10));
        this.utilizador = new Utilizador(
                            "Pedro", "1140781@isep.ipp.pt", "pedro", "12345");
        this.licitacao = new Licitacao(new Revisor(new Utilizador(
                            "fatima", "ola@iml.com", "fafa", "1234")),
                            new Artigo(), 0, null);
    }

    /**
     * Teste dos metodos set e get do titulo, da classe Evento.
     */
    @Test
    public void testSetAndGetTitulo() {
        System.out.println("setAngetTitulo");
        Evento instance = this.evento;
        String expResult = "titulo";
        instance.setTitulo(expResult);
        String result = instance.getTitulo();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da descricao, da classe Evento..
     */
    @Test
    public void testSetAndGetDescricao() {
        System.out.println("setAndGetDescricao");
        Evento instance = this.evento;
        String expResult = "descricao";
        instance.setDescricao(expResult);
        String result = instance.getDescricao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get do local, da classe Evento.
     */
    @Test
    public void testSetAndGetLocal() {
        System.out.println("setAndGetLocal");
        Evento instance = this.evento;
        Local expResult = new Local("isep");
        instance.setLocal(expResult);
        Local result = instance.getLocal();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio, da classe Evento.
     */
    @Test
    public void testSetAndGetDataInicio() {
        System.out.println("setAndGetDataInicio");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicio(expResult);
        Data result = instance.getDataInicio();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim, da classe Evento.
     */
    @Test
    public void testSetAndGetDataFim() {
        System.out.println("setAndGetDataFim");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataFim(expResult);
        Data result = instance.getDataFim();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de submissao, da classe
     * Evento.
     */
    @Test
    public void testSetAndGetDataInicioSubmissao() {
        System.out.println("setAndGetDataInicioSubmissao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicioSubmissao(expResult);
        Data result = instance.getDataInicioSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de fim de submissao, da classe
     * Evento.
     */
    @Test
    public void testSetAndGetDataFimSubmissao() {
        System.out.println("setAndGetDataFimSubmissao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataFimSubmissao(expResult);
        Data result = instance.getDataFimSubmissao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da data de inicio de distribuicao, da classe
     * Evento.
     */
    @Test
    public void testSetAndGetDataInicioDistribuicao() {
        System.out.println("gsetAndGetDataInicioDistribuicao");
        Evento instance = this.evento;
        Data expResult = new Data();
        instance.setDataInicioDistribuicao(expResult);
        Data result = instance.getDataInicioDistribuicao();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos métodos set e get do estado do evento, da classe evento.
     */
    @Test
    public void testSetAndGetEstado() {
        System.out.println("setAndGetEstado");
        Evento instance = this.evento;
        EventoState estado = new EventoCriadoState(this.evento);
        Class<? extends EventoState> expResult = estado.getClass();
        Class<? extends EventoState> result = instance.getEstado().getClass();
        assertEquals(expResult, result);
    }

    /**
     * Teste dos metodos set e get da CP, da classe Evento.
     */
    @Test
    public void testSetAndGetCP() {
        System.out.println("setAndGetCP");
        Evento instance = this.evento;
        instance.setCP(new CP());
        CP expResult = new CP();
        CP result = instance.getCP();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaSessoesTematicas, da classe Evento.
     */
    @Test
    public void testGetListaSessoesTematica() {
        System.out.println("getListaSessoesTematicas");
        Evento instance = this.evento;
        ListaSessoesTematicas expResult
                            = new ListaSessoesTematicas(this.evento);
        ListaSessoesTematicas result = instance.getListaSessoesTematicas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do metodo setTitulo, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetTituloEmpty() {
        System.out.println("setTituloEmpty");
        String titulo = "";
        Evento instance = this.evento;
        instance.setTitulo(titulo);
    }

    /**
     * Teste do metodo setDescricao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDescricaoEmpty() {
        System.out.println("setDescricaoEmpty");
        String descricao = "";
        Evento instance = this.evento;
        instance.setTitulo(descricao);
    }

    /**
     * Teste do método setDataInicio, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioNull() {
        System.out.println("setDataInicioNull");
        Data dataInicio = null;
        Evento instance = this.evento;
        instance.setDataInicio(dataInicio);
    }

    /**
     * Teste do método setDataFim, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimNull() {
        System.out.println("setDataFimNull");
        Data dataFim = null;
        Evento instance = this.evento;
        instance.setDataFim(dataFim);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioSubmissaoNull() {
        System.out.println("setDataInicioSubmissaoNull");
        Data dataInicioSubmissao = null;
        Evento instance = this.evento;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataInicioSubmissao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioSubmissaoDatePassed() {
        System.out.println("setDataInicioSubmissaoDatePassed");
        Data dataInicioSubmissao = new Data(1, 1, 1);
        Evento instance = this.evento;
        instance.setDataInicioSubmissao(dataInicioSubmissao);
    }

    /**
     * Teste do método setDataFimSubmissao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataFimSubmissaoNull() {
        System.out.println("setDataFimSubmissaoNull");
        Data dataFimSubmissao = null;
        Evento instance = this.evento;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataFimSubmissao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataFimSubmissaoDatePassed() {
        System.out.println("setDataFimSubmissaoDatePassed");
        Data dataFimSubmissao = new Data(2015, 6, 8);
        Evento instance = this.evento;
        instance.setDataFimSubmissao(dataFimSubmissao);
    }

    /**
     * Teste do método setDataInicioDistribuicao, da classe Evento.
     */
    @Test(expected = NullPointerException.class)
    public void testSetDataInicioDistribuicaoNull() {
        System.out.println("setDataInicioDistribuicaoNull");
        Data dataInicioDistribuicao = null;
        Evento instance = this.evento;
        instance.setDataInicioDistribuicao(dataInicioDistribuicao);
    }

    /**
     * Teste do método setDataInicioDistribuicao, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testSetDataInicioDistribuicaoDatePassed() {
        System.out.println("setDataInicioDistribuicaoDatePassed");
        Data dataInicioDistribuicao = new Data(2015, 6, 8);
        Evento instance = this.evento;
        instance.setDataInicioDistribuicao(dataInicioDistribuicao);
    }

    /**
     * Teste do método temSessoesTematicasDefinidas, da classe Evento.
     */
    @Test
    public void testTemSessoesTematicasDefinidas() {
        System.out.println("temSessoesTematicasDefinidas");
        boolean expResult = false;
        boolean result = this.evento.temSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe Evento.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object outroObjeto = this.evento;
        Evento instance = this.evento;
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
        Object outroObjeto = new Evento("sem titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 9, 10),
                            new Data(2016, 11, 1), new Data(2017, 6, 10));
        Evento instance = this.evento;
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoOrganizador, da classe Evento.
     */
    @Test
    public void testNovoOrganizador() {
        System.out.println("novoOrganizador");
        Evento instance = this.evento;
        boolean expResult = true;
        boolean result = instance.novoOrganizador(new Utilizador("Bea",
                            "1140587@isep.ipp.pt", "beatriz", "111"));
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novoOrganizador, da classe Evento.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testNovoOrganizadorExists() {
        System.out.println("novoOrganizadorExists");
        Evento instance = this.evento;
        instance.novoOrganizador(new Utilizador(
                            "Beatriz", "1140587@isep.ipp.pt", "bea", "1234"));
        instance.novoOrganizador(new Utilizador(
                            "Beatriz", "1140587@isep.ipp.pt", "bea", "1234"));
    }

    /**
     * Teste do método validarEvento, da classe Evento.
     */
    @Test
    public void testValidarEvento() {
        System.out.println("validarEvento");
        Evento instance = this.evento;
        boolean expResult = true;
        boolean result = instance.validarEvento();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método novaCP, da classe Evento.
     */
    @Test
    public void testNovaCP() {
        System.out.println("novaCP");
        Evento instance = this.evento;
        CP expResult = new CP();
        CP result = instance.novaCP();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao metodo adicionarCP, da classe Evento.
     */
    @Test
    public void testAdicionarCP() {
        System.out.println("adicionarCP");
        Evento instance = this.evento;
        instance.setEstado(new EventoSessoesTematicasDefinidasState(instance));
        CP cp = new CP();
        boolean expResult = true;
        boolean result = instance.adicionarCP(cp);
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isOrganizador, da classe Evento.
     */
    @Test
    public void testIsOrganizador() {
        System.out.println("isOrganizador");
        Evento instance = this.evento;
        instance.novoOrganizador(this.utilizador);
        boolean expResult = true;
        boolean result = instance.isOrganizador(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isRegistadoOuSessoesTematicasDefinidas, da classe evento.
     */
    @Test
    public void testIsRegistadoOuSessoesTematicasDefinidas() {
        System.out.println("isRegistadoOuSessoesTematicasDefinidas");
        Evento instance = this.evento;
        instance.setEstado(new EventoRegistadoState(instance));
        boolean expResult = true;
        boolean result = instance.isRegistadoOuSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isSessoesTematicasDefinidas, da classe Evento.
     */
    @Test
    public void testTemSessoesTematicasDefinidasSemSessoesDefinidas() {
        System.out.println("temSessoesTematicasDefinidasSemSessoesDefinidas");
        Evento instance = this.evento;
        instance.setEstado(new EventoRegistadoState(evento));
        boolean expResult = false;
        boolean result = instance.isSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste ao método isSessoesTematicasDefinidas, da classe Evento.
     */
    @Test
    public void testIsSessoesTematicasDefinidasComSessoesDefinidas() {
        System.out.println("isSessoesTematicasDefinidasComSessoesDefinidas");
        Evento instance = this.evento;
        instance.setEstado(new EventoSessoesTematicasDefinidasState(evento));
        boolean expResult = true;
        boolean result = instance.isSessoesTematicasDefinidas();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaCPDefiniveisSemCPOrganizadorProponente, da classe
     * Evento.
     */
    @Test
    public void testGetListaCPDefiniveisSemCPOrganizadorProponente() {
        System.out.println("getListaCPDefiniveisSemCPOrganizadorProponente");
        Utilizador utilizador = new Utilizador(this.utilizador);
        Evento instance = new Evento("titulo", "descricao", new Local("local"),
                            new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 7), new Data(2016, 8, 1),
                            new Data(2017, 6, 10), new Data(2018, 6, 10));
        Proponente prop = new Proponente(utilizador);
        List<CPDefinivel> expResult = new ArrayList<>();
        List<CPDefinivel> result = instance.getListaCPDefiniveisSemCPOrganizadorProponente(utilizador);
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getDataFimSubmissaoCameraReady method, of class Evento.
//     */
//    @Test
//    public void testGetDataFimSubmissaoCameraReady() {
//        System.out.println("getDataFimSubmissaoCameraReady");
//        Evento instance = null;
//        Data expResult = null;
//        Data result = instance.getDataFimSubmissaoCameraReady();
//        assertEquals(expResult, result);
//    }
    /**
     * Test of getListaLicitacoes method, of class Evento.
     */
    @Test
    public void testGetListaLicitacoes() {
        System.out.println("getListaLicitacoes");
        Evento instance = this.evento;
        ListaLicitacoes expResult = new ListaLicitacoes();
        ListaLicitacoes result = instance.getListaLicitacoes();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of getListaSubmissiveisAceitarArtigo method, of class Evento.
//     */
//    @Test
//    public void testGetListaSubmissiveisAceitarArtigo() {
//        System.out.println("getListaSubmissiveisAceitarArtigo");
//        Evento instance = null;
//        List<Submissivel> expResult = null;
//        List<Submissivel> result = instance.getListaSubmissiveisAceitarArtigo();
//        assertEquals(expResult, result);
//
//    }
    /**
     * Test of getConflitoRevisorArtigo method, of class Evento.
     */
    @Test
    public void testGetConflitoRevisorArtigo() {
        System.out.println("getConflitoRevisorArtigo");
        Revisor revisor = new Revisor(new Utilizador(
                            "Tiago", "1131658@isep.ipp.pt", "tiago", "1234"));
        Submissao submissao = new Submissao();
        submissao.setArtigoFinal(new Artigo("titulo", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));
        submissao.setArtigoInicial(new Artigo("titulo1234", "saude", "D:\\ISEP\\1.º Ano\\2.º Semestre"));

        Conflito c = new Conflito(revisor, submissao, new ArrayList<>());
        Evento instance = this.evento;
        instance.getProcessoDetecao().getListaConflito().add(c);

        Conflito expResult = c;
        Conflito result = instance.getConflitoRevisorArtigo(revisor, submissao);
        assertEquals(expResult, result);

    }

    /**
     * Teste dos métodos set e get ProcessoDetecao, da classe Evento.
     */
    @Test
    public void testSetAndGetProcessoDetecao() {
        System.out.println("setAndGetProcessoDetecao");
        Evento instance = this.evento;
        instance.setProcessoDetecao(new ProcessoDetecao());
        ProcessoDetecao expResult = new ProcessoDetecao();
        ProcessoDetecao result = instance.getProcessoDetecao();
        assertEquals(expResult, result);
    }

//    /**
//     * Test of iniciarProcessoDetecao method, of class Evento.
//     */
//    @Test
//    public void testIniciarProcessoDetecao() {
//        System.out.println("iniciarProcessoDetecao");
//        List<TipoConflito> listaTiposConflito = null;
//        Evento instance = null;
//        instance.iniciarProcessoDetecao(listaTiposConflito);
//    }
    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarNot() {
        System.out.println("isStateValidoParaLicitarNot");
        this.evento.setEstado(new EventoCriadoState(evento));
        EventoState instance = this.evento.getEstado();
        boolean expResult = false;
        boolean result = instance.isStateValidoParaLicitar();
        assertEquals(expResult, result);

    }

    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarValido() {
        System.out.println("isStateValidoParaLicitarValido");
        this.evento.setEstado(new EventoEmLicitacaoState(evento));
        this.evento.setCP(new CP());
        this.evento.getCP().novoRevisor(this.utilizador);
        boolean expResult = true;
        boolean result = this.evento.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);

    }

    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarEstadoInvalido() {
        System.out.println("isStateValidoParaLicitarValido");
        this.evento.setEstado(new EventoEmDetecaoConflitos(evento));
        this.evento.setCP(new CP());
        this.evento.getCP().novoRevisor(this.utilizador);
        boolean expResult = false;
        boolean result = this.evento.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Test of isStateValidoParaLicitar method, of class Evento.
     */
    @Test
    public void testIsStateValidoParaLicitarComLicitacao() {
        System.out.println("isStateValidoParaLicitarValido");
        this.evento.setEstado(new EventoEmLicitacaoState(evento));
        this.evento.setCP(new CP());
        this.evento.getCP().novoRevisor(this.utilizador);
        List<Licitacao> listaTeste = new ArrayList<>();
        listaTeste.add(licitacao);
        this.evento.getListaLicitacoes().adicionarListaLicitacoesTemporaria(listaTeste);
        boolean expResult = true;
        boolean result = this.evento.isStateValidoParaLicitar(this.utilizador);
        assertEquals(expResult, result);

    }
}
