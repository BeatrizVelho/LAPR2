package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de ListaConflitos, através de uma lista de conflitos
 * vazia.
 *
 * @author G01
 */
public class ListaConflitos {

    /**
     * Lista de conflitos.
     */
    private List<Conflito> listaConflitos;

    /**
     * Constrói uma instância de ListaConflitos com uma lista de conflitos
     * vazia.
     */
    public ListaConflitos() {
        this.listaConflitos = new ArrayList();
    }

    /**
     * Verifica se já existe um conflito na lista entre um dado revisor e uma
     * submissão.
     *
     * @param revisor Revisor que se pretende procurar.
     * @param submissao Submissão que se pretende procurar.
     * 
     * @return Retorna o conflito caso o mesmo exista, senão retorna null.
     */
    public Conflito validarExistenciaConflito(
            Revisor revisor, Submissao submissao) {
        for (Conflito conflito : this.listaConflitos) {
            if (conflito.getRevisor().equals(revisor)
                    || conflito.getSubmissao().equals(submissao)) {
                return conflito;
            }
        }

        return null;
    }

    /**
     * Cria um conflito entre um revisor e uma submissão com o tipo de conflito
     * detetado.
     * 
     * @param revisor Revisor com tipo de conflito.
     * @param submissao Submissao com a qual o revisor tem o tipo de conflito.
     * @param tipoConflito Tipo de conflito encontrado.
     * 
     * @return Conflito entre o revisor e a submissão com o tipo de conflito
     * detetado.
     */
    public Conflito novoConflito(Revisor revisor, Submissao submissao,
            TipoConflito tipoConflito) {
        List<TipoConflito> listaTiposConflito = new ArrayList();
        listaTiposConflito.add(tipoConflito);

        return new Conflito(revisor, submissao, listaTiposConflito);
    }

    /**
     * Adiciona o conflito à lista de conflitos.
     * 
     * @param conflito Conflito que vai ser adicionado à lista.
     * 
     * @return Verdadeiro se for possível adicionar o conflito à lista e falso
     * caso não seja.
     */
    public boolean adicionarConflito(Conflito conflito) {
        return this.listaConflitos.add(conflito);
    }

}
