package eventoscientificos.model;

/**
 * Representa uma instância de um proponente através de um utilizador que 
 * assume esse papel.
 * 
 * @author G01
 */
public class Proponente {

    /**
     * Utilizador que assume o papel de proponente.
     */
    private Utilizador utilizador;

    /**
     * Constrói uma instância de um proponente recebendo o utilizador que assume
     * o papel.
     * 
     * @param utilizador Utilizador que assume o papel de proponente.
     */
    public Proponente(Utilizador utilizador) {
        this.utilizador = utilizador;
    }

    /**
     * Valida um proponente de forma a garantir que o mesmo possui os dados
     * corretos.
     * 
     * @return Verdadeiro se possuir os dados corretos e falso caso não possua.
     */
    public boolean validarProponente() {
        if(this.utilizador == null) {
            throw new NullPointerException("O utilizador não pode estar vazio");
        }

        return true;
    }
    
}
