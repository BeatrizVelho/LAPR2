package eventoscientificos.controllers;

import eventoscientificios.view.ModeloListaAutores;
import eventoscientificos.model.Artigo;
import eventoscientificos.model.Autor;
import eventoscientificos.model.AutorCorrespondente;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.InstituicaoAfiliacao;
import eventoscientificos.model.ListaAutores;
import eventoscientificos.model.ListaSubmissoes;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Submissivel;
import eventoscientificos.model.Utilizador;
import java.util.List;

/**
 * @author G01
 */
public class AlterarSubmissaoController {

    /**
     * Intancia de Empresa.
     */
    private Empresa empresa;
    
    /**
     * Instância de registo eventos.
     */
    private RegistoUtilizadores registoUtilizadores;
    
    /**
     * Lista de Submissiveis.
     */
    private List<Submissivel> listaSubmissiveis;

    /**
     * Submissivel que tem a submissao pretendida para alterar.
     */
    private Submissivel submissivel;
    
    /**
     * Instância de lista de submissões.
     */
    private ListaSubmissoes listaSubmissoes;

    /**
     * Lista de Submissoes do utilizador.
     */
    private List<Submissao> listaSubmissoesUtilizador;

    /**
     * Instancia de submissao.
     */
    private Submissao submissao;
    
    /**
     * Instância de submissao.
     */
    private Submissao submissaoClone;
    
    /**
     * Instância de artigo.
     */
    private Artigo artigoClone;

    /**
     * Instância de lista de autores.
     */
    private ListaAutores listaAutoresClone;

    /**
     * Modelo da lista de autores.
     */
    private ModeloListaAutores modeloLista;
    
    /**
     * Lista de autores registados.
     */
    private List<Autor> listaAutoresRegistadosClone;

    /**
     * Constrói uma instância de AlterarSubmissaoController recebendo uma
     * empresa por parametro.
     *
     * @param empresa Empresa.
     */
    public AlterarSubmissaoController(Empresa empresa) {
        this.empresa = empresa;;
        this.registoUtilizadores = empresa.getRegistoUtilizadores();
        this.listaSubmissiveis = null;
        this.submissivel = null;
        this.listaSubmissoes = null;
        this.listaSubmissoesUtilizador = null;
        this.submissao = null;
        this.submissaoClone = null;
        this.artigoClone = null;
        this.listaAutoresClone = null;
        this.modeloLista = null;
        this.listaAutoresRegistadosClone = null;
    }

    /**
     * Devolve a lista de submissiveis a aceitar artigos com submissão do
     * utilizador.
     * 
     * @return Lista de submissíveis a aceitar artigos com submissão do
     * utilizador.
     */
    public List<Submissivel> getListaSubmissiveis() {
        return this.listaSubmissiveis;
    }

    /**
     * Devolve a lista de submissões do utilizador dentro de um submissivel.
     * 
     * @return Lista de submissões do utilizador dentro de um submissivel.
     */
    public List<Submissao> getListaSubmissoes() {
        return this.listaSubmissoesUtilizador;
    }

    /**
     * Devolve o titulo do artigo.
     * 
     * @return Titulo do artigo.
     */
    public String getArtigoTitulo() {
        return this.artigoClone.getTitulo();
    }

    /**
     * Devolve o resumo do artigo
     * 
     * @return Resumo do artigo.
     */
    public String getArtigoResumo() {
        return this.artigoClone.getResumo();
    }

    /**
     * Devolve as palavras-chave do artigo.
     * 
     * @return Lista de palavras-chave do artigo.
     */
    public List<String> getArtigoPalavrasChave() {
        return this.artigoClone.getPalavrasChave();
    }

    /**
     * Devolve o modelo da lista de autores do artigo.
     * 
     * @return Modelo da lista de autores do artigo.
     */
    public ModeloListaAutores getModeloListaAutores() {
        return this.modeloLista;
    }

    /**
     * Devolve o caminho para o ficheiro que contém o artigo científico.
     * 
     * @return Caminho para o ficheiro que contém o artigo científico.
     */
    public String getArtigoFicheiro() {
        return this.artigoClone.getFicheiro();
    }

    /**
     * Devolve uma lista de submissiveis nos quais é possivel alterar uma
     * submissao.
     *
     * @return Verdadeiro se o utilizador, registo eventos e lista de
     * submissiveis forem diferente de null
     */
    public boolean getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador() {
        Utilizador utilizadorAutenticado = this.empresa.getUtilizadorAutenticado();
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();

        this.listaSubmissiveis 
                = registoEventos.getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(
                        utilizadorAutenticado);

        return this.listaSubmissiveis != null;
    }

    /**
     *
     * @param indice Indice do submissivel selecionado.
     * @return Verdadeiro se a lista de submissoes e a lista de submisoes do
     * utilizador são diferentes de null.
     */
    public boolean selecionarSubmissivel(int indice) {
        this.submissivel = this.listaSubmissiveis.get(indice);
        this.listaSubmissoes = this.submissivel.getListaSubmissoes();
        this.listaSubmissoesUtilizador
                = listaSubmissoes.getListaSubmissoesUtilizadorEmPeriodoSubmissao(
                        this.empresa.getUtilizadorAutenticado());

        return this.submissivel != null && this.listaSubmissoes != null
                || this.listaSubmissoesUtilizador != null;
    }

    /**
     * Cria um clone da submissao selecionada.
     *
     * @param indice indice da submissao selecionada
     * @return verdadeiro se o artigo, a lista de autores e o registo
     * utilizadores forem diferentes de null.
     */
    public boolean selecionarSubmissao(int indice) {
        this.submissao = this.listaSubmissoesUtilizador.get(indice);
        this.submissaoClone = this.submissao.criarCloneSubmissao();
        this.artigoClone = this.submissaoClone.getArtigoInicial();
        this.listaAutoresClone = this.artigoClone.getListaAutores();
        this.modeloLista = new ModeloListaAutores(this.listaAutoresClone);

        return this.submissao != null && this.submissaoClone != null
                && this.artigoClone != null && this.listaAutoresClone != null
                && this.registoUtilizadores != null;
    }

    /**
     * Modifica o título e o resumo da submissão clone.
     *
     * @param titulo Titulo da submissao clone.
     * @param resumo Resumo da submissao clone.
     * @param palavrasChave Lista das palavras-chave da submissão clone.
     */
    public void alterarDados(String titulo, String resumo, List<String> palavrasChave) {
        this.artigoClone.setTitulo(titulo);
        this.artigoClone.setResumo(resumo);
        this.artigoClone.setPalavrasChave(palavrasChave);
    }

    /**
     * Verifica se o autor já existe na lista de autores.
     * 
     * @param nome Nome do autor.
     * @param email Email do autor
     * @param instituicaoAfiliacao Instituicao de afiliacao do autor.
     */
    public void alterarAutor(String nome, String email,
            String instituicaoAfiliacao) {

        Autor autor = new Autor(nome, email,
                new InstituicaoAfiliacao(instituicaoAfiliacao));
        autor.validarAutor();
    }

    /**
     * Elimina um autor da lista de autores.
     *
     * @param email Email do autor a ser eliminado.
     */
    public void apagarAutor(String email) {
        this.listaAutoresClone.removerAutor(email);
    }

    /**
     * Adiciona um autor à lista de autores.
     *
     * @param nome Nome do autor.
     * @param email Email do autor.
     * @param instituicaoAfiliacao Instituicao de afiliacao do autor.
     */
    public boolean novoAutor(String nome, String email,
            String instituicaoAfiliacao) {
        Utilizador utilizador = this.registoUtilizadores.getUtilizador(email);
        if (utilizador == null) {
            this.listaAutoresClone.novoAutor(nome, email,
                    new InstituicaoAfiliacao(instituicaoAfiliacao));
        } else {
            this.listaAutoresClone.novoAutor(utilizador,
                    new InstituicaoAfiliacao(instituicaoAfiliacao));
        }
        
        return true;
    }

    /**
     * Devolve uma lista de autores registados da lista de autores.
     *
     * @return Lista de autores rgistados.
     */
    public boolean getListaAutoresRegistados() {
        this.listaAutoresRegistadosClone = this.listaAutoresClone.getListaAutoresRegistados();
        return this.listaAutoresRegistadosClone != null;
    }

    /**
     * Modifica o autor correspondente.
     *
     * @param indice Indice do autor nomeado a autor correspondente.
     * 
     * @return Verdadeiro.
     */
    public boolean alterarAutorCorrespondente(int indice) {
        Autor autor = this.listaAutoresRegistadosClone.get(indice);
        AutorCorrespondente autorCorrespondente = 
                new AutorCorrespondente(autor.getUtilizador(), autor.getInstituicaoAfiliacao());
        this.artigoClone.setAutorCorrespondente(autorCorrespondente);
        
        return true;
    }

    /**
     * Modifica o ficheiro.
     *
     * @param ficheiro Novo Ficheiro.
     * 
     * @return Verdadeiro se o ficheiro for um caminho válido e falso caso não
     * seja.
     */
    public boolean alterarFicheiroPDF(String ficheiro) {
        this.artigoClone.setFicheiro(ficheiro);
        
        return true;
    }

    /**
     * Verifica se a submissao é válida e se já existe.
     *
     * @return Verdadeiro se a submissão é válida e se não exista na lista de
     * submissões e falso se não for.
     */
    public boolean validarSubmissao() {
        this.submissaoClone.validarSubmissao();
         
        if (!this.listaSubmissoes.validarCloneSubmissao(this.submissaoClone, this.submissao)) {
            throw new IllegalArgumentException("A submissão já existe na lista.");
        }
        
        return true;
    }

    /**
     * Altera uma Submissão.
     * 
     * @return Verdadeiro se a submissão foi alterada e falso se não foi.
     */
    public boolean alterarSubmissao() {
        return this.listaSubmissoes.alterarSubmissao(this.submissao, this.artigoClone);
    }

}

