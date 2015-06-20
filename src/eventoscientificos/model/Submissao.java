package eventoscientificos.model;

import eventoscientificos.model.state.submissao.SubmissaoAceiteState;
import eventoscientificos.model.state.submissao.SubmissaoCriadaState;
import eventoscientificos.model.state.submissao.SubmissaoEmCameraReadyState;
import eventoscientificos.model.state.submissao.SubmissaoEmSubmissaoState;
import eventoscientificos.model.state.submissao.SubmissaoRemovidaState;
import eventoscientificos.model.state.submissao.SubmissaoState;

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
    private AutorCorrespondente autorCorrespondente;

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
     * Constói uma instância de Submissão.
     */
    public Submissao() {
        setEstado(new SubmissaoCriadaState(this));
    }

    /**
     * Constrói uma instância de submissao recebendo uma outra submissao.
     *
     * @param submissao Submissao que irá ser copiada.
     */
    public Submissao(Submissao submissao) {
        setArtigoInicial(submissao.getArtigoInicial());
        setArtigoFinal(submissao.getArtigoFinal());
        setAutorCorrespondente(submissao.getAutorCorrespondente());
        setAutorSubmissorInicial(submissao.getAutorSubmissorInicial());
        setAutorSubmissorFinal(submissao.getAutorSubmissorFinal());
        setEstado(submissao.getEstado());
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
    public AutorCorrespondente getAutorCorrespondente() {
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
    public void setAutorCorrespondente(AutorCorrespondente autorCorrespondente) {
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
     * Cria e retorna uma instância de Artigo
     *
     * @return Artigo com os dados vazios
     */
    public Artigo novoArtigo() {
        if (getEstado() instanceof SubmissaoCriadaState) {
            return this.artigoInicial = new Artigo();
        }

        return this.artigoFinal = new Artigo();
    }

    /**
     * Altera o estado da submissão para EmSubmissão.
     *
     * @return Verdadeiro
     */
    public boolean alterarEstadoSubmissao() {
        if (this.estado instanceof SubmissaoCriadaState) {
            this.estado.setEmSubmissao();
        }

        return true;
    }

    /**
     * Valida o artigo conforme o estado da Submissao.
     *
     * @return Verdadeiro se o artigo for válido e falso se não for.
     */
    public boolean validarSubmissao() {
        if (this.estado instanceof SubmissaoEmSubmissaoState) {
            this.artigoInicial.validarArtigo();
        }

        if (this.estado instanceof SubmissaoEmCameraReadyState) {
            this.artigoFinal.validarArtigo();
        }

        return true;
    }

    /**
     * Adiciona um artigo conforme o estado da submissao.
     *
     * @param artigo Artigo a ser adicionado.
     * @return Verdadeiro se o atigo for adicionado.
     */
    public boolean adicionarArtigo(Artigo artigo) {
        if (this.estado instanceof SubmissaoEmSubmissaoState) {
            setArtigoInicial(artigo);
        }
        if (this.estado instanceof SubmissaoEmCameraReadyState) {
            setArtigoFinal(artigo);

            return this.estado.setEmCameraReady();
        }

        return true;
    }

    /**
     * Método que através dos atributos de Submissao instancia uma nova
     * Submissao (um clone) usando o construtor cópia.
     *
     * @return Submisado clone.
     */
    public Submissao criarCloneSubmissao() {
        return new Submissao(this);
    }

    public boolean isAutorEmPeriodoSubmissao(Utilizador utilizador) {
        if (this.estado instanceof SubmissaoEmSubmissaoState
                && this.getArtigoInicial().isAutor(utilizador)) {
            return true;
        }

        if (this.estado instanceof SubmissaoEmCameraReadyState
                && this.getArtigoFinal().isAutor(utilizador)) {
            return true;
        }

        return false;
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
                || this.getArtigoFinal().equals(outraSubmissao.getArtigoFinal());
    }

    /**
     * Verifica se a submissao se encontra no estado removida.
     *
     * @return Verdadeiro caso se encontre no estado removido e falso caso não
     * esteja.
     */
    public boolean isStateRemovida() {
        return this.estado instanceof SubmissaoRemovidaState;
    }

    public boolean isAutorArtigoInicial(Utilizador utilizador) {
        if (this.estado instanceof SubmissaoAceiteState
                && getArtigoInicial().isAutor(utilizador)) {
            return true;
        }
        return false;
    }

    /**
     * Valida se a submissão em questão está no estado aceite.
     *
     * @return Verdadeiro caso se encontre no estado aceite e falso caso não
     * esteja.
     */
    public boolean isStateAceite() {
        return estado.setAceite();
    }

    /**
     * Valida se a submissão se encontra no estado em Camera Ready
     *
     * @return verdadeiro se estiver e falso se não estiver no referido estado
     */
    public boolean isStateEmCameraReady() {
        return this.estado.setEmCameraReady();
    }

    /**
     * Verifica se determinado utilizador é autor no artigo.
     *
     * @param utilizador utilizador autenticado no sistema
     * @return verdadeiro se pertencer à lista de autores do artigo e falso se
     * não pertencer
     */
    public boolean isAutorArtigo(Utilizador utilizador) {
        return this.artigoInicial.isAutor(utilizador);
    }

    /**
     * Modifica o estado da submissão para o estado de removida se cumprir todos
     * os requisitos necessários para a mudança
     *
     * @return verdadeiro se mudar de estado para removida e falso se não
     * mudar.F
     */
    public boolean setEstadoRemovida() {
        return this.estado.setRemovida();
    }
}
