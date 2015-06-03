package eventoscientificos.model;

import eventoscientificos.EventoState.EventoState;
import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * @author G01
 */
public class Evento {

    /**
     * Título do Evento.
     */
    private String titulo;

    /**
     * Descrição do Evento.
     */
    private String descricao;

    /**
     * Local de Realização do Evento.
     */
    private Local local;

    /**
     * Data de Início de Submissão do Evento.
     */
    private Data dataInicioSubmissao;

    /**
     * Data Fim de Submissão do Evento.
     */
    private Data dataFimSubmissao;

    /**
     * Data de Início de Distribuição do Evento.
     */
    private Data dataInicioDistribuicao;

    /**
     * Data de Início do Evento.
     */
    private Data dataInicio;

    /**
     * Data de Fim do Evento.
     */
    private Data dataFim;

    /**
     * Lista de Orgazanidores do Evento.
     */
    private List<Organizador> listaOrganizadores;

    /**
     * Estado do evento.
     */
    private EventoState estado;

    /**
     * CP do evento.
     */
    private CP cp;

    /**
     * Constrói uma instância de evento recebendo um titulo, descricao, local,
     * data de inicio, data de fim, data de inicio de submissao, data fim de
     * submissao, data de inicio de distribuicao.
     *
     * @param titulo Titulo do evento.
     * @param descricao Descricao do evento.
     * @param local Local do evento.
     * @param dataInicioSubmissao Data de inicio de submissao do evento.
     * @param dataFimSubmissao Data fim de submissao do evento.
     * @param dataInicioDistribuicao Data de inicio de distribuicao do evento.
     * @param dataInicio Data de inicio do evento.
     * @param dataFim Data de fim do evento.
     */
    public Evento(String titulo, String descricao, Local local,
            Data dataInicioSubmissao, Data dataFimSubmissao,
            Data dataInicioDistribuicao, Data dataInicio, Data dataFim) {
        setTitulo(titulo);
        setDescricao(descricao);
        setLocal(local);
        setDataInicioSubmissao(dataInicioSubmissao);
        setDataFimSubmissao(dataFimSubmissao);
        setDataInicioDistribuicao(dataInicioDistribuicao);;
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        this.listaOrganizadores = new ArrayList<>();
    }

    /**
     * Devolve o título do Evento.
     *
     * @return Titulo do evento.
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Devolve a descrição do evento.
     *
     * @return Descrição so evento.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Devolve o local do evento.
     *
     * @return Local do evento.
     */
    public Local getLocal() {
        return this.local;
    }

    /**
     * Devolve a data de inicio de submissao do evento.
     *
     * @return Data de inicio de submissao do evento.
     */
    public Data getDataInicioSubmissao() {
        return this.dataInicioSubmissao;
    }

    /**
     * Devolve a data fim de submissao do evento.
     *
     * @return Data fim de submissao do evento.
     */
    public Data getDataFimSubmissao() {
        return this.dataFimSubmissao;
    }

    /**
     * Devolve a data de inicio de distribuicao do evento.
     *
     * @return Data de inicio de distribuicao do evento.
     */
    public Data getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * Devolve a data de inicio do evento.
     *
     * @return Data de inicio do evento.
     */
    public Data getDataInicio() {
        return this.dataInicio;
    }

    /**
     * Devolve a data de fim do evento.
     *
     * @return Data de fim do evento.
     */
    public Data getDataFim() {
        return this.dataFim;
    }

    /**
     * Devolve a CP da sessão temática.
     *
     * @return CP do evento.
     */
    public CP getCP() {
        return this.cp;
    }

    /**
     * Modifica o titulo do evento.
     *
     * @param titulo Novo titulo do evento.
     */
    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo não pode estar vazio");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica a descricao do evento.
     *
     * @param descricao Nova descricao do evento.
     */
    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A descrição não pode estar vazia");
        }
        this.descricao = descricao;
    }

    /**
     * Modifica o local do evento.
     *
     * @param local Novo local do evento.
     */
    public void setLocal(Local local) {
        this.local = local;
    }

    /**
     * Modifica a data de inicio de submissao do evento.
     *
     * @param dataInicioSubmissao Nova data de inicio de submissao do evento.
     */
    public void setDataInicioSubmissao(Data dataInicioSubmissao) {
        if (dataInicioSubmissao == null) {
            throw new NullPointerException("A data de inicio de submissão não pode"
                    + "estar vazia.");
        }
        if (!dataInicioSubmissao.isMaior(Data.dataAtual())) {
            throw new IllegalArgumentException("Data de inicio de submissao "
                    + "invalida");
        }
        this.dataInicioSubmissao = dataInicioSubmissao;
    }

    /**
     * Modifica a data fim de submissao do evento.
     *
     * @param dataFimSubmissao Nova data fim de submissao do evento.
     */
    public void setDataFimSubmissao(Data dataFimSubmissao) {
        if (dataFimSubmissao == null) {
            throw new NullPointerException("A data de fim de submissão não pode"
                    + "estar vazia.");
        }

        if (!dataFimSubmissao.isMaior(this.dataInicioSubmissao)) {
            throw new IllegalArgumentException("Data de fim de submissao "
                    + "invalida");
        }
        this.dataFimSubmissao = dataFimSubmissao;
    }

    /**
     * Modifica a data de inicio de distribuicao do evento.
     *
     * @param dataInicioDistribuicao Nova data de inicio de distribuicao do
     * evento.
     */
    public void setDataInicioDistribuicao(Data dataInicioDistribuicao) {
        if (dataInicioDistribuicao == null) {
            throw new NullPointerException("A data de inicio de distribuicao não"
                    + " pode estar vazia.");
        }
        if (!dataInicioDistribuicao.isMaior(this.dataFimSubmissao)) {
            throw new IllegalArgumentException("Data de inicio de distribuicao "
                    + "invalida");
        }
        this.dataInicioDistribuicao = dataInicioDistribuicao;
    }

    /**
     * Modifica a data de inicio do evento.
     *
     * @param dataInicio Nova data de inicio do evento.
     */
    public void setDataInicio(Data dataInicio) {
        if (dataInicio == null) {
            throw new NullPointerException("A data de inicio do evento não pode"
                    + "estar vazia.");
        }
        if (!dataInicio.isMaior(this.dataInicioDistribuicao)) {
            throw new IllegalArgumentException("Data de inicio do evento "
                    + "invalida");
        }
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a data de fim do evento.
     *
     * @param dataFim Nova data de fim do evento.
     */
    public void setDataFim(Data dataFim) {
        if (dataFim == null) {
            throw new NullPointerException("A data de fim do evento não pode"
                    + "estar vazia.");
        }
        if (!dataFim.isMaior(dataInicio)) {
            throw new IllegalArgumentException("Data de fim do evento "
                    + "invalida");
        }
        this.dataFim = dataFim;
    }

    /**
     * Muda o estado do evento.
     *
     * @param novoEstado Novo estado do evento.
     */
    public void setState(EventoState novoEstado) {
        this.estado = novoEstado;
    }

    /**
     * Modifica a CP do evento.
     *
     * @param cp Nova CP do evento.
     */
    public void setCp(CP cp) {
        this.cp = cp;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, titulo.
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

        Evento outroEvento = (Evento) outroObjeto;

        return this.getTitulo().equals(outroEvento.getTitulo());
    }

    /**
     * Constroi uma instancia de organizador recebendo um utilizador.
     *
     * @param utilizador Utilizador.
     * @return true se o organizador for adicionado a lista de organizadores e
     * false se nao for adicionado.
     */
    public boolean novoOrganizador(Utilizador utilizador) {
        Organizador o = new Organizador(utilizador);
        if (!o.validarOrganizador()) {
            throw new IllegalArgumentException("O organizador não pode estar "
                    + "invalido");
        }
        if (!validarOrganizador(o)) {
            throw new IllegalArgumentException("O organizador introduzido ja "
                    + "se encontra na lista");
        }

        return adicionarOganizador(o);
    }

    /**
     * Verifica se o organizador passado por parametro ja consta na lista de
     * organizadores.
     *
     * @param organizador instancia de organizador a verificar.
     * @return true caso nao conste na lista e false se conste.
     */
    private boolean validarOrganizador(Organizador organizador) {
        return !this.listaOrganizadores.contains(organizador);
    }

    /**
     * Adiciona o organizador passado por parametro a lista de organizadores
     * caso este nao conste na lista.
     *
     * @param o instancia de organizador a adicionar.
     * @return true caso seja adicionado e false se nao for adicionado.
     */
    private boolean adicionarOganizador(Organizador o) {
        return this.listaOrganizadores.add(o);
    }

    /**
     * Valida o Evento, verificando se todos os seus atributos se encontram
     * devidamente preenchidos.
     *
     * @return Verdadeiro se o objeto for válido e falso caso não seja.
     */
    public boolean validarEvento() {
        return true;
    }

}
