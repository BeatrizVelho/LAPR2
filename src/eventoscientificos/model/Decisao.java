package eventoscientificos.model;

/**
 *
 * @author G01
 */
public class Decisao {
    
    /**
     * Classificação.
     */
    private int classificacao;
    
    /**
     * Instância de submissão.
     */
    private Submissao submissao;

    /**
     * Constrói uma instância de Decisao
     * 
     * @param classificacao Classificação associado à submissão.
     * @param submissao Submissão associado à decisão.
     */
    public Decisao(int classificacao, Submissao submissao) {
        this.classificacao = classificacao;
        this.submissao = submissao;
    }
    
    
    
}
