/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de Licitacao através do objeto revisor, objeto
 * artigo, grau de interesse e conflitos.
 *
 * @author G01
 */
public class Licitacao {

    /**
     * Revisor que licita.
     */
    private Revisor revisor;
    /**
     * Artigo a licitar.
     */
    private Artigo artigo;
    /**
     * Grau de interesse em rever.
     */
    private int grauInteresse;
    /**
     * Lista de conflitos de interesse entre o revisor e o artigo a rever
     */
    private List<Conflito> listaConflitos;
    /**
     * Grau de interesse por omissão.
     */
    private static final int GRAU_INTERESSE_POR_OMISSAO = 0;
    /**
     * Lista de conflitos por omissão.
     */
    private static final List<Conflito> LISTA_CONFLITOS_POR_OMISSAO
                        = new ArrayList<Conflito>();

    /**
     * Constrói uma instancia de Licitacao com os valores passados por parametro
     *
     * @param revisor revisor que licita o artigo
     * @param artigo artigo a licitar
     * @param grauInteresse grau de interesse em rever o artigo
     * @param listaConflitos lista de conflitos entre o revisor com o artigo
     */
    public Licitacao(Revisor revisor, Artigo artigo, int grauInteresse, List<Conflito> listaConflitos) {
        this.revisor = revisor;
        this.artigo = artigo;
        setGrauInteresse(grauInteresse);
        setListaConflitos(listaConflitos);
    }

    /**
     * Modifica o grau de interesse do revisor rever o artigo
     *
     * @param grauInteresse grau de interesse indicado pelo revisor
     */
    public void setGrauInteresse(int grauInteresse) {
        if (grauInteresse > 3 || grauInteresse < 0) {
            this.grauInteresse = GRAU_INTERESSE_POR_OMISSAO;
        } else {
            this.grauInteresse = grauInteresse;
        }
    }

    /**
     * Modifica os conflitos detetados entre o revisor e o artigo a rever
     *
     * @param listaConflitos lista de conflitos alterados pelo revisor
     */
    public void setListaConflitos(List<Conflito> listaConflitos) {
        if (listaConflitos == null) {
            this.listaConflitos = LISTA_CONFLITOS_POR_OMISSAO;
        } else {
            this.listaConflitos = listaConflitos;
        }
    }

    /**
     * Valida se a licitação se encontra devidamente preenchida
     *
     * @return verdadeira se cumprir todos os requisitos de preenchimento e
     * falso se não uma licitação válida
     */
    public boolean validarLicitacao() {
        return (this.artigo!=null && this.revisor!=null);

    }

}
