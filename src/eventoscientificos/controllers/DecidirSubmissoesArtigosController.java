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
     * Instância de ListaDecisoes.
     */
    private ListaDecisoes listaDecisoes;

    /**
     * Constrói uma instância de DecidirSubmissoesArtigosController.
     * 
     * @param empresa Empresa
     */
    public DecidirSubmissoesArtigosController(Empresa empresa) {
        this.empresa = empresa;
        this.listaDecidivel = null;
        this.decidivel = null;
        this.processoDecisao = null;
        this.mecanismoDecisao = null;
        this.listaDecisoes = null;
    }
    
    /**
     * Devolve uma lista decidivel de eventos e sessões temáticas
     * onde o utilizador é organizador/proponente.
     * 
     * @return listaDecidivel
     */
    public boolean getListaDecidiveisOrganizadorProponente(){
        RegistoEventos registoEventos = empresa.getRegistoEventos();
        Utilizador utilizador = this.empresa.getUtilizadorAutenticado();
        this.listaDecidivel = registoEventos.getListaDecidivelOrganizadorProponente(utilizador);
        return this.listaDecidivel != null;
    }
    
    /**
     * Seleciona evento/sessao tematica da lista decidivel, pelo indice. 
     * 
     * @param indice Indice do decidivel
     * @return listaMecanismoDecisao
     */
    public boolean selecionarDefinivel(int indice){
        this.decidivel = this.listaDecidivel.get(indice);       
        this.processoDecisao = this.decidivel.novoProcessoDecisao();      
        List<MecanismoDecisao> listaMecanismoDecisao = empresa.getListaMecanismoDecisao();
        return this.decidivel != null && this.processoDecisao != null
                &&listaMecanismoDecisao.size() > 0;
    }
    
    /**
     * Adiciona mecanismo de mecanismo de decisao selecionado previamente
     * ao processo de decisão.
     * 
     * @param id Identificação
     * @return ListaDecisoes.
     */
    public boolean adicionarMecanismoDecisao(String id){
        this.processoDecisao.adicionarMecanismoDecisao(mecanismoDecisao);
        ListaRevisoes listaRevisoes = new ListaRevisoes();
        this.listaDecisoes = this.processoDecisao.classificarSubmissoes(listaRevisoes);
        return listaDecisoes != null;
    }
    
    /**
     * Adiciona processo de decisão ao decidivel.
     * 
     * @return Verdadeiro se adicionar.
     */
    public boolean adicionarProcessoDecisao(){
        return this.decidivel.adicionarProcessoDecisao(processoDecisao);
    }
}
