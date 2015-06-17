/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * distribuir as submissões do distribuível pelos revisores da CP, segundo
 * diferentes critérios.
 *
 * @author G01
 */
public interface MecanismoDistribuicao {

    /**
     * Distribui as revisões.
     */
    public boolean distribuirRevisoes(Distribuivel distribuivel, ListaRevisoes lr);
}
