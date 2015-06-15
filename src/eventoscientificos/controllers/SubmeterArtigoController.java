package eventoscientificos.controllers;

import eventoscientificos.model.Artigo;
import eventoscientificos.model.AutorCorrepondente;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.InstituicaoAfiliacao;
import eventoscientificos.model.ListaAutores;
import eventoscientificos.model.ListaSubmissoes;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Submissivel;
import eventoscientificos.model.Utilizador;
import java.util.ArrayList;
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

    private Submissivel submissivel;

    private Artigo artigo;

    private ListaAutores listaAutores;
    
    private Submissao submissao;
    
    private ListaSubmissoes listaSubmissoes;

    private RegistoUtilizadores registoUtilizadores;

    public SubmeterArtigoController(Empresa empresa) {
        this.empresa = empresa;
    }

    public List<Submissivel> getListaSubmissiveis() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        List<Submissivel> listaSubmissiveis
                = registoEventos.getListaSubmissiveisAceitarArtigo();

        return listaSubmissiveis;
    }


    /**
     * Modifica o submissivel.
     *
     * @param submissivel Novo submissivel.
     */
    public void selecionarSubmissivel(Submissivel submissivel) {
        this.submissivel = submissivel;
        this.listaSubmissoes = this.submissivel.getListaSubmissoes();
        this.submissao = listaSubmissoes.novaSubmissao();
        this.artigo = submissao.novoArtigo();
        this.listaAutores = artigo.getListaAutores();
    }

    /**
     * Modifica os dados do artigo.
     * 
     * @param titulo Titulo do Artigo.
     * @param resumo Resumo do Artigo.
     */
    public void adicionarDadosArtigo(String titulo, String resumo) {
        this.artigo.setTitulo(titulo);
        this.artigo.setResumo(resumo);
        this.registoUtilizadores = this.empresa.getRegistoUtilizadores();
    }

    /**
     * Devolve uma instancia de autor ou autor registado dependendo dos dados
     * recebidos por parametro.
     *
     * @param nome Nome do autor.
     * @param email Email do autor.
     * @param instituicaoAfiliacao Instituição de Afiliação do autor.
     */
    public void novoAutor(
            String nome, String email, InstituicaoAfiliacao instituicaoAfiliacao) {

        Utilizador utilizador = this.registoUtilizadores.getUtilizador(email);

        if (utilizador == null) {
            this.listaAutores.novoAutor(nome, email, instituicaoAfiliacao);
        } else {
            this.listaAutores.novoAutor(utilizador, instituicaoAfiliacao);
        }
    }
    
    public void getListaAutoresRegistados() {
        this.listaAutores.getListaAutoresRegistados();
    }
    
    public void adicionarAutorCorrespondente(
            AutorCorrepondente autorCorrespondente) {
        this.submissao.setAutorCorrespondente(autorCorrespondente);
    }
    
    public boolean adicionarFicheiroPDF(String ficheiro) {
        this.artigo.setFicheiro(ficheiro);
        return this.listaSubmissoes.validarSubmissao(this.submissao);
    }
    
    public boolean adicionarSubmissao() {
        return this.listaSubmissoes.adicionarSubmissao(this.submissao);
    }
}
