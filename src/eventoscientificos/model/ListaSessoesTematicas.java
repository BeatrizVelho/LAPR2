package eventoscientificos.model;

import java.util.ArrayList;
import java.util.List;
import utils.Data;

/**
 * Representa uma instância de uma lista de Sessões Temáticas através dessa
 * mesma lista.
 *
 * @author G01
 */
public class ListaSessoesTematicas {

    /**
     * Lista de Sessões Temáticas.
     */
    private List<SessaoTematica> listaSessoesTematicas;

    /**
     * Constrói uma instância de uma lista de Sessões Temáticas vazia.
     */
    public ListaSessoesTematicas() {
        this.listaSessoesTematicas = new ArrayList();
    }

    /**
     * Cria uma instância de sessão temática com um código único, uma descrição,
     * uma data de inicio de submissão e data de fim de submissão.
     *
     * @param codigoUnico Código único da Sessão Temática.
     * @param descricao Descrição da Sessão Temátiica.
     * @param dataInicioSubmissao Data de inicio do periodo de submissão da
     * Sessão Temática.
     * @param dataFimSubmissao Data de fim do periodo de submissão da Sessão
     * Temática.
     * @return Sessão Temática.
     */
    public SessaoTematica novaSessaoTematica(
                        String codigoUnico,
                        String descricao,
                        Data dataInicioSubmissao,
                        Data dataFimSubmissao) {
        return new SessaoTematica(
                            codigoUnico, descricao, dataInicioSubmissao, dataFimSubmissao);
    }

    /**
     * Valida uma instância de Sessão Temática verificando se a mesma já existe
     * numa lista.
     *
     * @param sessaoTematica Sessão Temática que vai ser procurada na lista.
     * @return Verdadeiro se a Sessão Temática já existir na lista e falso caso
     * não exista.
     */
    public boolean validarSessaoTematica(SessaoTematica sessaoTematica) {
        return !this.listaSessoesTematicas.contains(sessaoTematica);
    }

    /**
     * Adiciona uma instância de uma Sessão Temática a uma lista.
     *
     * @param sessaoTematica Sessão Temática que vai ser adicionada à lista.
     * @return Verdadeiro caso a Sessão Temática seja adicionada à lista e falso
     * caso a adição falhe.
     */
    public boolean adicionarSessaoTematica(SessaoTematica sessaoTematica) {
        return this.listaSessoesTematicas.add(sessaoTematica);
    }

    /**
     * Compara dois objetos entre si. Comparando primariamente a posição de
     * memória, seguida do conteudo e das classes as quais cada um deles
     * pertence, e finalmente os seus atributos, lista de sessões temáticas.
     *
     * @param outroObjeto ListaSessoesTematicas que vai ser usada na comparação.
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

        ListaSessoesTematicas outraListaSessoesTematicas
                            = (ListaSessoesTematicas) outroObjeto;

        return this.listaSessoesTematicas.equals(
                            outraListaSessoesTematicas.listaSessoesTematicas);
    }

    /**
     * Verifica se existem Sessões Temáticas a uma lista.
     *
     * @return Verdadeiro caso existam Sessões Temáticas definidas na lista e
     * falso caso esteja vazia.
     */
    public boolean temSessoesTematicasDefinidas() {
        return this.listaSessoesTematicas.size() > 0;
    }

}
