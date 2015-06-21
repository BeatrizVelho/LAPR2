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
     * 
     * @return ProcessoDecisao
     */
    public ProcessoDecisao novoProcessoDecisao();
    
}
