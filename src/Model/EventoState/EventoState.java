/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.EventoState;

/**
 *
 * @author Soraia
 */
public interface EventoState {

    public boolean setEventoCriado();

    public boolean setEventoRegistado();

    public boolean setEventoSTcriada();

    public boolean setEventoCPCriada();

    public boolean setEventoEmSubmissao();

    public boolean setEventoSubmetido();

    public boolean setEventoEmDetecaoConflitos();

    public boolean setEventoEmLicitacao();

    public boolean setEventoLicitado();

    public boolean setEventoEmDistribuicao();

    public boolean setEventoDistribuido();

    public boolean setEventoFaseDecisao();

    public boolean setEventoDecidico();

    public boolean valida();
}
