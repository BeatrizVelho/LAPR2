package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de ListaRevisoes através de uma lista de Revisões
 *
 * @author G01
 */
public class ListaRevisoes {

    /**
     * Lista de revisões.
     */
    private List<Revisao> listaRevisoes;

    /**
     * Quantidade de revisões revistas
     */
    private static int quantidadeRevisoesRevistas = 0;

    /**
     * Constrói instância de ListaRevisoes
     */
    public ListaRevisoes() {
        this.listaRevisoes = new ArrayList<>();
    }

    /**
     * Constrói uma instância de revisão com os valores recebidos por parametro
     *
     * @param submissao submissão associada à revisão
     * @param revisor revisor associado à revisão
     * @return revisão criada
     */
    public Revisao novaRevisao(Submissao submissao, Revisor revisor) {
        return new Revisao(submissao, revisor);
    }

    /**
     * Adiciona uma instância de revisão à lista de revisões
     *
     * @param revisao revisão a adicionar
     * @return verdadeiro se for adicionada com sucesso e falso se não for
     * possível adicioná-la
     */
    public boolean adicionarRevisao(Revisao revisao) {
        return this.listaRevisoes.add(revisao);
    }

    /**
     * Devolve uma lista de revisões cujo o utilizador em sistema é revisor
     *
     * @param u utilizador em sistema
     * @return lista de revisões do revisor
     */
    public List<Revisao> getRevisoesRevisor(Utilizador u) {
        Revisor revisor = new Revisor(u);
        List<Revisao> listaRevisoesDoRevisor = new ArrayList<>();
        for (Revisao r : this.listaRevisoes) {
            if ((r.getRevisor().equals(revisor)) && (r.validarRevisao() == false)) {
                listaRevisoesDoRevisor.add(r);
            }
        }
        return listaRevisoesDoRevisor;
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de revisões.
     *
     * @param outroObjecto ListaRevisoes a comparar
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjecto) {
        if (this == outroObjecto) {
            return true;
        }

        if (outroObjecto == null || this.getClass() != outroObjecto.getClass()) {
            return false;
        }

        ListaRevisoes outraLista = (ListaRevisoes) outroObjecto;

        return this.listaRevisoes.equals(outraLista.listaRevisoes);
    }

    /**
     * Devolve a quantidade de revisões revistas.
     *
     * @return quantidade de revisões revistas.
     */
    public int getQuantidadeRevisoesPorRever() {
        return listaRevisoes.size() - quantidadeRevisoesRevistas;
    }

    /**
     * Adiciona o resultado da revisao clone na revisao da lista e classifica-a
     * como revista na lista
     *
     * @param revisao revisao a alterar
     * @param rClone revisao provisória
     * @return verdadeiro se adicionar a informação e falso se não conseguir
     */
    public boolean adicionarResultadoRevisao(Revisao revisao, Revisao rClone) {
        if (revisao.adicionarResultadoRevisao(rClone)) {
            quantidadeRevisoesRevistas++;
            return true;
        } else {
            return false;
        }

    }
}
