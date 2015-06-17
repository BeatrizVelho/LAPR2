package eventoscientificos.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

/**
 * Representa uma instância de ModeloListaPapel, uma classe genérica aplicável
 *
 * @param <E> Papel assumivel: Organizador, Proponente, Revisor.
 *
 * @author G01
 */
public class ModeloListaPapel<E> extends AbstractListModel<E> {

    /**
     * Lista de um determinado papel que se assume na aplicação.
     */
    private List<E> listaPapel;

    /**
     * Constrói uma instância de ModeloListaPapel com uma lista de um papel que
     * se assume vazia.
     *
     */
    public ModeloListaPapel() {
        this.listaPapel = new ArrayList();
    }

    /**
     * Devolve o tamanho da lista do papel.
     *
     * @return Tamanho da lista do papel.
     */
    @Override
    public int getSize() {
        return this.listaPapel.size();
    }

    /**
     * Devolve o objeto que se encontra numa dada posição da lista.
     *
     * @param index Posição da lista.
     * @return Objeto da lista, caso o encontre.
     */
    @Override
    public E getElementAt(int index) {
        return this.listaPapel.get(index);
    }

    /**
     * Adiciona um elemento à lista.
     *
     * @param elemento Elemento a adicionar.
     * @return Verdadeiro se o elemento for adicionado à lista e falso se não
     * for possível adicionar.
     */
    public boolean addElement(E elemento) {
        boolean papelAdicionado = this.listaPapel.add(elemento);

        if (papelAdicionado) {
            fireIntervalAdded(elemento, this.getSize() - 1, this.getSize() - 1);
        }

        return papelAdicionado;
    }

}
