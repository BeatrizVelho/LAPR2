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
     * @param dataInicioSubmissao Data de inicio de submissao do evento.
     * @param dataLimiteSubmissao Data limite de submissao do evento.
     * @param dataInicioDistribuicao Data de inicio de distribuicao do evento.
     * @param dataFimSubmissaoCameraReady Data fim de submissao camera ready do
     * evento.
     * @param dataInicio Data de inicio do evento.
     * @param dataFim Data de fim do evento.
     *
     * @return Evento.
     */
    public Evento novoEvento(String titulo, String descricao, Local local,
            Data dataInicioSubmissao, Data dataLimiteSubmissao,
            Data dataInicioDistribuicao, Data dataFimRevisao,
            Data dataFimSubmissaoCameraReady, Data dataInicio,
            Data dataFim) {

        return new Evento(titulo, descricao, local, dataInicioSubmissao,
                dataLimiteSubmissao, dataInicioDistribuicao, dataFimRevisao,
                dataFimSubmissaoCameraReady, dataInicio, dataFim);
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
                    && evento.isRegistadoOuSessoesTematicasDefinidas()) {
                listaEventosOrganizador.add(evento);
            }
        }

        return listaEventosOrganizador;
    }

    /**
     * Devolve uma lista de submissiveis nos quais ainda é possivel submeter
     * artigos
     *
     * @return Lista de Submisiveis que aceitam submisoes
     */
    public List<Submissivel> getListaSubmissiveisAceitarArtigo() {
        List<Submissivel> listaSubmissiveis = new ArrayList<>();

        for (Evento evento : this.listaEventos) {
            if (evento.isStateValidoParaSubmeter()) {
                listaSubmissiveis.add(evento);
            }
            listaSubmissiveis.addAll(
                    evento.getListaSubmissiveisAceitarArtigo());
        }
        return listaSubmissiveis;
    }

    /**
     * Devolve uma lista de submissiveis nas quais o utilizador é autor de alguma
     * submissao.
     * 
     * @param utilizador
     * @return Lista de Submissiveis.
     */
    public List<Submissivel> getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(Utilizador utilizador) {
        List<Submissivel> listaSubmissiveisUtilizador = new ArrayList<>();
        
        for(Evento evento : this.listaEventos) {
            if(evento.isStateValidoParaAlterar() &&
                    evento.isUtilizadorUmAutorSubmissao(utilizador)) {
                listaSubmissiveisUtilizador.add(evento);
            }
            listaSubmissiveisUtilizador.addAll(
                    evento.getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador(utilizador));
        }
        
        return listaSubmissiveisUtilizador;
    }
    
    /**
     * Devolve uma lista de eventoes/sessões temáticas que se encontrem sem CP
     * definida e onde o utilizador é organizador/proponente.
     *
     * @param utilizador Utilizador a verificar se é organizador/proponente.
     * @return Lista de evento/sessao temática onde o utilizador é
     * organizador/proponente.
     */
    public List<CPDefinivel> getListaCPDefiniveisSemCPOrganizadorProponente(Utilizador utilizador) {
        List<CPDefinivel> listaSemCPDefinida = new ArrayList();

        for (Evento evento : this.listaEventos) {
            if (evento.isSessoesTematicasDefinidas()
                    && evento.isOrganizador(utilizador)) {
                listaSemCPDefinida.add(evento);
            }
            List<CPDefinivel> listaSessoesTematicas
                    = evento.getListaCPDefiniveisSemCPOrganizadorProponente(utilizador);
            listaSemCPDefinida.addAll(listaSessoesTematicas);
        }

        return listaSemCPDefinida;
    }

    /**
     * Devolve uma lista de eventos onde consta o utilizador no sistema como
     * revisor
     *
     * @param u utilizador no sistema
     * @return lista de eventos
     */
    public List<Licitavel> getListaLicitaveisComArtigosPorLicitarRevisor(Utilizador u) {
        List<Licitavel> listaLicitaveis = new ArrayList<>();
        for (Evento evento : listaEventos) {
            boolean validoParaLicitar = evento.isStateValidoParaLicitar(u);
            if (validoParaLicitar) {
                listaLicitaveis.add(evento);
            }
        }
        return listaLicitaveis;
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
