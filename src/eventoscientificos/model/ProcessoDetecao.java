package eventoscientificos.model;

import java.util.ArrayList;
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
        this.listaConflito = new ArrayList<>();
    }

    /**
     * Devolve uma lista de conflitos detetados entre revisor e submissão
     *
     * @return lista de conflitos detetados
     */
    public List<Conflito> getListaConflito() {
        return listaConflito;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de conflitos.
     *
     * @param outroObjecto Processo de deteção a comparar
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjecto) {
        if (this == outroObjecto) {
            return true;
        }

        if (outroObjecto == null || this.getClass() != outroObjecto.getClass()) {
            return false;
        }

        ProcessoDetecao outroProcesso = (ProcessoDetecao) outroObjecto;

        return listaConflito.equals(outroProcesso.listaConflito);
    }
}
