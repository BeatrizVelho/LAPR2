package utils.codificador.aritmetico;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import nayuki.arithcode.ArithmeticCoderBase;
import nayuki.arithcode.ArithmeticCompress;
import nayuki.arithcode.ArithmeticEncoder;
import nayuki.arithcode.BitOutputStream;
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

        this.listaTabelasFrequencia = new ArrayList();
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
    public String codificar(String password, int tabela) {
//        int numeroDeCarateresTabela = 257;
      FrequencyTable tabelaEscolhida = listaTabelasFrequencia.get(tabela);
//        double dimensaoIntervalo = 1, limiteInferior = 0.000000001, limiteSuperior = 1;
//        boolean encontrado;
////        int[] frequencias = null;
//        // List<Character> letras = new ArrayList();
////
////        for (int i = 0; i < password.length(); i++) {
////            if (!letras.contains(password.charAt(i))) {
////                letras.add(password.charAt(i));
////            }
////        }
////        frequencias = new int[letras.size()];
//
////        for (int i = 0; i < numeroDeCarateresTabela; i++) {
////            int codigo = String.valueOf(letras.get(i)).codePointAt(0);
////            int freq = tabelaEscolhida.get(codigo);
////            dimensaoIntervalo += freq;
////           // frequencias[i] = freq;
////        }
//        for (int i = 0; i < password.length(); i++) {
//            int indiceSimbolo = 0;
//            do {
//                encontrado = false;
//                char c = password.charAt(i);
//             //   String.valueOf(c).
//                int freq = tabelaEscolhida.get(indiceSimbolo);
//                if (freq != String.valueOf(c).codePointAt(0)) {
//                    limiteInferior = (dimensaoIntervalo * tabelaEscolhida.get(freq) / 10000.0) + limiteInferior;
//                } else {
//                    limiteSuperior = (dimensaoIntervalo * tabelaEscolhida.get(freq) / 10000.0) + limiteInferior;
//                    dimensaoIntervalo = limiteSuperior - limiteInferior;
//                    encontrado = true;
//                }
//                indiceSimbolo++;
//            } while (encontrado == false);
//        }
////return Double.toString(limiteInferior);
//        return String.format("%.8f", limiteInferior);
      
        InputStream in = new ByteArrayInputStream(password.getBytes(StandardCharsets.UTF_8));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BitOutputStream out = new BitOutputStream(byteArrayOutputStream);
        try {
            ArithmeticEncoder enc = new ArithmeticEncoder(out);
            while (true) {
                int b = in.read();
                if (b == -1) {
                    break;
                }
                enc.write(tabelaEscolhida, b);
            }
            //enc.write(tabelaEscolhida, 256);  // EOF
            enc.finish();
        }       
        catch (Exception ex) {
            System.out.println(ex);
        }
        finally {
            try {
                if (out != null) out.close();
                if (in != null)in.close();
            }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
        
        return byteArrayOutputStream.toString();
    }

    /**
     * Devolve o tamanho de tabelas de frequência.
     *
     * @return numero de tabelas
     */
    public int getSizeListaTabelasFreq() {
        return listaTabelasFrequencia.size();
    }

}
