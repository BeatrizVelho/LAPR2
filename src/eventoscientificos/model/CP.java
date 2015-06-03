package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de CP através de uma lista de revisores.
 *
 * @author G01
 */
public class CP {

    /**
     * Lista de revisores.
     */
    private List<Revisor> listaRevisores;

    /**
     * Contrói uma instância de CP com a lista de revisores vazia.
     */
    public CP() {
        this.listaRevisores = new ArrayList<>();
    }

    /**
     * Cria um objeto do tipo Revisor através de um utilizador.
     *
     * @param utilizador Utilizador que é revisor.
     * @return Novo revisor.
     */
    public boolean novoRevisor(Utilizador utilizador) {
        Revisor revisor = new Revisor(utilizador);

        if (!revisor.validarRevisor()) {
            throw new IllegalArgumentException("O revisor não existe.");
        }

        if (!validarRevisor(revisor)) {
            throw new IllegalArgumentException("O revisor"
                    + " já se encontra na lista.");
        }

        return adicionarRevisor(revisor);
    }

    /**
     * Adiciona um novo revisor à lista de revisores.
     *
     * @param revisor Revisor a adicionar na lista.
     * @return Retorna verdadeiro caso o revisor tenha sido adicionado à lista e
     * falso se a adição falhar.
     */
    private boolean adicionarRevisor(Revisor revisor) {
        return this.listaRevisores.add(revisor);
    }

    /**
     * Verifica se o revisor já existe na lista de revisores.
     *
     * @param revisor Revisor a verificar na lista.
     * @return Retorna verdadeiro caso o revisor não exista na lista e false
     * caso exista.
     */
    private boolean validarRevisor(Revisor revisor) {
        return !this.listaRevisores.contains(revisor);
    }

}
