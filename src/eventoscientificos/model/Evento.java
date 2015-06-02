package eventoscientificos.model;

import java.util.Date;

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
    private Date dataInicio;

    /**
     * Data de Fim do Evento
     */
    private Date dataFim;

    /**
     * Data de Início de Submissão do Evento
     */
    private Date dataInicioSubmissao;

    /**
     * Data Limite de Submissão do Evento
     */
    private Date dataLimiteSubmissao;

    /**
     * Data de Início de Distribuição do Evento
     */
    private Date dataInicioDistribuicao;

    /**
     * Título do Evento por omissao
     */
    private static final String TITULO_POR_OMISSAO = "Sem titulo";

    /**
     * Descricao do evento por omissao
     */
    private static final String DESCRICAO_POR_OMISSAO = "Sem descricao";

    public Evento(String titulo, String descricao, Local local, Date dataInicio,
            Date dataFim, Date dataInicioSubmissao, Date dataLimiteSubmissao,
            Date dataInicioDistribuicao) {

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
    public Date getDataInicio() {
        return this.dataInicio;
    }

    /**
     * Devolve a data de fim do evento
     *
     * @return Data de fim do evento
     */
    public Date getDataFim() {
        return this.dataFim;
    }

    /**
     * Devolve a data de inicio de submissao do evento
     *
     * @return Data de inicio de submissao do evento
     */
    public Date getDataInicioSubmissao() {
        return this.dataInicioSubmissao;
    }

    /**
     * Devolve a data limite de submissao do evento
     *
     * @return Data limite de submissao do evento
     */
    public Date getDataLimiteSubmissao() {
        return this.dataLimiteSubmissao;
    }

    /**
     * Devolve a data de inicio de distribuicao do evento
     *
     * @return Date de inicio de distribuicao do evento
     */
    public Date getDataInicioDistribuicao() {
        return this.dataInicioDistribuicao;
    }

    /**
     * 
     * @param titulo 
     */
    public void setTitulo(String titulo) {
        if (titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("O titulo não pode estar vazio");
        }
        this.titulo = titulo;
    }
}
