/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model.state.evento;

import eventoscientificos.model.Evento;

/**
 * Representa uma instância de EventoCriadoState tendo acesso ao respetivo
 * Evento através do objeto Evento que tem como atributo.
 *
 * @author G01
 */
public class EventoCriadoState implements EventoState {

    /**
     * Instancia de Evento
     */
    private Evento e;

    /**
     * Constroi uma instância de EventoCriadoState recebendo um Evento como
     * parametro.
     *
     * @param e objeto evento
     */
    public EventoCriadoState(Evento e) {
        this.e = e;
    }

    /**
     * Modifica o estado do evento para o estado Evento Criado
     *
     * @return verdadeiro pois corresponde ao estado atual
     */
    @Override
    public boolean setCriado() {
        return true;
    }

    /**
     * Modifica o estado do evento para o estado Evento Registado
     *
     * @return verdadeiro se mudou de estado e falso se nao mudou de estado
     */
    @Override
    public boolean setRegistado() {
        if (validarEstado()) {
            e.setEstado(new EventoRegistadoState(this.e));
            return true;
        }
        return false;
    }

    /**
     * Modifica o estado do evento para o estado Evento Sessoes Tematicas
     * Definidas
     *
     * @return falso visto ja se encontrar num estado anterior
     */
    @Override
    public boolean setSessoesTematicasDefinidas() {
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
     * validarEstado se cumpre as condicoes necessarias para efetuar a mudanca
     * de estado pretendida
     *
     * @return verdadeiro se poder passar de estado e falso se nao cumprir as
     * condicoes necessarias de mudanca de estado
     */
    @Override
    public boolean validarEstado() {
        return this.e.temOrganizadores();
    }

    /**
     * Valida se o evento se encontra num estado válido para ser removido
     *
     * @return verdadeiro se estiver no estado correto e falso se não estiver
     */
    @Override
    public boolean isStateValidoParaRemover() {
        return (!(setCriado() || setRegistado() || setSessoesTematicasDefinidas() || setCPDefinida() || setCameraReady()));

    }

    /**
     * Valida se o evento se encontra num estado válido para submeter artigos
     *
     * @return verdadeiro se estiver no estado correto e falso se não estiver
     */
    @Override
    public boolean isStateValidoParaSubmeter() {
        return setEmSubmissao();

    }

    /**
     * Valida se o evento se encontra num estado válido para efetuar alterações
     * nos artigos
     *
     * @return verdadeiro se estiver no estado correto e falso se não estiver
     */
    @Override
    public boolean isStateValidoParaAlterar() {
        return setEmSubmissao();

    }

    /**
     * Valida se o evento se encontra num estado válido para os revisores
     * licitarem as artigos
     *
     * @return verdadeiro se estiver no estado correto e falso se não estiver
     */
    @Override
    public boolean isStateValidoParaLicitar() {
        return setEmLicitacao();
    }

    /**
     * Valida se o evento se encontra num estado válido para distribuir revisões
     *
     * @return verdadeiro se estiver no estado correto e falso se não estiver
     */
    @Override
    public boolean isStateValidoParaDistribuir() {
        return setEmDistribuicao();
    }
}
