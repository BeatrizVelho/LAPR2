package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoCriadoState;
import eventoscientificos.model.state.evento.EventoEmSubmissaoState;
import eventoscientificos.model.state.evento.EventoRegistadoState;
import eventoscientificos.model.state.evento.EventoSessoesTematicasDefinidasState;
import eventoscientificos.model.state.evento.EventoState;
import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * @author G01
 */
public class Evento implements CPDefinivel, Submissivel, Detetavel, Licitavel {

    /**
     * Título do Evento.
     */
    private String titulo;

    /**
     * Descrição do Evento.
     */
    private String descricao;

    /**
     * Local de Realização do Evento.
     */
    private Local local;

    /**
     * Data de Início de Submissão do Evento.
     */
    private Data dataInicioSubmissao;

    /**
     * Data Fim de Submissão do Evento.
     */
    private Data dataFimSubmissao;

    /**
     * Data de Início de Distribuição do Evento.
     */
    private Data dataInicioDistribuicao;

    /**
     * Data de Fim da Submissao Camera Ready do Evento.
     */
    private Data dataFimSubmissaoCameraReady;

    /**
     * Data de Início do Evento.
     */
    private Data dataInicio;

    /**
     * Data de Fim do Evento.
     */
    private Data dataFim;

    /**
     * Lista de Organizadores do Evento.
     */
    private List<Organizador> listaOrganizadores;

    /**
     * Lista de Sessões Temáticas do Evento.
     */
    private ListaSessoesTematicas listaSessoesTematicas;

    /**
     * Lista de submissões do evento.
     */
    private ListaSubmissoes listaSubmissoes;

    /**
     * Lista de licitações do evento.
     */
    private ListaLicitacoes listaLicitacoes;

    /**
     * Processo de deteção de conflitos do evento.
     */
    private ProcessoDetecao processoDetecao;
    /**
     * CP do evento.
     */
    private CP cp;

    /**
     * Estado do evento.
     */
    private EventoState estado;

    /**
     * Constrói uma instância de evento recebendo um titulo, descricao, local,
     * data de inicio, data de fim, data de inicio de submissao, data fim de
     * submissao, data de inicio de distribuicao.
     *
     * @param titulo Titulo do evento.
     * @param descricao Descricao do evento.
     * @param local Local do evento.
     * @param dataInicioSubmissao Data de inicio de submissao do evento.
     * @param dataFimSubmissao Data fim de submissao do evento.
     * @param dataInicioDistribuicao Data de inicio de distribuicao do evento.
     * @param dataFimSubmissaoCameraReady Data fim da submissao camera ready do
     * evento.
     * @param dataInicio Data de inicio do evento.
     * @param dataFim Data de fim do evento.
     */
    public Evento(String titulo, String descricao, Local local,
                        Data dataInicioSubmissao, Data dataFimSubmissao,
                        Data dataInicioDistribuicao, Data dataFimSubmissaoCameraReady,
                        Data dataInicio, Data dataFim) {
        setTitulo(titulo);
        setDescricao(descricao);
        setLocal(local);
        setDataInicioSubmissao(dataInicioSubmissao);
        setDataFimSubmissao(dataFimSubmissao);
        setDataInicioDistribuicao(dataInicioDistribuicao);
        setDataFimSubmissaoCameraReady(dataFimSubmissaoCameraReady);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        this.listaOrganizadores = new ArrayList();
        this.listaSubmissoes = new ListaSubmissoes();
        this.listaSessoesTematicas = new ListaSessoesTematicas(this);
        this.listaLicitacoes = new ListaLicitacoes();
        this.processoDetecao = new ProcessoDetecao();
        this.cp = null;
        setEstado(new EventoCriadoState(this));
    }

    /**
     * Devolve o título do Evento.
     *
     * @return Titulo do evento.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Devolve a descrição do evento.
     *
     * @return Descrição so evento.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Devolve o local do evento.
     *
     * @return Local do evento.
     */
    public Local getLocal() {
        return this.local;
    }

    /**
     * Devolve a data de inicio de submissao do evento.
     *
     * @return Data de inicio de submissao do evento.
     */
    public Data getDataInicioSubmissao() {
        return this.dataInicioSubmissao;
    }

    /**
     * Devolve a data fim de submissao do evento.
     *
     * @return Data fim de submissao do evento.
     */
    public Data getDataFimSubmissao() {
        return this.dataFimSubmissao;
    }

    /**
     * Devolve a data de inicio de distribuicao do evento.
     *
     * @return Data de inicio de distribuicao do evento.
     */
    public Data getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * Devolve a data fim de submissao camera ready do evento.
     *
     * @return Data fim de submissao camera ready do evento.
     */
    public Data getDataFimSubmissaoCameraReady() {
        return this.dataFimSubmissaoCameraReady;
    }

    /**
     * Devolve a data de inicio do evento.
     *
     * @return Data de inicio do evento.
     */
    public Data getDataInicio() {
        return this.dataInicio;
    }

    /**
     * Devolve a data de fim do evento.
     *
     * @return Data de fim do evento.
     */
    public Data getDataFim() {
        return this.dataFim;
    }

    /**
     * Devolve a lista de sessões temáticas do evento.
     *
     * @return Lista de sessões temáticas do evento.
     */
    public ListaSessoesTematicas getListaSessoesTematicas() {
        return this.listaSessoesTematicas;
    }

    /**
     * Devolve a lista de submissões do evento.
     *
     * @return Lista de submissões do evento.
     */
    @Override
    public ListaSubmissoes getListaSubmissoes() {
        return this.listaSubmissoes;
    }

    /**
     * Devolve a lista de licitações do evento.
     *
     * @return lista de licitações do evento.
     */
    @Override
    public ListaLicitacoes getListaLicitacoes() {
        return this.listaLicitacoes;
    }

    /**
     * Devolve a CP do evento.
     *
     * @return CP do evento.
     */
    @Override
    public CP getCP() {
        return this.cp;
    }

    /**
     * Devolve o estado do evento.
     *
     * @return Estado do evento.
     */
    public EventoState getEstado() {
        return this.estado;
    }

    /**
     * Modifica o titulo do evento.
     *
     * @param titulo Novo titulo do evento.
     */
    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo não pode estar vazio");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica a descricao do evento.
     *
     * @param descricao Nova descricao do evento.
     */
    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode estar vazia");
        }
        this.descricao = descricao;
    }

    /**
     * Modifica o local do evento.
     *
     * @param local Novo local do evento.
     */
    public void setLocal(Local local) {
        this.local = local;
    }

    /**
     * Modifica a data de inicio de submissao do evento.
     *
     * @param dataInicioSubmissao Nova data de inicio de submissao do evento.
     */
    public void setDataInicioSubmissao(Data dataInicioSubmissao) {
        if (dataInicioSubmissao == null) {
            throw new NullPointerException("A data de inicio de submissão não pode"
                                + "estar vazia.");
        }
        if (!dataInicioSubmissao.isMaior(Data.dataAtual())) {
            throw new IllegalArgumentException("Data de inicio de submissao "
                                + "não pode ser menor que a data atual");
        }
        this.dataInicioSubmissao = dataInicioSubmissao;
    }

    /**
     * Modifica a data fim de submissao do evento.
     *
     * @param dataFimSubmissao Nova data fim de submissao do evento.
     */
    public void setDataFimSubmissao(Data dataFimSubmissao) {
        if (dataFimSubmissao == null) {
            throw new NullPointerException("A data de fim de submissão não pode"
                                + "estar vazia.");
        }

        if (!dataFimSubmissao.isMaior(this.dataInicioSubmissao)) {
            throw new IllegalArgumentException("Data de fim de submissao "
                                + "não pode ser menor que a data de inicio de submissao");
        }
        this.dataFimSubmissao = dataFimSubmissao;
    }

    /**
     * Modifica a data de inicio de distribuicao do evento.
     *
     * @param dataInicioDistribuicao Nova data de inicio de distribuicao do
     * evento.
     */
    public void setDataInicioDistribuicao(Data dataInicioDistribuicao) {
        if (dataInicioDistribuicao == null) {
            throw new NullPointerException("A data de inicio de distribuicao não"
                                + " pode estar vazia.");
        }
        if (!dataInicioDistribuicao.isMaior(this.dataFimSubmissao)) {
            throw new IllegalArgumentException("Data de inicio de distribuicao "
                                + "nao pode ser menor que a data de fim de submissao");
        }
        this.dataInicioDistribuicao = dataInicioDistribuicao;
    }

    /**
     * Modifica a data fim de submissao camera ready do evento.
     *
     * @param dataFimSubmissaoCameraReady Nova data fim de submissao camera
     * ready do evento.
     */
    public void setDataFimSubmissaoCameraReady(Data dataFimSubmissaoCameraReady) {
        if (dataFimSubmissaoCameraReady == null) {
            throw new NullPointerException("A data de fim de submissão camera "
                                + "ready não pode estar vazia.");
        }

        if (!dataFimSubmissaoCameraReady.isMaior(this.dataInicioDistribuicao)) {
            throw new IllegalArgumentException("Data de fim de submissao "
                                + "camera ready não pode ser menor que a data "
                                + "de inicio de distribuição.");
        }
        this.dataFimSubmissaoCameraReady = dataFimSubmissaoCameraReady;
    }

    /**
     * Modifica a data de inicio do evento.
     *
     * @param dataInicio Nova data de inicio do evento.
     */
    public void setDataInicio(Data dataInicio) {
        if (dataInicio == null) {
            throw new NullPointerException("A data de inicio do evento não pode"
                                + "estar vazia.");
        }
        if (!dataInicio.isMaior(this.dataInicioDistribuicao)) {
            throw new IllegalArgumentException("Data de inicio do evento "
                                + "nao pode ser menor que a data de inicio de distribuicao");
        }
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a data de fim do evento.
     *
     * @param dataFim Nova data de fim do evento.
     */
    public void setDataFim(Data dataFim) {
        if (dataFim == null) {
            throw new NullPointerException("A data de fim do evento não pode"
                                + "estar vazia.");
        }
        if (!dataFim.isMaior(dataInicio)) {
            throw new IllegalArgumentException("Data de fim do evento "
                                + "nao pode ser menor que a data de inicio");
        }
        this.dataFim = dataFim;
    }

    /**
     * Muda o estado do evento.
     *
     * @param estado Novo estado do evento.
     */
    public void setEstado(EventoState estado) {
        this.estado = estado;
    }

    /**
     * Método que altera o estado do Evento para em Submissão.
     */
    @Override
    public boolean setEmSubmissao() {
        return this.estado.setEmSubmissao();
    }

    /**
     * Modifica a CP do evento.
     *
     * @param cp Nova CP do evento.
     */
    @Override
    public void setCP(CP cp) {
        this.cp = cp;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, titulo.
     *
     * @param outroObjeto Evento que vai ser usado na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        Evento outroEvento = (Evento) outroObjeto;

        return this.getTitulo().equals(outroEvento.getTitulo())
                            && this.getDataInicio().equals(outroEvento.getDataInicio());
    }

    /**
     * Constroi uma instancia de organizador recebendo um utilizador.
     *
     * @param utilizador Utilizador.
     * @return true se o organizador for adicionado a lista de organizadores e
     * false se nao for adicionado.
     */
    public boolean novoOrganizador(Utilizador utilizador) {
        Organizador o = new Organizador(utilizador);
        if (!o.validarOrganizador()) {
            throw new IllegalArgumentException("O organizador não pode estar "
                                + "invalido");
        }
        if (!validarOrganizador(o)) {
            throw new IllegalArgumentException("O organizador introduzido ja "
                                + "se encontra na lista");
        }

        return adicionarOganizador(o);
    }

    /**
     * Verifica se o organizador passado por parametro ja consta na lista de
     * organizadores.
     *
     * @param organizador instancia de organizador a verificar.
     * @return true caso nao conste na lista e false se conste.
     */
    private boolean validarOrganizador(Organizador organizador) {
        return !this.listaOrganizadores.contains(organizador);
    }

    /**
     * Adiciona o organizador passado por parametro a lista de organizadores
     * caso este nao conste na lista.
     *
     * @param o instancia de organizador a adicionar.
     * @return true caso seja adicionado e false se nao for adicionado.
     */
    private boolean adicionarOganizador(Organizador o) {
        return this.listaOrganizadores.add(o);
    }

    /**
     * Valida o Evento, verificando se todos os seus atributos se encontram
     * devidamente preenchidos.
     *
     * @return Verdadeiro se o objeto for válido e falso caso não seja.
     */
    public boolean validarEvento() {
        return this.estado.setRegistado();
    }

    /**
     * Verifica se determinado utilizador é organizador do evento.
     *
     * @param utilizador Utilizador que se pretende verificar.
     * @return Verdadeiro caso seja e falso se não for.
     */
    public boolean isOrganizador(Utilizador utilizador) {
        for (Organizador organizador : this.listaOrganizadores) {
            if (utilizador.equals(organizador.getUtilizador())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Verifica se o evento está num estado que permite criar sessões temáticas.
     *
     * @return Verdadeiro se for possível criar sessões temáticas e falso caso
     * não seja.
     */
    public boolean isRegistadoOuSessoesTematicasDefinidas() {
        return this.getEstado() instanceof EventoRegistadoState
                            || this.getEstado() instanceof EventoSessoesTematicasDefinidasState;
    }

    /**
     * Verifica se existem sessões temáticas definidas no evento.
     *
     * @return Verdadeiro caso existam Sessões Temáticas definidas na
     * ListaSessõesTemáticas e falso caso esteja vazia.
     */
    public boolean temSessoesTematicasDefinidas() {
        return this.listaSessoesTematicas.temSessoesTematicasDefinidas();
    }

    /**
     * Cria uma instância de CP vazia.
     *
     * @return CP
     */
    @Override
    public CP novaCP() {
        return new CP();
    }

    /**
     * Adiciona uma nova CP ao evento.
     *
     * @param cp CP a adicionar ao evento.
     * @return Verdadeiro caso a CP tenha sido adicionada à sessão temática e
     * falso se a adição falhar.
     */
    @Override
    public boolean adicionarCP(CP cp) {
        setCP(cp);

        return this.estado.setCPDefinida();
    }

    /**
     * Verifica se o evento tem sessões temáticas definidas.
     *
     * @return Verdadeiro se tiver sessão temática e falso se não tiver.
     */
    public boolean isSessoesTematicasDefinidas() {
        return estado.setSessoesTematicasDefinidas();
    }

    /**
     * Devolve uma lista de sessões temáticas que se encontrem sem CP definida e
     * onde o utilizador é proponente.
     *
     * @param utilizador Utilizador a verificar se é proponente.
     * @return Lista de sessao temática onde o utilizador é proponente.
     */
    public List<CPDefinivel> getListaCPDefiniveisSemCPOrganizadorProponente(Utilizador utilizador) {
        return listaSessoesTematicas.getListaCPDefiniveisSemCPOrganizadorProponente(utilizador);
    }

    /**
     * Verifica se o Evento está no estado EmSubmissao.
     *
     * @return Verdadeiro se está no estado EmSubmissao e falso se não está.
     */
    @Override
    public boolean isStateValidoParaSubmeter() {
        return getEstado() instanceof EventoEmSubmissaoState;
    }

    /**
     * Verifica se o Evento está no estado EmSubmissao.
     *
     * @return Verdadeiro se está no estado EmSubmissao e falso se não está.
     */
    public boolean isStateValidoParaAlterar() {
        return getEstado() instanceof EventoEmSubmissaoState;
    }

    /**
     * Devolve uma lista de submissiveis nos quais ainda é possivel submeter
     * artigos
     *
     * @return Lista de Submisiveis que aceitam submisoes
     */
    public List<Submissivel> getListaSubmissiveisAceitarArtigo() {
        return this.listaSessoesTematicas.getListaSubmissiveisAceitarArtigo();
    }
//
//    public List<Submissivel> getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(Utilizador utilizador) {
//        return this.listaSessoesTematicas.getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(utilizador);
//    }

    /**
     * Devolve o conflito detetado entre o revisor e o artigo
     *
     * @param revisor revisor associado ao conflito
     * @param submissao submissão associada ao conflito
     * @return conflito detetado na caso de existir e null caso não seja
     * encontrado
     */
    @Override
    public Conflito getConflitoRevisorArtigo(Revisor revisor, Submissao submissao) {
        for (Conflito conflito : this.processoDetecao.getListaConflito()) {
            if (conflito.getRevisor().equals(revisor) && conflito.getSubmissao().equals(submissao)) {
                return conflito;
            }
        }
        return null;
    }

    /**
     * Devolve o processo de deteção do evento
     *
     * @return Processo de deteção
     */
    @Override
    public ProcessoDetecao getProcessoDetecao() {
        return this.processoDetecao;
    }

    /**
     * Modifica o processo de deteção do evento pelo processo recebido por
     * parâmetro
     *
     * @param processoDetecao novo processo de deteção do evento.
     */
    @Override
    public void setProcessoDetecao(ProcessoDetecao processoDetecao) {
        this.processoDetecao = processoDetecao;
    }

    /**
     *
     * @param listaTiposConflito
     */
    @Override
    public void iniciarProcessoDetecao(List<TipoConflito> listaTiposConflito) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Valida se o evento se encontra em periodo de licitação
     *
     * @param u utilizador no sistema
     * @return verdadeiro se estiver em periodo de licitação e falso se não
     * estiver
     */
    public boolean isStateValidoParaLicitar(Utilizador u) {
        if (this.estado.isStateValidoParaLicitar()) {
            if (this.cp.contains(u) && !this.listaLicitacoes.contains(u)) {
                return true;
            }
        }
        return false;
    }
}
