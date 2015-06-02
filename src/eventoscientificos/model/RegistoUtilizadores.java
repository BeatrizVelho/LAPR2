/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instancia de RegistoUtilizadores que representa uma lista de
 * utilizadores do sistema
 *
 * @author G01
 */
public class RegistoUtilizadores {

    /**
     * Lista de Utilizadores do sistema
     */
    private List<Utilizador> listaUtilizadores;

    /**
     * Constrói uma instância de RegistoUtilizadores sem parametros.
     */
    public RegistoUtilizadores() {

        this.listaUtilizadores = new ArrayList<>();
    }

    /**
     * Cria uma instancia de utilizador recebendo como parametros o nome, o
     * email, o username e password do utilizador a criar
     *
     * @param nome nome do utilizador a criar
     * @param email email do utilizador a criar
     * @param username username do utilizador a criar
     * @param password password do utilizado a criar
     * @return Utilizador
     */
    public Utilizador novoUtilizador(String nome, String email, String username, String password) {
        boolean utilizadorValido = false;
        Utilizador u = new Utilizador(nome, email, username, password);
        try {
            if (u.validaUtilizador() && validarUtilizador(u)) {
                utilizadorValido = true;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Utilizador invalido!");
        }
        if (utilizadorValido == true) {
            return u;
        } else {
            return null;
        }
    }

/**
 * 
 * @param u
 * @return 
 */
    public boolean adicionaUtilizador(Utilizador u) {
        if (this.listaUtilizadores.add(u)) {
            return true;
        } else {
            return false;
        }
    }
/**
 * 
 * @param u
 * @return 
 */
                    
    private boolean validarUtilizador(Utilizador u) {
        if (!listaUtilizadores.contains(u)) {
            return true;
        } else {
            return false;
        }
    }

}
