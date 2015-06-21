package eventoscientificos.model;

/**
 * Representa uma instância de ProcessoDecisao através de RegistoEventos.
 *
 * @author G01
 */
public class ProcessoDecisao {

    /**
     * Instância de ListaRevisoes.
     */
    private ListaRevisoes listaRevisoes;

    /**
     * Instância de MecanismoDecisao.
     */
    private MecanismoDecisao mecanismoDecisao;

    /**
     * Constroi uma instancia de ProcessoDecisao, sem parâmetros.
     */
    public ProcessoDecisao() {
    }

    /**
     * Constrói uma instância de Processo de Decisão.
     * @param listaRevisoes Lista de Revisoes.
     * @param mecanismoDecisao Mecanismo de Decisao.
     */
    public ProcessoDecisao(ListaRevisoes listaRevisoes, MecanismoDecisao mecanismoDecisao) {
        this.listaRevisoes = new ListaRevisoes();
        this.mecanismoDecisao = mecanismoDecisao;
    }

    /**
     * Devolve a ListaRevisões.
     *
     * @return Lista Revisões
     */
    public ListaRevisoes getListaRevisoes() {
        return this.listaRevisoes;
    }

    /**
     * Adiciona um Mecanismo de Decisão ao processo de decisão.
     *
     * @param mecanismoDecisao Mecanismo de decisão a adicionar.
     * @return Verdadeiro.
     */
    public boolean adicionarMecanismoDecisao(MecanismoDecisao mecanismoDecisao) {
        if (mecanismoDecisao != null) {
            this.mecanismoDecisao = mecanismoDecisao;
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de revisões e mecanismo
     * de decisao.
     *
     * @param outroObjecto Processo de decisão a comparar.
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

        ProcessoDecisao outroProcesso = (ProcessoDecisao) outroObjecto;

        return this.listaRevisoes.equals(outroProcesso.listaRevisoes)
                && this.mecanismoDecisao.equals(outroProcesso.mecanismoDecisao);
    }
}
