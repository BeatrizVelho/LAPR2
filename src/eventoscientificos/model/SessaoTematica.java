package eventoscientificos.model;

import eventoscientificos.model.state.sessaotematica.SessaoTematicaCriadaState;
import eventoscientificos.model.state.sessaotematica.SessaoTematicaState;
import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * Representa uma instância de uma sessão temática através de um código único,
 * uma descrição e uma data limite de submissão.
 *
 * @author G01
 */
public class SessaoTematica implements Submissivel, CPDefinivel, Licitavel {

    /**
     * Código único da sessão temática.
     */
    private String codigoUnico;

    /**
     * Descrição da sessão temática.
     */
    private String descricao;

    /**
     * Data de inicio de submissão da sessão temática.
     */
    private Data dataInicioSubmissao;

    /**
     * Data de fim de submissão da sessão temática.
     */
    private Data dataFimSubmissao;

    /**
     * Data de início de distribuição da sessão temática. 
     */
    private Data dataInicioDistribuicao;

    /**
     * Data de fim de submissão CameraReady da sessão temática.
     */
    private Data dataFimSubmissaoCameraReady;

    /**
     * Data de inicio da sessão temática.
     */
    private Data dataInicio;

    /**
     * Data de fim da sessão temática
     */
    private Data dataFim;

    /**
     * Lista de proponentes da sessão temática.
     */
    private List<Proponente> listaProponentes;
    /**
     * Lista de Licitações da sessão temática.
     */
    private ListaLicitacoes listaLicitacoes;
    /**
     * CP de sessão temática.
     */
    private CP cp;

    /**
     * Lista de submissões da sessão temática.
     */
    private ListaSubmissoes listaSubmissoes;

    /**
     * Estado da sessão temática.
     */
    private SessaoTematicaState estado;

    /**
     * Constrói uma instância de uma sessão temática recebendo um código único,
     * uma descrição e uma data limite de submissão.
     *
     * @param codigoUnico Código único da sessão temática.
     * @param descricao Descrição da sessão temática.
     * @param dataInicioSubmissao Data de inicio de submissão da sessão
     * temática.
     * @param dataFimSubmissao Data de fim de submissão da sessão temática.
     * @param dataInicioDistribuicao Data de início de distribuição da sessão
     * temática.
     * @param dataFimSubmissaoCameraReady Data de fim de submissão de artigo 
     * final da sessão temática.
     * @param dataInicio Data de início da sessão temática.
     * @param dataFim Data de fim da sessão temática.
     */
    public SessaoTematica(
            String codigoUnico,
            String descricao,
            Data dataInicioSubmissao,
            Data dataFimSubmissao,
            Data dataInicioDistribuicao,
            Data dataFimSubmissaoCameraReady,
            Data dataInicio,
            Data dataFim) {
        setCodigoUnico(codigoUnico);
        setDescricao(descricao);
        setDataInicioSubmissao(dataInicioSubmissao);
        setDataFimSubmissao(dataFimSubmissao);
        setDataInicioDistribuicao(dataInicioDistribuicao);
        setDataFimSubmissaoCameraReady(dataFimSubmissaoCameraReady);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        this.listaProponentes = new ArrayList();
        this.listaLicitacoes = new ListaLicitacoes();
        setCP(null);
        this.listaSubmissoes = new ListaSubmissoes();
        setEstado(new SessaoTematicaCriadaState(this));

    }

    /**
     * Devolve o código único da sessão temática.
     *
     * @return Código único da sessão temática.
     */
    public String getCodigoUnico() {
        return this.codigoUnico;
    }

    /**
     * Devolve a descrição da sessão temática.
     *
     * @return Descrição da sessão temática.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Devolve a data de inicio de submissão da sessão temática.
     *
     * @return Data de inicio de submissão da sessão temática.
     */
    public Data getDataInicioSubmissao() {
        return this.dataInicioSubmissao;
    }

    /**
     * Devolve a data de fim de submissão da sessão temática.
     *
     * @return Data de fim de submissão da sessão temática.
     */
    public Data getDataFimSubmissao() {
        return this.dataFimSubmissao;
    }

    /**
     * Devolve a data de inicio de distribuição da sessão temática.
     * 
     * @return Data de início de distribuição da sessão temática.
     */
    public Data getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * Devolve a data de inicio de distribuição da sessão temática.
     * 
     * @return Data de início de distribuição da sessão temática.
     */
    public Data getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * Devolve a data de fim de submissão CameraReady da sessão temática.
     *
     * @return Data de fim de submissão CameraReady da sessão temática.
     */
    public Data getDataFimSubmissaoCameraReady() {
        return this.dataFimSubmissaoCameraReady;
    }

    /**
     * Devolve a data de inicio da sessão temática.
     *
     * @return Data de início da sessão temática.
     */
    public Data getDataInicio() {
        return dataInicio;
    }

    /**
     * Devolve a data de fim da sessão temática.
     *
     * @return Data de fim da sessão temática.
     */
    public Data getDataFim() {
        return dataFim;
    }

    /**
     * Devolve a CP da sessão temática.
     *
     * @return CP da sessão temática.
     */
    public CP getCP() {
        return this.cp;
    }

    /**
     * Devolve a lista de submissões da sessão temática.
     *
     * @return Lista de submissões da sessão temática.
     */
    @Override
    public ListaSubmissoes getListaSubmissoes() {
        return this.listaSubmissoes;
    }

    /**
     * Devolve a lista de licitações da sessão temática.
     *
     * @return Lista de licitações da sessão temática
     */
    @Override
    public ListaLicitacoes getListaLicitacoes() {
        return this.listaLicitacoes;
    }

    /**
     * Devolve o estado da sessão temática.
     *
     * @return Estado da sessão temática.
     */
    public SessaoTematicaState getEstado() {
        return this.estado;
    }

    /**
     * Modifica o código único da sessão temática.
     *
     * @param codigoUnico Novo código único da sessão temática.
     */
    public void setCodigoUnico(String codigoUnico) {
        if (codigoUnico.trim().isEmpty()) {
            throw new IllegalArgumentException("O código único da sessão "
                                + "temática não pode estar vazio.");
        }

        this.codigoUnico = codigoUnico;
    }

    /**
     * Modifica a descrição da sessão temática.
     *
     * @param descricao Nova descrição da sessão temática.
     */
    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição da sessão temática"
                                + "não pode estar vazia.");
        }

        this.descricao = descricao;
    }

    /**
     * Modifica a data de inicio de submissão da sessão temática.
     *
     * @param dataInicioSubmissao Nova data de inicio de submissão da sessão
     * temática.
     */
    public void setDataInicioSubmissao(Data dataInicioSubmissao) {
        if (dataInicioSubmissao == null) {
            throw new NullPointerException("A data de inicio de submissão não "
                                + "pode estar vazia.");
        }

        this.dataInicioSubmissao = dataInicioSubmissao;
    }

    /**
     * Modifica a data de fim de submissão da sessão temática.
     *
     * @param dataFinalSubmissao Nova data de fim de submissão da sessão
     * temática.
     */
    public void setDataFimSubmissao(Data dataFinalSubmissao) {
        if (dataFinalSubmissao == null) {
            throw new NullPointerException("A data de fim de submissão não pode"
                                + "estar vazia.");
        }

        this.dataFimSubmissao = dataFinalSubmissao;
    }

    /**
     * Modifica a data de início de distribuição da sessão temática.
     * 
     * @param dataInicioDistribuicao Nova data de início de distribuição da
     * sessão temática.
     */
    public void setDataInicioDistribuicao(Data dataInicioDistribuicao) {
        if (dataInicioDistribuicao == null) {
            throw new NullPointerException("A data de início de distribuição "
                    + "não pode estar vazia.");
        }
        
        this.dataInicioDistribuicao = dataInicioDistribuicao;
    } 

    /**
     * Modifica a data de início de distribuição da sessão temática.
     * 
     * @param dataInicioDistribuicao Nova data de início de distribuição da
     * sessão temática.
     */
    public void setDataInicioDistribuicao(Data dataInicioDistribuicao) {
        if (dataInicioDistribuicao == null) {
            throw new NullPointerException("A data de início de distribuição "
                    + "não pode estar vazia.");
        }
        
        this.dataInicioDistribuicao = dataInicioDistribuicao;
    } 

    /**
     * Modifica a data de fim de submissão da sessão temática.
     *
     * @param dataFimSubmissaoCameraReady Nova data de fim de submissão
     * CameraReady da sessão temática.
     */
    public void setDataFimSubmissaoCameraReady(
                        Data dataFimSubmissaoCameraReady) {
        if (dataFimSubmissaoCameraReady == null) {
            throw new NullPointerException("A data de fim de submissão "
                                + "CameraReady não pode estar vazia.");
        }

        this.dataFimSubmissaoCameraReady = dataFimSubmissaoCameraReady;
    }

    /**
     * Modifica a data de início da sessão temática.
     *
     * @param dataInicio Nova data de início da sessão temática.
     */
    public void setDataInicio(Data dataInicio) {
        if (dataInicio == null) {
            throw new NullPointerException("A data de início não pode estar"
                                + "vazia.");
        }

        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a data de fim da sessão temática.
     *
     * @param dataFim Nova data de fim da sessão temática.
     */
    public void setDataFim(Data dataFim) {
        if (dataFim == null) {
            throw new NullPointerException("A data de fim não pode estar"
                                + "vazia.");
        }

        this.dataFim = dataFim;
    }

    /**
     * Modifica a CP da sessão temática.
     *
     * @param cp Nova CP da sessão temática.
     */
    public void setCP(CP cp) {
        this.cp = cp;
    }

    /**
     * Modifica o estado da sessão temática.
     *
     * @param estado Novo estado da sessão temática.
     */
    public void setEstado(SessaoTematicaState estado) {
        this.estado = estado;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, código único.
     *
     * @param outroObjeto Sessão Temática que vai ser usada na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        SessaoTematica outraSessaoTematica = (SessaoTematica) outroObjeto;

        return this.getCodigoUnico().equals(
                            outraSessaoTematica.getCodigoUnico());
    }

    /**
     * Cria uma instância de proponente através de um utilizador que assume esse
     * papel.
     *
     * @param utilizador Utilizador que assume o papel de proponente.
     * @return Verdadeiro se o proponente for criado e adicionado à lista com
     * sucesso e falso caso não seja.
     */
    public boolean novoProponente(Utilizador utilizador) {
        Proponente proponente = new Proponente(utilizador);

        if (!proponente.validarProponente()) {
            throw new IllegalArgumentException("Não introduziu um proponente"
                                + "válido.");
        }

        if (!validarProponente(proponente)) {
            throw new IllegalArgumentException("O proponente introduzido já"
                                + "se encontra na lista.");
        }

        return adicionarProponente(proponente);
    }

    /**
     * Valida uma instância de proponente verificando se o mesmo já existe numa
     * lista.
     *
     * @param proponente Proponente que vai ser procurado na lista.
     * @return Verdadeiro se o proponente não existir na lista e falso caso
     * exista.
     */
    private boolean validarProponente(Proponente proponente) {
        return !this.listaProponentes.contains(proponente);
    }

    /**
     * Adiciona uma instância de proponente a uma lista.
     *
     * @param proponente Proponente que vai ser adicionado na lista.
     * @return Verdadeiro caso o proponente seja adicionado à lista e falso caso
     * a adição falhe.
     */
    private boolean adicionarProponente(Proponente proponente) {
        return this.listaProponentes.add(proponente);
    }

    /**
     * Valida a sessão temática, verificando se todos os seus atributos se
     * encontram devidamente preenchidos.
     *
     * @return Verdadeiro se o objeto for válido e falso caso não seja.
     */
    public boolean validarSessaoTematica() {
        if (getDataInicioSubmissao().isMaior(getDataFimSubmissao())) {
            throw new IllegalArgumentException("A data de fim de submissão não "
                                + "pode ser menor que a data de inicio de submissão.");
        }

        if (getDataFimSubmissao().isMaior(getDataInicioDistribuicao())) {
            throw new IllegalArgumentException("A data de inicio de distribuição"
                    + " não pode ser menor que a data de fim de submissão.");
        }
        
        if (getDataInicioDistribuicao().isMaior(getDataFimSubmissaoCameraReady())) {
            throw new IllegalArgumentException("A data de fim de submissão "
                    + "CameraReady não pode ser menor que a data de início de"
                    + "distribuição.");
        }
        
        if (getDataInicioDistribuicao().isMaior(getDataFimSubmissaoCameraReady())) {
            throw new IllegalArgumentException("A data de fim de submissão "
                    + "CameraReady não pode ser menor que a data de início de"
                    + "distribuição.");
        }

        if (getDataFimSubmissaoCameraReady().isMaior(getDataInicio())) {
            throw new IllegalArgumentException("A data de início não pode ser"
                    + "menor que a data de submissão CameraReady.");            
        }

        if (getDataInicio().isMaior(getDataFim())) {
            throw new IllegalArgumentException("A data de fim não pode ser menor"
                                + " que a data de inicio.");
        }

        return this.estado.setRegistada();
    }

    /**
     * Cria uma instância de CP vazia.
     *
     * @return CP
     */
    public CP novaCP() {
        return new CP();
    }

    /**
     * Adiciona uma nova CP à sessão temática.
     *
     * @param cp CP a adicionar à sessão temática.
     * @return Verdadeiro caso a CP tenha sido adicionada à sessão temática e
     * falso se a adição falhar.
     */
    public boolean adicionarCP(CP cp) {
        setCP(cp);

        return this.estado.setCPDefinida();
    }

    /**
     * Método que altera o estado da Sessão Temática para em Submissão.
     */
    @Override
    public boolean setEmSubmissao() {
        return this.estado.setEmSubmissao();
    }

    /**
     * Verifica se determinado utilizador é proponente de sessão temática.
     *
     * @param utilizador Utilizador que se pretende verificar.
     * @return Verdadeiro caso seja e falso se não for.
     */
    public boolean isProponente(Utilizador utilizador) {
        for (Proponente proponente : this.listaProponentes) {
            if (utilizador.equals(proponente.getUtilizador())) {
                return true;
            }
        }

        return false;
    }

    /**
     * Verifica se a sessão temática está registada.
     *
     * @return Verdadeira se estiver registada e falso se não estiver.
     */
    public boolean isRegistada() {
        return estado.setRegistada();
    }

    @Override
    public List<Conflito> getConflitoRevisorArtigo(Revisor revisor, Submissao submissao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
