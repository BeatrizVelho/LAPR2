package eventoscientificos.model.mecanismo.detecao;

import eventoscientificos.model.Conflito;

/**
 * Todas as classes que implementam esta interface, herdam a responsabilidade de
 * detetar conflitos de interesse entre revisores e artigos retornando os mesmos.
 * 
 * @author G01
 */
public interface MecanismoDetecao {

    /**
     * Método responsável por detetar um conflito entre um revisor e uma 
     * submissão, aplicando-lhe uma descrição.
     * 
     * @return Conflito detetado.
     */
    Conflito detetarConflito();

}
