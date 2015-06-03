/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.EventoState;

/**
 *
 * @author Soraia
 */
public interface EventoState {

    public boolean setCriado();

    public boolean setRegistado();

    public boolean setSessoesTematicasDefinidas();

    public boolean setCPDefinida();

    public boolean setEmSubmissao();

    public boolean setEmDetecao();

    public boolean setEmLicitacao();

    public boolean setEmDistribuicao();

    public boolean setEmRevisao();

    public boolean setFaseDecisao();

    public boolean setEmSubmissaoCameraReady();

    public boolean setCameraReady();

    public boolean valida();
}
