/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de ListaLicitacoes através de uma lista de
 * licitações
 *
 * @author G01
 */
public class ListaLicitacoes {

    /**
     * Lista de licitações realizadas às submissões do licitável.
     */
    private List<Licitacao> listaLicitacoes;

    /**
     * Constrói uma instância de ListaLicitações
     *
     */
    public ListaLicitacoes() {
        listaLicitacoes = new ArrayList<>();
    }

    /**
     * Cria uma lista de licitações temporária.
     *
     * @return uma lista de licitações vazia.
     */
    public List<Licitacao> criarListaLicitacoesTemporaria() {
        return new ArrayList<>();
    }

    /**
     * Cria uma nova instância do tipo Licitação
     *
     * @param revisor revisor licitador
     * @param artigo artigo a licitar
     * @param grauInteresse grau de interesse na revisão do artigo em questão
     * @param conflitos lista de conflitos entre o revisor e o artigo
     * @return
     */
    public Licitacao novaLicitacao(Revisor revisor, Artigo artigo, int grauInteresse, List<Conflito> conflitos) {
        return new Licitacao(revisor, artigo, grauInteresse, conflitos);
    }

    /**
     * Adiciona uma lista recebido por parâmetro à lista de licitações existente
     *
     * @param listaTemporaria lista de licitações a adicionar
     * @return verdadeiro se for adicionada com sucesso e falso se não o for
     */
    public boolean adicionarListaLicitacoesTemporaria(List<Licitacao> listaTemporaria) {
        if (listaTemporaria != null) {
            this.listaLicitacoes.addAll(listaTemporaria);
            return true;
        } else {
            return false;
        }
    }
}