package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.ListaSubmissoes;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Submissivel;

/**
 * @author G01
 */
public class AlterarSubmissaoController {
    
    /**
     * Intancia de Empresa.
     */
    private Empresa empresa;
    
    /**
     * Constrói uma instância de AlterarSubmissaoController recebendo uma 
     * empresa por parametro.
     * 
     * @param empresa Empresa.
     */
    public AlterarSubmissaoController(Empresa empresa) {
        this.empresa = empresa;
    }
    
//    public boolean getListaSubmissiveisAceitarArtigoComSubmissaoUtilizador() {
//        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
//        
//        List<Submissivel> listaSubmissiveis = 
//    }
    
}
