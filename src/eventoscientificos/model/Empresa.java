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
     * Representa uma instancia de RegistoUtilizadores que contem uma lista
     * de utilizadores do sistema.
     */
    private RegistoUtilizadores registoUtilizadores;
    
    /**
     * Representa uma instancia de RegistoEventos que contem uma lista
     * de eventos do sistema.
     */
    private RegistoEventos registoEventos;
    
    /**
     * Representa um instancia de Timer de uma classe da biblioteca Java.
     */
    private Timer temporizador;
    
    /**
     * Constrói uma instância de Empresa nao recebendo quaiquer valores por
     * parametro.
     */
    public Empresa() {
        this.registoUtilizadores = new RegistoUtilizadores();
        this.registoEventos = new RegistoEventos();
    }

    /**
     * Devolve RegistoUtilizadores.
     *
     * @return RegistoUtilizadores.
     */
    public RegistoUtilizadores getRegistoUtilizadores() {
        return this.registoUtilizadores;
    }
    
    /**
     * Devolve RegistoEventos.
     * 
     * @return RegistoEventos.
     */
    public RegistoEventos getRegistoEventos() {
        return this.registoEventos;
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
