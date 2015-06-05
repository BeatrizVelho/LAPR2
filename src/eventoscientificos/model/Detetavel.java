package eventoscientificos.model;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * guardar todos os conflitos detetados entre revisores e artigos, ficando
 * obrigadas a implementar um processo de deteção.
 * 
 * @author G01
 */
public interface Detetavel {
    
    /**
     * Devolve o Processo de Deteção.
     * 
     * @return Processo de Deteção.
     */
    ProcessoDetecao getProcessoDetecao();

    /**
     * Modifica o Processo de Deteção.
     * 
     * @param processoDetecao Novo Processo de Deteção.
     */
    void setProcessoDetecao(ProcessoDetecao processoDetecao);

    /**
     * Cria uma instância de uma processo de deteção com uma lista de conflitos
     * de interesse vazia.
     * 
     * @return Processo de Deteção.
     */
    ProcessoDetecao novoProcessoDetecao();

    /**
     * Adiciona um Processo de Deteção.
     * 
     * @param processoDetecao Processo de Deteção que vai ser adicionado.
     * @return Verdadeiro se a adição for feita e falso se falhar.
     */
    boolean adicionarProcessoDetecao(ProcessoDetecao processoDetecao);
    
}
