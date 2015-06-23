package utils.codificador.aritmetico;

import java.io.IOException;
import java.util.List;
import nayuki.arithcode.FrequencyTable;
import nayuki.arithcode.SimpleFrequencyTable;
import utils.CSVParser;

/**
 * Esta classe tem a responsabilidade de codificar através da codificação
 * aritmética.
 *
 * @author G01
 */
public class CA implements Codificador {

    /**
     * Lista de tabelas de frequências.
     */
    List<FrequencyTable> listaTabelasFrequencia;

    /**
     * Constrói uma instância de CodificadorAritmetico.
     */
    public CA() throws IOException {
        CSVParser csvParser = new CSVParser();
        int[][] matrizTabelaFrequencia = csvParser.lerTabelasFrequencia();
        for (int i = 0; i < matrizTabelaFrequencia.length; i++) {
            listaTabelasFrequencia.add(new SimpleFrequencyTable(matrizTabelaFrequencia[i]));
        }
    }

    /**
     * Codifica a palavra recebida por parãmetro
     *
     * @param password password a codificar
     * @return palavra codificada
     */
    @Override
    public String codificar(String password) {
        return "";
    }

    /**
     * Devolve o tamanho de tabelas de frequência.
     * @return numero de tabelas
     */
    public int getSizeListaTabelasFreq() {
        return listaTabelasFrequencia.size();
    }

}
