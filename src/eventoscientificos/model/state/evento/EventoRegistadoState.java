/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.state.evento;

import eventoscientificos.model.Evento;

/**
 * Representa uma instância de EventoRegistadoState tendo acesso ao respetivo
 * Evento através do objeto Evento que tem como atributo.
 *
 * @author G01
 */
public class EventoRegistadoState implements EventoState {

    /**
     * Instancia de Evento
     */
    private Evento e;

    /**
     * Constroi uma instância de EventoRegistadoState recebendo um Evento como
     * parametro.
     *
     * @param Evento objeto evento
     */
    public EventoRegistadoState(Evento e) {
        this.e = e;
    }

    /**
     * Modifica o estado do evento para o estado Evento Criado
     *
     * @return falso visto ja se encontrar num estado avançado
     */
    @Override
    public boolean setCriado() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Registado
     *
     * @return verdadeiro pois corresponde ao estado atual
     */
    @Override
    public boolean setRegistado() {
        return true;
    }

    /**
     * Modifica o estado do evento para o estado Evento Sessoes Tematicas
     * Definidas
     *
     * @return verdadeiro se mudou de estado e falso se nao mudou de estado
     */
    @Override
    public boolean setSessoesTematicasDefinidas() {
        if (validarEstado()) {
            e.setEstado(new EventoSessoesTematicasDefinidasState(this.e));
            return true;
        }
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento CP definida
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setCPDefinida() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Submissao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmSubmissao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Detecao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmDetecao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Licitacao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmLicitacao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Distribuicao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmDistribuicao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Revisao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmRevisao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Fase de Decisao
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setFaseDecisao() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Em Submissao Camera
     * Ready
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setEmSubmissaoCameraReady() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento Camera Ready
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setCameraReady() {
        return false;

    }

    /**
     * validarEstado se cumpre as condicoes necessarias para efetuar a mudanca de
 estado pretendida
     *
     * @return verdadeiro se poder passar de estado e falso se nao cumprir as
     * condicoes necessarias de mudanca de estado
     */
    @Override
    public boolean validarEstado() {
        return this.e.temSessoesTematicasDefinidas();
    }
}