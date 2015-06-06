package eventoscientificos.model;

import eventoscientificos.model.mecanismo.detecao.MecanismoDetecao;

/**
 * Representa uma instância de TipoConflito através de um mecanismo de deteção e
 * uma descrição.
 *
 * @author G01
 */
public class TipoConflito {

    /**
     * Mecanismo que deteta determinado tipo de conflito.
     */
    private MecanismoDetecao mecanismoDetecao;

    /**
     * Descrição do tipo de conflito.
     */
    private String descricao;

    /**
     * Constrói uma instância de Tipo de Conflito recebendo um mecanismo de
     * deteção e de uma descrição.
     * 
     * @param mecanismoDetecao Mecanismo capaz de detetar conflitos.
     * @param descricao Descrição do tipo de conflito.
     */
    public TipoConflito(MecanismoDetecao mecanismoDetecao, String descricao) {
        setMecanismoDetecao(mecanismoDetecao);
        setDescricao(descricao);
    }

    /**
     * Constrói uma instância de TipoConflito recebendo uma descrição.
     * 
     * @param descricao Descrição do tipo de conflito.
     */
    public TipoConflito(String descricao) {
        this(null, descricao);
    }

    /**
     * Devolve o mecanismo de deteção do tipo de conflito.
     * 
     * @return Mecanismo de deteção do tipo de conflito.
     */
    public MecanismoDetecao getMecanismoDetecao() {
        return this.mecanismoDetecao;
    }

    /**
     * Devolve a descrição do tipo de conflito.
     * 
     * @return Descrição do tipo de conflito.
     */
    public String getDescricao() {
        return this.descricao;
    }

    /**
     * Modifica o mecanismo de deteção.
     * 
     * @param mecanismoDetecao Novo mecanismo de deteção.
     */
    public void setMecanismoDetecao(MecanismoDetecao mecanismoDetecao) {
        this.mecanismoDetecao = mecanismoDetecao;
    }

    public void setDescricao(String descricao) {
        if(descricao.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "A descrição não pode estar vazia.");
        }

        this.descricao = descricao;
    }

    /**
     * Verifica se o tipo de conflito tem um mecanismo de deteção associado a si
     * mesmo.
     * 
     * @return Verdadeiro se existir um mecanismo de deteção associado ao tipo
     * de conflito e falso caso não exista.
     */
    public boolean temMecanismo() {
        return getMecanismoDetecao() != null;
    }

}
