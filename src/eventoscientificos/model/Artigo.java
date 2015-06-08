package eventoscientificos.model;

import java.util.ArrayList;

/**
 * Representa uma instância de Artigo
 *
 * @author G01
 */
public class Artigo {

    /**
     * Título do artigo.
     */
    private String titulo;

    /**
     * Descrição do resumo.
     */
    private String resumo;

    /**
     * Caminho para o artigo.
     */
    private String ficheiro;

    /**
     * Lista de autores.
     */
    private ListaAutores listaAutores;
    
    /**
     * Titulo do artigo por omissão.
     */
    private static final String TITULO_POR_OMISSAO = "Sem Titulo!";

    /**
     * Resumo do artigo por omissão.
     */
    private static final String RESUMO_POR_OMISSAO = "Sem Resumo!";

    /**
     * Caminho para o ficheiro com o artigo por omissão.
     */
    private static final String FICHEIRO_POR__OMISSAO = "Sem Ficheiro!";

    /**
     * Lista de autores do artigo por omissão.
     */
    private static final ListaAutores LISTA_AUTORES_POR_OMISSAO
            = new ListaAutores();

    /**
     * Constroi uma instancia de artigo com o titulo, o resumo e o ficheiro.
     * @param titulo Titulo do artigo.
     * @param resumo Resumo do artigo.
     * @param ficheiro Caminho para o artigo.
     */
    public Artigo(String titulo, String resumo, String ficheiro) {
        setTitulo(titulo);
        setResumo(resumo);
        setFicheiro(ficheiro);
        this.listaAutores = new ListaAutores();
    }
    
    public Artigo() {
        this.titulo = TITULO_POR_OMISSAO;
        this.resumo = RESUMO_POR_OMISSAO;
        this.ficheiro = FICHEIRO_POR__OMISSAO;
        this.listaAutores =  LISTA_AUTORES_POR_OMISSAO;      
    }

    /**
     * Devolve o titulo do artigo.
     *
     * @return Titulo do artigo.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Devolve o resumo do artigo.
     *
     * @return Resumo do artigo.
     */
    public String getResumo() {
        return this.resumo;
    }

    /**
     * Devolve a lista com os autores do artigo.
     *
     * @return Lista dos autores do artigo
     */
    public ListaAutores getListaAutores() {
        return this.listaAutores;
    }

    /**
     * Modifica o titulo do artigo.
     *
     * @param titulo Novo titulo do artigo
     */
    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo do artigo não"
                    + " pode estar vazio.");
        }

        this.titulo = titulo;
    }

    /**
     * Modifica o resumo do artigo.
     *
     * @param resumo Novo resumo do artigo
     */
    public void setResumo(String resumo) {
        if (resumo.trim().isEmpty()) {
            throw new IllegalArgumentException("O resumo do artigo"
                    + " não pode estar vazio.");
        }

        this.resumo = resumo;
    }

    /**
     * Modifica o caminho para o ficheiro com o artigo.
     *
     * @param ficheiro Novo caminho para o ficheiro do artigo.
     */
    public void setFicheiro(String ficheiro) {
        if (ficheiro.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Não submeteu um ficheiro válido.");
        }

        this.ficheiro = ficheiro;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, titulo, resumo, ficheiro, lista
     * de autores.
     *
     * @param outroObjeto Artigo que vai ser comparado.
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

        Artigo outroArtigo = (Artigo) outroObjeto;

        return this.getTitulo().equals(outroArtigo.getTitulo());
    }
    
}
