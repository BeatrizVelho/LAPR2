package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Utilizador;
import java.util.Date;
import utils.Data;

/**
 * Representa uma instância de CriarEventoController através de RegistoEventos
 *
 * @author G01
 */
public class CriarEventoController {

    /**
     * Intancia de Empresa.
     */
    private Empresa empresa;

    /**
     * Instancia de RegistoEventos.
     */
    private RegistoEventos registoEventos;

    /**
     * Instancia de Evento.
     */
    private Evento evento;

    /**
     * Instancia de RegistoUtilizadores.
     */
    private RegistoUtilizadores registoUtilizadores;

    /**
     * Constrói uma instância de CriarEventoController recebendo uma empresa por
     * parametro.
     * 
     * @param empresa Empresa.
     */
    public CriarEventoController(Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Cria uma instancia de Evento recebendo como parametro o titulo, 
     * a descricao, o local, a data de inicio de submissao, 
     * a data de fim de submissao, a data de inicio de distribuicao, 
     * date de inicio do evento e data d fim do evento.
     * 
     * @param titulo Titulo do evento.
     * @param descricao Descricao do evento.
     * @param local Local do evento.
     * @param dataInicioSubmissao Data de Inicio de Submissão do Evento.
     * @param dataFimSubmissao Data de Fim de Submissão do Evento.
     * @param dataInicioDistribuicao Data de Inicio de Distribuição do Evento.
     * @param dataInicio Data de Início do Evento.
     * @param dataFim Data de Fim do Evento.
     */
    public void novoEvento(String titulo, String descricao, Local local,
            Data dataInicioSubmissao, Data dataFimSubmissao,
            Data dataInicioDistribuicao, Data dataFimSubmissaoCameraReady,
            Data dataInicio, Data dataFim) {

        this.registoEventos = this.empresa.getRegistoEventos();

        this.evento = this.registoEventos.novoEvento(titulo, descricao, local,
                dataInicioSubmissao, dataFimSubmissao, dataInicioDistribuicao, 
                dataFimSubmissaoCameraReady, dataInicio, dataFim);
        this.registoUtilizadores = this.empresa.getRegistoUtilizadores();
    }

    /**
     * Cria uma instancia de Organizador recebendo como parametro uma String id
     *
     * @param id Id de utilizador do organizador.
     */
    public void novoOrganizador(String id) {
        Utilizador utilizador = this.registoUtilizadores.getUtilizador(id);
        this.evento.novoOrganizador(utilizador);
    }

    public void validarEvento() {
        if (evento.validarEvento()) {
            this.registoEventos.validarEvento(evento);
        }
    }
    
    public void adicionarEvento(Evento evento) {
        this.registoEventos.adicionarEvento(evento);
    }

    public void criarTimers() {
        
    }
}
