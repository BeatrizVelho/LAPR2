package eventoscientificos.model;

import eventoscientificos.model.StateSessaoTematica.SessaoTematicaCriadaState;
import eventoscientificos.model.StateSessaoTematica.SessaoTematicaState;
import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * Representa uma instância de uma sessão temática através de um código único,
 * uma descrição e uma data limite de submissão.
 *
 * @author G01
 */
public class SessaoTematica {

    /**
     * Código único da Sessão Temática.
     */
    private String codigoUnico;

    /**
     * Descrição da Sessão Temática.
     */
    private String descricao;

    /**
     * Data de inicio de submissão da Sessão Temática.
     */
    private Data dataInicioSubmissao;

    /**
     * Data de fim de submissão da Sessão Temática.
     */
    private Data dataFimSubmissao;

    /**
     * Lista de proponentes da sessão temática.
     */
    private List<Proponente> listaProponentes;

    /**
     * CP de sessão temática.
     */
    private CP cp;

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
     */
    public SessaoTematica(
            String codigoUnico,
            String descricao,
            Data dataInicioSubmissao,
            Data dataFimSubmissao) {
        setCodigoUnico(codigoUnico);
        setDescricao(descricao);
        setDataInicioSubmissao(dataInicioSubmissao);
        setDataFimSubmissao(dataFimSubmissao);
        this.listaProponentes = new ArrayList();
        setCp(null);
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
     * Devolve a CP da sessão temática.
     *
     * @return CP da sessão temática.
     */
    public CP getCP() {
        return this.cp;
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
        if (!dataFinalSubmissao.isMaior(this.dataInicioSubmissao)) {
            throw new IllegalArgumentException("A data de fim de submissão não"
                    + "pode ser menor que a data de inicio de submissão.");
        }

        this.dataFimSubmissao = dataFinalSubmissao;
    }
    
    /**
     * Modifica a CP da sessão temática.
     *
     * @param cp Nova CP da sessão temática.
     */
    public void setCp(CP cp) {
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
        return this.estado.setRegistada();
    }

    /**
     * Cria uma instância de CP vazia.
     *
     * @return CP
     */
    public CP novaCp() {
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
        setCp(cp);

        return this.estado.setCPDefinida();
    }

}
