package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.Submissao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author G01
 */
public class GerarEstatisticasTopicos {

    private Empresa empresa;

    private RegistoEventos registoEventos;

    private List<Submissao> listaSubmissoesAceites;

    private List<Submissao> listaSubmissoesRejeitadas;

    public GerarEstatisticasTopicos(Empresa empresa) {
        this.empresa = empresa;
    }

//    public void getListaSSubmissoesAceites() {
//
//        this.registoEventos = this.empresa.getRegistoEventos();
//
//        this.listaSubmissoesAceites = new ArrayList<>();
//        this.listaSubmissoesRejeitadas = new ArrayList<>();
//
//        registoEventos.getSubmissoesAceitesRejeitadas(listaSubmissoesAceites, listaSubmissoesRejeitadas);
//    }
//
//    public void getRecomendacoesGlobaisPalavrasChaves() {
//
//        HashMap recomendacaoGlobalSubmissoesAceites
//                = this.registoEventos.getRecomendacoesGlobaisSubmissoesAceites(
//                        this.listaSubmissoesAceites);
//
//        HashMap recomendacaoGlobalSubmissoesRejeitadas
//                = this.registoEventos.getRecomendacoesGlobaisSubmissoesRejeitadas(
//                        this.listaSubmissoesRejeitadas);
//    }
    
    public void getHashMap() {
        
        this.registoEventos = this.empresa.getRegistoEventos();
        
        HashMap hashMapSubmissoesAceites = new HashMap();
        
        HashMap hashMapSubmissoesRejeitadas = new HashMap();
                
         registoEventos.hashMapSubmissoes(hashMapSubmissoesAceites,hashMapSubmissoesRejeitadas); 
    }
}

