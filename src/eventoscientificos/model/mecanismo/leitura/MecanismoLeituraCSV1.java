package eventoscientificos.model.mecanismo.leitura;

import eventoscientificos.model.Evento;
import eventoscientificos.model.RegistoUtilizadores;

/**
 * Representa uma instância MecanismLeituraCSV1, responsável por ler e 
 * interpretar ficheiros csv.
 * 
 * @author G01
 */
public class MecanismoLeituraCSV1 implements MecanismoLeitura {

    /**
     * Contrói uma instância de Mecanismo de Leitura CSV1.
     */
    public MecanismoLeituraCSV1() {
    }

    /**
     * Lê uma submissão de um artigo, contida num ficheiro.
     * 
     * @param registoUtilizadores Registo de utilizadores da empresa. 
     * @param evento Evento ao qual a submissão se destina.
     * @param ficheiro Caminho para o ficheiro.
     */
    @Override
    public void lerFicheiroSubmissao(RegistoUtilizadores registoUtilizadores, Evento evento, String ficheiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
