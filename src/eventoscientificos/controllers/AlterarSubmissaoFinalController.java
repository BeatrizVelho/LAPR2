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
 * @author G01
 */
public class AlterarSubmissaoFinalController {

    /**
     * Instância de empresa.
     */
    private Empresa empresa;

    /**
     * Instânci de utilizador.
     */
    private Utilizador utilizador;

    /**
     * Lista de submissiveis.
     */
    private List<Submissivel> listaSubmissiveis;

    /**
     * Submissivel que tem a submissao pretendida para alterar.
     */
    private Submissivel submissivel;

    /**
     * Instância de lista de submissoes.
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
    private ListaAutores listaAutores;

    /**
     * Instância de registo eventos.
     */
    private RegistoUtilizadores registoUtilizadores;

    /**
     * Lista de autores registados.
     */
    private List<Autor> listaAutoresRegistados;

    /**
     * Constrói uma instância de AlterarSubmissaoFinalController recebendo uma
     * empresa por parametro.
     *
     * @param empresa Empresa.
     */
    public AlterarSubmissaoFinalController(Empresa empresa) {
        this.empresa = empresa;
        this.utilizador = null;
        this.listaSubmissiveis = null;
        this.submissivel = null;
        this.listaSubmissoes = null;
        this.listaSubmissoesUtilizador = null;
        this.submissao = null;
        this.submissaoClone = null;
        this.artigoClone = null;
        this.listaAutores = null;
        this.listaAutoresRegistados = null;
    }

    /**
     * Devolve uma lista de submissiveis nos quais é possivel alterar uma
     * submissao.
     *
     * @return Verdadeiro se o utilizador, registo eventos e lista de
     * submissiveis forem diferente de null
     */
    public boolean getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador() {
        this.utilizador = this.empresa.getUtilizadorAutenticado();
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();

        this.listaSubmissiveis = registoEventos.
                getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(this.utilizador);

        return this.utilizador != null && registoEventos != null
                && this.listaSubmissiveis != null;
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
        this.listaSubmissoesUtilizador = listaSubmissoes.
                getListaSubmissoesUtilizadorEmPeriodoSubmissao(this.utilizador);

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
        this.submissaoClone = submissao.criarCloneSubmissao();
        this.artigoClone = submissaoClone.getArtigoFinal();
        this.listaAutores = artigoClone.getListaAutores();

        this.registoUtilizadores = this.empresa.getRegistoUtilizadores();

        return this.submissao != null && this.submissaoClone != null
                && this.artigoClone != null && this.listaAutores != null
                && this.registoUtilizadores != null;
    }

    /**
     * Modifica o título e o resumo da submissão clone.
     *
     * @param titulo Titulo da submissao clone.
     * @param resumo Resumo da submissao clone.
     */
    public void alterarDados(String titulo, String resumo) {
        this.artigoClone.setTitulo(titulo);
        this.artigoClone.setResumo(resumo);
    }
//
//    /**
//     * Verifica se o autor já existe na lista de autores.
//     * 
//     * @param nome Nome do autor.
//     * @param email Email do autor
//     * @param instituicaoAfiliacao Instituicao de afiliacao do autor.
//     */
//    public void alterarAutor(String nome, String email,
//            String instituicaoAfiliacao) {
//
//        this.aut
//        Autor autor = new Autor(nome, email,
//                new InstituicaoAfiliacao(instituicaoAfiliacao));
//        autor.validarAutor();
//        this.listaAutores.n(autor);
//    }
    
    /**
     * Elimina um autor da lista de autores.
     *
     * @param email Email do autor a ser eliminado.
     */
    public void apagarAutor(String email) {
        this.listaAutores.removerAutor(email);
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
        this.utilizador = this.registoUtilizadores.getUtilizador(email);
        if (this.utilizador == null) {
            this.listaAutores.novoAutor(nome, email,
                    new InstituicaoAfiliacao(instituicaoAfiliacao));
        } else {
            this.listaAutores.novoAutor(utilizador,
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
        this.listaAutoresRegistados = this.listaAutores.getListaAutoresRegistados();
        return this.listaAutoresRegistados != null;
    }

    /**
     * Modifica o autor correspondente.
     *
     * @param indice Indice do autor nomeado a autor correspondente.
     */
    public boolean alterarAutorCorrespondente(int indice) {
        Autor autor = this.listaAutoresRegistados.get(indice);
        AutorCorrespondente autorCorrespondente = 
                new AutorCorrespondente(autor.getUtilizador(), autor.getInstituicaoAfiliacao());
        this.artigoClone.setAutorCorrespondente(autorCorrespondente);
        
        return true;
    }

    /**
     * Modifica o ficheiro.
     *
     * @param ficheiro Novo Ficheiro.
     * @return Verdadeiro se o ficheiro 
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
        return this.submissaoClone.validarSubmissao()
                && this.listaSubmissoes.validarCloneSubmissao(this.submissaoClone, this.submissao);
    }

    /**
     * Altera uma Submissão.
     * @return Verdadeiro se a submissão foi alterada e falso se não foi.
     */
    public boolean alterarSubmissao() {
        return this.listaSubmissoes.alterarSubmissao(this.submissao, this.artigoClone);
    }
}
