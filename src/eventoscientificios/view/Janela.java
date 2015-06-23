package eventoscientificios.view;

import eventoscientificos.model.Empresa;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;
import utils.XMLParser;

/**
 * @author G01
 */
public class Janela extends javax.swing.JFrame {

    /**
     * Empresa que contém todos os dados usados pela aplicação.
     */
    private Empresa empresa;

    /**
     * Parser de XML responsável pela persistência dos dados da aplicação.
     */
    private XMLParser xmlParser;

    /**
     * Creates new form Janela
     */
    public Janela() {
        this.empresa = new Empresa();
        
        try {
            this.xmlParser = new XMLParser(this, empresa);
            this.xmlParser.lerFicheiroUtilizador();
            this.xmlParser.lerFicheiroLocal();
            this.xmlParser.lerFicheiroEvento();
        } catch (ParserConfigurationException | IOException | SAXException
                | ClassNotFoundException | InstantiationException
                | IllegalAccessException | NoSuchMethodException
                | IllegalArgumentException | InvocationTargetException ex) {
        }

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                terminarPrograma();
            }
        });

        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        boasVindas = new javax.swing.JLabel();
        painelUCs = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        opcoes = new javax.swing.JMenu();
        uc1 = new javax.swing.JMenuItem();
        login = new javax.swing.JMenuItem();
        uc9 = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();
        administracao = new javax.swing.JMenu();
        uc12 = new javax.swing.JMenuItem();
        uc18 = new javax.swing.JMenuItem();
        uc19a = new javax.swing.JMenuItem();
        uc19b = new javax.swing.JMenuItem();
        uc20 = new javax.swing.JMenuItem();
        gerirEventos = new javax.swing.JMenu();
        uc2 = new javax.swing.JMenuItem();
        uc6 = new javax.swing.JMenuItem();
        uc3 = new javax.swing.JMenuItem();
        uc8 = new javax.swing.JMenuItem();
        uc13 = new javax.swing.JMenuItem();
        gerirSubmissoes = new javax.swing.JMenu();
        uc4 = new javax.swing.JMenuItem();
        uc10 = new javax.swing.JMenuItem();
        uc16 = new javax.swing.JMenuItem();
        uc17 = new javax.swing.JMenuItem();
        uc11 = new javax.swing.JMenuItem();
        uc5 = new javax.swing.JMenuItem();
        uc15 = new javax.swing.JMenuItem();
        uc22 = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Sistema de Gestão de Eventos Cientificos");
        setPreferredSize(new java.awt.Dimension(900, 650));
        setResizable(false);

        boasVindas.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        boasVindas.setText("Olá, visitante.");

        painelUCs.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        painelUCs.setMinimumSize(new java.awt.Dimension(780, 532));
        painelUCs.setLayout(new java.awt.GridLayout(1, 0));

        opcoes.setText("Opções");

        uc1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        uc1.setText("Registar Utilizador");
        uc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc1ActionPerformed(evt);
            }
        });
        opcoes.add(uc1);

        login.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        opcoes.add(login);

        uc9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        uc9.setText("Alterar Utilizador");
        uc9.setVisible(false);
        uc9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc9ActionPerformed(evt);
            }
        });
        opcoes.add(uc9);

        logout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        logout.setText("Logout");
        logout.setVisible(false);
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        opcoes.add(logout);

        sair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        opcoes.add(sair);

        barraMenu.add(opcoes);

        administracao.setText("Administração");
        administracao.setVisible(false);

        uc12.setText("Definir tipo conflito");
        uc12.setEnabled(false);
        administracao.add(uc12);

        uc18.setText("Carregar artigo científico por ficheiro");
        administracao.add(uc18);

        uc19a.setText("Gerar estatísticas de evento");
        administracao.add(uc19a);

        uc19b.setText("Gerar estatísticas de tópicos");
        administracao.add(uc19b);

        uc20.setText("Análise estatística das revisões");
        uc20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc20ActionPerformed(evt);
            }
        });
        administracao.add(uc20);

        barraMenu.add(administracao);

        gerirEventos.setText("Gerir Eventos");
        gerirEventos.setVisible(false);

        uc2.setText("Criar evento");
        uc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc2ActionPerformed(evt);
            }
        });
        gerirEventos.add(uc2);

        uc6.setText("Criar Sessão Temática");
        uc6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc6ActionPerformed(evt);
            }
        });
        gerirEventos.add(uc6);

        uc3.setText("Criar Comissão de Programa");
        uc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc3ActionPerformed(evt);
            }
        });
        gerirEventos.add(uc3);

        uc8.setText("Distribuir artigos científicos para revisão");
        uc8.setEnabled(false);
        gerirEventos.add(uc8);

        uc13.setText("Decidir sobre submissões de artigos científicos");
        uc13.setEnabled(false);
        gerirEventos.add(uc13);

        barraMenu.add(gerirEventos);

        gerirSubmissoes.setText("Gerir Submissões");
        gerirSubmissoes.setVisible(false);

        uc4.setText("Submeter artigo científico");
        uc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc4ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc4);

        uc10.setText("Alterar submissão de artigo científico");
        uc10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc10ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc10);

        uc16.setText("Retirar submissão de artigo científico");
        uc16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc16ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc16);

        uc17.setText("Listar submissões retiradas");
        uc17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc17ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc17);

        uc11.setText("Licitar artigos científicos para revisão");
        uc11.setEnabled(false);
        gerirSubmissoes.add(uc11);

        uc5.setText("Rever artigo científico");
        uc5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc5ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc5);

        uc15.setText("Submeter versão final do artigo científico");
        uc15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc15ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc15);

        uc22.setText("Alterar submissão final de artigo científico");
        uc22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uc22ActionPerformed(evt);
            }
        });
        gerirSubmissoes.add(uc22);

        barraMenu.add(gerirSubmissoes);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(painelUCs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 630, Short.MAX_VALUE)
                        .addComponent(boasVindas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(boasVindas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(painelUCs, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        new LoginUI(this, true, this.empresa);

        if (empresa.getUtilizadorAutenticado() != null) {
            boasVindas.setText("Olá, " + empresa.getUtilizadorAutenticado().getNome() + ".");
            boasVindas.revalidate();
            uc1.setVisible(false);
            login.setVisible(false);
            uc9.setVisible(true);
            logout.setVisible(true);
            administracao.setVisible(true);
            gerirEventos.setVisible(true);
            gerirSubmissoes.setVisible(true);
        }
    }//GEN-LAST:event_loginActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        boasVindas.setText("Olá, visitante.");
        boasVindas.revalidate();
        uc1.setVisible(true);
        login.setVisible(true);
        uc9.setVisible(false);
        logout.setVisible(false);
        administracao.setVisible(false);
        gerirEventos.setVisible(false);
        gerirSubmissoes.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void uc5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc5ActionPerformed
        new ReverArtigoUI(this, true, this.empresa);
    }//GEN-LAST:event_uc5ActionPerformed

    private void uc16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc16ActionPerformed
        new RetirarSubmissaoUI(this, true, this.empresa);
    }//GEN-LAST:event_uc16ActionPerformed

    private void uc20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uc20ActionPerformed

    private void uc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc1ActionPerformed
        new RegistarUtilizadorUI(this, true, this.empresa);
    }//GEN-LAST:event_uc1ActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        terminarPrograma();
    }//GEN-LAST:event_sairActionPerformed

    private void uc9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc9ActionPerformed
        new AlterarUtilizadorUI(this, true, this.empresa);
        boasVindas.setText("Olá, " + empresa.getUtilizadorAutenticado().getNome() + ".");
        boasVindas.revalidate();
    }//GEN-LAST:event_uc9ActionPerformed

    private void uc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc2ActionPerformed
        new CriarEventoUI(this, true, this.empresa);
    }//GEN-LAST:event_uc2ActionPerformed

    private void uc6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc6ActionPerformed
        new DefinirSessaoTematicaUI(this, true, this.empresa);
    }//GEN-LAST:event_uc6ActionPerformed

    private void uc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc3ActionPerformed
        new CriarCPUI(this, true, this.empresa);
    }//GEN-LAST:event_uc3ActionPerformed

    private void uc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc4ActionPerformed
        new SubmeterArtigoUI(this, true, this.empresa);
    }//GEN-LAST:event_uc4ActionPerformed

    private void uc10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc10ActionPerformed
        new AlterarSubmissaoUI(this, true, this.empresa);
    }//GEN-LAST:event_uc10ActionPerformed

    private void uc22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc22ActionPerformed
        new AlterarSubmissaoFinalUI(this, true, this.empresa);
    }//GEN-LAST:event_uc22ActionPerformed

    private void uc17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc17ActionPerformed
        new ListarSubmissoesRetiradasUI(this, true, this.empresa);
    }//GEN-LAST:event_uc17ActionPerformed

    private void uc15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uc15ActionPerformed
        new SubmeterArtigoFinalUI(this, true, this.empresa);
    }//GEN-LAST:event_uc15ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Janela().setVisible(true);
            }
        });
    }

    /**
     * Este método traduz para português todo o texto visual da janela gerada
     * pela classe JFileChooser.
     */
    public static void personalizarFileChooserEmPortugues() {

        // Títulos das Caixas de Diálogo
        UIManager.put("FileChooser.openDialogTitleText", "Importar Ficheiro");
        UIManager.put("FileChooser.saveDialogTitleText", "Exportar Ficheiro");

        // Botão "Importar"
        UIManager.put("FileChooser.openButtonText", "Importar");
        UIManager.put("FileChooser.openButtonMnemonic", "I");
        UIManager.put("FileChooser.openButtonToolTipText", "Importar Ficheiro");

        // Botão "Exportar"
        UIManager.put("FileChooser.saveButtonText", "Exportar");
        UIManager.put("FileChooser.saveButtonMnemonic", "E");
        UIManager.put("FileChooser.saveButtonToolTipText", "Exportar Ficheiro");

        // Botão "Cancelar"
        UIManager.put("FileChooser.cancelButtonText", "Cancelar");
        UIManager.put("FileChooser.cancelButtonMnemonic", "C");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Cancelar");

        // Botão "Ajuda"
        UIManager.put("FileChooser.helpButtonText", "Ajuda");
        UIManager.put("FileChooser.helpButtonMnemonic", "A");
        UIManager.put("FileChooser.helpButtonToolTipText", "Ajuda");

        // Legenda "Procurar em:"
        UIManager.put("FileChooser.lookInLabelMnemonic", "E");
        UIManager.put("FileChooser.lookInLabelText", "Procurar em:");

        // Legenda "Guardar em:"
        UIManager.put("FileChooser.saveInLabelText", "Guardar em:");
        UIManager.put("FileChooser.saveInLabelMnemonic", "G");

        // Legenda "Tipo de ficheiros:"
        UIManager.put("FileChooser.filesOfTypeLabelText", "Ficheiros do tipo:");
        UIManager.put("FileChooser.filesOfTypeLabelMnemonic", "F");

        // Legenda "Nome do ficheiro:"
        UIManager.put("FileChooser.fileNameLabelMnemonic", "N");
        UIManager.put("FileChooser.fileNameLabelText", "Nome do ficheiro:");

        // Filtro "Todos os Ficheiros"
        UIManager.put("FileChooser.acceptAllFileFilterText", "Todos os Ficheiros");

        // Botão "Um nível acima"
        UIManager.put("FileChooser.upFolderToolTipText", "Um nível acima");
        UIManager.put("FileChooser.upFolderAccessibleName", "Um nível acima");

        // Botão "Ambiente de Trabalho"
        UIManager.put("FileChooser.homeFolderToolTipText", "Ambiente");
        UIManager.put("FileChooser.homeFolderToolTipText", "Ambiente de Trabalho");
        UIManager.put("FileChooser.homeFolderAccessibleName", "Ambiente de Trabalho");

        // Botão "Nova Pasta"
        UIManager.put("FileChooser.newFolderToolTipText", "Criar nova pasta");
        UIManager.put("FileChooser.newFolderAccessibleName", "Criar nova pasta");

        // Botão "Vista Lista"
        UIManager.put("FileChooser.listViewButtonToolTipText", "Lista");
        UIManager.put("FileChooser.listViewButtonAccessibleName", "Lista");

        // Botão "Vista Detalhada"
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Detalhes");
        UIManager.put("FileChooser.detailsViewButtonAccessibleName", "Detalhes");

        // Cabeçalhos da "Vista Lista Detalhada"
        UIManager.put("FileChooser.fileNameHeaderText", "Nome");
        UIManager.put("FileChooser.fileSizeHeaderText", "Tamanho");
        UIManager.put("FileChooser.fileTypeHeaderText", "Tipo");
        UIManager.put("FileChooser.fileDateHeaderText", "Data");
        UIManager.put("FileChooser.fileAttrHeaderText", "Atributos");
    }

    /**
     * Filtra os ficheiros possiveis de escolher no JFileChooser, aceitando
     * assim apenas PDFs.
     *
     * @param fileChooser JFileChooser no qual se pretende realizar a filtragem.
     */
    public static void definirFiltroExtensaoBin(JFileChooser fileChooser) {
        fileChooser.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File f) {
                if (f.isDirectory()) {
                    return true;
                }
                String extensao = extensao(f);
                if (extensao != null) {
                    return extensao.equals("pdf");
                }
                return false;
            }

            @Override
            public String getDescription() {
                return "*.pdf";
            }

            private String extensao(File f) {
                String ext = null;
                String s = f.getName();
                int i = s.lastIndexOf(".");
                if (i != -1) {
                    ext = s.substring(i + 1).toLowerCase();
                }
                return ext;
            }
        });
    }

    /**
     *
     */
    private void terminarPrograma() {
        try {
            this.xmlParser.escreverFicheiroUtilizador();
            this.xmlParser.escreverFicheiroLocal();
            this.xmlParser.escreverFicheiroEvento();
        } catch (ParserConfigurationException | TransformerException ex) {
            JOptionPane.showMessageDialog(
                    this,
                    "Ocorreu um erro ao guardar os dados.",
                    "Guardar Dados",
                    JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu administracao;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JLabel boasVindas;
    private javax.swing.JMenu gerirEventos;
    private javax.swing.JMenu gerirSubmissoes;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu opcoes;
    private javax.swing.JPanel painelUCs;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem uc1;
    private javax.swing.JMenuItem uc10;
    private javax.swing.JMenuItem uc11;
    private javax.swing.JMenuItem uc12;
    private javax.swing.JMenuItem uc13;
    private javax.swing.JMenuItem uc15;
    private javax.swing.JMenuItem uc16;
    private javax.swing.JMenuItem uc17;
    private javax.swing.JMenuItem uc18;
    private javax.swing.JMenuItem uc19a;
    private javax.swing.JMenuItem uc19b;
    private javax.swing.JMenuItem uc2;
    private javax.swing.JMenuItem uc20;
    private javax.swing.JMenuItem uc22;
    private javax.swing.JMenuItem uc3;
    private javax.swing.JMenuItem uc4;
    private javax.swing.JMenuItem uc5;
    private javax.swing.JMenuItem uc6;
    private javax.swing.JMenuItem uc8;
    private javax.swing.JMenuItem uc9;
    // End of variables declaration//GEN-END:variables
}
