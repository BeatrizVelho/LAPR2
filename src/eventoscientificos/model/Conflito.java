package eventoscientificos.model;

import java.util.List;

/**
 * Representa uma instância de conflito através
 *
 * @author G01
 */
public class Conflito {

    /**
     * Revisor do conflito.
     */
    private Revisor revisor;

    /**
     * Submissão do conflito.
     */
    private Submissao submissao;

    /**
     * Tipo do conflito.
     */
    private List<TipoConflito> ListaTipoConflito;

    /**
     * Constrói uma instância de Conflito recebendo um revisor, uma submissão e
     * um tipo de conflito.
     *
     * @param revisor Revisor do conflito.
     * @param submissao Submissão do conflito.
     * @param listaConflitos lista de Tipos do conflito.
     */
    public Conflito(
                        Revisor revisor, Submissao submissao, List<TipoConflito> listaConflitos) {
        this.revisor = revisor;
        this.submissao = submissao;
        this.ListaTipoConflito = listaConflitos;
    }
/**
 * Devolve o revisor associado ao conflito
 * @return revisor
 */
    public Revisor getRevisor() {
        return revisor;
    }
/**
 * Devolve a submissão associada ao conflito
 * @return submissao
 */
    public Submissao getSubmissao() {
        return submissao;
    }

    /**
     * Devolve os tipos de conflitos associados entre o revisor e artigo
     *
     * @return lista de conflitos
     */
    public List<TipoConflito> getListaTipoConflito() {
        return ListaTipoConflito;
    }
}
