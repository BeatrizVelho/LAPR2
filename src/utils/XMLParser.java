package utils;

import eventoscientificos.model.Empresa;
import eventoscientificos.model.RegistoUtilizadores;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.Formatter;
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
     * Caminho para o ficheiro .xml dos utilizadores.
     */
    private String caminhoFicheiroUtilizador = "Utilizador.xml";

    /**
     * Caminho para o ficheiro .xml dos eventos e locais.
     */
    private String caminhoFicheiroEvento = "Evento.xml";
    private String caminhoFicheiroLocal = "Local.xml";

    /**
     * Tag passíveis de ser encontradas no ficheiro .xml dos utilizadores.
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
            File ficheiroUtilizador = new File(this.caminhoFicheiroUtilizador);
            DocumentBuilderFactory docBuilderF = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderF.newDocumentBuilder();
            Document doc = docBuilder.parse(ficheiroUtilizador);

            doc.getDocumentElement().normalize();

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
        } catch (ParserConfigurationException | SAXException | IOException | IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(framePai, "Ocorreu um erro durante a leitura dos ficheiros XML.", "Leitura XML", JOptionPane.ERROR_MESSAGE);
            this.empresa = new Empresa();
        }

    }

    /**
     * Lê o ficheiro XML que contém os dados dos eventos da aplicação.
     */
    public void lerFicheiroEvento() {
        // Precisa de implementação
    }

    /**
     *
     */
    public void escreverFicheiroUtilizador() {
        // Precisa de implementação
    }

    /**
     *
     */
    public void escreverFicheiroEvento() {
        // Precisa de implementação
    }

}
