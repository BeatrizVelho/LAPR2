/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificios.view;

import eventoscientificos.controllers.SubmeterArtigoController;
import eventoscientificos.controllers.SubmeterArtigoFinalController;
import eventoscientificos.model.Empresa;
import java.awt.Frame;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class SubmeterArtigoFinalUI extends javax.swing.JDialog {

    private Frame framePai;
    private SubmeterArtigoFinalController controller;

    /**
     * Creates new form SubmeterArtigoFinalUI
     *
     * @param parent
     * @param modal
     * @param empresa
     */
    public SubmeterArtigoFinalUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.framePai = parent;
        this.controller = new SubmeterArtigoFinalController(empresa);
        setResizable(false);
        initComponents();
        getRootPane().setDefaultButton(this.btn_selecionarSubmissivel);
        setLocationRelativeTo(null);
        // Verificar se existem eventos/sessões que aceitem revisões de artigos.
        setVisible(true);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_selecionarSubmissivel = new javax.swing.JPanel();
        cmb_selecionarSubmissivel = new javax.swing.JComboBox();
        btn_selecionarSubmissivel = new javax.swing.JButton();
        pnl_selecionarSubmissao = new javax.swing.JPanel();
        btn_selecionarSubmissao = new javax.swing.JButton();
        cmb_selecionarSubmissao = new javax.swing.JComboBox();
        pnl_informacoes = new javax.swing.JPanel();
        lbl_titulo = new javax.swing.JLabel();
        lbl_resumo = new javax.swing.JLabel();
        lbl_palavrasChave = new javax.swing.JLabel();
        txt_titulo = new javax.swing.JTextField();
        txt_palavraChave1 = new javax.swing.JTextField();
        txt_palavraChave3 = new javax.swing.JTextField();
        txt_palavraChave4 = new javax.swing.JTextField();
        txt_palavraChave5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_resumo = new javax.swing.JTextArea();
        txt_palavraChave2 = new javax.swing.JTextField();
        pnl_listaAutores = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList_listaAutores = new javax.swing.JList();
        btn_novoAutor = new javax.swing.JButton();
        pnl_selecionarAutorCorrespondente = new javax.swing.JPanel();
        cmb_selecionarAutorCorrespondente = new javax.swing.JComboBox();
        btn_selecionarAutorCorrespondente = new javax.swing.JButton();
        pnl_ficheiro = new javax.swing.JPanel();
        txt_ficheiro = new javax.swing.JTextField();
        btn_ficheiro = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        btn_submeter = new javax.swing.JButton();
        btn_seguinteAutores = new javax.swing.JButton();
        btn_seguinteInfo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_selecionarSubmissivel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o evento/sessão temática onde pretende submeter a versão final do artigo"));

        btn_selecionarSubmissivel.setText("Selecionar");
        btn_selecionarSubmissivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarSubmissivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_selecionarSubmissivelLayout = new javax.swing.GroupLayout(pnl_selecionarSubmissivel);
        pnl_selecionarSubmissivel.setLayout(pnl_selecionarSubmissivelLayout);
        pnl_selecionarSubmissivelLayout.setHorizontalGroup(
            pnl_selecionarSubmissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarSubmissivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_selecionarSubmissivel, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarSubmissivel)
                .addContainerGap())
        );
        pnl_selecionarSubmissivelLayout.setVerticalGroup(
            pnl_selecionarSubmissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarSubmissivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarSubmissivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_selecionarSubmissivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarSubmissivel))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pnl_selecionarSubmissao.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione a submissão para a qual quer submeter a versão final"));

        btn_selecionarSubmissao.setText("Selecionar");
        btn_selecionarSubmissao.setEnabled(false);
        btn_selecionarSubmissao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarSubmissaoActionPerformed(evt);
            }
        });

        cmb_selecionarSubmissao.setEnabled(false);

        javax.swing.GroupLayout pnl_selecionarSubmissaoLayout = new javax.swing.GroupLayout(pnl_selecionarSubmissao);
        pnl_selecionarSubmissao.setLayout(pnl_selecionarSubmissaoLayout);
        pnl_selecionarSubmissaoLayout.setHorizontalGroup(
            pnl_selecionarSubmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_selecionarSubmissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_selecionarSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarSubmissao)
                .addContainerGap())
        );
        pnl_selecionarSubmissaoLayout.setVerticalGroup(
            pnl_selecionarSubmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarSubmissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarSubmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_selecionarSubmissao)
                    .addComponent(cmb_selecionarSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_informacoes.setVisible(false);
        pnl_informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));
        pnl_informacoes.setToolTipText("");

        lbl_titulo.setText("Titulo:");

        lbl_resumo.setText("Resumo:");

        lbl_palavrasChave.setText("Palavras-chave:");

        txtA_resumo.setColumns(20);
        txtA_resumo.setLineWrap(true);
        txtA_resumo.setRows(3);
        jScrollPane1.setViewportView(txtA_resumo);

        javax.swing.GroupLayout pnl_informacoesLayout = new javax.swing.GroupLayout(pnl_informacoes);
        pnl_informacoes.setLayout(pnl_informacoesLayout);
        pnl_informacoesLayout.setHorizontalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_informacoesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbl_palavrasChave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_palavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(txt_palavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_palavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_palavraChave4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_palavraChave5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_informacoesLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_resumo)
                            .addComponent(lbl_titulo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_titulo)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
        );
        pnl_informacoesLayout.setVerticalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_titulo))
                .addGap(18, 18, 18)
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_resumo)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_palavraChave1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_palavrasChave))
                    .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_palavraChave5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_palavraChave4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_palavraChave3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_palavraChave2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pnl_listaAutores.setVisible(false);
        pnl_listaAutores.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de autores"));
        pnl_listaAutores.setPreferredSize(new java.awt.Dimension(780, 161));

        jList_listaAutores.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        jList_listaAutores.setToolTipText("");
        jScrollPane2.setViewportView(jList_listaAutores);

        btn_novoAutor.setText("Novo Autor");

        javax.swing.GroupLayout pnl_listaAutoresLayout = new javax.swing.GroupLayout(pnl_listaAutores);
        pnl_listaAutores.setLayout(pnl_listaAutoresLayout);
        pnl_listaAutoresLayout.setHorizontalGroup(
            pnl_listaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_listaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_listaAutoresLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_novoAutor)))
                .addContainerGap())
        );
        pnl_listaAutoresLayout.setVerticalGroup(
            pnl_listaAutoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaAutoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_novoAutor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_selecionarAutorCorrespondente.setVisible(false);
        pnl_selecionarAutorCorrespondente.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o autor correspondente"));
        pnl_selecionarAutorCorrespondente.setPreferredSize(new java.awt.Dimension(780, 68));

        btn_selecionarAutorCorrespondente.setText("Selecionar Autor Correspondente");
        btn_selecionarAutorCorrespondente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarAutorCorrespondenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_selecionarAutorCorrespondenteLayout = new javax.swing.GroupLayout(pnl_selecionarAutorCorrespondente);
        pnl_selecionarAutorCorrespondente.setLayout(pnl_selecionarAutorCorrespondenteLayout);
        pnl_selecionarAutorCorrespondenteLayout.setHorizontalGroup(
            pnl_selecionarAutorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarAutorCorrespondenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_selecionarAutorCorrespondente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarAutorCorrespondente)
                .addContainerGap())
        );
        pnl_selecionarAutorCorrespondenteLayout.setVerticalGroup(
            pnl_selecionarAutorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarAutorCorrespondenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarAutorCorrespondenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_selecionarAutorCorrespondente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarAutorCorrespondente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_ficheiro.setVisible(false);
        pnl_ficheiro.setBorder(javax.swing.BorderFactory.createTitledBorder("Ficheiro"));
        pnl_ficheiro.setPreferredSize(new java.awt.Dimension(780, 68));

        txt_ficheiro.setEnabled(false);

        btn_ficheiro.setText("Escolher Ficheiro");
        btn_ficheiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ficheiroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_ficheiroLayout = new javax.swing.GroupLayout(pnl_ficheiro);
        pnl_ficheiro.setLayout(pnl_ficheiroLayout);
        pnl_ficheiroLayout.setHorizontalGroup(
            pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ficheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_ficheiro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_ficheiro)
                .addContainerGap())
        );
        pnl_ficheiroLayout.setVerticalGroup(
            pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_ficheiroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_ficheiroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ficheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ficheiro))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_submeter.setVisible(false);
        btn_submeter.setText("Submeter Artigo Final");
        btn_submeter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submeterActionPerformed(evt);
            }
        });

        btn_seguinteAutores.setVisible(false);
        btn_seguinteAutores.setText("Seguinte");
        btn_seguinteAutores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinteAutoresActionPerformed(evt);
            }
        });

        btn_seguinteInfo.setVisible(false);
        btn_seguinteInfo.setText("Seguinte");
        btn_seguinteInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinteInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_listaAutores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_selecionarSubmissivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_selecionarSubmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_selecionarAutorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_ficheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_seguinteInfo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_seguinteAutores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_submeter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_selecionarSubmissivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_selecionarSubmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_listaAutores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_selecionarAutorCorrespondente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_ficheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_submeter)
                    .addComponent(btn_seguinteAutores)
                    .addComponent(btn_seguinteInfo))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selecionarSubmissivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarSubmissivelActionPerformed
        //int indice = this.cmb_selecionarSubmissivel.getSelectedIndex();

        this.cmb_selecionarSubmissivel.setEnabled(false);
        this.btn_selecionarSubmissivel.setEnabled(false);
        this.cmb_selecionarSubmissao.setEnabled(true);
        this.btn_selecionarSubmissao.setEnabled(true);
        getRootPane().setDefaultButton(this.btn_selecionarSubmissao);
    }//GEN-LAST:event_btn_selecionarSubmissivelActionPerformed

    private void btn_selecionarSubmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarSubmissaoActionPerformed
        //int indice = this.cmb_selecionarSubmissivel.getSelectedIndex();

        this.pnl_selecionarSubmissivel.setVisible(false);
        this.pnl_selecionarSubmissao.setVisible(false);
        this.pnl_informacoes.setVisible(true);
        this.btn_seguinteInfo.setVisible(true);
        getRootPane().setDefaultButton(this.btn_seguinteInfo);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarSubmissaoActionPerformed

    private void btn_seguinteInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinteInfoActionPerformed

        this.pnl_informacoes.setVisible(false);
        this.btn_seguinteInfo.setVisible(false);
        this.pnl_listaAutores.setVisible(true);
        this.btn_seguinteAutores.setVisible(true);
        getRootPane().setDefaultButton(this.btn_seguinteAutores);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_seguinteInfoActionPerformed

    private void btn_seguinteAutoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinteAutoresActionPerformed
        //int indice = this.cmb_selecionarAutorCorrespondente.getSelectedIndex();

        this.pnl_listaAutores.setVisible(false);
        this.btn_seguinteAutores.setVisible(false);
        this.pnl_selecionarAutorCorrespondente.setVisible(true);
        getRootPane().setDefaultButton(this.btn_selecionarAutorCorrespondente);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_seguinteAutoresActionPerformed

    private void btn_selecionarAutorCorrespondenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarAutorCorrespondenteActionPerformed
        this.pnl_selecionarAutorCorrespondente.setVisible(false);
        this.pnl_ficheiro.setVisible(true);
        this.btn_submeter.setVisible(true);
        getRootPane().setDefaultButton(this.btn_ficheiro);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarAutorCorrespondenteActionPerformed

    private void btn_ficheiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ficheiroActionPerformed
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

                getRootPane().setDefaultButton(this.btn_submeter);
            }
        }
    }//GEN-LAST:event_btn_ficheiroActionPerformed

    private void btn_submeterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submeterActionPerformed
        String opcoes[] = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(
                null, "Pretende submeter  versão final do artigo?", "Submeter artigo final", 0,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (resposta == 0) {
        }
        dispose();
    }//GEN-LAST:event_btn_submeterActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_ficheiro;
    private javax.swing.JButton btn_novoAutor;
    private javax.swing.JButton btn_seguinteAutores;
    private javax.swing.JButton btn_seguinteInfo;
    private javax.swing.JButton btn_selecionarAutorCorrespondente;
    private javax.swing.JButton btn_selecionarSubmissao;
    private javax.swing.JButton btn_selecionarSubmissivel;
    private javax.swing.JButton btn_submeter;
    private javax.swing.JComboBox cmb_selecionarAutorCorrespondente;
    private javax.swing.JComboBox cmb_selecionarSubmissao;
    private javax.swing.JComboBox cmb_selecionarSubmissivel;
    private javax.swing.JList jList_listaAutores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_palavrasChave;
    private javax.swing.JLabel lbl_resumo;
    private javax.swing.JLabel lbl_titulo;
    private javax.swing.JPanel pnl_ficheiro;
    private javax.swing.JPanel pnl_informacoes;
    private javax.swing.JPanel pnl_listaAutores;
    private javax.swing.JPanel pnl_selecionarAutorCorrespondente;
    private javax.swing.JPanel pnl_selecionarSubmissao;
    private javax.swing.JPanel pnl_selecionarSubmissivel;
    private javax.swing.JTextArea txtA_resumo;
    private javax.swing.JTextField txt_ficheiro;
    private javax.swing.JTextField txt_palavraChave1;
    private javax.swing.JTextField txt_palavraChave2;
    private javax.swing.JTextField txt_palavraChave3;
    private javax.swing.JTextField txt_palavraChave4;
    private javax.swing.JTextField txt_palavraChave5;
    private javax.swing.JTextField txt_titulo;
    // End of variables declaration//GEN-END:variables
}
