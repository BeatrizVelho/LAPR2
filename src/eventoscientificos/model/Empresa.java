package eventoscientificos.model;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Representa uma instância de Empresa através de RegistoUtilizadores e
 * RegistoEventos.
 *
 * @author G01
 */
public class Empresa {

    /**
     * Registo de utilizadores da empresa.
     */
    private RegistoUtilizadores registoUtilizadores;

    /**
     * Registo de eventos da empresa.
     */
    private RegistoEventos registoEventos;

    /**
     * Registo de tipos de conflitos da empresa.
     */
    private RegistoTiposConflito registoTiposConflito;

    /**
     * Temporizador que controla a agenda da empresa.
     */
    private Timer temporizador;

    /**
     * Constrói uma instância de Empresa nao recebendo quaisquer valores por
     * parametro.
     */
    public Empresa() {
        this.registoUtilizadores = new RegistoUtilizadores();
        this.registoEventos = new RegistoEventos();
        this.registoTiposConflito = new RegistoTiposConflito();
        this.temporizador = new Timer();
    }

    /**
     * Devolve o Registo de Utilizadores.
     *
     * @return Registo de Utilizadores.
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.registoUtilizadores;
    }

    /**
     * Devolve o Registo de Eventos.
     *
     * @return RegistoEventos.
     */
    public RegistoEventos getRegistoEventos() {
        return this.registoEventos;
    }

    /**
     * Devolve o Registo de Tipos de Confllito.
     */
    public RegistoTiposConflito getRegistoTiposConflito() {
        return this.registoTiposConflito;
    }

    /**
     * Agenda no temporizador da empresa uma tarefa a ser executada na data
     * definidia.
     *
     * @param task Tarefa a ser executada.
     * @param date Data em que a tarefa irá ser executada.
     */
    public void schedule(TimerTask task, Date date) {
        this.temporizador.schedule(task, date);
    }

}
