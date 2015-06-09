/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.state.evento;

import eventoscientificos.model.Evento;
import utils.Data;

/**
 * Representa uma instância de EventoEmDistribuicaoState tendo acesso ao
 * respetivo Evento através do objeto Evento que tem como atributo.
 *
 * @author G01
 */
public class EventoEmDistribuicaoState implements EventoState {

    /**
     * Instancia de Evento
     */
    private Evento e;

    /**
     * Constroi uma instância de EventoEmDistribuicaoState recebendo um Evento
     * como parametro.
     *
     * @param Evento objeto evento
     */
    public EventoEmDistribuicaoState(Evento e) {
        this.e = e;
    }

    /**
     * Modifica o estado do evento para o estado Evento Criado.
     *
     * @return falso visto ja se encontrar num estado mais avançado.
     */
    @Override
    public boolean setCriado() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Registado.
     *
     * @return falso visto ja se encontrar num estado mais avançado.
     */
    @Override
    public boolean setRegistado() {
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Sessoes Tematicas
     * Definidas.
     *
     * @return falso visto ja se encontrar num estado mais avançado.
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
     * @return verdadeiro pois corresponde ao estado atual
     */
    @Override
    public boolean setEmDistribuicao() {
        return true;
    }

    /**
     * Modifica o estado do evento para o estado Evento Em Revisao
     *
     * @return verdadeiro se puder mudar para o estado EventoEmRevisaoState e
     * falso se não puder
     */
    @Override
    public boolean setEmRevisao() {
        if (validarEstado()) {
            e.setEstado(new EventoEmRevisaoState(e));
            return true;
        }
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
      // implementar quando UC8 completo (precisa-se do processo distribuição)
        return false;
       
    }
}