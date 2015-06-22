package eventoscientificos.model;

import java.util.List;
import utils.Data;

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
     * Lista de palavras chave.
     */
    private List<String> palavrasChave;

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
     * Data de submissão do artigo inicial.
     */
    private Data dataSubmissaoInicial;

    /**
     * Data de submissão do artigo final.
     */
    private Data dataSubmissaoFinal;

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
     * Constroi uma instancia de artigo com o titulo, o resumo e o ficheiro.
     *
     * @param titulo Titulo do artigo.
     * @param resumo Resumo do artigo.
     * @param ficheiro Caminho para o artigo.
     */
    public Artigo(String titulo, String resumo, String ficheiro) {
        setTitulo(titulo);
        setResumo(resumo);
        setFicheiro(ficheiro);
        this.listaAutores = new ListaAutores();
        setAutorCorrespondente(getAutorCorrespondente());
        setAutorSubmissorInicial(getAutorSubmissorInicial());
        setAutorSubmissorFinal(getAutorSubmissorFinal());
    }

    public Artigo() {
        this.titulo = TITULO_POR_OMISSAO;
        this.resumo = RESUMO_POR_OMISSAO;
        this.ficheiro = FICHEIRO_POR__OMISSAO;
        this.listaAutores = new ListaAutores();
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
     * Devolve o caminho do ficheiro do artigo
     *
     * @return Caminho do ficheiro do artigo.
     */
    public String getFicheiro() {
        return ficheiro;
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
     * Devolve a lista de palavras de chave.do artigo.
     *
     * @return Lista de palavras chave do artigo.
     */
    public List<String> getPalavrasChave() {
        return palavrasChave;
    }

    /**
     * Devolve a data de submissão do artigo inicial.
     *
     * @return Data de submissaão do artigo inicial.
     */
    public Data getDataSubmissaoInicial() {
        return dataSubmissaoInicial;
    }

    /**
     * Devolve a data de submissão do artigo final.
     *
     * @return Data de submissaão do artigo final.
     */
    public Data getDataSubmissaoFinal() {
        return dataSubmissaoFinal;
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
     * Modifica a lista de palavras chave do artigo.
     *
     * @param palavrasChave Nova lista de palavras chave.
     */
    public void setPalavrasChave(List<String> palavrasChave) {
        this.palavrasChave = palavrasChave;
    }

    /**
     * Modifica a data de submissão do artigo inicial.
     *
     * @param dataSubmissaoInicial Nova data de submissão do artigo inicial.
     */
    public void setDataSubmissaoInicial(Data dataSubmissaoInicial) {
        this.dataSubmissaoInicial = dataSubmissaoInicial;
    }

    /**
     * Modifica a data de submissão do artigo Final.
     *
     * @param dataSubmissaoFinal Nova data de submissão do artigo final.
     */
    public void setDataSubmissaoFinal(Data dataSubmissaoFinal) {
        this.dataSubmissaoFinal = dataSubmissaoFinal;
    }

    /**
     * Verifica se o artigo é válido.
     * 
     * @return Verdadeiro se o artigo é válido e falso se não é.
     */
    public boolean validarArtigo() {
        return true;
    }

    /**
     * Verifica se o utilizador passado por parâmetro está inserido na lista.
     * 
     * @param utilizador Utilizador a verificar.
     * @return Verdadeiro se já existe na lista de autores e falso se não está.
     */
    public boolean isAutor(Utilizador utilizador) {
        return this.listaAutores.isAutor(utilizador);
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
