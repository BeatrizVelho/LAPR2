/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.EventoState;

import eventoscientificos.model.Evento;
import utils.Data;

/**
 * Representa uma instância de EventoEmRevisaoState tendo acesso ao respetivo
 * Evento através do objeto Evento que tem como atributo.
 *
 * @author G01
 */
public class EventoEmRevisaoState implements EventoState {

    /**
     * Instancia de Evento
     */
    private Evento e;

    /**
     * Constroi uma instância de EventoEmRevisaoState recebendo um Evento como
     * parametro.
     *
     * @param Evento objeto evento
     */
    public EventoEmRevisaoState(Evento e) {
        this.e = e;
    }

    /**
     * Modifica o estado do evento para o estado Evento Criado
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setCriado() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Registado
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setRegistado() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Sessoes Tematicas
     * Definidas
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setSessoesTematicasDefinidas() {
        return false;

    }

    /**
     * Modifica o estado do evento para o estado Evento CP definida
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setCPDefinida() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Submissao
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setEmSubmissao() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Detecao
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setEmDetecao() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Licitacao
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setEmLicitacao() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Distribuicao
     *
     * @return falso visto ja se encontrar num estado mais avançado
     */
    @Override
    public boolean setEmDistribuicao() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Revisao
     *
     * @return verdadeiro pois corresponde ao estado atual
     */
    @Override
    public boolean setEmRevisao() {
        return true;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Fase de Decisao
     *
     * @return verdadeiro se mudou de estado e falso se nao mudou de estado
     */
    @Override
    public boolean setFaseDecisao() {
        if (valida()) {
            e.setEstado(new EventoFaseDecisaoState(e));
            return true;
        }
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
     * valida se cumpre as condicoes necessarias para efetuar a mudanca de
     * estado pretendida
     *
     * @return verdadeiro se poder passar de estado e falso se nao cumprir as
     * condicoes necessarias de mudanca de estado
     */
    @Override
    public boolean valida() {
        // implementar qd houver método no evento/st que pesquise na lista 
        //se submissões em estado revista
        return false;
    }
}
