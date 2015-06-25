package eventoscientificos.controllers;

import eventoscientificos.model.Decidivel;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.ListaDecisoes;
import eventoscientificos.model.ListaRevisoes;
import eventoscientificos.model.ProcessoDecisao;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.Utilizador;
import eventoscientificos.model.mecanismo.decisao.MecanismoDecisao;
import java.util.List;

/**
 * Representa uma instância de DecidirSubmissoesArtigosController.
 * 
 * @author G01
 */
public class DecidirSubmissoesArtigosController {
    
    /**
     * Instância de Empresa.
     */
    private Empresa empresa;
    
    /**
     * Lista de Decidivel.
     */
    private List<Decidivel> listaDecidivel;
    
    /**
     * Instância de Decidivel.
     */
    private Decidivel decidivel;
    
    /**
     * Instância de ProcessoDecisao.
     */
    private ProcessoDecisao processoDecisao;
    
    /**
     * Instância de MecanismoDecisao.
     */
    private MecanismoDecisao mecanismoDecisao;
    
    /**
     * Constrói uma instância de DecidirSubmissoesArtigosController recebendo uma
     * empresa.
     * 
     * @param empresa Empresa que contém os dados.
     */
    public DecidirSubmissoesArtigosController(Empresa empresa) {
        this.empresa = empresa;
        
    }
    
    public boolean getListaDecidiveisOrganizadorProponente(){
        RegistoEventos registoEventos = empresa.getRegistoEventos();
        
        Utilizador utilizador = this.empresa.getUtilizadorAutenticado();
        
        this.listaDecidivel = registoEventos.getListaDecidivelOrganizadorProponente(utilizador);
        
        return this.listaDecidivel != null;
    }
    
    public boolean selecionarDefinivel(int indice){
        this.decidivel = this.listaDecidivel.get(indice);
        
        this.processoDecisao = this.decidivel.novoProcessoDecisao();
        
        List<MecanismoDecisao> listaMecanismoDecisao = empresa.getListaMecanismoDecisao();
        
        return listaMecanismoDecisao.size() > 0;
    }
    
//    public List<MecanismoDecisao> getListaMecanismoDecisao(){
//        List<MecanismoDecisao> listaMecanismoDecisao = empresa.getListaMecanismoDecisao();
//        
//        return listaMecanismoDecisao;
//    }
//    
////    public boolean adicionarMecanismoDecisao(String id){
////        this.processoDecisao.adicionarMecanismoDecisao(mecanismoDecisao);
////        
//////        ListaRevisoes listaRevisoes = this.empresa.getRegistoEventos();
////        
////        ListaRevisoes listaRevisoes = new ListaRevisoes();
////        
////        ListaDecisoes listaDecisoes = this.processoDecisao.classificarSubmissoes(listaRevisoes);
////    }
////    
//    
//    public boolean adicionarProcessoDecisao(){
//        return this.decidivel.adicionarProcessoDecisao(processoDecisao);
//    }
}
