package eventoscientificios.view;

import eventoscientificos.controllers.ReverArtigoController;
import eventoscientificos.model.Empresa;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 * @author G01
 */
public class ReverArtigoUI extends javax.swing.JDialog {

    private Frame framePai;
    private ReverArtigoController controller;

    /**
     * Creates new form ReverArtigoUI
     */
    public ReverArtigoUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        this.framePai = parent;
        this.controller = new ReverArtigoController(empresa);
        setResizable(false);
        initComponents();
        getRootPane().setDefaultButton(this.btn_selecionarRevisivel);
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

        pnl_selecionarRevisivel = new javax.swing.JPanel();
        cmb_selecionarRevisivel = new javax.swing.JComboBox();
        btn_selecionarRevisivel = new javax.swing.JButton();
        pnl_selecionarSubmissao = new javax.swing.JPanel();
        btn_selecionarSubmissao = new javax.swing.JButton();
        cmb_selecionarSubmissao = new javax.swing.JComboBox();
        pnl_revisao = new javax.swing.JPanel();
        lbl_confianca = new javax.swing.JLabel();
        lbl_adequacao = new javax.swing.JLabel();
        lbl_recomendacao = new javax.swing.JLabel();
        lbl_texto = new javax.swing.JLabel();
        lbl_originalidade = new javax.swing.JLabel();
        lbl_qualidade = new javax.swing.JLabel();
        cmb_recomendacao = new javax.swing.JComboBox();
        cmb_adequacao = new javax.swing.JComboBox();
        cmb_confianca = new javax.swing.JComboBox();
        cmb_qualidade = new javax.swing.JComboBox();
        cmb_originalidade = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtA_texto = new javax.swing.JTextArea();
        btn_cancelar = new javax.swing.JButton();
        btn_submeterRevisao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        pnl_selecionarRevisivel.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o evento/sessão temática onde pretende rever artigos"));
        pnl_selecionarRevisivel.setPreferredSize(new java.awt.Dimension(780, 68));

        btn_selecionarRevisivel.setText("Selecionar");
        btn_selecionarRevisivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_selecionarRevisivelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_selecionarRevisivelLayout = new javax.swing.GroupLayout(pnl_selecionarRevisivel);
        pnl_selecionarRevisivel.setLayout(pnl_selecionarRevisivelLayout);
        pnl_selecionarRevisivelLayout.setHorizontalGroup(
            pnl_selecionarRevisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarRevisivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmb_selecionarRevisivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarRevisivel)
                .addContainerGap())
        );
        pnl_selecionarRevisivelLayout.setVerticalGroup(
            pnl_selecionarRevisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarRevisivelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarRevisivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_selecionarRevisivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarRevisivel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_selecionarSubmissao.setBorder(javax.swing.BorderFactory.createTitledBorder("Selecione o artigo que pretende rever"));
        pnl_selecionarSubmissao.setPreferredSize(new java.awt.Dimension(780, 68));

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
                .addComponent(cmb_selecionarSubmissao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_selecionarSubmissao)
                .addContainerGap())
        );
        pnl_selecionarSubmissaoLayout.setVerticalGroup(
            pnl_selecionarSubmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_selecionarSubmissaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_selecionarSubmissaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmb_selecionarSubmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_selecionarSubmissao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_revisao.setVisible(false);
        pnl_revisao.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados da revisão"));

        lbl_confianca.setText("Confiança no tema revisto:");

        lbl_adequacao.setText("Adequação do artigo:");

        lbl_recomendacao.setText("Recomendação global:");

        lbl_texto.setText("Texto justificativo:");

        lbl_originalidade.setText("Originalidade do artigo:");

        lbl_qualidade.setText("Qualidade do artigo:");

        cmb_recomendacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-2", "2", "0", "1", "2" }));
        cmb_recomendacao.setSelectedIndex(2);

        cmb_adequacao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cmb_confianca.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cmb_qualidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        cmb_originalidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));

        txtA_texto.setColumns(20);
        txtA_texto.setLineWrap(true);
        txtA_texto.setRows(5);
        txtA_texto.setTabSize(2);
        jScrollPane1.setViewportView(txtA_texto);

        javax.swing.GroupLayout pnl_revisaoLayout = new javax.swing.GroupLayout(pnl_revisao);
        pnl_revisao.setLayout(pnl_revisaoLayout);
        pnl_revisaoLayout.setHorizontalGroup(
            pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_revisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_adequacao)
                    .addComponent(lbl_confianca)
                    .addComponent(lbl_qualidade)
                    .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbl_recomendacao)
                        .addComponent(lbl_originalidade)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_revisaoLayout.createSequentialGroup()
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cmb_confianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_adequacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(lbl_texto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_revisaoLayout.createSequentialGroup()
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_originalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_qualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_recomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 551, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnl_revisaoLayout.setVerticalGroup(
            pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_revisaoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_confianca)
                    .addComponent(cmb_confianca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_texto))
                .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_revisaoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_adequacao)
                            .addComponent(cmb_adequacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_originalidade)
                            .addComponent(cmb_originalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_qualidade, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_qualidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnl_revisaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_recomendacao)
                            .addComponent(cmb_recomendacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_revisaoLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_submeterRevisao.setVisible(false);
        btn_submeterRevisao.setText("Submeter Revisão");
        btn_submeterRevisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_submeterRevisaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnl_revisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_selecionarSubmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnl_selecionarRevisivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_submeterRevisao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnl_selecionarRevisivel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_selecionarSubmissao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_revisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_submeterRevisao))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_selecionarRevisivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarRevisivelActionPerformed
        //int indice = this.cmb_selecionarRevisivel.getSelectedIndex();

        this.btn_selecionarRevisivel.setEnabled(false);
        this.cmb_selecionarRevisivel.setEnabled(false);
        this.btn_selecionarSubmissao.setEnabled(true);
        this.cmb_selecionarSubmissao.setEnabled(true);
        getRootPane().setDefaultButton(btn_selecionarSubmissao);
    }//GEN-LAST:event_btn_selecionarRevisivelActionPerformed

    private void btn_selecionarSubmissaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_selecionarSubmissaoActionPerformed
        //int indice = this.cmb_selecionarSubmissao.getSelectedIndex();

        this.pnl_selecionarRevisivel.setVisible(false);
        this.pnl_selecionarSubmissao.setVisible(false);
        this.pnl_revisao.setVisible(true);
        getRootPane().setDefaultButton(this.btn_submeterRevisao);
        pack();
        setLocationRelativeTo(null);
    }//GEN-LAST:event_btn_selecionarSubmissaoActionPerformed

    private void btn_submeterRevisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_submeterRevisaoActionPerformed
        int confianca = (Integer) this.cmb_confianca.getSelectedItem();
        int adequacao = (Integer) this.cmb_adequacao.getSelectedItem();
        int originalidade = (Integer) this.cmb_originalidade.getSelectedItem();
        int qualidade = (Integer) this.cmb_qualidade.getSelectedItem();
        int recomendacao = (Integer) this.cmb_recomendacao.getSelectedItem();
        String texto = this.txtA_texto.getText();

        String opcoes[] = {"Sim", "Não"};
        int resposta = JOptionPane.showOptionDialog(
                null, "Pretende submeter a revisão?", "Rever Artigo", 0,
                JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        if (resposta == 0) {
        }
        dispose();
    }//GEN-LAST:event_btn_submeterRevisaoActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_selecionarRevisivel;
    private javax.swing.JButton btn_selecionarSubmissao;
    private javax.swing.JButton btn_submeterRevisao;
    private javax.swing.JComboBox cmb_adequacao;
    private javax.swing.JComboBox cmb_confianca;
    private javax.swing.JComboBox cmb_originalidade;
    private javax.swing.JComboBox cmb_qualidade;
    private javax.swing.JComboBox cmb_recomendacao;
    private javax.swing.JComboBox cmb_selecionarRevisivel;
    private javax.swing.JComboBox cmb_selecionarSubmissao;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_adequacao;
    private javax.swing.JLabel lbl_confianca;
    private javax.swing.JLabel lbl_originalidade;
    private javax.swing.JLabel lbl_qualidade;
    private javax.swing.JLabel lbl_recomendacao;
    private javax.swing.JLabel lbl_texto;
    private javax.swing.JPanel pnl_revisao;
    private javax.swing.JPanel pnl_selecionarRevisivel;
    private javax.swing.JPanel pnl_selecionarSubmissao;
    private javax.swing.JTextArea txtA_texto;
    // End of variables declaration//GEN-END:variables
}
