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
    
    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, classificação e submissão.
     *
     * @param outroObjecto Decisão a comparar.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjecto) {
        if (this == outroObjecto) {
            return true;
        }

        if (outroObjecto == null || this.getClass() != outroObjecto.getClass()) {
            return false;
        }

        Decisao outraDecisao = (Decisao) outroObjecto;

        return this.classificacao == (outraDecisao.classificacao)
                && this.submissao.equals(outraDecisao.submissao);
    }
    
}
