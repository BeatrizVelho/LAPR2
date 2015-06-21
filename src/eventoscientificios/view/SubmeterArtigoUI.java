package eventoscientificios.view;

import eventoscientificos.controllers.SubmeterArtigoController;
import eventoscientificos.model.Autor;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.InstituicaoAfiliacao;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 * @author G01
 */
public class SubmeterArtigoUI extends javax.swing.JDialog {

    private Frame framePai;
    private SubmeterArtigoController controller;

    /**
     * Creates new form SubmeterArtigoUI
     *
     * @param parent
     * @param modal
     * @param empresa
     */
    public SubmeterArtigoUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, "Submeter artigo científico", modal);
        this.framePai = parent;
        this.controller = new SubmeterArtigoController(empresa);
        this.controller.getListaSubmissiveisAceitarArtigo();
        setResizable(false);
        initComponents();
        getRootPane().setDefaultButton(btn_selecionarSubmissivel);
        setLocationRelativeTo(null);
        if (controller.getListaSubmissiveis().isEmpty()) {
            JOptionPane.showMessageDialog(
                    framePai,
                    "Não existem eventos ou sessões temáticas onde lhe é "
                    + "possível submeter artigos.",
                    "Submeter Artigo",
                    JOptionPane.ERROR_MESSAGE);
            dispose();
        } else {
            setVisible(true);
            pack();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnl_informacoes = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        lbl_resumo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txt_resumo = new javax.swing.JTextArea();
        pnl_listaAutores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_autores = new javax.swing.JList(this.controller.getModeloLista());
        pnl_ficheiro = new javax.swing.JPanel();
        txt_ficheiro = new javax.swing.JTextField();
        btn_escolherFicheiro = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        pnl_autorCorrespondente = new javax.swing.JPanel();
        cmb_AutorCorrespondente = new javax.swing.JComboBox();
        btn_selecionarAutorCorrespondente = new javax.swing.JButton();
        btn_submeter = new javax.swing.JButton();
        pnl_submissivel = new javax.swing.JPanel();
        cmb_submissivel = new javax.swing.JComboBox(this.controller.getListaSubmissiveis().toArray());
        btn_selecionarSubmissivel = new javax.swing.JButton();
        pnl_novoAutor = new javax.swing.JPanel();
        txt_nomeAutor = new javax.swing.JTextField();
        txt_emailAutor = new javax.swing.JTextField();
        txt_instituicaoAutor = new javax.swing.JTextField();
        lbl_instituicaoAutor = new javax.swing.JLabel();
        lbl_emailAutor = new javax.swing.JLabel();
        btn_adicionarAutor = new javax.swing.JButton();
        lbl_nomeAutor = new javax.swing.JLabel();
        btn_seguinteInformacoes = new javax.swing.JButton();
        btn_seguinteAutores = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_informacoes.setVisible(false);
        pnl_informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));
        pnl_informacoes.setPreferredSize(new java.awt.Dimension(780, 143));

        lbl_titulo.setText("Título:");

        lbl_resumo.setText("Resumo:");

        txt_resumo.setColumns(20);
        txt_resumo.setLineWrap(true);
        txt_resumo.setRows(3);
        txt_resumo.setMinimumSize(new java.awt.Dimension(702, 58));
        txt_resumo.setPreferredSize(new java.awt.Dimension(702, 58));
        jScrollPane3.setViewportView(txt_resumo);

        javax.swing.GroupLayout pnl_informacoesLayout = new javax.swing.GroupLayout(pnl_informacoes);
        pnl_informacoes.setLayout(pnl_informacoesLayout);
        pnl_informacoesLayout.setHorizontalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_informacoesLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lbl_titulo))
                    .addComponent(lbl_resumo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_titulo)
                    .addComponent(jScrollPane3))
                .addGap(10, 10, 10))
        );
        pnl_informacoesLayout.setVerticalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_titulo)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_resumo)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_listaAutores.setVisible(false);
        pnl_listaAutores.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Autores"));

        jList_autores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList_autores.setMinimumSize(new java.awt.Dimension(548, 0));
        jList_autores.setPreferredSize(new java.awt.Dimension(550, 0));
        jScrollPane2.setViewportView(jList_autores);

        javax.swing.GroupLayout pnl_listaAutoresLayout = new javax.swing.GroupLayout(pnl_listaAutores);
        pnl_listaAutores.setLayout(pnl_listaAutoresLayout);
        pnl_listaAutoresLayout.setHorizontalGroup(
            pnl_listaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        pnl_listaAutoresLayout.setVerticalGroup(
            pnl_listaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnl_ficheiro.setVisible(false);
        pnl_ficheiro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficheiro"));
        pnl_ficheiro.setPreferredSize(new java.awt.Dimension(780, 68));

        txt_ficheiro.setEnabled(false);

        btn_escolherFicheiro.setText("Escolher Ficheiro");
        btn_escolherFicheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_escolherFicheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ficheiroLayout = new javax.swing.GroupLayout(pnl_ficheiro);
        pnl_ficheiro.setLayout(pnl_ficheiroLayout);
        pnl_ficheiroLayout.setHorizontalGroup(
            pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ficheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_ficheiro, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_escolherFicheiro, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_ficheiroLayout.setVerticalGroup(
            pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ficheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ficheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_escolherFicheiro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        pnl_autorCorrespondente.setVisible(false);
        pnl_autorCorrespondente.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o Autor Correspondente"));
        pnl_autorCorrespondente.setPreferredSize(new java.awt.Dimension(780, 68));

        cmb_AutorCorrespondente.setMinimumSize(new java.awt.Dimension(28, 20));
        cmb_AutorCorrespondente.setPreferredSize(new java.awt.Dimension(28, 20));

        btn_selecionarAutorCorrespondente.setText("Selecionar Autor Correspondente");
        btn_selecionarAutorCorrespondente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarAutorCorrespondenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_autorCorrespondenteLayout = new javax.swing.GroupLayout(pnl_autorCorrespondente);
        pnl_autorCorrespondente.setLayout(pnl_autorCorrespondenteLayout);
        pnl_autorCorrespondenteLayout.setHorizontalGroup(
            pnl_autorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_autorCorrespondenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_AutorCorrespondente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_selecionarAutorCorrespondente)
                .addContainerGap())
        );
        pnl_autorCorrespondenteLayout.setVerticalGroup(
            pnl_autorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_autorCorrespondenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_autorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addGroup(pnl_autorCorrespondenteLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(cmb_AutorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btn_selecionarAutorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_submeter.setVisible(false);
        btn_submeter.setText("Submeter Artigo");
        btn_submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submeterActionPerformed(evt);
            }
        });

        pnl_submissivel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o evento/sessão temática"));
        pnl_submissivel.setToolTipText("");
        pnl_submissivel.setPreferredSize(new java.awt.Dimension(780, 69));

        btn_selecionarSubmissivel.setText("Selecionar");
        btn_selecionarSubmissivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarSubmissivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_submissivelLayout = new javax.swing.GroupLayout(pnl_submissivel);
        pnl_submissivel.setLayout(pnl_submissivelLayout);
        pnl_submissivelLayout.setHorizontalGroup(
            pnl_submissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_submissivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_submissivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_selecionarSubmissivel)
                .addContainerGap())
        );
        pnl_submissivelLayout.setVerticalGroup(
            pnl_submissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_submissivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_submissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_submissivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarSubmissivel))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pnl_novoAutor.setVisible(false);
        pnl_novoAutor.setBorder(javax.swing.BorderFactory.createTitledBorder("Novo Autor"));

        lbl_instituicaoAutor.setText("Instituição:");

        lbl_emailAutor.setText("Email:");

        btn_adicionarAutor.setText("Adicionar Autor");
        btn_adicionarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarAutorActionPerformed(evt);
            }
        });

        lbl_nomeAutor.setText("Nome:");

        javax.swing.GroupLayout pnl_novoAutorLayout = new javax.swing.GroupLayout(pnl_novoAutor);
        pnl_novoAutor.setLayout(pnl_novoAutorLayout);
        pnl_novoAutorLayout.setHorizontalGroup(
            pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_novoAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_novoAutorLayout.createSequentialGroup()
                        .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_nomeAutor)
                            .addComponent(lbl_instituicaoAutor)
                            .addComponent(lbl_emailAutor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_nomeAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(txt_emailAutor)
                            .addComponent(txt_instituicaoAutor)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_novoAutorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_adicionarAutor)))
                .addContainerGap())
        );
        pnl_novoAutorLayout.setVerticalGroup(
            pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_novoAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nomeAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_emailAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_emailAutor))
                .addGap(11, 11, 11)
                .addGroup(pnl_novoAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_instituicaoAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_instituicaoAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_adicionarAutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_seguinteInformacoes.setVisible(false);
        btn_seguinteInformacoes.setText("Seguinte");
        btn_seguinteInformacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinteInformacoesActionPerformed(evt);
            }
        });

        btn_seguinteAutores.setVisible(false);
        btn_seguinteAutores.setText("Seguinte");
        btn_seguinteAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinteAutoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_ficheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_autorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_submissivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_seguinteAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_seguinteInformacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_submeter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(pnl_listaAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnl_novoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_submissivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_listaAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_novoAutor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_autorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_ficheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_submeter)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_seguinteInformacoes)
                    .addComponent(btn_seguinteAutores))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_escolherFicheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_escolherFicheiroActionPerformed
        Janela.personalizarFileChooserEmPortugues();
        JFileChooser escolherFicheiro = new JFileChooser();
        Janela.definirFiltroExtensaoBin(escolherFicheiro);
        int opcao = escolherFicheiro.showOpenDialog(this);

        if (opcao == JFileChooser.APPROVE_OPTION) {
            File ficheiro = escolherFicheiro.getSelectedFile();

            if (!ficheiro.getName().endsWith(".pdf")) {
                JOptionPane.showMessageDialog(
                        this.framePai,
                        "O ficheiro deve ter o formato PDF.",
                        "Submeter Ficheiro",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.txt_ficheiro.setText(ficheiro.getAbsolutePath());
                this.controller.adicionarFicheiroPDF(this.txt_ficheiro.getText());
                getRootPane().setDefaultButton(this.btn_submeter);
            }
        }
    }//GEN-LAST:event_btn_escolherFicheiroActionPerformed

    private void btn_submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submeterActionPerformed
        try {
            String opcoes[] = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(
                    null, "Pretende submeter o artigo?", "Submeter artigo", 0,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (resposta == 0) {
                this.controller.adicionarSubmissao();
            }
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this.framePai,
                    ex.getMessage(),
                    "Submeter Artigo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_submeterActionPerformed

    private void btn_selecionarSubmissivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarSubmissivelActionPerformed
        int indice = this.cmb_submissivel.getSelectedIndex();
        this.controller.selecionarSubmissivel(indice);

        this.pnl_submissivel.setVisible(false);
        this.pnl_informacoes.setVisible(true);
        this.btn_seguinteInformacoes.setVisible(true);
        getRootPane().setDefaultButton(this.btn_seguinteInformacoes);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarSubmissivelActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_selecionarAutorCorrespondenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarAutorCorrespondenteActionPerformed
        int indice = this.cmb_AutorCorrespondente.getSelectedIndex();
        this.controller.adicionarAutorCorrespondente(indice);

        this.pnl_autorCorrespondente.setVisible(false);
        this.pnl_ficheiro.setVisible(true);
        this.btn_submeter.setVisible(true);
        getRootPane().setDefaultButton(this.btn_escolherFicheiro);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarAutorCorrespondenteActionPerformed

    private void btn_adicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarAutorActionPerformed
        try {
            this.controller.novoAutor(
                    this.txt_nomeAutor.getText(),
                    this.txt_emailAutor.getText(),
                    new InstituicaoAfiliacao(this.txt_instituicaoAutor.getText()));

            this.txt_nomeAutor.setText("");
            this.txt_emailAutor.setText("");
            this.txt_instituicaoAutor.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(
                    this.framePai,
                    "Não preencheu todos os campos.",
                    "Novo autor",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this.framePai,
                    ex.getMessage(),
                    "Novo autor",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_adicionarAutorActionPerformed

    private void btn_seguinteInformacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinteInformacoesActionPerformed
        try {
            this.controller.adicionarDadosArtigo(
                    this.txt_titulo.getText(), this.txt_resumo.getText());
            this.pnl_informacoes.setVisible(false);
            this.btn_seguinteInformacoes.setVisible(false);
            this.pnl_listaAutores.setVisible(true);
            this.pnl_novoAutor.setVisible(true);
            this.btn_seguinteAutores.setVisible(true);
            getRootPane().setDefaultButton(this.btn_seguinteAutores);
            pack();
            setLocationRelativeTo(null);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    this.framePai,
                    ex.getMessage(),
                    "Dados do artigo",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_seguinteInformacoesActionPerformed

    private void btn_seguinteAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinteAutoresActionPerformed
        this.controller.getListaAutoresRegistados();

        for (Autor autor : this.controller.getListaAutores()) {
            this.cmb_AutorCorrespondente.addItem(autor);
        }

        this.pnl_listaAutores.setVisible(false);
        this.pnl_novoAutor.setVisible(false);
        this.btn_seguinteAutores.setVisible(false);
        this.pnl_autorCorrespondente.setVisible(true);
        getRootPane().setDefaultButton(this.btn_selecionarAutorCorrespondente);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_seguinteAutoresActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionarAutor;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_escolherFicheiro;
    private javax.swing.JButton btn_seguinteAutores;
    private javax.swing.JButton btn_seguinteInformacoes;
    private javax.swing.JButton btn_selecionarAutorCorrespondente;
    private javax.swing.JButton btn_selecionarSubmissivel;
    private javax.swing.JButton btn_submeter;
    private javax.swing.JComboBox cmb_AutorCorrespondente;
    private javax.swing.JComboBox cmb_submissivel;
    private javax.swing.JButton jButton1;
    private javax.swing.JList jList_autores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lbl_emailAutor;
    private javax.swing.JLabel lbl_instituicaoAutor;
    private javax.swing.JLabel lbl_nomeAutor;
    private javax.swing.JLabel lbl_resumo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_autorCorrespondente;
    private javax.swing.JPanel pnl_ficheiro;
    private javax.swing.JPanel pnl_informacoes;
    private javax.swing.JPanel pnl_listaAutores;
    private javax.swing.JPanel pnl_novoAutor;
    private javax.swing.JPanel pnl_submissivel;
    private javax.swing.JTextField txt_emailAutor;
    private javax.swing.JTextField txt_ficheiro;
    private javax.swing.JTextField txt_instituicaoAutor;
    private javax.swing.JTextField txt_nomeAutor;
    private javax.swing.JTextArea txt_resumo;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
