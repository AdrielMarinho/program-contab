package Funcionalidades;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaAddCliente extends javax.swing.JFrame {

    public TelaAddCliente() {
        initComponents();
    }

    Cliente cliente = new Cliente();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Title = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        RazaoSocialText = new javax.swing.JTextField();
        CpfCnpjLabel = new javax.swing.JLabel();
        CpfCnpjText = new javax.swing.JTextField();
        InscricaoMunicipalLabel = new javax.swing.JLabel();
        InscricaoMunicipalText = new javax.swing.JTextField();
        EnderecoLabel = new javax.swing.JLabel();
        EnderecoText = new javax.swing.JTextField();
        NumeroLabel = new javax.swing.JLabel();
        NumEnderecoText = new javax.swing.JTextField();
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

        RazaoSocialText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RazaoSocialTextActionPerformed(evt);
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
                            .addComponent(RazaoSocialText, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CpfCnpjText, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(InscricaoMunicipalText, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RazaoRedText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DataCadastroText, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IndicacaoText, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NumEnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(RazaoSocialText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(NumEnderecoText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    }// </editor-fold>                        

    private void RazaoSocialTextActionPerformed(java.awt.event.ActionEvent evt) {                                                
        
    }                                               

    private void CpfCnpjTextActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void CancelButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        CancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }                                            

    private void SaveButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (validaCamposObrigatorios()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos para salvar!");
        } else {
            try {
                cliente.setCpfCnpj(Integer.parseInt(CpfCnpjText.getText()));
                cliente.setInscricaoMunicipal(Integer.parseInt(InscricaoMunicipalText.getText()));
                cliente.setRazaoSocial(RazaoSocialText.getText());
                cliente.setEndereco(EnderecoText.getText());
                cliente.setNumeroEndereco(Integer.parseInt(NumEnderecoText.getText()));
                cliente.setComplemento(ComplementoText.getText());
                cliente.setBairro(BairroText.getText());
                cliente.setUfEndereco(UfText.getText());
                cliente.setCep(Integer.parseInt(CepText.getText()));
                cliente.setTelefone(Integer.parseInt(TelefoneText.getText()));
                cliente.setEmail(EmailText.getText());
                cliente.setRazaoReduzida(RazaoRedText.getText());
                cliente.setDataCadastro(DataCadastroText.getText());
                cliente.setIndicacao(IndicacaoText.getText());
                cliente.setComissao(Float.parseFloat(ComissaoText.getText()));
          } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados!");
            }
        }
        salvarDados();
        // Cliente c1 = new Cliente(cpfCnpj, inscMunicipal, nome, endereco, numero, complemento, bairro, uf, cep, tel, email, razaoRed, data, indicacao, comissao);
    }                                          

    private void salvarDados() {

    }

    private boolean validaCamposObrigatorios() {
        return (CpfCnpjText.getText().equals("")
                || InscricaoMunicipalText.getText().equals("")
                || RazaoSocialText.getText().equals("")
                || EnderecoText.getText().equals("")
                || NumEnderecoText.getText().equals("")
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
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
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
    private javax.swing.JTextField NumEnderecoText;
    private javax.swing.JLabel NumeroLabel;
    private javax.swing.JLabel RazaoRedLabel;
    private javax.swing.JTextField RazaoRedText;
    private javax.swing.JTextField RazaoSocialText;
    private javax.swing.JButton SaveButton;
    private javax.swing.JLabel TelefoneLabel;
    private javax.swing.JTextField TelefoneText;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel UfLabel;
    private javax.swing.JTextField UfText;
    // End of variables declaration                   
}
