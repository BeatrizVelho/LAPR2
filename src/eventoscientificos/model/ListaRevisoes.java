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
     * Constrói instância de ListaRevisoes.
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
     * Devolve a taxa de aceitação e as médias de cada parâmetro de avaliação
     * (adequação, confiança, originalidade, qualidade e recomendação)
     *
     * @param nSubmissoes numero total de submissões
     * @return taxa de aceitação e as médias de cada parâmetro de avaliação.
     */
    public float[] getValoresTotaisParaEstatisticaEvento(int nSubmissoes) {
        int nSubmissoesAceites = 0, totalAdequacao = 0, totalConfianca = 0, totalOriginalidade = 0,
                            totalQualidade = 0, totalRecomendacao = 0;

        float[] vecTaxaEMediaParametrosAvaliacao = new float[6];

        for (Revisao r : this.listaRevisoes) {
            Submissao s = r.getSubmissao();
            if (s.isStateAceite()) {
                nSubmissoesAceites++;

                totalAdequacao += r.getAdequacaoArtigo();
                totalConfianca += r.getConfiancaRevisor();
                totalOriginalidade += r.getOriginalidadeArtigo();
                totalQualidade += r.getQualidadeArtigo();
                totalRecomendacao += r.getRecomendacaoGlobal();
            }
        }
        vecTaxaEMediaParametrosAvaliacao[0] = nSubmissoesAceites / nSubmissoes;
        vecTaxaEMediaParametrosAvaliacao[1] = totalAdequacao / nSubmissoesAceites;
        vecTaxaEMediaParametrosAvaliacao[2] = totalConfianca / nSubmissoesAceites;
        vecTaxaEMediaParametrosAvaliacao[3] = totalOriginalidade / nSubmissoesAceites;
        vecTaxaEMediaParametrosAvaliacao[4] = totalQualidade / nSubmissoesAceites;
        vecTaxaEMediaParametrosAvaliacao[5] = totalRecomendacao / nSubmissoesAceites;

        return vecTaxaEMediaParametrosAvaliacao;
    }
   
}
