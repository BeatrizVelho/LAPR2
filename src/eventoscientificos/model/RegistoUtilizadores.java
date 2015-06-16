package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma instancia de RegistoUtilizadores que representa uma lista de
 * utilizadores do sistema
 *
 * @author G01
 */
public class RegistoUtilizadores {

    /**
     * Lista de Utilizadores do sistema
     */
    private List<Utilizador> listaUtilizadores;

    /**
     * Constrói uma instância de RegistoUtilizadores sem parametros.
     */
    public RegistoUtilizadores() {

        this.listaUtilizadores = new ArrayList<>();
    }

    /**
     * Cria uma instancia de utilizador recebendo como parametros o nome, o
     * email, o username e password de utilizador
     *
     * @param nome nome do utilizador a criar
     * @param email email do utilizador a criar
     * @param username username do utilizador a criar
     * @param password password do utilizado a criar
     * @return Utilizador
     */
    public Utilizador novoUtilizador(String nome, String email, String username, String password) {
        Utilizador utilizador = new Utilizador(nome, email, username, password);
        if (!utilizador.validarUtilizador()) {
            throw new IllegalArgumentException(" Utilizador invalido");
        }
        if (!validarUtilizador(utilizador)) {
            throw new IllegalArgumentException("Utilizador ja consta na lista"
                    + " de utilizadores da empresa");
        }
        return utilizador;
    }

    /**
     * Adiciona o utilizador passado por parametro a lista de utilizadores caso
     * este nao exista na lista
     *
     * @param utilizador instancia de Utilizador a adicionar
     * @return true quando adicionado caso o utilizador nao exista na lista de
     * utilizadores e adicionado e false caso o utilizador
     */
    public boolean adicionaUtilizador(Utilizador utilizador) {
        return this.listaUtilizadores.add(utilizador);
    }

    /**
     * Verifica se o utilizador passado por parametro ja consta na lista de
     * utilizadores
     *
     * @param utilizador instancia de Utilizador a verificar
     * @return true caso nao exista na lista e false caso ja conste
     */
    private boolean validarUtilizador(Utilizador utilizador) {
        return !listaUtilizadores.contains(utilizador);
    }

    /**
     * Verifica se o utilizador passado por paraemtro já consta na lista de
     * utilizadores, ignorando o utilizador que lhe deu origem.
     *
     * @return Verdadeiro se o utilizador passado por parametro não existir 
     */
    public boolean validarUtilizadorClone(
            Utilizador utilizador, Utilizador utilizadorClone) {
        for (Utilizador outroUtilizador : this.listaUtilizadores) {
            if (utilizadorClone.equals(outroUtilizador)
                    && !utilizador.equals(outroUtilizador)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Atualiza um utilizador na lista de utilizadores, substituindo o atual
     * pelo novo.
     * 
     * @param utilizador Utilizador antigo.
     * @param utilizadorClone Utilizador novo.
     * @return Verdadeiro se for possível realizar a atualização e falso caso 
     * não seja.
     */
    public boolean atualizarUtilizador(
            Utilizador utilizador, Utilizador utilizadorClone) {
        return this.listaUtilizadores.remove(utilizador) 
                && this.listaUtilizadores.add(utilizadorClone);
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos lista de utilizadores.
     *
     * @param outroObjeto Utilizador que vai ser usado na comparação.
     * @return Verdadeiro caso os objetos comparados sejam iguais e falso caso
     * não o sejam.
     */
    public boolean equals(Object outroObjeto) {
        if (this == outroObjeto) {
            return true;
        }

        if (outroObjeto == null || this.getClass() != outroObjeto.getClass()) {
            return false;
        }

        RegistoUtilizadores outroRegisto = (RegistoUtilizadores) outroObjeto;

        return this.listaUtilizadores.equals(outroRegisto.listaUtilizadores);
    }

    /**
     * Procura um utilizador na lista de utilizadores através dos seus
     * identificadores (username ou email).
     *
     * @param id ID do utilizador, pode ser o seu utilizador ou email
     * @return Um objeto do tipo utilizador, caso o mesmo exista, senão retorna
     * null.
     */
    public Utilizador getUtilizador(String id) {
        for (Utilizador utilizador : this.listaUtilizadores) {
            if (utilizador.getEmail().equals(id)
                    || utilizador.getUsername().equals(id)) {
                return utilizador;
            }
        }

        return null;
    }

}
