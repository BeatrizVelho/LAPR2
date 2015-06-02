/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author G01
 */
public class RegistoUtilizadores {

    private List<Utilizador> listaUtilizadores;

    public RegistoUtilizadores() {

        this.listaUtilizadores = new ArrayList<>();
    }

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

    public boolean adicionaUtilizador(Utilizador u) {
        if (this.listaUtilizadores.add(u)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean validarUtilizador(Utilizador u) {
        if (!listaUtilizadores.contains(u)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        RegistoUtilizadores ru = new RegistoUtilizadores();
        Utilizador u = ru.novoUtilizador("susana", "mail@mail.com", "susu", "1234");
        boolean adicionado = ru.adicionaUtilizador(u);
        System.out.println(adicionado);
    }

}
