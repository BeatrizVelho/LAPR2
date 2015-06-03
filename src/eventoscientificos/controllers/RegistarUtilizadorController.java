/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Utilizador;

/**
 * Representa uma instância de RegistarUtilizadorController através de
 * RegistoUtilizadores e Utilizador .
 *
 * @author G01
 */
public class RegistarUtilizadorController {

    /**
     * Instancia de RegistoUtilizadores
     */
    private RegistoUtilizadores ru;

    /**
     * Instancia de Utilizador
     */
    private Utilizador u;

    /**
     * Constrói uma instância de RegistarUtilizadorController recebendo uma
     * empresa por parametro.
     */
    public RegistarUtilizadorController(Empresa empresa) {
        this.ru = empresa.getRegistoUtilizadores();
    }

    /**
     * Devolve instancia de RegistoUtilizadores
     *
     * @return RegistoUtilizadores
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.ru;
    }

    /**
     * Cria uma instancia de Utilizador recebendo como parametro uma String
     * nome, String email, String username,String password
     *
     * @param nome nome do novo utilizador
     * @param email email do novo utilizador
     * @param username username do novo utilizador
     * @param password password do novo utilizador
     * @return nova instancia de utilizador
     */
    public boolean novoUtilizador(String nome, String email, String username,
                        String password) {
        try {
            this.u = ru.novoUtilizador(nome, email, username, password);
        } catch (IllegalArgumentException e) {
            e.getMessage();
            return false;
        }
        return true;
    }

    /**
     * Adiciona a instancia de utilizador a lista de utilizadores do
     * RegistoUtilizadores
     *
     * @return verdadeiro se for adicionado e falso se nao for possivel
     * adiciona-lo
     */
    public boolean adicionarUtilizador() {
        return ru.adicionaUtilizador(this.u);
    }
}
