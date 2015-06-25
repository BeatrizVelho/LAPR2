package eventoscientificios.view;

import eventoscientificos.model.Autor;
import eventoscientificos.model.ListaAutores;
import javax.swing.AbstractListModel;

/**
 * Representa uma instância de ModeloListaAutores através de uma lista de
 * autores.
 *
 * @author G01
 */
public class ModeloListaAutores extends AbstractListModel<Autor> {

    /**
     * Lista de autores.
     */
    private ListaAutores listaAutores;

    /**
     * Constrói uma instância de ModeloListaAutores recebendo uma lista de
     * autores.
     *
     * @param listaAutores Lista de autores.
     */
    public ModeloListaAutores(ListaAutores listaAutores) {
        this.listaAutores = listaAutores;
    }

    /**
     * Devolve o tamanho da lista de autores.
     *
     * @return Tamanho da lista de autores.
     */
    @Override
    public int getSize() {
        return this.listaAutores.getNumeroAutores();
    }

    /**
     * Devolve o autor de uma determinada posição.
     *
     * @param index Posição do autor na lista.
     *
     * @return Autor.
     */
    @Override
    public Autor getElementAt(int index) {
        return this.listaAutores.getAutorPeloID(index);
    }

}
