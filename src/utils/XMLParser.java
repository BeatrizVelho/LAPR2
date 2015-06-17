package utils;

import eventoscientificos.model.CP;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.Local;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.Utilizador;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * Representa uma instância de um parser de XML, responsável pela persistência
 * dos dados da aplicação, através de uma empresa e dos caminhos para ficheiros.
 *
 * @author G01
 */
public class XMLParser {

    /**
     * Frame principal.
     */
    private Frame framePai;

    /**
     * Empresa onde é guardada a informação.
     */
    private Empresa empresa;

    /**
     * Locais de todos os eventos, com o respetivo ID de cada um.
     */
    private HashMap<String, String> locais;

    /**
     * Caminho para o ficheiro .xml dos utilizadores.
     */
    private String caminhoFicheiroUtilizador = "Utilizador.xml";

    /**
     * Caminho para o ficheiro .xml dos eventos e locais.
     */
    private String caminhoFicheiroEvento = "Evento.xml";
    private String caminhoFicheiroLocal = "Local.xml";

    /**
     * Tags passíveis de serem encontradas no ficheiro .xml dos utilizadores.
     */
    private String listaUtilizadoresTag = "ListaUtilizadores";
    private String numeroElementosTag = "NumeroElementos";
    private String utilizadoresTag = "Utilizadores";
    private String utilizadorTag = "Utilizador";
    private String usernameTag = "Username";
    private String nomeTag = "Nome";
    private String emailTag = "Email";
    private String passwordTag = "Password";

    /**
     * Tags passíveis de serem encontradas no ficheiro .xml dos locais.
     */
    private String listaLocaisTag = "ListaLocais";
    private String numElementosTag = "NumElementos";
    private String locaisTag = "Locais";
    private String localTag = "Local";
    private String localIDTag = "LocalID";
    private String designacaoTag = "Designacao";

    /**
     * Tags passíveis de serem encontradas no ficheiro .xml dos eventos.
     */
    
    /**
     * Evento
     */
    private String listaEventosTag = "ListaEventos";
    private String numeroEventosTag = "NumeroEventos";
    private String eventosTag = "EventosTag";
    private String eventoTag = "Evento";
    private String tituloTag = "Titulo";
    private String descricaoTag = "Descricao";
    private String dataInicioTag = "DataInicio";
    private String dataFimTag = "DataFim";
    private String dataInicioSubmissaoTag = "DataInicioSubmissao";
    private String dataFimSubmissaoTag = "DataFimSubmissao";
    private String dataInicioDistribuicaoTag = "DataInicioDistribuicao";
    private String dataLimiteRevisaoTag = "DataLimiteRevisao";
    private String dataLimiteSubmissaoEmCameraReadyTag = "DataLimiteSubmissaoEmCameraReady";
    private String estadoEventoTag = "EstadoEvento";
    private String listaOrganizadoresTag = "ListaOrganizadores";
    private String numeroOrganizadoresTag = "NumeroOrganizadores";
    private String organizadoresTag = "Organizadores";
    private String organizadorTag = "Organizador";
    private String cpTag = "CP";
    private String numeroMembrosCPTag = "NumeroMembrosCP";
    private String membrosCPTag = "MembrosCP";
    private String membroCPTag = "MembroCP";

    /**
     * Sessão Temática
     */
    private String listaSessoesTematicasTag = "ListaSessoesTematicas";
    private String numeroSessoesTematicasTag = "NumeroSessoesTematicas";
    private String sessoesTematicasTag = "SessoesTematicas";
    private String sessaoTematicaTag = "SessaoTematica";
    private String codigoCPTag = "CodigoCP";
    private String descricaoCPTag = "DescricaoCP";
    private String listaProponentesTag = "ListaProponentes";
    private String numeroProponentesTag = "NumeroProponentes";
    private String proponentesTag = "Proponentes";
    private String proponenteTag = "Proponente";
    private String CPSessaoTag = "CPSessao";
    private String numeroMembrosCPSTTag = "NumeroMembrosCPST";
    private String membrosCPSessaoTag = "MembrosCPSessao";
    private String membroCPSessaoTag = "MembroCPSessao";

    /**
     * Lista de Submissões Evento/Sessão Temática
     */
    private String listaSubmissoesTag = "ListaSubmissoes";
    private String numeroSubmissoesTag = "NumeroSubmissoes";
    private String submissoesTag = "Submissoes";
    private String submissaoTag = "Submissao";

    /**
     * Representa uma instância de um parser de XML, recebendo uma empresa.
     *
     * @param empresa Empresa onde é guardada a informação.
     */
    public XMLParser(java.awt.Frame parent, Empresa empresa) {
        this.empresa = empresa;
    }

    /**
     * Lê o ficheiro XML que contém os dados dos utilizadores da aplicação.
     */
    public void lerFicheiroUtilizador() {
        RegistoUtilizadores registoUtilizadores
                = this.empresa.getRegistoUtilizadores();

        try {
            Document doc = lerFicheiro(caminhoFicheiroUtilizador);
            int numeroUtilizadores = -1;
            numeroUtilizadores = Integer.parseInt(doc.getElementsByTagName(numeroElementosTag).item(0).getTextContent());
            NodeList nodeList = doc.getElementsByTagName(utilizadorTag);

            if (numeroUtilizadores != -1 && numeroUtilizadores != nodeList.getLength()) {
                throw new IllegalArgumentException();
            }

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String username = element.getElementsByTagName(usernameTag).item(0).getTextContent();
                    String nome = element.getElementsByTagName(nomeTag).item(0).getTextContent();
                    String email = element.getElementsByTagName(emailTag).item(0).getTextContent();
                    String password = element.getElementsByTagName(passwordTag).item(0).getTextContent();

                    registoUtilizadores.adicionaUtilizador(
                            registoUtilizadores.novoUtilizador(
                                    nome, email, username, password));
                }
            }
        } catch (ParserConfigurationException | IOException | SAXException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(framePai, "Ocorreu um erro durante a leitura dos ficheiros XML.", "Leitura XML", JOptionPane.ERROR_MESSAGE);
            this.empresa = new Empresa();
        }

    }

    /**
     * Lê o ficheiro .xml que contém os dados sobre os locais da aplicação.
     */
    public void lerFicheiroLocal() {
        this.locais = new HashMap();

        try {
            Document doc = lerFicheiro(caminhoFicheiroLocal);

            int numeroLocais = -1;
            numeroLocais = Integer.parseInt(doc.getElementsByTagName(numElementosTag).item(0).getTextContent());
            NodeList nodeList = doc.getElementsByTagName(localTag);

            if (numeroLocais != -1 && numeroLocais != nodeList.getLength()) {
                throw new IllegalArgumentException();
            }

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    String id = element.getElementsByTagName(localIDTag).item(0).getTextContent();
                    String designacao = element.getElementsByTagName(designacaoTag).item(0).getTextContent();

                    this.locais.put(id, designacao);
                }
            }

            if (this.locais.isEmpty()) {
                throw new IllegalArgumentException();
            }
        } catch (ParserConfigurationException | IOException | SAXException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(framePai, "Ocorreu um erro durante a leitura dos ficheiros XML.", "Leitura XML", JOptionPane.ERROR_MESSAGE);
            this.empresa = new Empresa();
        }
    }

    /**
     * Lê o ficheiro XML que contém os dados dos eventos da aplicação.
     */
    public void lerFicheiroEvento() {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        RegistoUtilizadores registoUtilizadores = this.empresa.getRegistoUtilizadores();

        try {
            Document docEvento = lerFicheiro(caminhoFicheiroEvento);

            NodeList nList = docEvento.getElementsByTagName(eventoTag);

            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;

                    String titulo = eElement.getElementsByTagName(tituloTag).item(0).getTextContent();
                    String descricao = eElement.getElementsByTagName(descricaoTag).item(0).getTextContent();
                    String nomeLocal = this.locais.get(eElement.getElementsByTagName(localTag).item(0).getTextContent());
                    Local local = new Local(nomeLocal);
                    Data dataInicio = Data.converterString(eElement.getElementsByTagName(dataInicioTag).item(0).getTextContent());
                    Data dataFim = Data.converterString(eElement.getElementsByTagName(dataFimTag).item(0).getTextContent());
                    Data dataInicioSubmissao = Data.converterString(eElement.getElementsByTagName(dataInicioSubmissaoTag).item(0).getTextContent());
                    Data dataFimSubmissao = Data.converterString(eElement.getElementsByTagName(dataFimSubmissaoTag).item(0).getTextContent());
                    Data dataInicioDistribuicao = Data.converterString(eElement.getElementsByTagName(dataInicioDistribuicaoTag).item(0).getTextContent());
                    Data dataFimRevisao = Data.converterString(eElement.getElementsByTagName(dataLimiteRevisaoTag).item(0).getTextContent());
                    Data dataFimSubmissaoCameraReady = Data.converterString(eElement.getElementsByTagName(dataLimiteSubmissaoEmCameraReadyTag).item(0).getTextContent());

                    Evento evento = registoEventos.novoEvento(
                            titulo, descricao, local, dataInicioSubmissao,
                            dataFimSubmissao, dataInicioDistribuicao,
                            dataFimRevisao, dataFimSubmissaoCameraReady,
                            dataInicio, dataFim);

                    for (String username : lerIntervenientes(docEvento, numeroOrganizadoresTag, organizadorTag)) {
                        Utilizador utilizador = registoUtilizadores.getUtilizador(username);
                        if (utilizador == null) {
                            throw new IllegalArgumentException();
                        }

                        evento.novoOrganizador(utilizador);
                    }

                    if (evento.validarEvento()) {
                        CP cp = evento.novaCP();

                        for (String username : lerIntervenientes(docEvento, numeroMembrosCPTag, membroCPTag)) {
                            Utilizador utilizador = registoUtilizadores.getUtilizador(username);
                            if (utilizador == null) {
                                throw new IllegalArgumentException();
                            }

                            cp.novoRevisor(utilizador);
                        }

                        evento.adicionarCP(cp);
                    }

                    registoEventos.adicionarEvento(evento);
                }
            }

        } catch (ParserConfigurationException | IOException | SAXException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(framePai, "Ocorreu um erro durante a leitura dos ficheiros XML.", "Leitura XML", JOptionPane.ERROR_MESSAGE);
            this.empresa = new Empresa();
        }
    }

    /**
     *
     */
    public void escreverFicheiroUtilizador() {
        // Precisa de implementação
    }

    public void escreverFicheiroLocal() {
        // Precisa de implementação
    }

    /**
     *
     */
    public void escreverFicheiroEvento() {
        // Precisa de implementação
    }

    /**
     *
     *
     * @param doc
     * @param totalIntervenientes
     * @param interveniente
     * @return
     */
    private List<String> lerIntervenientes(Document doc, String totalIntervenientes, String interveniente) {
        List<String> listaUsernames = new ArrayList();

        int numeroOrganizadores = -1;
        numeroOrganizadores = Integer.parseInt(doc.getElementsByTagName(totalIntervenientes).item(0).getTextContent());
        NodeList nList = doc.getElementsByTagName(interveniente);

        if (numeroOrganizadores != -1 && numeroOrganizadores != nList.getLength()) {
            throw new IllegalArgumentException();
        }

        for (int temp = 0; temp < nList.getLength(); temp++) {
            Node nNode = nList.item(temp);

            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element) nNode;
                listaUsernames.add(eElement.getTextContent());
            }
        }

        return listaUsernames;
    }

    /**
     * Lê e processa um ficheiro XML
     *
     * @param caminho Caminho do ficheiro a ler.
     * @return Construção de uma árvore em XML.
     */
    private Document lerFicheiro(String caminho) throws ParserConfigurationException, IOException, SAXException {
        File ficheiro = new File(caminho);
        DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        docBuilder = docBuilderF.newDocumentBuilder();
        Document doc = docBuilder.parse(ficheiro);
        doc.normalize();

        return doc;
    }

}
