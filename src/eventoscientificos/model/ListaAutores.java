package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instância de lista de autores através de uma lista de autores
 * 
 * @author G01
 */
public class ListaAutores {
    
    /**
     * Lista de autores.
     */
    private List<Autor> listaAutores;
    
    /**
     * Constrói uma instância de uma lista de autores vazia.
     */
    public ListaAutores() {
        this.listaAutores = new ArrayList();
    }
    
    /**
     * Cria um objeto do tipo Autor através de um nome, email e uma instituição
     * de afiliação.
     *
     * @param nome Nome do autor.
     * @param email Email do autor.
     * @param instituicaoAfiliacao instituicao de afiliacao do autor
     * 
     * @return Verdadeiro que o Autor criado for adicionado à lista e falso se
     * não for.
     */
    public boolean novoAutor(String nome, String email, 
            InstituicaoAfiliacao instituicaoAfiliacao) {
        
        Autor autor = new Autor(nome, email, instituicaoAfiliacao);

        if(!autor.validarAutor()) {
            throw new IllegalArgumentException(
                    "Não introduziu um autor válido.");
        }
        if(!validarAutor(autor)) {
            throw new IllegalArgumentException("O autor introduzido já se"
                    + "econtra na lista de autores.");
        }
        
        return adicionarAutor(autor);
    }
    
    /**
     * Cria um objeto do tipo Autor através de um utilizador e uma instituição
     * de afiliação.
     * 
     * @param utilizador Utilizador que é autor.
     * @param instituicaoAfiliacao Instituicao de Afiliacao do autor.
     * 
     * @return Verdadeiro que o Autor criado for adicionado à lista e falso se
     * não for.
     */
    public  boolean novoAutor(
            Utilizador utilizador, InstituicaoAfiliacao instituicaoAfiliacao) {
        Autor autor = new Autor(utilizador, instituicaoAfiliacao);
        
        if(!autor.validarAutor()) {
            throw new IllegalArgumentException(
                    "Não introduziu um autor válido.");
        }
        if(!validarAutor(autor)) {
            throw new IllegalArgumentException("O autor introduzido já se"
                    + "econtra na lista de autores.");
        }
        
        return adicionarAutor(autor);
    }
    
    /**
     * Valida uma instância de Autor verificando se o mesmo já existe
     * na lista.
     * 
     * @param autor Autor que vai ser procurado na lista.
     * @return Verdadeiro se o Autor não existir na lista e falso caso
     *exista.
     */
    private boolean validarAutor(Autor autor) {
        return !this.listaAutores.contains(autor);
    }
    
    /**
     * Adicina um autor a lista de autores.
     * 
     * @param autor Autor a inserir na lista de autores.
     * 
     * @return Verdadeiro se for adicionado e falso se não for.
     */
    public boolean adicionarAutor(Autor autor) {
        return this.listaAutores.add(autor);
    }
    
    /**
     * Remove um autor da lista de autores.
     * 
     * @param autor Autor a remover da lista de autores.
     * @return Verdadeiro se for removido e falso se não for
     */
    public boolean removerAutor(String email) {
        for(Autor autor : this.listaAutores) {
            if(autor.getEmail().equals(email)) {
                return this.listaAutores.remove(autor);
            }
        }
        return false;
    }
    
    public boolean isAutor(Utilizador utilizador){
        for(Autor autor : this.listaAutores) {
            if(utilizador.equals(autor.getUtilizador())){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Devolve uma lista de autores registados na lista de autores.
     * 
     * @return Lista de Autores registados
     */
    public List<Autor> getListaAutoresRegistados() {
       List<Autor> listaAutoresRegistados = new ArrayList<>();
        for(Autor autor : this.listaAutores) {
            if(autor.isAutorRegistado()) {
                listaAutoresRegistados.add(autor);
            }
        }
        return listaAutoresRegistados;
    }
    
    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de autores.
     *
     * @param outroObjeto lista de autores que vai ser comparada.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    @Override
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        ListaAutores outraListaAutores = (ListaAutores) outroObjeto;

        return this.listaAutores.equals(outraListaAutores.listaAutores);
    }
}
