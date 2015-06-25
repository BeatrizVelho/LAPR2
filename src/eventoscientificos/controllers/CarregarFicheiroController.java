package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoMecanismosLeitura;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.mecanismo.leitura.MecanismoLeitura;
import java.util.List;

/**
 * @author G01
 */
public class CarregarFicheiroController {

    private Empresa empresa;

    private List<Evento> listaEventosAceitarEventos;

    private Evento evento;

    public CarregarFicheiroController(Empresa empresa) {
        this.empresa = empresa;
        this.listaEventosAceitarEventos = null;
        this.evento = null;
    }

    /**
     * Devolve a lista de eventos.
     * 
     * @return Lista de Eventos. 
     */
    public List<Evento> getListaEventosAceitarEventos() {
        return listaEventosAceitarEventos;
    }

    public boolean getListaEventosAceitarArtigos() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        this.listaEventosAceitarEventos
                = registoEventos.getListaEventosAceitarArtigos();

        return registoEventos != null && this.listaEventosAceitarEventos != null;
    }

    public boolean selecionarEvento(int indice) {
        this.evento = this.listaEventosAceitarEventos.get(indice);
        return this.evento != null;
    }

    public boolean submeterFicheiro(String ficheiro) {
        RegistoMecanismosLeitura registoMecanismosLeitura
                = this.empresa.getRegistoMecanismosLeitura();

        MecanismoLeitura mecanismoLeitura
                = registoMecanismosLeitura.getMecanismoAdequadoAoFicheiro(ficheiro);

        if (mecanismoLeitura == null) {
            throw new NullPointerException();
        }

        RegistoUtilizadores registoUtilizadores = this.empresa.getRegistoUtilizadores();

        mecanismoLeitura.lerFicheiroSubmissao(
                registoUtilizadores, this.evento, ficheiro);

        return true;
    }
}
