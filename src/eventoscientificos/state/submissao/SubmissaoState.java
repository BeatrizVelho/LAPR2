package eventoscientificos.state.submissao;

/** 
 * @author G01
 */
public interface SubmissaoState {
    
    boolean setCriada();
    
    boolean setEmSubmissao();
    
    boolean setEmLicitacao();
    
    boolean setEmRevisao();
    
    boolean setRevista();
    
    boolean setNaoRevista();
    
    boolean setAceite();
    
    boolean setRejeitada();
    
    boolean setEmCameraRedy();
    
    boolean setSemArtigoFinal();
    
    boolean setRemovida();
    
    boolean validarEstado();
    
}
