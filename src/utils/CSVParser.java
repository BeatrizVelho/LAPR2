package utils;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Representa uma instância de CSVParser.
 *
 * Esta classe utiliza uma biblioteca denominada de OpenCSV, capaz de ler e
 * escrever ficheiros .csv.
 *
 * @author G01
 */
public class CSVParser {

    /**
     * Caminho para o ficheiro .csv que contém as tabelas de frequência.
     */
    private static final String ficheiro = "excel.csv";

    /**
     * Separador pelo qual é feito o split dos dados.
     */
    private static final char separador = ';';

    /**
     * Constrói uma instância de CSVParser.
     */
    public CSVParser() {
    }

    /**
     * Devolve uma matriz de inteiros com todas as tabelas de frequência
     * contidas no ficheiro .csv.
     *
     * @return Matriz de inteiros com as tabelas de frequência.
     * @throws IOException Lançada no caso do ficheiro não ser encontrado.
     */
    public int[][] lerTabelasFrequencia() throws IOException {
        CSVReader csv = new CSVReader(
                new FileReader(new File(ficheiro)), separador);

        String[] proximaLinha = csv.readNext();
        int totalTabelas = proximaLinha.length - 2;

        int[][] matrizTabelasFrequencia = new int[totalTabelas][257];

        while ((proximaLinha = csv.readNext()) != null) {

            if (!proximaLinha[0].isEmpty()) {

                int simbolo = proximaLinha[0].codePointAt(0);

                for (int tabela = 0; tabela < totalTabelas; tabela++) {
                    int coluna = tabela + 2;

                    double probabilidade = Double.parseDouble(proximaLinha[coluna].replace(",", ".")) * 10000;

                    matrizTabelasFrequencia[tabela][simbolo] = (int) probabilidade;
                }
            }
        }

        return matrizTabelasFrequencia;
    }

}
