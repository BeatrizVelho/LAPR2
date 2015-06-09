package eventoscientificos.model;

import eventoscientificos.state.submissao.SubmissaoAceiteState;
import eventoscientificos.state.submissao.SubmissaoCriadaState;
import eventoscientificos.state.submissao.SubmissaoEmSubmissaoState;
import eventoscientificos.state.submissao.SubmissaoState;

/**
 * @author G01
 */
public class Submissao {

    /**
     * Artigo da Submissão Inicial.
     */
    private Artigo artigoInicial;

    /**
     * Artigo da Submissão Final.
     */
    private Artigo artigoFinal;

    /**
     * Autor Correspondente do artigoInicial.
     */
    private AutorCorrepondente autorCorrespondente;

    /**
     * Autor que realiza a submissão inicial.
     */
    private Autor autorSubmissorInicial;

    /**
     * Autor que realiza a submissão final.
     */
    private Autor autorSubmissorFinal;

    /**
     * Estado da submissao.
     */
    private SubmissaoState estado;

    /**
     *
     */
    public Submissao() {
        this.artigoInicial = new Artigo();
        setEstado(new SubmissaoCriadaState(this));
    }

    /**
     * Devolve o artigo da submissão inicial.
     *
     * @return Artigo da submissão inicial
     */
    public Artigo getArtigoInicial() {
        return this.artigoInicial;
    }

    /**
     * Devolve o artigo da submissão final.
     *
     * @return Artigo da submissão final
     */
    public Artigo getArtigoFinal() {
        return this.artigoFinal;
    }

    /**
     * Devolve o autor correspondente da submissao
     *
     * @return Autor correspondente da submissao
     */
    public AutorCorrepondente getAutorCorrespondente() {
        return this.autorCorrespondente;
    }

    /**
     * Devolve o autor submissor que realiza a submissão inicial.
     *
     * @return Autor que realiza a submissão inicial.
     */
    public Autor getAutorSubmissorInicial() {
        return this.autorSubmissorInicial;
    }

    /**
     * Devolve o autor submissor que realiza a submissão final.
     *
     * @return Autor que realiza a submissão final.
     */
    public Autor getAutorSubmissorFinal() {
        return this.autorSubmissorFinal;
    }

    /**
     * Devolve o estado da submissão.
     *
     * @return Estado da submissão.
     */
    public SubmissaoState getEstado() {
        return this.estado;
    }

    /**
     * Modifica o artigo da submissao inicial.
     *
     * @param artigoInicial Artigo da submissao inicial.
     */
    public void setArtigoInicial(Artigo artigoInicial) {
        this.artigoInicial = artigoInicial;
    }

    /**
     * Modifica o artigo da submissao final.
     *
     * @param artigoFinal Artigo da submissao final.
     */
    public void setArtigoFinal(Artigo artigoFinal) {
        this.artigoFinal = artigoFinal;
    }

    /**
     * Modifica o autor correspondente da submissão.
     *
     * @param autorCorrespondente Novo autor correspondente do artigoInicial.
     */
    public void setAutorCorrespondente(AutorCorrepondente autorCorrespondente) {
        this.autorCorrespondente = autorCorrespondente;
    }

    /**
     * Modifica o autor submissor da submissão inicial.
     *
     * @param autorSubmissorInicial Novo autor submissor inicial.
     */
    public void setAutorSubmissorInicial(Autor autorSubmissorInicial) {
        this.autorSubmissorInicial = autorSubmissorInicial;
    }

    /**
     * Modifica o autor submissor da submissão final.
     *
     * @param autorSubmissorFinal Novo autor submissor final.
     */
    public void setAutorSubmissorFinal(Autor autorSubmissorFinal) {
        this.autorSubmissorFinal = autorSubmissorFinal;
    }

    /**
     * Modifica o estado da submissao.
     *
     * @param estado Novo estado da submissao.
     */
    public void setEstado(SubmissaoState estado) {
        this.estado = estado;
    }

    /**
     * Valida a Submissão, verificando se todos os seus atributos se encontram
     * devidamente preenchidos.
     *
     * @return Verdadeiro se o objeto for válido e falso caso não seja.
     */
    public boolean validarSubmissao() {
        if (this.estado instanceof SubmissaoCriadaState) {
            this.estado.setEmSubmissao();
        }
        
        return true;
    }

    public boolean adicionarArtigo(Artigo artigo) {
        if (this.estado instanceof SubmissaoEmSubmissaoState) {
            setArtigoInicial(artigo);
        }
        if (this.estado instanceof SubmissaoAceiteState) {
            setArtigoFinal(artigo);

            return this.estado.setEmCameraReady();
        }

        return true;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, artigoInicial.
     *
     * @param outroObjecto Submissao que vai ser comparado.
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

        Submissao outraSubmissao = (Submissao) outroObjecto;

        return this.getArtigoInicial().equals(outraSubmissao.getArtigoInicial())
                && this.getArtigoFinal().equals(outraSubmissao.getArtigoFinal());
    }
}
