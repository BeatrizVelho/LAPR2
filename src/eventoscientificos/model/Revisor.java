package eventoscientificos.model;

/**
 * Representa uma instância de um revisor através de um utilizador registado.
 *
 * @author G01
 */
public class Revisor {

    /**
     * Utilizador que é revisor.
     */
    private Utilizador utilizador;

    /**
     * Constrói uma instância de um revisor recebendo o utilizador que assume o
     * papel.
     *
     * @param utilizador Utilizador que assume o papel de revisor.
     */
    public Revisor(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Devolve o utilizador que assume o papel de revisor.
     *
     * @return
     */
    public Utilizador getUtilizador() {
        return this.utilizador;
    }

    /**
     * Valida um revisor de forma a garantir que o mesmo possui os dados
     * corretos.
     *
     * @return Verdadeiro se possuir os dados corretos e falso caso não possua.
     */
    public boolean validarRevisor() {
        if (this.utilizador == null) {
            throw new NullPointerException("O utilizador não pode estar vazio");
        }

        return true;
    }

    

}
