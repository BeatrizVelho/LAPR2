package eventoscientificos.model;

/**
 * Representa uma instância de um Revisao através de submissão e revisor.
 *
 * @author G01
 */
public class Revisao {

    /**
     * Instância de submissão.
     */
    private Submissao submissao;

    /**
     * Instância de revisor.
     */
    private Revisor revisor;

    /**
     * Constrói uma instância de revisão através dos valores recebidos por
     * parâmetro
     *
     * @param submissao submissão associado à revisão
     * @param revisor revisor associado à revisão
     */
    public Revisao(Submissao submissao, Revisor revisor) {
        this.submissao = submissao;
        this.revisor = revisor;
    }
///**
// * Modifica o Revisor da revisão
// * @param revisor 
// */
//    public void setRevisor(Revisor revisor) {
//        this.revisor = revisor;
//    }
//
//    public void setSubmissao(Submissao submissao) {
//        this.submissao = submissao;
//    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, submissao e revisor.
     *
     * @param outroObjecto Revisao que vai ser comparado.
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

        Revisao outraRevisao = (Revisao) outroObjecto;

        return this.revisor.equals(outraRevisao.revisor)
                            && this.submissao.equals(outraRevisao.submissao);
    }
}
