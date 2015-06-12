package eventoscientificos.model;

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
    private TipoConflito tipoConflito;

    /**
     * Constrói uma instância de Conflito recebendo um revisor, uma submissão e
     * um tipo de conflito.
     * 
     * @param revisor Revisor do conflito.
     * @param submissao Submissão do conflito.
     * @param tipoConflito Tipo do conflito.
     */
    public Conflito(
            Revisor revisor, Submissao submissao, TipoConflito tipoConflito) {
        this.revisor = revisor;
        this.submissao = submissao;
        this.tipoConflito = tipoConflito;
    }   

}
