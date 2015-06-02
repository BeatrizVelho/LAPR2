/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

/**
 * Representa uma instância de Empresa através de RegistoUtilizadores.
 * @author G01
 */
public class Empresa {
    /**
     * Representa uma instancia de RegistoUtilizadores que representa uma lista 
     * de utilizadores do sistema
     */
    private RegistoUtilizadores ru;

    /**
     * Devolve RegistoUtilizadores
     * 
     * @return RegistoUtilizadores
     */
    public RegistoUtilizadores getRegistoUtilizador() {
        return ru;
    }
   
    
}
