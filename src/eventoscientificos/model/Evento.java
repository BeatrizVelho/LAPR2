package eventoscientificos.model;

import Model.EventoState.EventoState;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import utils.Data;

/**
 * @author G01
 */
public class Evento {

    /**
     * Título do Evento
     */
    private String titulo;

    /**
     * Descrição do Evento
     */
    private String descricao;

    /**
     * Local de Realização do Evento
     */
    private Local local;

    /**
     * Data de Início do Evento
     */
    private Data dataInicio;

    /**
     * Data de Fim do Evento
     */
    private Data dataFim;

    /**
     * Data de Início de Submissão do Evento
     */
    private Data dataInicioSubmissao;

    /**
     * Data Fim de Submissão do Evento
     */
    private Data dataFimSubmissao;

    /**
     * Data de Início de Distribuição do Evento
     */
    private Data dataInicioDistribuicao;

    /**
     * Lista de Orgazanidores do Evento
     */
    private List<Organizador> listaOrganizadores;

    /**
     * Instância de EventoState
     */
    private EventoState e_state;

    /**
     * Título do Evento por omissao
     */
    private static final String TITULO_POR_OMISSAO = "Sem titulo";

    /**
     * Descricao do evento por omissao
     */
    private static final String DESCRICAO_POR_OMISSAO = "Sem descricao";
    
    /**
     * Local de realizacao do evento por omissao
     */
    private static Local LOCAL_POR_OMISSAO = new Local("Porto");
    
    /**
     * Data de inicio do evento por omissão.
     */
    private static Data DATAINICIO_POR_OMISSAO = new Data();
    
    /**
     * Data de fim do evento por omissão.
     */
    private static Data DATAFIM_POR_OMISSAO = new Data();
    
    /**
     * Data de inicio de submissão do evento por omissão.
     */
    private static Data DATAINICIOSUBMISSAO_POR_OMISSAO = new Data();
    
    /**
     * Data fim de submissão do evento por omissão.
     */
    private static Data DATAFIMSUBMISSAO_POR_OMISSAO = new Data();
    
    /**
     * Data de inicio de distribuicao do evento por omissão.
     */
    private static Data DATAINICIODISTRIBUICAO_POR_OMISSAO = new Data();
    
    /**
     * Constrói uma instância de evento recebendo um titulo, descricao, local,
     * data de inicio, data de fim, data de inicio de submissao, data fim de
     * submissao, data de inicio de distribuicao
     *
     * @param titulo Titulo do evento
     * @param descricao Descricao do evento
     * @param local Local do evento
     * @param dataInicio Data de inicio do evento
     * @param dataFim Data de fim do evento
     * @param dataInicioSubmissao Data de inicio de submissao do evento
     * @param dataFimSubmissao Data fim de submissao do evento
     * @param dataInicioDistribuicao Data de inicio de distribuicao do evento
     */
    public Evento(String titulo, String descricao, Local local, Data dataInicio,
            Data dataFim, Data dataInicioSubmissao, Data dataFimSubmissao,
            Data dataInicioDistribuicao) {
        setTitulo(titulo);
        setDescricao(descricao);
        setLocal(titulo);
        setDataInicio(dataInicio);
        setDataFim(dataFim);
        setDataInicioSubmissao(dataInicioSubmissao);
        setDataFimSubmissao(dataFimSubmissao);
        setDataInicioDistribuicao(dataInicioDistribuicao);
        this.listaOrganizadores = new ArrayList<>();
    }
    
    /**
     * Constrói uma instância de um evento com os parametros por
     * omissão.
     */
    public Evento() {
        this(TITULO_POR_OMISSAO, DESCRICAO_POR_OMISSAO, LOCAL_POR_OMISSAO, 
                DATAINICIO_POR_OMISSAO, DATAFIM_POR_OMISSAO, 
                DATAINICIOSUBMISSAO_POR_OMISSAO, DATAFIMSUBMISSAO_POR_OMISSAO, 
                DATAINICIODISTRIBUICAO_POR_OMISSAO);
        this.listaOrganizadores = new ArrayList<>();
    }

    /**
     * Devolve o título do Evento
     *
     * @return Titulo do evento
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Devolve a descrição do evento
     *
     * @return Descrição so evento
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Devolve o local do evento
     *
     * @return Local do evento
     */
    public Local getLocal() {
        return this.local;
    }

    /**
     * Devolve a data de inicio do evento
     *
     * @return Data de inicio do evento
     */
    public Data getDataInicio() {
        return this.dataInicio;
    }

    /**
     * Devolve a data de fim do evento
     *
     * @return Data de fim do evento
     */
    public Data getDataFim() {
        return this.dataFim;
    }

    /**
     * Devolve a data de inicio de submissao do evento
     *
     * @return Data de inicio de submissao do evento
     */
    public Data getDataInicioSubmissao() {
        return this.dataInicioSubmissao;
    }

    /**
     * Devolve a data fim de submissao do evento
     *
     * @return Data fim de submissao do evento
     */
    public Data getDataFimSubmissao() {
        return this.dataFimSubmissao;
    }

    /**
     * Devolve a data de inicio de distribuicao do evento
     *
     * @return Data de inicio de distribuicao do evento
     */
    public Data getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * Modifica o titulo do evento
     *
     * @param titulo Novo titulo do evento
     */
    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo não pode estar vazio");
        }
        this.titulo = titulo;
    }

    /**
     * Modifica a descricao do evento
     *
     * @param descricao Nova descricao do evento
     */
    public void setDescricao(String descricao) {
        if (descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("A desricao não pode estar vazia");
        }
        this.descricao = descricao;
    }

    /**
     * Modifica o local do evento
     *
     * @param local Novo local do evento
     */
    public void setLocal(String local) {
        this.local.setNomeLocal(local);
    }

    /**
     * Modifica a data de inicio do evento
     *
     * @param dataInicio Nova data de inicio do evento
     */
    public void setDataInicio(Data dataInicio) {
        if (dataInicio == null) {
            throw new NullPointerException("A data de inicio do evento não pode"
                    + "estar vazia.");
        }
        this.dataInicio = dataInicio;
    }

    /**
     * Modifica a data de fim do evento
     *
     * @param dataFim Nova data de fim do evento
     */
    public void setDataFim(Data dataFim) {
        if (dataFim == null) {
            throw new NullPointerException("A data de fim do evento não pode"
                    + "estar vazia.");
        }
        this.dataFim = dataFim;
    }

    /**
     * Modifica a data de inicio de submissao do evento
     *
     * @param dataInicioSubmissao Nova data de inicio de submissao do evento
     */
    public void setDataInicioSubmissao(Data dataInicioSubmissao) {
        if (dataInicioSubmissao == null) {
            throw new NullPointerException("A data de inicio de submissão não pode"
                    + "estar vazia.");
        }
        this.dataInicioSubmissao = dataInicioSubmissao;
    }

    /**
     * Modifica a data fim de submissao do evento
     *
     * @param dataFimSubmissao Nova data fim de submissao do evento
     */
    public void setDataFimSubmissao(Data dataFimSubmissao) {
        if (dataFimSubmissao == null) {
            throw new NullPointerException("A data de fim de submissão não pode"
                    + "estar vazia.");
        }
        this.dataFimSubmissao = dataFimSubmissao;
    }

    /**
     * Modifica a data de inicio de distribuicao do evento
     *
     * @param dataInicioDistribuicao Nova data de inicio de distribuicao do
     * evento
     */
    public void setDataInicioDistribuicao(Data dataInicioDistribuicao) {
        if (dataInicioDistribuicao == null) {
            throw new NullPointerException("A data de inicio de distribuicao não"
                    + " pode estar vazia.");
        }
        this.dataInicioDistribuicao = dataInicioDistribuicao;
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
        if(this == outroObjeto) {
            return true;
        }
        
        if(outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }
        
        Evento outroEvento = (Evento) outroObjeto;
        
        return this.getTitulo().equals(outroEvento.getTitulo());
    }
    /**
     * Constroi uma instancia de organizador recebendo um utilizador
     *
     * @param utilizador Utilizador
     * @return true se o organizador for adicionado a lista de organizadores e
     * false se nao for adicionado
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
     * organizadores
     *
     * @param organizador instancia de organizador a verificar
     * @return true caso nao conste na lista e false se conste
     */
    public boolean validarOrganizador(Organizador organizador) {
        return !this.listaOrganizadores.contains(organizador);
    }

    /**
     * Adiciona o organizador passado por parametro a lista de organizadores
     * caso este nao conste na lista
     *
     * @param o instancia de organizador a adicionar
     * @return true caso seja adicionado e false se nao for adicionado
     */
    public boolean adicionarOganizador(Organizador o) {
        return this.listaOrganizadores.add(o);
    }

}
