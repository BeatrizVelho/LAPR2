package utils;

import eventoscientificos.model.CP;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Evento;
import eventoscientificos.model.ListaSessoesTematicas;
import eventoscientificos.model.Local;
import eventoscientificos.model.RegistoEventos;
import eventoscientificos.model.RegistoUtilizadores;
import eventoscientificos.model.SessaoTematica;
import eventoscientificos.model.Utilizador;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
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
    private String caminhoFicheiroUtilizador = "TestSet02_Utilizador.xml";

    /**
     * Caminho para o ficheiro .xml dos eventos e locais.
     */
    private String caminhoFicheiroEvento = "TestSet02_Evento.xml";
    private String caminhoFicheiroLocal = "TestSet02_Local.xml";

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
    private String eventosTag = "Eventos";
    private String eventoTag = "Evento";
    private String tituloTag = "Titulo";
    private String descricaoTag = "Descricao";
    private String dataInicioTag = "DataInicio";
    private String dataFimTag = "DataFim";
    private String dataInicioSubmissaoTag = "DataInicioSubmissao";
    private String dataFimSubmissaoTag = "DataFimSubmissao";
    private String dataInicioDistribuicaoTag = "DataInicioDistribuicao";
    private String dataLimiteRevisaoTag = "DataLimiteRevisao";
    private String dataLimiteSubmissaoFinalTag = "DataLmiteSubmissaoFinal";
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
    private String codigoSTTag = "CodigoST";
    private String descricaoSTTag = "DescricaoST";
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
    private String listaSubmissoesEventoTag = "ListaSubmissoesEvento";
    private String listaSubmissoesTag = "ListaSubmissoes";
    private String numeroSubmissoesTag = "NumeroSubmissoes";
    private String submissoesTag = "Submissoes";
    private String submissaoTag = "Submissao";

    /**
     * Artigo
     */
    private String artigoTag = "Artigo";
    private String autorCorrespondenteTag = "AutorCorrespondente";
    private String autorSubmissorTag = "Autor Submissor";
    private String dataSubmissaoTag = "DataSubmissao";
    private String tituloArtigoTag = "TituloArtigo";
    private String resumoTag = "Resumo";
    private String listaAutoresTag = "ListaAutores";
    private String numeroAutoresTag = "NumeroAutores";
    private String autoresTag = "Autores";
    private String autorTag = "Autor";
    private String nomeAutorTag = "NomeAutor";
    private String emailAutorTag = "EmailAutor";
    private String filiacaoTag = "Filiacao";
    private String usernameAutorTag = "UsernameAutor";
    private String palavrasChaveTag = "PalavrasChave";

    /**
     * Lista Revisões.
     */
    private String listaRevisoesTag = "ListaRevisoes";
    private String numeroRevisoesTag = "NumeroRevisoes";
    private String revisoesTag = "Revisoes";
    private String revisaoTag = "Revisao";
    private String revisorTag = "Revisor";
    private String estadoRevisaoTag = "EstadoRevisao";
    private String confiancaTag = "Confianca";
    private String adequacaoTag = "Adequacao";
    private String originalidadeTag = "Originalidade";
    private String apresentacaoTag = "Apresentacao";
    private String recomendacaoTag = "Recomendacao";
    private String justificacaoTag = "Justificacao";

    /**
     * Decisao
     */
    private String decisaoTag = "Decisao";

    /**
     * Representa uma instância de um parser de XML, recebendo uma empresa.
     *
     * @param parent Frame para a qual são reportados erros.
     * @param empresa Empresa onde é guardada a informação.
     */
    public XMLParser(java.awt.Frame parent, Empresa empresa) {
        this.framePai = parent;
        this.empresa = empresa;
    }

    /**
     * Lê o ficheiro XML que contém os dados dos utilizadores da aplicação.
     */
    public void lerFicheiroUtilizador() throws ParserConfigurationException, IOException, SAXException {
        RegistoUtilizadores registoUtilizadores
                = this.empresa.getRegistoUtilizadores();

        Document doc = lerFicheiro(caminhoFicheiroUtilizador);

        if (Integer.parseInt(doc.getElementsByTagName(numeroElementosTag).item(0).getTextContent()) > 0) {
            NodeList utilizadoresNodeList = doc.getElementsByTagName(utilizadorTag);

            for (int i = 0; i < utilizadoresNodeList.getLength(); i++) {
                Node utilizadorNode = utilizadoresNodeList.item(i);

                if (utilizadorNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element utilizadorElement = (Element) utilizadorNode;

                    registoUtilizadores.adicionaUtilizador(registoUtilizadores.novoUtilizador(
                            utilizadorElement.getElementsByTagName(nomeTag).item(0).getTextContent(),
                            utilizadorElement.getElementsByTagName(emailTag).item(0).getTextContent(),
                            utilizadorElement.getElementsByTagName(usernameTag).item(0).getTextContent(),
                            utilizadorElement.getElementsByTagName(passwordTag).item(0).getTextContent()));
                }
            }
        }
    }

    /**
     * Lê o ficheiro .xml que contém os dados sobre os locais da aplicação.
     */
    public void lerFicheiroLocal() throws ParserConfigurationException, IOException, SAXException {
        this.locais = new HashMap();

        Document doc = lerFicheiro(caminhoFicheiroLocal);

        if (Integer.parseInt(doc.getElementsByTagName(numElementosTag).item(0).getTextContent()) > 0) {
            NodeList nodeList = doc.getElementsByTagName(localTag);

            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);

                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;

                    this.locais.put(
                            element.getElementsByTagName(localIDTag).item(0).getTextContent(),
                            element.getElementsByTagName(designacaoTag).item(0).getTextContent());
                }
            }
        }
    }

    /**
     * Lê o ficheiro XML que contém os dados dos eventos da aplicação.
     *
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.io.IOException
     * @throws org.xml.sax.SAXException
     */
    public void lerFicheiroEvento() throws ParserConfigurationException, IOException, SAXException {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();
        RegistoUtilizadores registoUtilizadores = this.empresa.getRegistoUtilizadores();

        Document docEvento = lerFicheiro(caminhoFicheiroEvento);

        if (Integer.parseInt(docEvento.getElementsByTagName(numeroEventosTag).item(0).getTextContent()) > 0) {
            NodeList eventosNodeList = docEvento.getElementsByTagName(eventoTag);

            for (int i = 0; i < eventosNodeList.getLength(); i++) {
                Node eventoNode = eventosNodeList.item(i);

                if (eventoNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eventoElement = (Element) eventoNode;

                    Evento evento = registoEventos.novoEvento(
                            eventoElement.getElementsByTagName(tituloTag).item(0).getTextContent(),
                            eventoElement.getElementsByTagName(descricaoTag).item(0).getTextContent(),
                            new Local(this.locais.get(eventoElement.getElementsByTagName(localTag).item(0).getTextContent())),
                            Data.converterString(eventoElement.getElementsByTagName(dataInicioSubmissaoTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataFimSubmissaoTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataInicioDistribuicaoTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataLimiteRevisaoTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataLimiteSubmissaoFinalTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataInicioTag).item(0).getTextContent()),
                            Data.converterString(eventoElement.getElementsByTagName(dataFimTag).item(0).getTextContent()));

                    if (Integer.parseInt(eventoElement.getElementsByTagName(numeroOrganizadoresTag).item(0).getTextContent()) > 0) {
                        NodeList OrganizadoresNodeList = eventoElement.getElementsByTagName(organizadorTag);

                        for (int j = 0; j < OrganizadoresNodeList.getLength(); j++) {
                            Node organizadorNode = OrganizadoresNodeList.item(j);

                            if (organizadorNode.getNodeType() == Node.ELEMENT_NODE) {
                                Element organizadorElement = (Element) organizadorNode;

                                Utilizador utilizador = registoUtilizadores.getUtilizador(organizadorElement.getTextContent());

                                if (utilizador != null) {
                                    evento.novoOrganizador(utilizador);
                                }
                            }
                        }

                        if (evento.validarEvento() && registoEventos.validarEvento(evento)) {
                            registoEventos.adicionarEvento(evento);

                            if (Integer.parseInt(eventoElement.getElementsByTagName(numeroSessoesTematicasTag).item(0).getTextContent()) > 0) {
                                NodeList sessoesTematicasNodeList = eventoElement.getElementsByTagName(sessaoTematicaTag);
                                ListaSessoesTematicas listaSessoesTematicas = evento.getListaSessoesTematicas();

                                for (int j = 0; j < sessoesTematicasNodeList.getLength(); j++) {
                                    Node sessaoTematicaNode = sessoesTematicasNodeList.item(j);

                                    if (sessaoTematicaNode.getNodeType() == Node.ELEMENT_NODE) {
                                        Element sessaoTematicaElement = (Element) sessaoTematicaNode;

                                        SessaoTematica sessaoTematica = listaSessoesTematicas.novaSessaoTematica(
                                                sessaoTematicaElement.getElementsByTagName(codigoSTTag).item(0).getTextContent(),
                                                sessaoTematicaElement.getElementsByTagName(descricaoSTTag).item(0).getTextContent(),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataInicioSubmissaoTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataFimSubmissaoTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataInicioDistribuicaoTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataLimiteRevisaoTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataLimiteSubmissaoFinalTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataInicioTag).item(0).getTextContent()),
                                                Data.converterString(sessaoTematicaElement.getElementsByTagName(dataFimTag).item(0).getTextContent()));

                                        if (Integer.parseInt(eventoElement.getElementsByTagName(numeroProponentesTag).item(0).getTextContent()) > 0) {
                                            NodeList proponenteNodeList = sessaoTematicaElement.getElementsByTagName(proponenteTag);

                                            for (int k = 0; k < proponenteNodeList.getLength(); k++) {
                                                Node proponenteNode = proponenteNodeList.item(k);

                                                if (proponenteNode.getNodeType() == Node.ELEMENT_NODE) {
                                                    Element proponenteElement = (Element) proponenteNode;

                                                    Utilizador utilizador = registoUtilizadores.getUtilizador(proponenteElement.getTextContent());

                                                    if (utilizador != null) {
                                                        sessaoTematica.novoProponente(utilizador);
                                                    }
                                                }
                                            }

                                            if (sessaoTematica.validarSessaoTematica() && listaSessoesTematicas.validarSessaoTematica(sessaoTematica)) {
                                                listaSessoesTematicas.adicionarSessaoTematica(sessaoTematica);

                                                if (Integer.parseInt(eventoElement.getElementsByTagName(numeroMembrosCPTag).item(0).getTextContent()) > 0) {
                                                    NodeList membrosCPSTNodeList = sessaoTematicaElement.getElementsByTagName(membrosCPSessaoTag);
                                                    CP cp = sessaoTematica.novaCP();

                                                    for (int k = 0; k < membrosCPSTNodeList.getLength(); k++) {
                                                        Node membroCPSTNode = membrosCPSTNodeList.item(k);

                                                        if (membroCPSTNode.getNodeType() == Node.ELEMENT_NODE) {
                                                            Element membroCPSTElement = (Element) membroCPSTNode;

                                                            Utilizador utilizador = registoUtilizadores.getUtilizador(membroCPSTElement.getTextContent());

                                                            if (utilizador != null) {
                                                                cp.novoRevisor(utilizador);
                                                            }
                                                        }
                                                    }

                                                    sessaoTematica.adicionarCP(cp);

                                                    if (sessaoTematica.setEmSubmissao() && Integer.parseInt(sessaoTematicaElement.getElementsByTagName(numeroSubmissoesTag).item(0).getTextContent()) > 0) {
                                                        // Descodificar Submissões...
                                                    }
                                                }

                                                if (evento.temSessoesTematicasDefinidas()) {
                                                    if (Integer.parseInt(eventoElement.getElementsByTagName(numeroMembrosCPTag).item(0).getTextContent()) > 0) {
                                                        NodeList membrosCPNodeList = eventoElement.getElementsByTagName(membroCPTag);
                                                        CP cp = evento.novaCP();

                                                        for (int l = 0; l < membrosCPNodeList.getLength(); l++) {
                                                            Node membroCPNode = membrosCPNodeList.item(l);

                                                            if (membroCPNode.getNodeType() == Node.ELEMENT_NODE) {
                                                                Element membroCPElement = (Element) membroCPNode;

                                                                Utilizador utilizador = registoUtilizadores.getUtilizador(membroCPElement.getTextContent());

                                                                if (utilizador != null) {
                                                                    cp.novoRevisor(utilizador);
                                                                }
                                                            }
                                                        }
                                                        evento.adicionarCP(cp);

                                                        if (evento.setEmSubmissao() && Integer.parseInt(eventoElement.getElementsByTagName(numeroSubmissoesTag).item(0).getTextContent()) > 0) {
                                                            // Descodificar Submissões...
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Cria uma árvore com toda a informação sobre os utilizadores e guarda tudo
     * num ficheiro em formato XML.
     */
    public void escreverFicheiroUtilizador() throws ParserConfigurationException, TransformerException {
        RegistoUtilizadores registoUtilizadores = this.empresa.getRegistoUtilizadores();

        DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderF.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element listaUtilizadoresElement = doc.createElement(listaUtilizadoresTag);
        doc.appendChild(listaUtilizadoresElement);

        listaUtilizadoresElement.appendChild(doc.createElement(numeroElementosTag)).setTextContent(String.valueOf(registoUtilizadores.getNumeroUtilizadores()));

        Element utilizadoresElement = doc.createElement(utilizadoresTag);
        listaUtilizadoresElement.appendChild(utilizadoresElement);

        for (int i = 0; i < registoUtilizadores.getNumeroUtilizadores(); i++) {
            Element utilizadorElement = doc.createElement(utilizadorTag);
            utilizadoresElement.appendChild(utilizadorElement);

            Utilizador utilizador = registoUtilizadores.getUtilizadorPeloID(i);

            utilizadorElement.appendChild(doc.createElement(usernameTag)).setTextContent(utilizador.getUsername());
            utilizadorElement.appendChild(doc.createElement(nomeTag)).setTextContent(utilizador.getNome());
            utilizadorElement.appendChild(doc.createElement(emailTag)).setTextContent(utilizador.getEmail());
            utilizadorElement.appendChild(doc.createElement(passwordTag)).setTextContent(utilizador.getPassword());
        }

        escreverFicheiro(doc, caminhoFicheiroUtilizador);
    }

    /**
     * Cria uma árvore com toda a informação sobre os locais e guarda tudo num
     * ficheiro em formato XML.
     */
    public void escreverFicheiroLocal() throws ParserConfigurationException, TransformerException {
        RegistoEventos registoEventos = this.empresa.getRegistoEventos();

        DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder = docBuilderF.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        Element listaLocaisElement = doc.createElement(listaLocaisTag);
        doc.appendChild(listaLocaisElement);

        listaLocaisElement.appendChild(doc.createElement(numElementosTag)).setTextContent(String.valueOf(registoEventos.getNumeroEventos()));

        Element locaisElement = doc.createElement(locaisTag);
        listaLocaisElement.appendChild(locaisElement);

        for (int i = 0; i < registoEventos.getNumeroEventos(); i++) {
            Element localElement = doc.createElement(localTag);
            locaisElement.appendChild(localElement);

            Evento e = registoEventos.getEventoPeloID(i);

            localElement.appendChild(doc.createElement(localIDTag)).setTextContent(String.valueOf(i + 1));
            localElement.appendChild(doc.createElement(designacaoTag)).setTextContent(e.getLocal().toString());
        }

        escreverFicheiro(doc, caminhoFicheiroLocal);
    }

    /**
     * Cria uma árvore com toda a informação sobre os eventos e guarda tudo num
     * ficheiro em formato XML.
     */
    public void escreverFicheiroEvento() throws ParserConfigurationException, TransformerException {
            RegistoEventos registoEventos = this.empresa.getRegistoEventos();

            DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderF.newDocumentBuilder();
            Document doc = docBuilder.newDocument();

            Element listaEventos = doc.createElement(listaEventosTag);
            doc.appendChild(listaEventos);

            Element numeroEventos = doc.createElement(numeroEventosTag);
            numeroEventos.setTextContent(String.valueOf(registoEventos.getNumeroEventos()));
            listaEventos.appendChild(numeroEventos);

            Element eventos = doc.createElement(eventosTag);
            listaEventos.appendChild(eventos);

            for (int i = 0; i < registoEventos.getNumeroEventos(); i++) {
                Evento e = registoEventos.getEventoPeloID(i);

                Element evento = doc.createElement(eventoTag);
                eventos.appendChild(evento);

                Element titulo = doc.createElement(tituloTag);
                titulo.setTextContent(e.getTitulo());
                evento.appendChild(titulo);
                Element descricao = doc.createElement(descricaoTag);
                descricao.setTextContent(e.getDescricao());
                evento.appendChild(descricao);
                Element dataInicio = doc.createElement(dataInicioTag);
                dataInicio.setTextContent(e.getDataInicio().toString());
                evento.appendChild(dataInicio);
                Element dataFim = doc.createElement(dataInicioTag);
                dataFim.setTextContent(e.getDataFim().toString());
                evento.appendChild(dataFim);
                Element dataInicioSubmissao = doc.createElement(dataInicioSubmissaoTag);
                dataInicioSubmissao.setTextContent(e.getDataInicioSubmissao().toString());
                evento.appendChild(dataInicioSubmissao);
                Element dataFimSubmissao = doc.createElement(dataFimSubmissaoTag);
                dataFimSubmissao.setTextContent(e.getDataFimSubmissao().toString());
                evento.appendChild(dataFimSubmissao);
                Element dataInicioDistribuicao = doc.createElement(dataInicioDistribuicaoTag);
                dataInicioDistribuicao.setTextContent(e.getDataInicioDistribuicao().toString());
                evento.appendChild(dataInicioDistribuicao);
                Element dataLimiteRevisao = doc.createElement(dataLimiteRevisaoTag);
                dataLimiteRevisao.setTextContent(e.getDataFimRevisao().toString());
                evento.appendChild(dataLimiteRevisao);
                Element dataLimiteSubmissaoFinal = doc.createElement(dataLimiteSubmissaoFinalTag);
                dataLimiteSubmissaoFinal.setTextContent(e.getDataFimSubmissaoCameraReady().toString());
                evento.appendChild(dataLimiteSubmissaoFinal);
                Element estadoEvento = doc.createElement(estadoEventoTag);
                estadoEvento.setTextContent(e.getEstado().getClass().getSimpleName());
                evento.appendChild(estadoEvento);
                Element local = doc.createElement(localTag);
                local.setTextContent(String.valueOf(i + 1));
                evento.appendChild(local);

                // Leitura dos organizadores do evento.
                Element listaOrganizadores = doc.createElement(listaOrganizadoresTag);
                evento.appendChild(listaOrganizadores);

                Element numeroOrganizadores = doc.createElement(numeroOrganizadoresTag);
                numeroOrganizadores.setTextContent(String.valueOf(e.getNumeroOrganizadores()));
                listaOrganizadores.appendChild(numeroOrganizadores);

                Element organizadores = doc.createElement(organizadoresTag);
                listaOrganizadores.appendChild(organizadores);

                for (int j = 0; j < e.getNumeroOrganizadores(); j++) {
                    Element organizador = doc.createElement(organizadorTag);
                    organizador.setTextContent(e.getOrganizadorPeloID(j).getUtilizador().getUsername());
                    organizadores.appendChild(organizador);
                }

                // Leitura da comissão do evento.
                Element CP = doc.createElement(cpTag);
                evento.appendChild(CP);
                CP comissaoPrograma = e.getCP();

                Element numeroMembrosCP = doc.createElement(numeroMembrosCPTag);
                numeroMembrosCP.setTextContent(String.valueOf(comissaoPrograma.getNumeroRevisores()));
                CP.appendChild(numeroMembrosCP);

                Element membrosCP = doc.createElement(membrosCPTag);
                CP.appendChild(membrosCP);

                for (int j = 0; j < comissaoPrograma.getNumeroRevisores(); j++) {
                    Element membroCP = doc.createElement(membroCPTag);
                    membroCP.setTextContent(comissaoPrograma.getRevisorPeloID(j).getUtilizador().getUsername());
                    membrosCP.appendChild(membroCP);
                }

                // Leitura das sessões temáticas do evento.
                Element listaSessoesTematicas = doc.createElement(listaSessoesTematicasTag);
                evento.appendChild(listaSessoesTematicas);

                ListaSessoesTematicas listaSTs = e.getListaSessoesTematicas();

                Element numeroSessoesTematica = doc.createElement(numeroSessoesTematicasTag);
                numeroSessoesTematica.setTextContent(String.valueOf(listaSTs.getNumeroSessoesTematicas()));
                listaSessoesTematicas.appendChild(numeroSessoesTematica);

                Element sessoesTematicas = doc.createElement(sessoesTematicasTag);
                listaSessoesTematicas.appendChild(sessoesTematicas);

                for (int j = 0; j < listaSTs.getNumeroSessoesTematicas(); j++) {
                    Element sessaoTematica = doc.createElement(sessaoTematicaTag);
                    sessoesTematicas.appendChild(sessaoTematica);

                    SessaoTematica s = listaSTs.getSessoesTematicasPeloID(j);

                    Element codigoST = doc.createElement(codigoSTTag);
                    codigoST.setTextContent(s.getCodigoUnico());
                    sessaoTematica.appendChild(codigoST);

                    Element descricaoST = doc.createElement(descricaoSTTag);
                    descricaoST.setTextContent(s.getDescricao());
                    sessaoTematica.appendChild(descricaoST);

                    Element dataInicioST = doc.createElement(dataInicioTag);
                    dataInicioST.setTextContent(s.getDataInicio().toString());
                    sessaoTematica.appendChild(dataInicioST);

                    Element dataFimST = doc.createElement(dataFimTag);
                    dataFimST.setTextContent(s.getDataFim().toString());
                    sessaoTematica.appendChild(dataFimST);

                    Element dataInicioSubmissaoST = doc.createElement(dataInicioSubmissaoTag);
                    dataInicioSubmissaoST.setTextContent(s.getDataInicioSubmissao().toString());
                    sessaoTematica.appendChild(dataInicioSubmissaoST);

                    Element dataFimSubmissaoST = doc.createElement(dataFimSubmissaoTag);
                    dataFimSubmissaoST.setTextContent(s.getDataFimSubmissao().toString());
                    sessaoTematica.appendChild(dataFimSubmissaoST);

                    Element dataInicioDistribuicaoST = doc.createElement(dataInicioDistribuicaoTag);
                    dataInicioDistribuicaoST.setTextContent(s.getDataInicioDistribuicao().toString());
                    sessaoTematica.appendChild(dataInicioDistribuicaoST);

                    Element dataLimiteRevisaoST = doc.createElement(dataLimiteRevisaoTag);
                    dataLimiteRevisaoST.setTextContent(s.getDataFimRevisao().toString());
                    sessaoTematica.appendChild(dataLimiteRevisaoST);

                    Element dataLimiteSubmissaoFinalST = doc.createElement(dataLimiteSubmissaoFinalTag);
                    dataLimiteSubmissaoFinalST.setTextContent(s.getDataFimSubmissaoCameraReady().toString());
                    sessaoTematica.appendChild(dataLimiteSubmissaoFinalST);

                }

                //e.getListaSessoesTematicas();
                Element listasubmissoes = doc.createElement(listaSubmissoesEventoTag);
                //e.getListaSubmissoes();
            }

            escreverFicheiro(doc, "teste.xml");
    }

    /**
     * Lê e processa um ficheiro XML devolvendo a árvore do mesmo.
     *
     * @param caminho Caminho do ficheiro a ler.
     * @return Construção de uma árvore em XML.
     */
    private Document lerFicheiro(String caminho)
            throws ParserConfigurationException, IOException, SAXException {
        File ficheiro = new File(caminho);
        DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
        DocumentBuilder docBuilder;
        docBuilder = docBuilderF.newDocumentBuilder();
        Document doc = docBuilder.parse(ficheiro);
        doc.normalize();

        return doc;
    }

    /**
     * Gera o ficheiro XML com a árvores de informação disponibilizada.
     *
     * @param doc Documento que contém toda a árvore de informação
     * disponibilizada.
     * @param nomeFicheiro Nome do ficheiro XML que irá ser criado.
     */
    private void escreverFicheiro(Document doc, String nomeFicheiro)
            throws TransformerException {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(nomeFicheiro));
        transformer.setOutputProperty(OutputKeys.METHOD, "xml");
        transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
        transformer.transform(source, result);
    }

}
