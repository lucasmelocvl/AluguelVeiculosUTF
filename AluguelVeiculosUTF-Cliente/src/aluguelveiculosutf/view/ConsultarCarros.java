/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aluguelveiculosutf.view;


import aluguelveiculosutf.impl.CliImpl;
import aluguelveiculosutf.servidor.Veiculo;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class ConsultarCarros extends javax.swing.JFrame {

    CliImpl cliImpl;
    
    /**
     * Creates new form OpcoesTransferencia
     * @param cli
     */
    public ConsultarCarros(CliImpl cli) throws IOException, ClassNotFoundException
    {
        initComponents();
        cliImpl = cli;
        ArrayList<Veiculo> listaVeiculo;
        listaVeiculo = cliImpl.consultarVeiculo();
        System.out.println(listaVeiculo.toString());
        
        String disponibilidade;
        
        for (Veiculo veiculo: listaVeiculo) {
            System.out.println(veiculo.isOcupado());
            modeloVeiculo.addItem(veiculo.getModelo() + "-R$" + veiculo.getValorLocacao());
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

        jInternalFrame1 = new javax.swing.JInternalFrame();
        registrarInteresse = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        alugarVeiculo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        precoDesejado = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        modeloVeiculo = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jInternalFrame1.setVisible(true);

        registrarInteresse.setText("Registrar Interesse");
        registrarInteresse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarInteresseActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Consulta de veículos para locação");

        jLabel2.setText("Abaixo, serão listados todos os carros de nossa empresa.");

        jLabel5.setText("Caso deseje egistrar interesse em algum veículo, informe abaixo");

        jLabel7.setText("o preço desejado e após utilize a opção de Registrar Interesse.");

        alugarVeiculo.setText("Alugar Veículo");
        alugarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alugarVeiculoActionPerformed(evt);
            }
        });

        jLabel1.setText("Caso deseje alugar o carro, clique em Alugar Veículo. Boa procura.");

        jLabel3.setText("Preço desejado:");

        precoDesejado.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        jLabel9.setText("Veículos para locação:");

        modeloVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modeloVeiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                                .addComponent(registrarInteresse)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                                .addComponent(alugarVeiculo))
                            .addComponent(modeloVeiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(precoDesejado)))
                    .addGroup(jInternalFrame1Layout.createSequentialGroup()
                        .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel2))
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(modeloVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(precoDesejado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voltar)
                    .addComponent(registrarInteresse)
                    .addComponent(alugarVeiculo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_voltarActionPerformed
    {//GEN-HEADEREND:event_voltarActionPerformed
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void registrarInteresseActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_registrarInteresseActionPerformed
    {//GEN-HEADEREND:event_registrarInteresseActionPerformed
        String msg;
        String modeloVeic = modeloVeiculo.getSelectedItem().toString();
        String preco = precoDesejado.getText();
        try{
            float valor =  Float.parseFloat(preco);
            boolean ret = cliImpl.regInteresseVeic(modeloVeic, valor);
            if(ret) msg = "Interesse em veículo registrado com sucesso!";
            else msg = "Lamentamos, não foi possível registrar seus interesse pelo veículo.";
            JOptionPane.showMessageDialog(null, msg);
            this.setVisible(false);
            this.dispose();
        }catch(Exception e){
            msg = "Por favor, informe dados válidos.";
            JOptionPane.showMessageDialog(null, msg);
        }
    }//GEN-LAST:event_registrarInteresseActionPerformed

    private void alugarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alugarVeiculoActionPerformed
        String modeloVeic = modeloVeiculo.getSelectedItem().toString();
        String carro[] = modeloVeic.split("-");
        String carroALocar = carro[0];
        boolean ret = cliImpl.solicitacaoFormLocacao(carroALocar);
        if(!ret){
            String msg = "Lamentamos, não foi possível acessar o formulário de aluguel deste veículo.\n";
            msg = msg + "Este carro não está disponível no momento.";
            JOptionPane.showMessageDialog(null, msg);
        }else{
            this.setVisible(false);
            this.dispose();
            new AlugarCarro(cliImpl, carroALocar).setVisible(true);
        }
    }//GEN-LAST:event_alugarVeiculoActionPerformed

    private void modeloVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modeloVeiculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modeloVeiculoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alugarVeiculo;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox modeloVeiculo;
    private javax.swing.JFormattedTextField precoDesejado;
    private javax.swing.JButton registrarInteresse;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
