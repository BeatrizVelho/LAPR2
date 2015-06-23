package eventoscientificos.model;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * decidir as submissões do decidivel pelos revisores da CP, ficando obrigadas a
 * implementar um processo referente ao mesmo.
 * 
 * @author G01
 */
public interface Decidivel {
    
    /**
     * Constrói instância de ProcessoDecisao.
     */
    public ProcessoDecisao novoProcessoDecisao();
    
    /**
     * Adiciona um Processo Distribuição ao Decidivel.
     * 
     * @param processoDecisao Processo decisão a adicionar.
     * @return Verdadeiro caso adicione e falso se não adicionar.
     */
    public boolean adicionarProcessoDecisao(ProcessoDecisao processoDecisao);
    
}
