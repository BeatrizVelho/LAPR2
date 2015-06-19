package eventoscientificos.controllers;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.ListaSubmissoes;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.Submissao;
import eventoscientificos.model.Submissivel;
import eventoscientificos.model.Utilizador;
import java.util.List;

/**
 *
 * @author G01
 */
public class ListarSubmissoesRetiradasController {
    
    /**
     * Instância de empresa.
     */
    private Empresa empresa;
    
    /**
     * Instância de listaSubmissiveisComSubRetiradas.
     */
    private List<Submissivel> listaSubmissiveisComSubRetiradas;
    
    /**
     * Constrói uma instância de ListarSubmissoesRetiradasController.
     *
     * @param empresa empresa.
     */
    public ListarSubmissoesRetiradasController(Empresa empresa) {
        this.empresa = empresa;
        this.listaSubmissiveisComSubRetiradas = null;
    }
    
    /**
     * Retorna uma lista de submissiveis com submissões retiradas do
     * evento/sessão temática em que o utilizador autenticado
     * é organizador/proponente.
     * 
     * @return Verdadeiro caso exista uma lista e falso se não existir.
     */
    public boolean getListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        
        Utilizador utilizador = this.empresa.getUtilizadorAutenticado();
        
        this.listaSubmissiveisComSubRetiradas = registoEventos.
                getListaSubmissiveisComSubmissoesRetiradasOrganizadorProponente
        (utilizador);
        
                
        return listaSubmissiveisComSubRetiradas != null;
    }
    
    /**
     * Retorna uma lista de submissões retiradas do evento/sessão temática
     * que tenham submissões retiradas.
     * 
     * @param indice Indice do submissivel selecionado.
     * @return Verdadeiro caso exista uma lista com submissoes retiradas
     * e falso se não existir.
     */
    public boolean selecionarSubmissivel(int indice){
        
        Submissivel submissivel = this.listaSubmissiveisComSubRetiradas.get(indice);
        
        List<Submissao> listaSubmissoesRetiradas = submissivel.getListaSubmissoesRetiradas();

        
        return listaSubmissoesRetiradas != null;
    }
    
    
    
}
