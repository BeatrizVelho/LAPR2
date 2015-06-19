package eventoscientificos.controllers;

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
 * Representa uma instância de SubmeterArtigoController através de uma empresa.
 *
 * @author G01
 */
public class SubmeterArtigoController {

    /**
     * Instância de Empresa.
     */
    private Empresa empresa;

    /**
     * Instância de Submissivel.
     */
    private Submissivel submissivel;

    /**
     * Instncia de Artigo.
     */
    private Artigo artigo;

    /**
     * Intância de Lista de Autores.
     */
    private ListaAutores listaAutores;

    /**
     * Instância de Submissao.
     */
    private Submissao submissao;

    /**
     * Instância de Lista de Submissões.
     */
    private ListaSubmissoes listaSubmissoes;

    /**
     * Intância de Registo de Utiliazadores.
     */
    private RegistoUtilizadores registoUtilizadores;
    
    /**
     * Lista de Submissiveis.
     */
    private List<Submissivel> listaSubmissiveis;
    
    /**
     * Lista de autores registados.
     */
    private List<Autor> listaAutoresRegistados;

    /**
     * Constrói uma instância de SubmeterArtigoController.
     * 
     * @param empresa Empresa.
     */
    public SubmeterArtigoController(Empresa empresa) {
        this.empresa = empresa;
        this.artigo = null;
        this.submissivel = null;
        this.listaAutores = null;
        this.submissao = null;
        this.listaSubmissoes = null;
        this.registoUtilizadores = null;
    }

    /**
     * Devolve uma lista de Submissiveis que estão a aceitar submissoes de artigos
     * 
     * @return Lista de Submissiveis.
     */
    public boolean getListaSubmissiveis() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        this.listaSubmissiveis
                = registoEventos.getListaSubmissiveisAceitarArtigo();

        return registoEventos != null && this.listaSubmissiveis != null;
    }

    /**
     * Cria uma nova submissão no submissível selecionado.
     */
    public boolean selecionarSubmissivel(int indice) {
        this.submissivel = this.listaSubmissiveis.get(indice);
        this.listaSubmissoes = this.submissivel.getListaSubmissoes();
        this.submissao = listaSubmissoes.novaSubmissao();
        this.artigo = submissao.novoArtigo();
        this.listaAutores = artigo.getListaAutores();
        
        return this.submissivel != null && this.listaSubmissoes != null &&
                this.submissao != null && this.artigo != null &&
                this.listaAutores != null;
    }

    /**
     * Modifica os dados do artigo.
     *
     * @param titulo Titulo do Artigo.
     * @param resumo Resumo do Artigo.
     */
    public boolean adicionarDadosArtigo(String titulo, String resumo) {
        this.artigo.setTitulo(titulo);
        this.artigo.setResumo(resumo);
        this.registoUtilizadores = this.empresa.getRegistoUtilizadores();
        
        return this.registoUtilizadores != null;
    }

    /**
     * Devolve uma instancia de autor ou autor registado dependendo dos dados
     * recebidos por parametro.
     *
     * @param nome Nome do autor.
     * @param email Email do autor.
     * @param instituicaoAfiliacao Instituição de Afiliação do autor.
     */
    public boolean novoAutor(
            String nome, String email, InstituicaoAfiliacao instituicaoAfiliacao) {

        Utilizador utilizador = this.registoUtilizadores.getUtilizador(email);

        if (utilizador == null) {
            return this.listaAutores.novoAutor(nome, email, instituicaoAfiliacao);
        } else {
            return this.listaAutores.novoAutor(utilizador, instituicaoAfiliacao);
        }
    }

    /**
     * Devolveuma lista de autores registados.
     * 
     * @return Lista de autores registados.
     */
    public boolean getListaAutoresRegistados() {
        this.listaAutoresRegistados = this.listaAutores.getListaAutoresRegistados();
        return this.listaAutoresRegistados != null;
    }

    /**
     * Modifica o autor correspondente da submissão.
     */
    public boolean adicionarAutorCorrespondente(int indice) {
        Autor autor = this.listaAutoresRegistados.get(indice);
        AutorCorrespondente autorCorrespondente = new AutorCorrespondente(
                autor.getUtilizador(), autor.getInstituicaoAfiliacao());
        this.submissao.setAutorCorrespondente(autorCorrespondente);
        
        return autorCorrespondente != null;
    }

    /**
     * Modifica o ficheiro da submissão.
     * 
     * @param ficheiro Ficheiro da submissão.
     * @return Verdadeiro se o ficheiro for válido e falso se não for.
     */
    public boolean adicionarFicheiroPDF(String ficheiro) {
        this.artigo.setFicheiro(ficheiro);
        return this.listaSubmissoes.validarSubmissao(this.submissao);
    }

    /**
     * Adiciona uma submissão ao Submissível selecionado.
     * 
     * @return Verdaeiro se a submissao for adicionada e falso se não for.
     */
    public boolean adicionarSubmissao() {
        return this.listaSubmissoes.adicionarSubmissao(this.submissao);
    }
}

