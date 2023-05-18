/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;
/**
 *
 * @author Adriel
 */
public class TelaAddCliente extends javax.swing.JFrame {

    /**
     * Creates new form TelaAddCliente
     */
	
	Cliente cliente = new Cliente();
    MetodosSave metodoSave = new MetodosSave();
	
    public TelaAddCliente() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NameText = new javax.swing.JTextField();
        CpfCnpjLabel = new javax.swing.JLabel();
        CpfCnpjText = new javax.swing.JTextField();
        InscricaoMunicipalLabel = new javax.swing.JLabel();
        InscricaoMunicipalText = new javax.swing.JTextField();
        EnderecoLabel = new javax.swing.JLabel();
        EnderecoText = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        NumeroText = new javax.swing.JTextField();
        ComplementoLabel = new javax.swing.JLabel();
        ComplementoText = new javax.swing.JTextField();
        BairroLabel = new javax.swing.JLabel();
        BairroText = new javax.swing.JTextField();
        CepLabel = new javax.swing.JLabel();
        CepText = new javax.swing.JTextField();
        UfLabel = new javax.swing.JLabel();
        UfText = new javax.swing.JTextField();
        TelefoneLabel = new javax.swing.JLabel();
        TelefoneText = new javax.swing.JTextField();
        EmailLabel = new javax.swing.JLabel();
        EmailText = new javax.swing.JTextField();
        RazaoRedLabel = new javax.swing.JLabel();
        RazaoRedText = new javax.swing.JTextField();
        DataCadastroLabel = new javax.swing.JLabel();
        DataCadastroText = new javax.swing.JTextField();
        IndicacaoLabel = new javax.swing.JLabel();
        IndicacaoText = new javax.swing.JTextField();
        ComissaoLabel = new javax.swing.JLabel();
        ComissaoText = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Title.setText("Cadastro de Cliente");

        NameLabel.setText("Nome/Razão Social:");

        NameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextActionPerformed(evt);
            }
        });

        CpfCnpjLabel.setText("CPF/CNPJ:");

        CpfCnpjText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CpfCnpjTextActionPerformed(evt);
            }
        });

        InscricaoMunicipalLabel.setText("Inscrição Municipal:");

        EnderecoLabel.setText("Endereço:");

        NumeroLabel.setText("Número:");

        ComplementoLabel.setText("Complemento:");

        BairroLabel.setText("Bairro:");

        CepLabel.setText("Cep:");

        UfLabel.setText("UF:");

        TelefoneLabel.setText("Telefone:");

        EmailLabel.setText("E-mail:");

        RazaoRedLabel.setText("RazaoReduzida:");

        DataCadastroLabel.setText("Data de Cadastro:");

        IndicacaoLabel.setText("Indicação:");

        ComissaoLabel.setText("Comissão:");

        SaveButton.setText("Salvar");
        SaveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveButtonActionPerformed(evt);
            }
        });

        CancelButton.setText("Cancelar");
        CancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NameLabel)
                            .addComponent(CpfCnpjLabel)
                            .addComponent(InscricaoMunicipalLabel)
                            .addComponent(EnderecoLabel)
                            .addComponent(NumeroLabel)
                            .addComponent(BairroLabel)
                            .addComponent(CepLabel)
                            .addComponent(TelefoneLabel)
                            .addComponent(RazaoRedLabel)
                            .addComponent(DataCadastroLabel)
                            .addComponent(IndicacaoLabel)
                            .addComponent(ComissaoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BairroText, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CpfCnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InscricaoMunicipalText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RazaoRedText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataCadastroText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IndicacaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComplementoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ComplementoText, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CepText, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UfLabel)
                                    .addComponent(EmailLabel))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UfText, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComissaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(119, 119, 119)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(Title)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CpfCnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CpfCnpjLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(InscricaoMunicipalText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(InscricaoMunicipalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnderecoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumeroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NumeroLabel)
                            .addComponent(ComplementoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ComplementoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BairroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BairroLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CepText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CepLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TelefoneLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(UfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UfLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RazaoRedText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RazaoRedLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DataCadastroText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DataCadastroLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IndicacaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IndicacaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComissaoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComissaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextActionPerformed

    private void CpfCnpjTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CpfCnpjTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CpfCnpjTextActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        CancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	 TelaInicial telaInicial = new TelaInicial();
            	 telaInicial.setVisible(true);        	 
                 dispose();
            }
        });
    }//GEN-LAST:event_CancelButtonActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
       
        salvarDados();
        //System.out.println(cliente);
        // Cliente c1 = new Cliente(cpfCnpj, inscMunicipal, nome, endereco, numero, complemento, bairro, uf, cep, tel, email, razaoRed, data, indicacao, comissao);
    }
   
    private void salvarDados() {
    	if (validaCamposObrigatorios()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para salvar!");
        } else {
            try {
                cliente.setCpfCnpj(CpfCnpjText.getText().trim());
                cliente.setInscricaoMunicipal(InscricaoMunicipalText.getText().trim());
                cliente.setRazaoSocial(NameText.getText().trim());
                cliente.setEndereco(EnderecoText.getText());
                cliente.setNumeroEndereco(NumeroText.getText().trim());
                cliente.setComplemento(ComplementoText.getText().trim());
                cliente.setBairro(BairroText.getText().trim());
                cliente.setUfEndereco(UfText.getText().trim());
                cliente.setCep(CepText.getText().trim());
                cliente.setTelefone((TelefoneText.getText().trim()));
                cliente.setEmail(EmailText.getText().trim());
                cliente.setRazaoReduzida(RazaoRedText.getText().trim());
                cliente.setDataCadastro(DataCadastroText.getText().trim());
                cliente.setIndicacao(IndicacaoText.getText().trim());
                cliente.setComissao(ComissaoText.getText().trim());
                
                metodoSave.criarRegistroClienteBD(cliente);
                
                JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
          } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!");
            }
        }
    }

    private boolean validaCamposObrigatorios() {
        return (CpfCnpjText.getText().equals("")
                || InscricaoMunicipalText.getText().equals("")
                || NameText.getText().equals("")
                || EnderecoText.getText().equals("")
                || NumeroText.getText().equals("")
                || ComplementoText.getText().equals("")
                || BairroText.getText().equals("")
                || UfText.getText().equals("")
                || CepText.getText().equals("")
                || TelefoneText.getText().equals("")
                || EmailText.getText().equals("")
                || RazaoRedText.getText().equals("")
                || DataCadastroText.getText().equals("")
                || IndicacaoText.getText().equals("")
                || ComissaoText.getText().equals(""));       
    }//GEN-LAST:event_SaveButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BairroLabel;
    private javax.swing.JTextField BairroText;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CepLabel;
    private javax.swing.JTextField CepText;
    private javax.swing.JLabel ComissaoLabel;
    private javax.swing.JTextField ComissaoText;
    private javax.swing.JLabel ComplementoLabel;
    private javax.swing.JTextField ComplementoText;
    private javax.swing.JLabel CpfCnpjLabel;
    private javax.swing.JTextField CpfCnpjText;
    private javax.swing.JLabel DataCadastroLabel;
    private javax.swing.JTextField DataCadastroText;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField EmailText;
    private javax.swing.JLabel EnderecoLabel;
    private javax.swing.JTextField EnderecoText;
    private javax.swing.JLabel IndicacaoLabel;
    private javax.swing.JTextField IndicacaoText;
    private javax.swing.JLabel InscricaoMunicipalLabel;
    private javax.swing.JTextField InscricaoMunicipalText;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JTextField NameText;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JTextField NumeroText;
    private javax.swing.JLabel RazaoRedLabel;
    private javax.swing.JTextField RazaoRedText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JTextField TelefoneText;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UfLabel;
    private javax.swing.JTextField UfText;
    // End of variables declaration//GEN-END:variables
}
