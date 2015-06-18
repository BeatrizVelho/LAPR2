/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventoscientificios.view;

import eventoscientificos.controllers.DefinirSessaoTematicaController;
import eventoscientificos.model.Empresa;
import eventoscientificos.model.Local;
import java.awt.Frame;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import utils.Data;

/**
 *
 * @author Pedro
 */
public class DefinirSessaoTematicaUI extends javax.swing.JDialog {

    private Frame framePai;
    private DefinirSessaoTematicaController controller;

    /**
     * Creates new form UI
     *
     * @param parent
     * @param modal
     * @param empresa
     */
    public DefinirSessaoTematicaUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, "Criar Sessao Temática", modal);
        this.controller = new DefinirSessaoTematicaController(empresa);
        this.controller.getListaEventosOrganizador();
        this.framePai = parent;
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_selecionarEvento);
        setVisible(true);
        pack();
        if (this.cmb_selecionarEvento.getItemCount() == 0) {
            JOptionPane.showMessageDialog(
                    framePai,
                    "Não existem eventos onde seja possível definir sessões temáticas.",
                    "Criar Evento",
                    JOptionPane.ERROR_MESSAGE);
            dispose();
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

        pnl_selecionarEvento = new javax.swing.JPanel();
        cmb_selecionarEvento = new javax.swing.JComboBox(this.controller.getListaEventos().toArray());
        btn_selecionarEvento = new javax.swing.JButton();
        pnl_informacoes = new javax.swing.JPanel();
        lbl_descricao = new javax.swing.JLabel();
        lbl_codigoUnico = new javax.swing.JLabel();
        txt_codigoUnico = new javax.swing.JTextField();
        txt_descricao = new javax.swing.JTextField();
        pnl_datas = new javax.swing.JPanel();
        lbl_dataInicio = new javax.swing.JLabel();
        lbl_dataFim = new javax.swing.JLabel();
        datePicker_dataInicio = new org.jdesktop.swingx.JXDatePicker();
        lbl_dataInicioSubmissao = new javax.swing.JLabel();
        datePicker_dataFim = new org.jdesktop.swingx.JXDatePicker();
        datePicker_dataInicioDistribuicao = new org.jdesktop.swingx.JXDatePicker();
        datePicker_dataFimRevisao = new org.jdesktop.swingx.JXDatePicker();
        lbl_dataInicioDistribuicao = new javax.swing.JLabel();
        lbl_dataFimRevisao = new javax.swing.JLabel();
        datePicker_dataFimSubmissaoCameraReady = new org.jdesktop.swingx.JXDatePicker();
        lbl_dataFimSubmissaoCameraReady = new javax.swing.JLabel();
        lbl_dataFimSubmissao = new javax.swing.JLabel();
        datePicker_dataInicioSubmissao = new org.jdesktop.swingx.JXDatePicker();
        datePicker_dataFimSubmissao = new org.jdesktop.swingx.JXDatePicker();
        pnl_listaProponentes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList(this.controller.getModeloListaPapel());
        btn_adicionarProponente = new javax.swing.JButton();
        txt_IDProponente = new javax.swing.JTextField();
        lbl_IDProponente = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_criarST = new javax.swing.JButton();
        btn_seguinte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_selecionarEvento.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o evento onde pretende criar a sessão temática"));

        btn_selecionarEvento.setText("Selecionar");
        btn_selecionarEvento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarEventoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_selecionarEventoLayout = new javax.swing.GroupLayout(pnl_selecionarEvento);
        pnl_selecionarEvento.setLayout(pnl_selecionarEventoLayout);
        pnl_selecionarEventoLayout.setHorizontalGroup(
            pnl_selecionarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_selecionarEvento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarEvento)
                .addContainerGap())
        );
        pnl_selecionarEventoLayout.setVerticalGroup(
            pnl_selecionarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarEventoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_selecionarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarEvento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_informacoes.setVisible(false);
        pnl_informacoes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informações"));

        lbl_descricao.setText("Descrição:");

        lbl_codigoUnico.setText("Códigio Único:");

        javax.swing.GroupLayout pnl_informacoesLayout = new javax.swing.GroupLayout(pnl_informacoes);
        pnl_informacoes.setLayout(pnl_informacoesLayout);
        pnl_informacoesLayout.setHorizontalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_codigoUnico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_codigoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_descricao)
                .addContainerGap())
        );
        pnl_informacoesLayout.setVerticalGroup(
            pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_informacoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_informacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_codigoUnico)
                    .addComponent(txt_codigoUnico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_descricao)
                    .addComponent(txt_descricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_datas.setVisible(false);
        pnl_datas.setBorder(javax.swing.BorderFactory.createTitledBorder("Datas"));

        lbl_dataInicio.setText("Data de início:");

        lbl_dataFim.setText("Data de fim:");

        lbl_dataInicioSubmissao.setText("Data inicial de submissão:");

        lbl_dataInicioDistribuicao.setText("Data de distribuição:");

        lbl_dataFimRevisao.setText("Data limite de revisão:");

        lbl_dataFimSubmissaoCameraReady.setText("Data limite de submissão Camera Ready:");

        lbl_dataFimSubmissao.setText("Data de fim de submissão:");

        javax.swing.GroupLayout pnl_datasLayout = new javax.swing.GroupLayout(pnl_datas);
        pnl_datas.setLayout(pnl_datasLayout);
        pnl_datasLayout.setHorizontalGroup(
            pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_datasLayout.createSequentialGroup()
                        .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_dataFim)
                            .addComponent(lbl_dataInicio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnl_datasLayout.createSequentialGroup()
                                .addComponent(datePicker_dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(80, 80, 80)
                                .addComponent(lbl_dataFimSubmissao))
                            .addGroup(pnl_datasLayout.createSequentialGroup()
                                .addComponent(datePicker_dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(lbl_dataInicioSubmissao)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(datePicker_dataInicioSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datePicker_dataFimSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datasLayout.createSequentialGroup()
                                .addComponent(lbl_dataFimRevisao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(datePicker_dataFimRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datasLayout.createSequentialGroup()
                                .addComponent(lbl_dataInicioDistribuicao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(datePicker_dataInicioDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_datasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_dataFimSubmissaoCameraReady)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(datePicker_dataFimSubmissaoCameraReady, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnl_datasLayout.setVerticalGroup(
            pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_datasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dataInicio)
                    .addComponent(datePicker_dataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dataInicioSubmissao)
                    .addComponent(datePicker_dataInicioDistribuicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dataInicioDistribuicao)
                    .addComponent(datePicker_dataInicioSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_dataFim)
                    .addComponent(datePicker_dataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePicker_dataFimRevisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dataFimRevisao)
                    .addComponent(lbl_dataFimSubmissao)
                    .addComponent(datePicker_dataFimSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnl_datasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePicker_dataFimSubmissaoCameraReady, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_dataFimSubmissaoCameraReady))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_listaProponentes.setVisible(false);
        pnl_listaProponentes.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Proponentes"));

        jScrollPane1.setViewportView(jList1);

        btn_adicionarProponente.setText("Adicionar Proponente");
        btn_adicionarProponente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adicionarProponenteActionPerformed(evt);
            }
        });

        lbl_IDProponente.setText("Insira o ID do Proponente:");

        javax.swing.GroupLayout pnl_listaProponentesLayout = new javax.swing.GroupLayout(pnl_listaProponentes);
        pnl_listaProponentes.setLayout(pnl_listaProponentesLayout);
        pnl_listaProponentesLayout.setHorizontalGroup(
            pnl_listaProponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaProponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_listaProponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_listaProponentesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_IDProponente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_IDProponente, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_adicionarProponente)))
                .addContainerGap())
        );
        pnl_listaProponentesLayout.setVerticalGroup(
            pnl_listaProponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_listaProponentesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_listaProponentesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_adicionarProponente)
                    .addComponent(txt_IDProponente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_IDProponente))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_criarST.setVisible(false);
        btn_criarST.setText("Criar Sessão Temática");
        btn_criarST.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_criarSTActionPerformed(evt);
            }
        });

        btn_seguinte.setVisible(false);
        btn_seguinte.setText("Seguinte");
        btn_seguinte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_seguinteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_selecionarEvento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_informacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_datas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_listaProponentes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_seguinte)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_criarST)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar)))
                .addGap(13, 13, 13))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_selecionarEvento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_informacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnl_datas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_listaProponentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_criarST)
                    .addComponent(btn_seguinte))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selecionarEventoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarEventoActionPerformed
        int indice = this.cmb_selecionarEvento.getSelectedIndex();

        this.controller.selecionarEvento(indice);
        this.cmb_selecionarEvento.setEnabled(false);
        this.btn_selecionarEvento.setEnabled(false);
        this.pnl_informacoes.setVisible(true);
        this.pnl_datas.setVisible(true);
        this.btn_seguinte.setVisible(true);
        getRootPane().setDefaultButton(this.btn_seguinte);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarEventoActionPerformed

    private void btn_seguinteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_seguinteActionPerformed
        try {
            SimpleDateFormat formatador = new SimpleDateFormat("yyyy-MM-dd");

            this.controller.novaSessaoTematica(
                    txt_codigoUnico.getText(),
                    txt_descricao.getText(),
                    Data.converterString(formatador.format(datePicker_dataInicioSubmissao.getDate())),
                    Data.converterString(formatador.format(datePicker_dataFimSubmissao.getDate())),
                    Data.converterString(formatador.format(datePicker_dataInicioDistribuicao.getDate())),
                    Data.converterString(formatador.format(datePicker_dataFimRevisao.getDate())),
                    Data.converterString(formatador.format(datePicker_dataFimSubmissaoCameraReady.getDate())),
                    Data.converterString(formatador.format(datePicker_dataInicio.getDate())),
                    Data.converterString(formatador.format(datePicker_dataFim.getDate())));

            this.pnl_selecionarEvento.setVisible(false);
            this.pnl_informacoes.setVisible(false);
            this.pnl_datas.setVisible(false);
            this.btn_seguinte.setVisible(false);
            this.pnl_listaProponentes.setVisible(true);
            this.btn_criarST.setVisible(true);
            pack();
            setLocationRelativeTo(null);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    framePai,
                    ex.getMessage(),
                    "Criar Evento",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_seguinteActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_criarSTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_criarSTActionPerformed
        try {
            this.controller.validarSessaoTematica();

            String opcoes[] = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(
                    null, "Pretende criar a sessão temática?", "Criar Sessão Temática", 0, 
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (resposta == 0) {
                this.controller.adicionarSessaoTematica();
            }
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    framePai,
                    ex.getMessage(),
                    "Criar Sessão Temática",
                    JOptionPane.ERROR_MESSAGE);
            this.controller.getModeloListaPapel().removeAllElements();
            this.pnl_selecionarEvento.setVisible(true);
            this.pnl_informacoes.setVisible(true);
            this.pnl_datas.setVisible(true);
            this.btn_seguinte.setVisible(true);
            this.pnl_listaProponentes.setVisible(false);
            this.btn_criarST.setVisible(false);
            pack();
            setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btn_criarSTActionPerformed

    private void btn_adicionarProponenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adicionarProponenteActionPerformed
        try {
            this.controller.novoProponente(this.txt_IDProponente.getText());

            this.txt_IDProponente.setText("");
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(
                    framePai,
                    "Não introduziu um ID válido.",
                    "Criar Evento",
                    JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    framePai,
                    ex.getMessage(),
                    "Criar Evento",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_adicionarProponenteActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_adicionarProponente;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_criarST;
    private javax.swing.JButton btn_seguinte;
    private javax.swing.JButton btn_selecionarEvento;
    private javax.swing.JComboBox cmb_selecionarEvento;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataFim;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataFimRevisao;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataFimSubmissao;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataFimSubmissaoCameraReady;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataInicio;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataInicioDistribuicao;
    private org.jdesktop.swingx.JXDatePicker datePicker_dataInicioSubmissao;
    private javax.swing.JList jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_IDProponente;
    private javax.swing.JLabel lbl_codigoUnico;
    private javax.swing.JLabel lbl_dataFim;
    private javax.swing.JLabel lbl_dataFimRevisao;
    private javax.swing.JLabel lbl_dataFimSubmissao;
    private javax.swing.JLabel lbl_dataFimSubmissaoCameraReady;
    private javax.swing.JLabel lbl_dataInicio;
    private javax.swing.JLabel lbl_dataInicioDistribuicao;
    private javax.swing.JLabel lbl_dataInicioSubmissao;
    private javax.swing.JLabel lbl_descricao;
    private javax.swing.JPanel pnl_datas;
    private javax.swing.JPanel pnl_informacoes;
    private javax.swing.JPanel pnl_listaProponentes;
    private javax.swing.JPanel pnl_selecionarEvento;
    private javax.swing.JTextField txt_IDProponente;
    private javax.swing.JTextField txt_codigoUnico;
    private javax.swing.JTextField txt_descricao;
    // End of variables declaration//GEN-END:variables
}