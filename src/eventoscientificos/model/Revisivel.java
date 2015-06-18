
package eventoscientificos.model;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * permitir a revisão de submissões.
 *
 * @author G01
 */
public interface Revisivel {

    /**
     * Devolve o Processo de Distribuicao. 
     * @return Processo de distribuicao.
     */
    public ProcessoDistribuicao getProcessoDistribuicao();
}
