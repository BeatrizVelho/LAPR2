package eventoscientificos.model;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * permitir submissões de artigos cientificos, ficando obrigadas a implementar
 * uma lista com as mesmas.
 * 
 * @author G01
 */
public interface Submissivel {

    /**
     * Devolve a lista de submissões do submissivel.
     * 
     * @return Devolve a lista de submissões do submissivel.
     */
    ListaSubmissoes getListaSubmissoes();

    /**
     * Altera o estado do submissivel quando o mesmo atinge a data de inicio de
     * submissão.
     */
    void setEmSubmissao();
    
}
