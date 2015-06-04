/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.StateSessaoTematica;

import eventoscientificos.model.SessaoTematica;

/**
 *
 * @author Pedro
 */
public class SessaoTematicaCriadaState implements SessaoTematicaState {

    private SessaoTematica sessaoTematica;

    public SessaoTematicaCriadaState(SessaoTematica sessaoTematica) {
        this.sessaoTematica = sessaoTematica;
    }

    /**
     * Método que permite a mudança de estado para Criada.
     *
     * @return Verdadeiro, a sessão temática encontra-se neste estado.
     */
    @Override
    public boolean setCriada() {
        return true;
    }

    /**
     * Método que permite a mudança de estado para CPDefinida.
     *
     * @return Verdadeiro se for possivel alterar o estado para Registada e
     * falso caso não seja.
     */
    @Override
    public boolean setRegistada() {
        if (validarEstado()) {
            this.sessaoTematica.setEstado(
                    new SessaoTematicaRegistadaState(this.sessaoTematica));
            return true;
        }

        return false;
    }

    /**
     * Método que permite a mudança de estado para CPDefinida.
     *
     * @return Falso, não deve ser possível mudar de Criada para CPDefinida.
     */
    @Override
    public boolean setCPDefinida() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmSubmissao.
     *
     * @return Falso, não deve ser possível mudar de Criada para EmSubmissao.
     */
    @Override
    public boolean setEmSubmissao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmDetecao.
     *
     * @return Falso, não deve ser possível mudar de Criada para EmDetecao.
     */
    @Override
    public boolean setEmDetecao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmLicitacao.
     *
     * @return Falso, não deve ser possível mudar de Criada para EmLicitacao.
     */
    @Override
    public boolean setEmLicitacao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmDistribuicao.
     *
     * @return Falso, não deve ser possível mudar de Criada para EmDistribuicao.
     */
    @Override
    public boolean setEmDistribuicao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmRevisão.
     *
     * @return Falso, não deve ser possível mudar de Criada para EmRevisão.
     */
    @Override
    public boolean setEmRevisao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para FaseDecisao.
     *
     * @return Falso, não deve ser possível mudar de Criada para FaseDecisao.
     */
    @Override
    public boolean setFaseDecisao() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para EmSubmissaoCameraReady.
     *
     * @return Falso, não deve ser possível mudar de Criada para
     * EmSubmissaoCameraReady.
     */
    @Override
    public boolean setEmSubmissaoCameraReady() {
        return false;
    }

    /**
     * Método que permite a mudança de estado para CameraReady.
     *
     * @return Falso, não deve ser possível mudar de Criada para CameraReady.
     */
    @Override
    public boolean setCameraReady() {
        return false;
    }

    /**
     * Método que permite validar uma tentativa de mudança de estado.
     *
     * @return Verdadeiro se a mudança for possível e falso caso não seja..
     */
    @Override
    public boolean validarEstado() {
        return true;
    }

}
