package eventoscientificos.model;

/**
 * Representa um autor correspondente através do utilizador e da instituição de
 * afiliação.
 * 
 * @author G01
 */
public class AutorCorrespondente extends Autor {
    
    /**
     * Constrói uma instância de autor recebendo um utilizador e uma instituição
     * de afiliação.
     * 
     * @param utilizador Utilizador do autor.
     * @param instituicaoAfiliacao Instituicao de afiliacao do autor.
     */
    public AutorCorrespondente(
            Utilizador utilizador, InstituicaoAfiliacao instituicaoAfiliacao) {
        
        super(utilizador, instituicaoAfiliacao);
    }
    
}
