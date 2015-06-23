package eventoscientificios.view;

import eventoscientificos.model.Empresa;
import java.awt.Frame;

/**
 * @author G01
 */
public class GerarEstatisticasTopicosUI extends javax.swing.JDialog {
    
    private Frame framePai;

    /**
     * Creates new form GerarEstatisticasTopicosUI
     * @param parent
     * @param modal
     * @param empresa
     */
    public GerarEstatisticasTopicosUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, modal);
        setResizable(false);
        initComponents();
        getRootPane().setDefaultButton(this.btn_gerar);
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

        lbl_descricao = new javax.swing.JLabel();
        btn_gerar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lbl_descricao.setText("Descrição:");

        btn_gerar.setText("Gerar Estatísticas sobre Tópicos");
        btn_gerar.setPreferredSize(new java.awt.Dimension(400, 23));
        btn_gerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_gerarActionPerformed(evt);
            }
        });

        btn_cancelar.setText("Cancelar");
        btn_cancelar.setPreferredSize(new java.awt.Dimension(400, 23));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(lbl_descricao)
                .addGap(170, 170, 170))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_descricao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(btn_gerar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_gerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_gerarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_gerarActionPerformed

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_gerar;
    private javax.swing.JLabel lbl_descricao;
    // End of variables declaration//GEN-END:variables
}
