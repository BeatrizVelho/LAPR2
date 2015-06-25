package eventoscientificios.view;

import eventoscientificos.controllers.AlterarUtilizadorController;
import eventoscientificos.model.Empresa;
import java.awt.Frame;
import javax.swing.JOptionPane;

/**
 * @author G01
 */
public class AlterarUtilizadorUI extends javax.swing.JDialog {

    private Frame framePai;
    private AlterarUtilizadorController controller;

    /**
     * Creates new form NewJDialog
     *
     * @param parent
     * @param modal
     * @param empresa
     */
    public AlterarUtilizadorUI(java.awt.Frame parent, boolean modal, Empresa empresa) {
        super(parent, "Alterar Utilizador", modal);
        this.controller = new AlterarUtilizadorController(empresa);
        this.controller.criarCloneUtilizador();
        this.framePai = parent;
        setResizable(false);
        initComponents();
        setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btn_alterarDados);
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

        txt_username = new javax.swing.JTextField();
        txt_nome = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        lbl_password = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        lbl_nome = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();
        btn_alterarDados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txt_username.setText(this.controller.getUtilizadorUsername());

        txt_nome.setText(this.controller.getUtilizadorNome());

        txt_email.setText(this.controller.getUtilizadorEmail());

        txt_password.setText(this.controller.getUtilizadorPassword());

        lbl_password.setText("Password:");

        lbl_username.setText("Username:");

        lbl_nome.setText("Nome:");

        lbl_email.setText("Email:");

        btn_cancelar.setText("Cancelar");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        btn_alterarDados.setText("Alterar Dados");
        btn_alterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_alterarDadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_username)
                                    .addComponent(lbl_password))
                                .addComponent(lbl_email, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(lbl_nome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_email)
                            .addComponent(txt_nome)
                            .addComponent(txt_username)
                            .addComponent(txt_password)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 145, Short.MAX_VALUE)
                        .addComponent(btn_alterarDados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_cancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_username))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_password))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_nome))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_email))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelar)
                    .addComponent(btn_alterarDados))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    private void btn_alterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_alterarDadosActionPerformed
        try {
            if (!controller.alterarDadosUtilizador(
                    txt_username.getText(),
                    new String(txt_password.getPassword()),
                    txt_nome.getText(),
                    txt_email.getText())) {
                throw new IllegalArgumentException("Já existe um utilizador com"
                        + " os dados que inseriu.");
            }

            String opcoes[] = {"Sim", "Não"};
            int resposta = JOptionPane.showOptionDialog(
                    null, "Confirma os dados?", "Alterar Utilizador", 0,
                    JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
            if (resposta == 0) {
                controller.atualizarUtilizador();
            }
            dispose();
        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(
                    framePai,
                    ex.getMessage(),
                    "Alterar Utilizador",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_alterarDadosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alterarDados;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_nome;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_nome;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
