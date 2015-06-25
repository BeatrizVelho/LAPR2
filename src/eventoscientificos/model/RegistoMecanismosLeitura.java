package eventoscientificos.model;

import eventoscientificos.model.mecanismo.leitura.MecanismoLeitura;
import java.util.HashMap;

/**
 * @author G01
 */
public class RegistoMecanismosLeitura {
    
    /**
     * Maoa de mecanismos de leitura, cada extensão tem associado um mecanismo 
     * diferente.
     */
    private HashMap<String, MecanismoLeitura> listaMecanismosLeitura;
    
    /**
     * Constrói uma instância de RegistoMecanismosLeitura sem parametros.
     */
    public RegistoMecanismosLeitura() {
        this.listaMecanismosLeitura = new HashMap(); 
    }

    /**
     * Devolve a lista de mecanismos de leitura da empresa.
     * 
     * @return Lista de Mecanismos de leitura da empresa.
     */
    public HashMap<String, MecanismoLeitura> getListaMecanismosLeitura() {
        return this.listaMecanismosLeitura;
    }
    
    /**
     * Devolve o mecanismo de leitura adequeando ao ficheiro recbeido por
     * parâmetro. 
     * 
     * @param ficheiro Ficheiro.
     * @return Mecanismo de leitura adequado.
     */
    public MecanismoLeitura getMecanismoAdequadoAoFicheiro(String ficheiro) {
        int separador = ficheiro.lastIndexOf(".");
        String extensao = ficheiro.substring(separador + 1);

        return this.listaMecanismosLeitura.get(extensao);
    }
    
}
