package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de ListaDecisoes, através de uma lista de decisões.
 * 
 * @author G01
 */
public class ListaDecisoes {

    /**
     * Lista de decisões.
     */
    private List<Decisao> listaDecisoes;
    
    /**
     * Constrói uma instância de ListaDecisoes vazia.
     */
    public ListaDecisoes() {
        listaDecisoes = new ArrayList<>();
    }
    
    /**
     * Cria uma nova instância de Decisão.
     * 
     * @param classificacao classificação da submissão.
     * @param submissao submissão a decidir.
     * @return Decisão criada.
     */
    public Decisao novaDecisao (int classificacao, Submissao submissao){
       return new Decisao(classificacao, submissao); 
    }
    
    /**
     * Adiciona na lista de decisões uma decisão.
     * 
     * @param decisao Decisão a adicionar na lista.
     * @return Lista de decisões.
     */
    public boolean adicionarDecisao(Decisao decisao){
        return listaDecisoes.add(decisao);
    }
}
