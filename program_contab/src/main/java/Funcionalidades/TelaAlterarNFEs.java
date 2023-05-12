package Funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Adriel
 */
public class TelaAlterarNFEs extends javax.swing.JFrame {

    /**
     * Creates new form TelaAlterarNFEs
     */
    public TelaAlterarNFEs() {
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
        NumeroLabel = new javax.swing.JLabel();
        NumeroField = new javax.swing.JTextField();
        CodVerificacaoLabel = new javax.swing.JLabel();
        CodVerificacaoField = new javax.swing.JTextField();
        DataEmissaoLabel = new javax.swing.JLabel();
        DataEmissaoField = new javax.swing.JTextField();
        CompetenciaLabel = new javax.swing.JLabel();
        CompetenciaField = new javax.swing.JTextField();
        BasedeCalculoLabel = new javax.swing.JLabel();
        BasedeCalculoField = new javax.swing.JTextField();
        IssRetidoLabel = new javax.swing.JLabel();
        IssRetidoField = new javax.swing.JTextField();
        ValordosServicosLabel = new javax.swing.JLabel();
        ValordosServicosField = new javax.swing.JTextField();
        ValorLiquidoLabel = new javax.swing.JLabel();
        ValorLiquidoLabelField = new javax.swing.JTextField();
        CodTributacaoMunLabel = new javax.swing.JLabel();
        CodTributacaoMunField = new javax.swing.JTextField();
        DescontoLabel = new javax.swing.JLabel();
        DescontoField = new javax.swing.JTextField();
        DiscServicosLabel = new javax.swing.JLabel();
        DiscServicosScroll = new javax.swing.JScrollPane();
        DiscServicosText = new javax.swing.JTextArea();
        CpfCnpjLabel = new javax.swing.JLabel();
        CpfCnpjField = new javax.swing.JTextField();
        RazaoRedLabel = new javax.swing.JLabel();
        RazaoRedField = new javax.swing.JTextField();
        BairroLabel = new javax.swing.JLabel();
        BairroField = new javax.swing.JTextField();
        UFLabel = new javax.swing.JLabel();
        UFField = new javax.swing.JTextField();
        PagamentoLabel = new javax.swing.JLabel();
        PagamentoField = new javax.swing.JTextField();
        VencimentoLabel = new javax.swing.JLabel();
        VencimentoField = new javax.swing.JTextField();
        JurosLabel = new javax.swing.JLabel();
        JurosField = new javax.swing.JTextField();
        ValorPagoLabel = new javax.swing.JLabel();
        ValorPagoField = new javax.swing.JTextField();
        ImportadaEmLabel = new javax.swing.JLabel();
        ImportadaEmField = new javax.swing.JTextField();
        ImpostoRetLabel = new javax.swing.JLabel();
        ImpostoRetField = new javax.swing.JTextField();
        JurosMultaAbonadaLabel = new javax.swing.JLabel();
        JurosMultaAbonadaField = new javax.swing.JTextField();
        MesAnoLabel = new javax.swing.JLabel();
        MesAnoField = new javax.swing.JTextField();
        SaveButton = new javax.swing.JButton();
        CancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Title.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Title.setText("Alterar NFE's");

        NumeroLabel.setText("Número:");

        NumeroField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeroFieldActionPerformed(evt);
            }
        });

        CodVerificacaoLabel.setText("Código de verificação:");

        DataEmissaoLabel.setText("Data de emissão:");

        CompetenciaLabel.setText("Competência:");

        BasedeCalculoLabel.setText("Base de cálculo:");

        BasedeCalculoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BasedeCalculoFieldActionPerformed(evt);
            }
        });

        IssRetidoLabel.setText("Iss Retido:");

        ValordosServicosLabel.setText(" Valor dos serviços:");

        ValorLiquidoLabel.setText("Valor Líquido:");

        CodTributacaoMunLabel.setText(" Código de Tributação Municipal:");

        DescontoLabel.setText("Desconto:");

        DiscServicosLabel.setText("Discriminação dos Serviços:");

        DiscServicosText.setColumns(20);
        DiscServicosText.setRows(5);
        DiscServicosScroll.setViewportView(DiscServicosText);

        CpfCnpjLabel.setText("Cpf/Cnpj:");

        RazaoRedLabel.setText("Razão Reduzida:");

        RazaoRedField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaoRedFieldActionPerformed(evt);
            }
        });

        BairroLabel.setText("Bairro:");

        UFLabel.setText("UF:");

        PagamentoLabel.setText("Pagamento:");

        VencimentoLabel.setText("Vencimento:");

        JurosLabel.setText("Juros:");

        ValorPagoLabel.setText("Valor Pago:");

        ImportadaEmLabel.setText("Importada em :");

        ImpostoRetLabel.setText("Imposto Retido:");

        JurosMultaAbonadaLabel.setText(" Juros/Multa Abonada:");

        MesAnoLabel.setText("Mês/Ano:");

        SaveButton.setText("Alterar");
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
                        .addGap(201, 201, 201)
                        .addComponent(DiscServicosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NumeroLabel)
                                    .addComponent(CodVerificacaoLabel)
                                    .addComponent(CompetenciaLabel)
                                    .addComponent(DiscServicosLabel)
                                    .addComponent(CpfCnpjLabel)
                                    .addComponent(BairroLabel)
                                    .addComponent(PagamentoLabel)
                                    .addComponent(JurosLabel)
                                    .addComponent(ImportadaEmLabel)
                                    .addComponent(JurosMultaAbonadaLabel))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JurosMultaAbonadaField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CpfCnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BairroField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PagamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JurosField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ImportadaEmField, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(SaveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(MesAnoLabel)
                                    .addComponent(RazaoRedLabel)
                                    .addComponent(UFLabel)
                                    .addComponent(VencimentoLabel)
                                    .addComponent(ImpostoRetLabel)
                                    .addComponent(ValorPagoLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ValorPagoField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(ImpostoRetField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(MesAnoField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(VencimentoField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(UFField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                    .addComponent(RazaoRedField)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CodTributacaoMunLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(CodVerificacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DataEmissaoLabel)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ValordosServicosLabel)
                                    .addComponent(BasedeCalculoLabel))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ValordosServicosField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BasedeCalculoField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CodTributacaoMunField, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(401, 401, 401)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IssRetidoLabel)
                                            .addComponent(ValorLiquidoLabel)
                                            .addComponent(DescontoLabel))))
                                .addGap(32, 32, 32)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(DataEmissaoField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(IssRetidoField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(ValorLiquidoLabelField, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                            .addComponent(DescontoField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumeroField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CompetenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(197, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroLabel)
                    .addComponent(NumeroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(DataEmissaoLabel)
                        .addComponent(DataEmissaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CodVerificacaoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CodVerificacaoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CompetenciaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CompetenciaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BasedeCalculoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(IssRetidoLabel)
                                    .addComponent(IssRetidoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(3, 3, 3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ValorLiquidoLabel)
                            .addComponent(ValorLiquidoLabelField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ValordosServicosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(BasedeCalculoLabel)
                        .addGap(18, 18, 18)
                        .addComponent(ValordosServicosLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DescontoLabel)
                            .addComponent(DescontoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CodTributacaoMunLabel)
                            .addComponent(CodTributacaoMunField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(DiscServicosLabel))
                    .addComponent(DiscServicosScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CpfCnpjLabel)
                            .addComponent(CpfCnpjField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BairroLabel)
                            .addComponent(BairroField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(PagamentoLabel)
                            .addComponent(PagamentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JurosField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JurosLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ImportadaEmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ImportadaEmLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JurosMultaAbonadaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JurosMultaAbonadaLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RazaoRedLabel)
                            .addComponent(RazaoRedField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UFLabel)
                            .addComponent(UFField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VencimentoLabel)
                            .addComponent(VencimentoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ValorPagoLabel)
                            .addComponent(ValorPagoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ImpostoRetLabel)
                            .addComponent(ImpostoRetField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MesAnoLabel)
                            .addComponent(MesAnoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SaveButton)
                    .addComponent(CancelButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NumeroFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeroFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeroFieldActionPerformed

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveButtonActionPerformed

    private void BasedeCalculoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BasedeCalculoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BasedeCalculoFieldActionPerformed

    private void RazaoRedFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RazaoRedFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RazaoRedFieldActionPerformed

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButtonActionPerformed
        CancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }//GEN-LAST:event_CancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAlterarNFEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarNFEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarNFEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarNFEs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarNFEs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField BairroField;
    private javax.swing.JLabel BairroLabel;
    private javax.swing.JTextField BasedeCalculoField;
    private javax.swing.JLabel BasedeCalculoLabel;
    private javax.swing.JButton CancelButton;
    private javax.swing.JTextField CodTributacaoMunField;
    private javax.swing.JLabel CodTributacaoMunLabel;
    private javax.swing.JTextField CodVerificacaoField;
    private javax.swing.JLabel CodVerificacaoLabel;
    private javax.swing.JTextField CompetenciaField;
    private javax.swing.JLabel CompetenciaLabel;
    private javax.swing.JTextField CpfCnpjField;
    private javax.swing.JLabel CpfCnpjLabel;
    private javax.swing.JTextField DataEmissaoField;
    private javax.swing.JLabel DataEmissaoLabel;
    private javax.swing.JTextField DescontoField;
    private javax.swing.JLabel DescontoLabel;
    private javax.swing.JLabel DiscServicosLabel;
    private javax.swing.JScrollPane DiscServicosScroll;
    private javax.swing.JTextArea DiscServicosText;
    private javax.swing.JTextField ImportadaEmField;
    private javax.swing.JLabel ImportadaEmLabel;
    private javax.swing.JTextField ImpostoRetField;
    private javax.swing.JLabel ImpostoRetLabel;
    private javax.swing.JTextField IssRetidoField;
    private javax.swing.JLabel IssRetidoLabel;
    private javax.swing.JTextField JurosField;
    private javax.swing.JLabel JurosLabel;
    private javax.swing.JTextField JurosMultaAbonadaField;
    private javax.swing.JLabel JurosMultaAbonadaLabel;
    private javax.swing.JTextField MesAnoField;
    private javax.swing.JLabel MesAnoLabel;
    private javax.swing.JTextField NumeroField;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JTextField PagamentoField;
    private javax.swing.JLabel PagamentoLabel;
    private javax.swing.JTextField RazaoRedField;
    private javax.swing.JLabel RazaoRedLabel;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UFField;
    private javax.swing.JLabel UFLabel;
    private javax.swing.JLabel ValorLiquidoLabel;
    private javax.swing.JTextField ValorLiquidoLabelField;
    private javax.swing.JTextField ValorPagoField;
    private javax.swing.JLabel ValorPagoLabel;
    private javax.swing.JTextField ValordosServicosField;
    private javax.swing.JLabel ValordosServicosLabel;
    private javax.swing.JTextField VencimentoField;
    private javax.swing.JLabel VencimentoLabel;
    // End of variables declaration//GEN-END:variables
}
