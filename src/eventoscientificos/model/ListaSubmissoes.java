package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * @author G01
 */
public class ListaSubmissoes {

    /**
     * Lista das submissões.
     */
    private List<Submissao> listaSubmissoes;

    /**
     * Constroi uma instancia de Lista de submissoes em que a lista de
     * submissoes se encontra vazia.
     */
    public ListaSubmissoes() {
        this.listaSubmissoes = new ArrayList();
    }

    /**
     * Devolve a lista de submissões.
     *
     * @return lista de submissões.
     */
    public List<Submissao> getListaSubmissoes() {
        return listaSubmissoes;
    }

    /**
     * Cria e retorna uma instância de submissao.
     *
     * @return Submissao com os dados vazios
     */
    public Submissao novaSubmissao() {
        return new Submissao();
    }

    /**
     * Valida a lista de submissoes verificando se a lista já possui uma
     * submissão igual à passada por parametro.
     *
     * @param submissao Submissao de artigo
     * @return Verdadeiro se a lista de submissoes nao tem a submissao e falso
     * se tiver.
     */
    public boolean validarSubmissao(Submissao submissao) {
        if (submissao.validarArtigo()) {
            return !this.listaSubmissoes.contains(submissao);
        }
        return false;
    }

    /**
     * Adiciona à lista de submissoes a submissao passada por parametro.
     *
     * @param submissao Submissao de artigo
     */
    public boolean adicionarSubmissao(Submissao submissao) {
        submissao.alterarEstadoSubmissao();
        return this.listaSubmissoes.add(submissao);
    }

    /**
     * Devolve uam lista de submissões associadas ao utilizador
     *
     * @param utilizador utilizador a verificar submissões
     * @return lista de submissões do utilizador
     */
    public List<Submissao> getListaSubmissoesUtilizador(Utilizador utilizador) {
        List<Submissao> listaSubmissoesUtilizador = new ArrayList<>();

        for (Submissao submissao : this.listaSubmissoes) {
            if (submissao.isAutor(utilizador)) {
                listaSubmissoesUtilizador.add(submissao);
            }
        }
        return listaSubmissoesUtilizador;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de submissoes.
     *
     * @param outroObjeto ListaSubmissoes que vai ser usada na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        ListaSubmissoes outraListaSubmissoes
                            = (ListaSubmissoes) outroObjeto;

        return this.listaSubmissoes.equals(
                            outraListaSubmissoes.listaSubmissoes);
    }

}
