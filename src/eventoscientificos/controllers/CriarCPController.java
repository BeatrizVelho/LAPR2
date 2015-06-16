package eventoscientificos.controllers;

import eventoscientificos.model.CP;
import eventoscientificos.model.CPDefinivel;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Utilizador;
import java.util.List;

/**
 * Representa uma instância de CriarCPController através de CPDefinivel.
 *
 * @author G01
 */
public class CriarCPController {

    /**
     * Intancia de Empresa.
     */
    private Empresa empresa;

    /**
     * Instancia de listaCPDefinivel
     */
    private List<CPDefinivel> listaCPDefinivel;

    /**
     * Instancia de CPDefinivel.
     */
    private CPDefinivel cpDefinivel;

    /**
     * Instancia de RegistoUtilizadores.
     */
    private RegistoUtilizadores registoUtilizadores;

    /**
     * Instancia de CP.
     */
    private CP cp;

    /**
     * Constrói uma instância de CriarCPController recebendo uma empresa por
     * parametro.
     *
     * @param empresa Empresa.
     */
    public CriarCPController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Devolve uma lista de eventos/sessão temáticas que se encontrem sem CP
     * definida e onde o utilizador é proponente.
     *
     * @return
     */
    public boolean getListaCPDefiniveisSemCPOrganizadorProponente() {

        RegistoEventos registoEventos = empresa.getRegistoEventos();

        Utilizador utilizador = empresa.getUtilizadorAutenticado();

        this.listaCPDefinivel = registoEventos.
                getListaCPDefiniveisSemCPOrganizadorProponente(utilizador);

        return true;
    }

    /**
     * Seleciona uma CP pelo seu indice.
     *
     * @param indice A procurar.
     * @return
     */
    public boolean selecionarCPDefinivel(int indice) {

        this.cpDefinivel = this.listaCPDefinivel.get(indice);

        this.cp = cpDefinivel.novaCP();

        this.registoUtilizadores = empresa.getRegistoUtilizadores();
       
        return true;
    }

    /**
     * Cria uma instancia de Revisor recebendo como parametro uma String id
     *
     * @param id Id de utilizador do revisor.
     * @return
     */
    public boolean novoRevisor(String id) {
        Utilizador utilizador = this.registoUtilizadores.getUtilizador(id);

        return this.cp.novoRevisor(utilizador);

    }

    /**
     * Valida se a cp já existe.
     *
     * @return Verdadeiro caso a cp seja válida e falso caso não seja.
     */
    public boolean validarCP() {
        return this.cp.validarCP();
    }

    /**
     * Adiciona uma nova CP.
     *
     * @return Verdadeiro caso a CP seja adicionada e falso caso não seja.
     */
    public boolean adicionarCP() {
        return this.cpDefinivel.adicionarCP(cp);

    }

}
