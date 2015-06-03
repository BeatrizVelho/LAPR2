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
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente a lista de revisores da CP.
     *
     * @param outroObjeto CP que vai ser usado na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        CP outraCP = (CP) outroObjeto;

        return this.listaRevisores.equals(outraCP.listaRevisores);
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

    /**
     * Verifica se a lista de revisores está vazia.
     *
     * @return Verdadeiro caso a lista não esteja vazia e false caso esteja
     * vazia.
     */
    public boolean validarCP() {
        return !(this.listaRevisores.size() == 0);
    }

}
