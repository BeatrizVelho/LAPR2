package eventoscientificos.model.mecanismo.detecao;

import eventoscientificos.model.Conflito;

/**
 * Constrói uma instância de MecanismoDetecao1.
 *
 * @author G01
 */
public class MecanismoDetecao1 implements MecanismoDetecao {

    /**
     * Constrói uma instância de MecanismoDetecao1.
     */
    public MecanismoDetecao1() {
    }

    /**
     * Deteta um conflito entre um revisor e uma submissão da forma indicada.
     *
     * @return Conflito detetado.
     */
    @Override
    public Conflito detetarConflito() {
        throw new UnsupportedOperationException(
                "Needs logic...");
    }

}
