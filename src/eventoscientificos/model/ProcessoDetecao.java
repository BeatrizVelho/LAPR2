package eventoscientificos.model;

import java.util.List;

/**
 * @author G01
 */
public class ProcessoDetecao {

    /**
     * Lista de conflitos detetados
     */
    private List<Conflito> listaConflito;

    /**
     * Constrói uma instância de Processo de Deteção
     */
    public ProcessoDetecao() {
    }

    /**
     * Devolve uma lista de conflitos detetados entre revisor e submissão
     *
     * @return lista de conflitos detetados
     */
    public List<Conflito> getListaConflito() {
        return listaConflito;
    }

}
