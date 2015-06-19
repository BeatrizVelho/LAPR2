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
     *
     * @return Processo de distribuicao.
     */
    public ProcessoDistribuicao getProcessoDistribuicao();

    /**
     * Verifica se o revisivel contém as condições necessárias para as
     * submissões serem revistas pelos revisores
     *
     * @return verdadeiro cumprir as condições necessárias para rever e falso se
     * não estiver
     */
    public boolean isStateValidoParaRever(Utilizador u);

    /**
     * Devolve a informação se todas as submissões fora revistas.
     *
     * @return verdadeiro se todas submissões já estiverem revistas e falso se
     * não.
     */
    public boolean todasAsSubmissoesRevistas();
}
