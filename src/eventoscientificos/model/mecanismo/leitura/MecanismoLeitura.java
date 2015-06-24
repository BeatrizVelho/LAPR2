package eventoscientificos.model.mecanismo.leitura;

import eventoscientificos.model.Evento;
import eventoscientificos.model.RegistoUtilizadores;

/**
 * Todas as classes que implementam esta Interface herdam as responsabilidade
 * de descodificar submissões a partir de ficheiros. A forma como a descodifica-
 * ção é feita, diz respeito a forma como cada uma delas é implementada.
 *
 * @author G01
 */
public interface MecanismoLeitura {

    /**
     * Lê uma submissão de um artigo, contida num ficheiro.
     * 
     * @param registoUtilizadores Registo de utilizadores da empresa. 
     * @param evento Evento ao qual a submissão se destina.
     * @param ficheiro Caminho para o ficheiro.
     */
    void lerFicheiroSubmissao(
            RegistoUtilizadores registoUtilizadores,
            Evento evento, String ficheiro);
    
}
