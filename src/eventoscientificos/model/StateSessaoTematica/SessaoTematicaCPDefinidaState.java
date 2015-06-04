package eventoscientificos.model.StateSessaoTematica;

import eventoscientificos.model.SessaoTematica;

/**
 * Representa uma instância de SessaoTematicaCPDefinidaState através de uma
 * Sessão Temática.
 *
 * @author G01
 */
public class SessaoTematicaCPDefinidaState implements SessaoTematicaState {

    /**
     * Sessão Temática que adota o estado.
     */
    private SessaoTematica sessaoTematica;

    /**
     * Constrói uma instância de SessaoTematicaCPDefinidaState recebendo uma
     * Sessão Temática.
     * 
     * @param sessaoTematica Sessão Temática que adota o estado. 
     */
    public SessaoTematicaCPDefinidaState(SessaoTematica sessaoTematica) {
        this.sessaoTematica = sessaoTematica;
    }

    @Override
    public boolean setCriada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setRegistada() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCPDefinida() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmSubmissao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmDetecao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmLicitacao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmDistribuicao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmRevisao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setFaseDecisao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setEmSubmissaoCameraReady() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean setCameraReady() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean validarEstado() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
