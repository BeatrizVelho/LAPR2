package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoEmLicitacaoState;
import eventoscientificos.model.state.evento.EventoEmRevisaoState;
import eventoscientificos.model.state.evento.EventoEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.evento.EventoEmSubmissaoState;
import eventoscientificos.model.state.evento.EventoFaseDecisaoState;
import eventoscientificos.model.state.evento.EventoRegistadoState;
import eventoscientificos.model.state.evento.EventoSessoesTematicasDefinidasState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaEmSubmissaoCameraReadyState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaFaseDecisaoState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaRegistadaState;
import eventoscientificos.model.state.submissao.SubmissaoEmCameraReadyState;
import eventoscientificos.model.state.submissao.SubmissaoEmSubmissaoState;
import eventoscientificos.model.state.submissao.SubmissaoRemovidaState;
import eventoscientificos.model.state.submissao.SubmissaoRevistaState;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.Data;

/**
 * @author G01
 */
public class RegistoEventosTest {

    private Evento evento;
    private Utilizador utilizador;
    private SessaoTematica st;
    private Revisao revisao;

    public RegistoEventosTest() {
        String titulo = "sem titulo";
        String descricao = "descricao";
        Local local = new Local("local");
        Data dataInicioSubmissao = new Data(2016, 6, 8);
        Data dataFimSubmissao = new Data(2016, 6, 20);
        Data dataInicioDistribuicao = new Data(2016, 7, 30);
        Data dataFimRevisao = new Data(2016, 8, 15);
        Data dataFimSubmissaoCameraReady = new Data(2016, 8, 30);
        Data dataInicio = new Data(2016, 10, 9);
        Data dataFim = new Data(2017, 6, 10);
        RegistoEventos instance = new RegistoEventos();
        this.evento = new Evento(titulo, descricao, local, dataInicioSubmissao,
                            dataFimSubmissao, dataInicioDistribuicao, dataFimRevisao,
                            dataFimSubmissaoCameraReady, dataInicio, dataFim);

        this.utilizador = new Utilizador(
                            "pedro", "1140781@isep.ipp.pt", "pedro", "12345");
        this.st = new SessaoTematica(
                            "#123456", "Uma descrição", new Data(2016, 5, 9),
                            new Data(2016, 6, 21), new Data(2016, 7, 8),
                            new Data(2016, 7, 20), new Data(2016, 9, 24),
                            new Data(2017, 5, 28), new Data(2017, 6, 8));

        Artigo artigoInicial = new Artigo();
        Artigo artigoFinal = new Artigo();
        Submissao submissao = new Submissao();
        submissao.setArtigoInicial(artigoInicial);
        submissao.setArtigoFinal(artigoFinal);

        this.revisao = new Revisao(submissao, new Revisor(utilizador));
    }

    /**
     * Teste do método novoEvento, da classe RegistoEventos.
     */
    @Test
    public void testNovoEvento() {
        System.out.println("novoEvento");
        String titulo = "sem titulo";
        String descricao = "descricao";
        Local local = new Local("local");
        Data dataInicioSubmissao = new Data(2016, 6, 8);
        Data dataFimSubmissao = new Data(2016, 6, 20);
        Data dataInicioDistribuicao = new Data(2016, 7, 30);
        Data dataFimRevisao = new Data(2016, 8, 15);
        Data dataFimSubmissaoCameraReady = new Data(2016, 8, 30);
        Data dataInicio = new Data(2016, 10, 9);
        Data dataFim = new Data(2017, 6, 10);
        RegistoEventos instance = new RegistoEventos();
        Evento expResult = this.evento;
        Evento result = instance.novoEvento(
                            titulo, descricao, local, dataInicioSubmissao, dataFimSubmissao,
                            dataInicioDistribuicao, dataFimRevisao, dataFimSubmissaoCameraReady,
                            dataInicio, dataFim);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método validarEvento, da classe RegistoEventos.
     */
    @Test
    public void testValidarEvento() {
        System.out.println("validarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.validarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método adicionarEvento, da classe RegistoEventos.
     */
    @Test
    public void testAdicionarEvento() {
        System.out.println("adicionarEvento");
        Evento evento = this.evento;
        RegistoEventos instance = new RegistoEventos();
        boolean expResult = true;
        boolean result = instance.adicionarEvento(evento);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        RegistoEventos outroObjeto = new RegistoEventos();

        outroObjeto.adicionarEvento(this.evento);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = true;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método equals, da classe RegistoEventos.
     */
    @Test
    public void testEqualsNot() {
        System.out.println("equalsNot");
        Object outroObjeto = new RegistoEventos();
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        boolean expResult = false;
        boolean result = instance.equals(outroObjeto);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaEventosOrganizador, da classe RegistoEventos.
     */
    @Test
    public void testGetListaEventosOrganizador() {
        this.evento.setEstado(new EventoRegistadoState(this.evento));
        this.evento.novoOrganizador(this.utilizador);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        List<Evento> expResult = new ArrayList();
        expResult.add(this.evento);
        List<Evento> result
                            = instance.getListaEventosOrganizador(this.utilizador);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaCPDefiniveisSemCPOrganizadorProponente, da classe
     * RegistoEventos.
     */
    @Test
    public void testGetListaCPDefiniveisSemCPOrganizadorProponente() {
        System.out.println("getListaCPDefiniveisSemOrganizadorProponente");
        this.evento.setEstado(new EventoSessoesTematicasDefinidasState(evento));
        evento.novoOrganizador(this.utilizador);
        st.setEstado(new SessaoTematicaRegistadaState(st));
        st.novoProponente(this.utilizador);
        evento.getListaSessoesTematicas().adicionarSessaoTematica(st);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        int expResult = 2;
        int result = (instance.getListaCPDefiniveisSemCPOrganizadorProponente(this.utilizador)).size();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaCPDefiniveisSemCPOrganizadorProponente, da classe
     * RegistoEventos.
     */
    @Test
    public void testGetListaCPDefiniveisSemCPOrganizadorProponenteSemEvento() {
        System.out.println("getListaCPDefiniveisSemOrganizadorProponenteSemEvento");
        this.evento.setEstado(new EventoSessoesTematicasDefinidasState(evento));
        evento.novoOrganizador(new Utilizador("fafa", "fafa@imal.com", "nana", "1234"));
        st.setEstado(new SessaoTematicaRegistadaState(st));
        st.novoProponente(this.utilizador);
        evento.getListaSessoesTematicas().adicionarSessaoTematica(st);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        int expResult = 1;
        int result = (instance.getListaCPDefiniveisSemCPOrganizadorProponente(this.utilizador)).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaLicitaveisComArtigosPorLicitarRevisor method, of class
     * RegistoEventos.
     */
    @Test
    public void testGetListaLicitaveisComArtigosPorLicitarRevisor() {
        System.out.println("getListaLicitaveisComArtigosPorLicitarRevisor");
        Utilizador u = this.utilizador;
        this.evento.setCP(new CP());
        this.evento.getCP().novoRevisor(utilizador);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        boolean expResult = true;
        boolean result = instance.getListaLicitaveisComArtigosPorLicitarRevisor(u) != null;
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaSubmissiveisAceitarArtigo, da classe
     * RegistoEventos.
     */
    @Test
    public void testGetListaSubmissiveisAceitarArtigo() {
        System.out.println("getListaSubmissiveisAceitarArtigo");
        RegistoEventos instance = new RegistoEventos();
        Evento evento = this.evento;
        evento.setEstado(new EventoEmSubmissaoState(evento));
        instance.adicionarEvento(evento);
        instance.adicionarEvento(new Evento("sem titulo", "descricao",
                            new Local("local"), new Data(2016, 6, 8), new Data(2016, 6, 20),
                            new Data(2016, 7, 30), new Data(2016, 8, 15), new Data(2016, 8, 30),
                            new Data(2016, 10, 9), new Data(2017, 6, 10)));
        int expResult = 1;
        int result = instance.getListaSubmissiveisAceitarArtigo().size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaDistribuiveisOrganizadorProponente method, of class
     * RegistoEventos.
     */
    @Test
    public void testgetListaDistribuiveisOrganizadorProponente() {
        System.out.println("getListaDistribuiveisOrganizadorProponente");
        Utilizador u = this.utilizador;
        this.evento.setCP(new CP());
        this.evento.getCP().novoRevisor(utilizador);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        boolean expResult = true;
        boolean result = instance.getListaDistribuiveisOrganizadorProponente(u) != null;
        assertEquals(expResult, result);
    }

    /**
     * Teste do método
     * getListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente, da
     * classe RegistoEventos.
     */
    @Test
    public void testGetListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente() {
        System.out.println(
                            "getListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente");
        Submissao submissao = new Submissao();
        submissao.setEstado(new SubmissaoRemovidaState(submissao));

        SessaoTematica st = this.st;
        st.setEstado(new SessaoTematicaEmSubmissaoCameraReadyState(st));
        st.novoProponente(this.utilizador);
        st.getListaSubmissoes().adicionarSubmissao(submissao);

        Evento evento = this.evento;
        evento.setEstado(new EventoEmSubmissaoCameraReadyState(evento));
        evento.novoOrganizador(this.utilizador);
        evento.getListaSubmissoes().adicionarSubmissao(submissao);
        evento.getListaSessoesTematicas().adicionarSessaoTematica(st);

        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);

        int expResult = 2;
        int result = (instance.getListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente(this.utilizador)).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaRevisiveisComArtigosPReverRevisor method, of class
     * RegistoEventos.
     */
    @Test
    public void testGetListaRevisiveisComArtigosPReverRevisor() {
        System.out.println("getListaRevisiveisComArtigosPReverRevisor");
        this.evento.setEstado(new EventoEmRevisaoState(evento));
        this.evento.adicionarCP(new CP());
        this.evento.getCP().novoRevisor(utilizador);
        ProcessoDistribuicao pd = this.evento.novoProcessoDistribuicao();
        this.evento.adicionarProcessoDistribuicao(pd);

        ListaRevisoes lr = pd.getListaRevisoes();
        lr.adicionarRevisao(this.revisao);

        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);

        int expResult = 1;
        int result = instance.getListaRevisiveisComArtigosPReverRevisor(utilizador).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaSubmissiveisComArtigosUtilizadorParaRemover method, of
     * class RegistoEventos.
     */
    @Test
    public void testGetListaSubmissiveisComArtigosUtilizadorParaRemover() {
        System.out.println("getListaSubmissiveisComArtigosUtilizadorParaRemover");
        Utilizador u = this.utilizador;
        this.evento.setEstado(new EventoEmSubmissaoState(evento));
        Artigo a = new Artigo();
        a.getListaAutores().novoAutor(utilizador, new InstituicaoAfiliacao("Matosinhos"));
        Submissao s = new Submissao();
        s.setEstado(new SubmissaoEmSubmissaoState(s));
        s.adicionarArtigo(a);
        this.evento.getListaSubmissoes().adicionarSubmissao(s);
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        int expResult = 1;
        int result = instance.getListaSubmissiveisComArtigosUtilizadorParaRemover(u).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaEventosOrganizadorEmSubmissaoCameraReady method, of class
     * RegistoEventos.
     */
    @Test
    public void testGetListaEventosOrganizadorEmSubmissaoCameraReady() {
        System.out.println("getListaEventosOrganizadorEmSubmissaoCameraReady");
        Utilizador u = this.utilizador;
        Artigo a = new Artigo();
        a.getListaAutores().novoAutor(utilizador, new InstituicaoAfiliacao("Matosinhos"));
        Submissao s = new Submissao();
        s.adicionarArtigo(a);
        s.setEstado(new SubmissaoEmCameraReadyState(s));
        this.evento.getListaSubmissoes().adicionarSubmissao(s);
        this.evento.novoOrganizador(utilizador);
        this.evento.setEstado(new EventoEmSubmissaoCameraReadyState(evento));
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        int expResult = 1;
        int result = instance.getListaEventosOrganizadorEmSubmissaoCameraReady(u).size();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getNumeroEventos, da classe RegistoEventos.
     */
    @Test
    public void testGetNumeroEventos() {
        System.out.println("getNumeroEventos");
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        int expResult = 1;
        int result = instance.getNumeroEventos();
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getEventoPeloID, da classe RegistoEventos.
     */
    @Test
    public void testGetEventoPeloID() {
        System.out.println("getEventoPeloID");
        int indice = 0;
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(this.evento);
        Evento expResult
                            = this.evento;
        Evento result = instance.getEventoPeloID(indice);
        assertEquals(expResult, result);
    }

    /**
     * Teste do método getListaDecidivelOrganizadorProponente, da classe
     * RegistoEventos.
     */
    @Test
    public void testGetListaDecidivelOrganizadorProponente() {
        System.out.println("getListaDecidivelOrganizadorProponente");
        Submissao submissao = new Submissao();
        submissao.setEstado(new SubmissaoRevistaState(submissao));

        SessaoTematica sessaoTematica = this.st;
        sessaoTematica.setEstado(new SessaoTematicaFaseDecisaoState(sessaoTematica));
        sessaoTematica.novoProponente(this.utilizador);
        sessaoTematica.getListaSubmissoes().adicionarSubmissao(submissao);

        Evento evento = this.evento;
        evento.setEstado(new EventoFaseDecisaoState(evento));
        evento.novoOrganizador(this.utilizador);
        evento.getListaSubmissoes().adicionarSubmissao(submissao);
        evento.getListaSessoesTematicas().adicionarSessaoTematica(sessaoTematica);

        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);

        int expResult = 2;
        int result = (instance.getListaDecidivelOrganizadorProponente(this.utilizador)).size();
        assertEquals(expResult, result);
    }

    /**
     * Test of getListaTodosRevisores method, of class RegistoEventos.
     */
    @Test
    public void testGetListaTodosRevisores() {
        System.out.println("getListaTodosRevisores");
        RegistoEventos instance = new RegistoEventos();
        instance.adicionarEvento(evento);
        CP cp = new CP();
        
        cp.novoRevisor(utilizador);
        this.evento.adicionarCP(new CP());
        this.evento.getCP().novoRevisor(
                            new Utilizador("fafa", "mmi@gmail.com", "mfmf", "1234"));
        this.st.adicionarCP(cp);
        this.evento.getListaSessoesTematicas().adicionarSessaoTematica(st);
        int expResult = 2;
        int result = instance.getListaTodosRevisores().size();
        assertEquals(expResult, result);
    }

}
