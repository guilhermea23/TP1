/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Classes.Editora;
import Classes.Livro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bodao
 */
public class CadastroEditora extends javax.swing.JFrame {

    static ArrayList<Editora> listaEditora;
    
    String botao;
    int indexPesquisa = -1;
    
    public CadastroEditora() {
        initComponents();
        
        listaEditora = new ArrayList();
        
         //habilitar e desabilitar botões
        btnEditoraNovo.setEnabled(true);
        btnEditoraSalvar.setEnabled(false);
        btnEditoraCancelar.setEnabled(false);
        btnEditoraEditar.setEnabled(false);
        btnEditoraExcluir.setEnabled(false);
        btnEditoraPesquisar.setEnabled(true);
        btnPesquisarEditora.setEnabled(false);
        // habilitar e desabilitar campos txt        
        txtNomeEditora.setEnabled(false);
        txtPaisOrigem.setEnabled(false) ;
        txtTelefone.setEnabled(false);
       
        
    }
    // carregar tabela Editora
    public void carregarTabelaEditoras(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","País de Origem","Telefone"},0);
        for (int i = 0; i < listaEditora.size(); i++){
            Object linha[] = new Object[]{listaEditora.get(i).getNomeEditora(),
                                          listaEditora.get(i).getPaisEditora(),
                                          listaEditora.get(i).getTelefoneEditora()};
            modelo.addRow(linha);            
        }
        //tabela de editoras recebendo da modelo
        tblEditoras.setModel(modelo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        pnCadastroEditora = new javax.swing.JPanel();
        lblNomeEditora = new javax.swing.JLabel();
        txtNomeEditora = new javax.swing.JTextField();
        lblPaisOrigem = new javax.swing.JLabel();
        txtPaisOrigem = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        btnPesquisarEditora = new javax.swing.JButton();
        txtTelefone = new javax.swing.JFormattedTextField();
        btnEditoraNovo = new javax.swing.JButton();
        btnEditoraSalvar = new javax.swing.JButton();
        btnEditoraCancelar = new javax.swing.JButton();
        btnEditoraEditar = new javax.swing.JButton();
        btnEditoraExcluir = new javax.swing.JButton();
        btnEditoraPesquisar = new javax.swing.JButton();
        scpEditora = new javax.swing.JScrollPane();
        tblEditoras = new javax.swing.JTable();
        btnSairCadastroEditora = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Editora");

        pnCadastroEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Editora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblNomeEditora.setText("Nome Editora:");

        txtNomeEditora.setToolTipText("Digite nome editora");

        lblPaisOrigem.setText("País de Origem:");

        txtPaisOrigem.setToolTipText("Digite país de origem da editora");
        txtPaisOrigem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisOrigemActionPerformed(evt);
            }
        });

        lblTelefone.setText("Telefone:");

        btnPesquisarEditora.setText("ok");
        btnPesquisarEditora.setToolTipText("Confirmar pesquisa");
        btnPesquisarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarEditoraActionPerformed(evt);
            }
        });

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout pnCadastroEditoraLayout = new javax.swing.GroupLayout(pnCadastroEditora);
        pnCadastroEditora.setLayout(pnCadastroEditoraLayout);
        pnCadastroEditoraLayout.setHorizontalGroup(
            pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroEditoraLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPaisOrigem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(txtPaisOrigem)
                    .addComponent(txtTelefone))
                .addGap(38, 38, 38)
                .addComponent(btnPesquisarEditora)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnCadastroEditoraLayout.setVerticalGroup(
            pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnCadastroEditoraLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeEditora)
                    .addComponent(txtNomeEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarEditora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaisOrigem)
                    .addComponent(txtPaisOrigem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnCadastroEditoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        btnEditoraNovo.setText("Novo");
        btnEditoraNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraNovoActionPerformed(evt);
            }
        });

        btnEditoraSalvar.setText("Salvar");
        btnEditoraSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraSalvarActionPerformed(evt);
            }
        });

        btnEditoraCancelar.setText("Cancelar");
        btnEditoraCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraCancelarActionPerformed(evt);
            }
        });

        btnEditoraEditar.setText("Editar");
        btnEditoraEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraEditarActionPerformed(evt);
            }
        });

        btnEditoraExcluir.setText("Excluir");
        btnEditoraExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraExcluirActionPerformed(evt);
            }
        });

        btnEditoraPesquisar.setText("Pesquisar");
        btnEditoraPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditoraPesquisarActionPerformed(evt);
            }
        });

        tblEditoras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome Editora", "País de Origem", "Telefone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEditoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEditorasMouseClicked(evt);
            }
        });
        scpEditora.setViewportView(tblEditoras);

        btnSairCadastroEditora.setText("Sair");
        btnSairCadastroEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroEditoraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(btnSairCadastroEditora))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(scpEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 521, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(btnEditoraNovo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditoraSalvar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditoraCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditoraEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEditoraExcluir)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEditoraPesquisar))
                            .addComponent(pnCadastroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(pnCadastroEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditoraNovo)
                    .addComponent(btnEditoraSalvar)
                    .addComponent(btnEditoraCancelar)
                    .addComponent(btnEditoraEditar)
                    .addComponent(btnEditoraExcluir)
                    .addComponent(btnEditoraPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scpEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(btnSairCadastroEditora)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //botão sair
    private void btnSairCadastroEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroEditoraActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairCadastroEditoraActionPerformed
    //botão de novo cadastro
    private void btnEditoraNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraNovoActionPerformed
        //indicar o botao que é novo cadastro
        botao = "novo";
        //habilitar e desabilitar botões
        btnEditoraNovo.setEnabled(false);
        btnEditoraSalvar.setEnabled(true);
        btnEditoraCancelar.setEnabled(true);
        btnEditoraEditar.setEnabled(false);
        btnEditoraExcluir.setEnabled(false);
        btnEditoraPesquisar.setEnabled(false);
        btnPesquisarEditora.setEnabled(false);
        // habilitar e desabilitar campos txt        
        txtNomeEditora.setEnabled(true);
        txtPaisOrigem.setEnabled(true) ;
        txtTelefone.setEnabled(true);
        
        txtNomeEditora.requestFocus();
    }//GEN-LAST:event_btnEditoraNovoActionPerformed
    //botão de cancelar
    private void btnEditoraCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraCancelarActionPerformed
        // Limpar campos
        txtNomeEditora.setText("");
        txtPaisOrigem.setText("");
        txtTelefone.setText("");
        //habilitar e desabilitar botões
        btnEditoraNovo.setEnabled(true);
        btnEditoraSalvar.setEnabled(false);
        btnEditoraCancelar.setEnabled(false);
        btnEditoraEditar.setEnabled(false);
        btnEditoraExcluir.setEnabled(false);
        btnEditoraPesquisar.setEnabled(true);
        btnPesquisarEditora.setEnabled(false); 
        // habilitar e desabilitar campos txt        
        txtNomeEditora.setEnabled(false);
        txtPaisOrigem.setEnabled(false) ;
        txtTelefone.setEnabled(false);
    }//GEN-LAST:event_btnEditoraCancelarActionPerformed
    //botão de salvar
    private void btnEditoraSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraSalvarActionPerformed
        if(txtNomeEditora.getText().equals("") || txtPaisOrigem.getText().equals("") || txtTelefone.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            String nomeEditora = txtNomeEditora.getText();
            String paisEditora = txtPaisOrigem.getText();
            String telefoneEditora = txtTelefone.getText();            
            if(botao.equals("novo")){
                Editora editora = new Editora(nomeEditora, paisEditora, telefoneEditora);            
                listaEditora.add(editora);
                JOptionPane.showMessageDialog(null, "Editora cadastrado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }else if (botao.equals("editar")){
                 //pegando o indexador da tabela
                int index = tblEditoras.getSelectedRow();
                if(indexPesquisa > -1){//caso seja através de pesquisa o indexador vem do botão ok
                    index = indexPesquisa;
                    indexPesquisa = -1; //voltando o indexador para -1 para não vinmcular a variável que é global
                }                   
                listaEditora.get(index).setNomeEditora(nomeEditora);
                listaEditora.get(index).setPaisEditora(paisEditora);
                listaEditora.get(index).setTelefoneEditora(telefoneEditora);
                JOptionPane.showMessageDialog(null, "Alteações realizadas com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            carregarTabelaEditoras();
                       
            // Limpar camposfla
            txtNomeEditora.setText("");
            txtPaisOrigem.setText("");
            txtTelefone.setText("");
            
            //habilitar e desabilitar botões
            btnEditoraNovo.setEnabled(true);
            btnEditoraSalvar.setEnabled(false);
            btnEditoraCancelar.setEnabled(false);
            btnEditoraEditar.setEnabled(false);
            btnEditoraExcluir.setEnabled(false);
            btnEditoraPesquisar.setEnabled(true);
            btnPesquisarEditora.setEnabled(false);
            // habilitar e desabilitar campos txt        
            txtNomeEditora.setEnabled(false);
            txtPaisOrigem.setEnabled(false) ;
            txtTelefone.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnEditoraSalvarActionPerformed
    //clicando na tabela para editar
    private void tblEditorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEditorasMouseClicked
        int i = tblEditoras.getSelectedRow();
        if(i >= 0 && i < listaEditora.size()){
            
            Editora edt = listaEditora.get(i);
            // habilitar campos
            txtNomeEditora.setText(edt.getNomeEditora());
            txtPaisOrigem.setText(edt.getPaisEditora());
            txtTelefone.setText(edt.getTelefoneEditora()); 
            //habilitar botões
            btnEditoraSalvar.setEnabled(true);
            btnEditoraCancelar.setEnabled(true);
            btnEditoraEditar.setEnabled(true);
            btnPesquisarEditora.setEnabled(false);
        }
    }//GEN-LAST:event_tblEditorasMouseClicked
    //botão de editar
    private void btnEditoraEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraEditarActionPerformed
        //indicar o botao que é editar cadastro
        botao = "editar";
        //habilitar e desabilitar botões
        btnEditoraNovo.setEnabled(false);
        btnEditoraSalvar.setEnabled(true);
        btnEditoraCancelar.setEnabled(true);
        btnEditoraEditar.setEnabled(false);
        btnEditoraExcluir.setEnabled(false);
        btnEditoraPesquisar.setEnabled(false);
        btnPesquisarEditora.setEnabled(false);   
        // habilitar e desabilitar campos txt 
        txtNomeEditora.setEnabled(true);
        txtPaisOrigem.setEnabled(true) ;
        txtTelefone.setEnabled(true);
               
        
        txtNomeEditora.requestFocus();
    }//GEN-LAST:event_btnEditoraEditarActionPerformed
    //botão de excluir
    private void btnEditoraExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraExcluirActionPerformed
        int index = tblEditoras.getSelectedRow();
       if(index >= 0 && index < listaEditora.size()){
            listaEditora.remove(index);
       }
       carregarTabelaEditoras();
       // Limpar campos
        txtNomeEditora.setText("");
        txtPaisOrigem.setText("");
        txtTelefone.setText("");
        //habilitar e desabilitar botões
        btnEditoraNovo.setEnabled(true);
        btnEditoraSalvar.setEnabled(false);
        btnEditoraCancelar.setEnabled(false);
        btnEditoraEditar.setEnabled(false);
        btnEditoraExcluir.setEnabled(false);
        btnEditoraPesquisar.setEnabled(true);
        btnPesquisarEditora.setEnabled(false); 
        // habilitar e desabilitar campos txt        
        txtNomeEditora.setEnabled(false);
        txtPaisOrigem.setEnabled(false) ;
        txtTelefone.setEnabled(false);
    }//GEN-LAST:event_btnEditoraExcluirActionPerformed
            
   //botão pesquisar que ativa o botão ok e inicia a pesquisa 
    private void btnEditoraPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditoraPesquisarActionPerformed
        if(listaEditora.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não contém editoras cadastradas!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else{
             // Limpar campos
            txtNomeEditora.setText("");
            txtPaisOrigem.setText("");
            txtTelefone.setText("");

            //habilitar e desabilitar botões
            btnEditoraNovo.setEnabled(false);
            btnEditoraSalvar.setEnabled(false);
            btnEditoraCancelar.setEnabled(true);
            btnEditoraEditar.setEnabled(false);
            btnEditoraExcluir.setEnabled(false);
            btnEditoraPesquisar.setEnabled(false);
            btnPesquisarEditora.setEnabled(true);
            // habilitar e desabilitar campos txt        
            txtNomeEditora.setEnabled(true);
            txtPaisOrigem.setEnabled(false) ;
            txtTelefone.setEnabled(false);
            
            txtNomeEditora.requestFocus();
        }
    }//GEN-LAST:event_btnEditoraPesquisarActionPerformed

    //botão ok de pesquisar editora
    private void btnPesquisarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarEditoraActionPerformed

        if(txtNomeEditora.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O nome da editora deve ser informado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            Editora edt;
            String pesquisaEditora = txtNomeEditora.getText(); //pegando o desejo da pesquisa e fazendo loop na lista
            for(int i = 0; i < listaEditora.size(); i++){
                edt = listaEditora.get(i);
                if(pesquisaEditora.equals(edt.getNomeEditora()) ){
                    //pegando o indexador da pesquisa
                    indexPesquisa = i;
                    // inserindo nos campos
                    txtNomeEditora.setText(edt.getNomeEditora());
                    txtPaisOrigem.setText(edt.getPaisEditora());
                    txtTelefone.setText(edt.getTelefoneEditora());
                    //habilitar botões
                    btnEditoraSalvar.setEnabled(false);
                    btnEditoraCancelar.setEnabled(true);
                    btnEditoraEditar.setEnabled(true);
                    btnEditoraExcluir.setEnabled(true);
                    btnEditoraPesquisar.setEnabled(true);
                    btnPesquisarEditora.setEnabled(false);

                    txtNomeEditora.selectAll();
                    txtNomeEditora.requestFocus();

                    i = listaEditora.size();
                }

            }
            if(txtPaisOrigem.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Editora não encontrada!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                // Limpar campos
                txtNomeEditora.setText("");
                txtPaisOrigem.setText("");
                txtTelefone.setText("");

                txtNomeEditora.selectAll();
                txtNomeEditora.requestFocus();
            }
        }
    }//GEN-LAST:event_btnPesquisarEditoraActionPerformed

    private void txtPaisOrigemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisOrigemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisOrigemActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroEditora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroEditora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditoraCancelar;
    private javax.swing.JButton btnEditoraEditar;
    private javax.swing.JButton btnEditoraExcluir;
    private javax.swing.JButton btnEditoraNovo;
    private javax.swing.JButton btnEditoraPesquisar;
    private javax.swing.JButton btnEditoraSalvar;
    private javax.swing.JButton btnPesquisarEditora;
    private javax.swing.JButton btnSairCadastroEditora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNomeEditora;
    private javax.swing.JLabel lblPaisOrigem;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel pnCadastroEditora;
    private javax.swing.JScrollPane scpEditora;
    private javax.swing.JTable tblEditoras;
    private javax.swing.JTextField txtNomeEditora;
    private javax.swing.JTextField txtPaisOrigem;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
