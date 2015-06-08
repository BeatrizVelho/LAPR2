package eventoscientificos.model;

import eventoscientificos.model.state.evento.EventoRegistadoState;
import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * Representa uma instancia de RegistoEventos que representa uma lista de
 * eventos da empresa.
 *
 * @author G01
 */
public class RegistoEventos {

    /**
     * Lista de Eventos da empresa.
     */
    private List<Evento> listaEventos;

    /**
     * Constrói uma instância de RegistoEventos sem parametros.
     */
    public RegistoEventos() {
        this.listaEventos = new ArrayList<>();
    }

    /**
     * Constrói uma instância de evento recebendo um titulo, descricao, local,
     * data de inicio, data de fim, data de inicio de submissao, data limite de
     * submissao, data de inicio de distribuicao.
     *
     * @param titulo Titulo do evento.
     * @param descricao Descricao do evento.
     * @param local Local do evento.
     * @param dataInicio Data de inicio do evento.
     * @param dataFim Data de fim do evento.
     * @param dataInicioSubmissao Data de inicio de submissao do evento.
     * @param dataLimiteSubmissao Data limite de submissao do evento.
     * @param dataInicioDistribuicao Data de inicio de distribuicao do evento.
     *
     * @return Evento.
     */
    public Evento novoEvento(String titulo, String descricao, Local local,
            Data dataInicioSubmissao, Data dataLimiteSubmissao,
            Data dataInicioDistribuicao, Data dataInicio, Data dataFim) {

        return new Evento(titulo, descricao, local, dataInicioSubmissao,
                dataLimiteSubmissao, dataInicioDistribuicao, dataInicio, dataFim);
    }

    /**
     * Verifica se o evento passado por parametro ja consta na lista de eventos.
     *
     * @param evento instancia de evento a verificar.
     * @return true caso nao exista na lista e false caso ja exista.
     */
    public boolean validarEvento(Evento evento) {
        return !this.listaEventos.contains(evento);
    }

    /**
     * Adiciona o evento passado por parametro a lista de eventos caso este nao
     * exista na lista.
     *
     * @param evento instancia de evento a adicionar.
     * @return true caso seja adicionado e false se nao for adicionado.
     */
    public boolean adicionarEvento(Evento evento) {
        return this.listaEventos.add(evento);
    }

    /**
     * Devolve uma lista de eventos onde o utilizador é organizador, onde ainda
     * é possível criar Sessões Temáticas.
     * 
     * @param utilizador Utilizador que se quer verificar se é organizador.
     * @return Lista de eventos onde o utilizador é organizador.
     */
    public List<Evento> getListaEventosOrganizador(Utilizador utilizador) {
        List<Evento> listaEventosOrganizador = new ArrayList();

        for (Evento evento : this.listaEventos) {
            if (evento.isOrganizador(utilizador)
                    && evento.getEstado() instanceof EventoRegistadoState) {
                listaEventosOrganizador.add(evento);
            }
        }

        return listaEventosOrganizador;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos lista de eventos.
     * 
     * @param outroObjeto Evento que vai ser usado na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        RegistoEventos outroRegisto = (RegistoEventos) outroObjeto;

        return this.listaEventos.equals(outroRegisto.listaEventos);
    }

}

