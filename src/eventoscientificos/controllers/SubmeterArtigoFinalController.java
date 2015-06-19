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
public class SubmeterArtigoFinalController {

    /**
     * Instância de empresa.
     */
    private Empresa empresa;
    
    /**
     * Lista de Submissiveis  que estão a aceitar a submissão de artigos finais.
     */
    private List<Submissivel> listaSubmissivesAceitarArtigoFinal;
    
    /**
     * Instância de Submissivel.
     */
    private Submissivel submissivel;
    
    /**
     * Lista de submissões aceites do utilizador.
     */
    private List<Submissao> listaSubmissoesAceiteUtilizador;
    
    /**
     * Instância de submissao.
     */
    private Submissao submissao;
    
    /*
    Instância de artigo.
    */
    private Artigo artigo;
    
    /**
     * Instância de registo de utilizadores.
     */
    private RegistoUtilizadores registoUtilizadores;
    
    /**
     * Instância de lista de autores.
     */
    private ListaAutores listaAutores;
    
    /**
     * Lista de autores registados.
     */
    private List<Autor> listaAutoresRegistados;
    
    /**
     * Instância de Lista de Submissões.
     */
    private ListaSubmissoes listaSubmissoes;

    /**
     * Constrói uma instância de SubmeterArtigoFinalController.
     * 
     * @param empresa Empresa.
     */
    public SubmeterArtigoFinalController(Empresa empresa) {
        this.empresa = empresa;
        this.artigo = null;
        this.listaAutores = null;
        this.listaAutoresRegistados = null;
        this.listaSubmissivesAceitarArtigoFinal = null;
        this.listaSubmissoes = null;
        this.listaSubmissoesAceiteUtilizador = null;
        this.registoUtilizadores = null;
        this.submissao = null;
        this.submissivel = null;
    }

    /**
     * Devolve uma lista de Submissiveis que estão a aceitar submissoes de artigos
     * finais
     * 
     * @return Lista de Submissiveis.
     */
    public boolean getListaSubmissiveisAceitarArtigoFinal() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();

        this.listaSubmissivesAceitarArtigoFinal
                = registoEventos.getListaSubmissiveisAceitarArtigoFinal(
                        this.empresa.getUtilizadorAutenticado());

        return registoEventos != null && listaSubmissivesAceitarArtigoFinal != null;
    }

    /**
     * 
     * @param indice Indice do submissivel selecionado
     */
    public boolean selecionarSubmissivel(int indice) {
        this.submissivel = this.listaSubmissivesAceitarArtigoFinal.get(indice);
        this.listaSubmissoes = this.submissivel.getListaSubmissoes();
        this.listaSubmissoesAceiteUtilizador = listaSubmissoes.
                getListaSubmissoesUtilizador(this.empresa.getUtilizadorAutenticado());

        return this.submissivel != null && listaSubmissoes != null
                && this.listaSubmissivesAceitarArtigoFinal != null;
    }

    /**
     * Cria um novo artigo na submissão selecionada.
     * 
     * @param indice Indice da submissao.
     */
    public boolean selecionarSubmissaoAceite(int indice) {
        this.submissao = this.listaSubmissoesAceiteUtilizador.get(indice);
        this.artigo = this.submissao.novoArtigo();

        return this.submissao != null;
    }

    /**
     * Modifica os dados do artigo.
     *
     * @param titulo Titulo do Artigo.
     * @param resumo Resumo do Artigo.
     */
    public boolean adicionarDadosArtigoFinal(String titulo, String resumo) {
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
    public boolean novoAutor(String nome, String email, String instituicaoAfiliacao) {
        Utilizador utilizador = this.registoUtilizadores.getUtilizador(email);

        if (utilizador == null) {
            return this.listaAutores.novoAutor(
                    nome, email, new InstituicaoAfiliacao(instituicaoAfiliacao));
        } else {
            return this.listaAutores.novoAutor(utilizador,
                    new InstituicaoAfiliacao(instituicaoAfiliacao));
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
