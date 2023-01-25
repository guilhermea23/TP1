/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Classes.Autor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bodao
 */
public class CadastroAutor extends javax.swing.JFrame {

    static ArrayList<Autor> listaAutor;
    
    String botao;
    int indexPesquisa = -1;
    
    public CadastroAutor() {
        initComponents();
        
        listaAutor = new ArrayList();
        
        //habilitar e desabilitar botões
        btnAutorNovo.setEnabled(true);
        btnAutorSalvar.setEnabled(false);
        btnAutorCancelar.setEnabled(false);
        btnAutorEditar.setEnabled(false);
        btnAutorExcluir.setEnabled(false);
        btnAutorPesquisar.setEnabled(true);
        btnPesquisarAutor.setEnabled(false);
        
        // habilitar e desabilitar campos txt        
        txtNomeAutor.setEnabled(false);
        txtPaisAutor.setEnabled(false);        
        
   }
    
   // carregar tabela Autor
    public void carregarTabelaAutor(){
        DefaultTableModel modelo = new DefaultTableModel(new Object[]{"Nome","País de Origem"},0);
        for (int i = 0; i < listaAutor.size(); i++){
            Object linha[] = new Object[]{listaAutor.get(i).getNomeAutor(),
                                          listaAutor.get(i).getPaisAutor()};
            modelo.addRow(linha);            
        }
        //tabela de autores recebendo da modelo
        tblAutores.setModel(modelo);
    } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeAutor = new javax.swing.JPanel();
        lblAutor = new javax.swing.JLabel();
        txtNomeAutor = new javax.swing.JTextField();
        lblPaisAutor = new javax.swing.JLabel();
        txtPaisAutor = new javax.swing.JTextField();
        btnPesquisarAutor = new javax.swing.JButton();
        btnAutorNovo = new javax.swing.JButton();
        btnAutorSalvar = new javax.swing.JButton();
        btnAutorCancelar = new javax.swing.JButton();
        btnAutorEditar = new javax.swing.JButton();
        btnAutorExcluir = new javax.swing.JButton();
        btnAutorPesquisar = new javax.swing.JButton();
        scpAutor = new javax.swing.JScrollPane();
        tblAutores = new javax.swing.JTable();
        btnSairCadastroAutor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Autor");

        lblNomeAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        lblAutor.setText("Nome:");

        txtNomeAutor.setToolTipText("Digite o nome do autor");
        txtNomeAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeAutorActionPerformed(evt);
            }
        });

        lblPaisAutor.setText("País Autor:");

        txtPaisAutor.setToolTipText("Digite o país do Autor");

        btnPesquisarAutor.setText("ok");
        btnPesquisarAutor.setToolTipText("Confirmar pesquisa");
        btnPesquisarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lblNomeAutorLayout = new javax.swing.GroupLayout(lblNomeAutor);
        lblNomeAutor.setLayout(lblNomeAutorLayout);
        lblNomeAutorLayout.setHorizontalGroup(
            lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNomeAutorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPaisAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNomeAutor, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                    .addComponent(txtPaisAutor))
                .addGap(18, 18, 18)
                .addComponent(btnPesquisarAutor)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        lblNomeAutorLayout.setVerticalGroup(
            lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lblNomeAutorLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAutor)
                    .addComponent(txtNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarAutor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(lblNomeAutorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPaisAutor)
                    .addComponent(txtPaisAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        btnAutorNovo.setText("Novo");
        btnAutorNovo.setToolTipText("");
        btnAutorNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorNovoActionPerformed(evt);
            }
        });

        btnAutorSalvar.setText("Salvar");
        btnAutorSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorSalvarActionPerformed(evt);
            }
        });

        btnAutorCancelar.setText("Cancelar");
        btnAutorCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorCancelarActionPerformed(evt);
            }
        });

        btnAutorEditar.setText("Editar");
        btnAutorEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorEditarActionPerformed(evt);
            }
        });

        btnAutorExcluir.setText("Excluir");
        btnAutorExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorExcluirActionPerformed(evt);
            }
        });

        btnAutorPesquisar.setText("Pesquisar");
        btnAutorPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAutorPesquisarActionPerformed(evt);
            }
        });

        tblAutores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome Autor", "País Autor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAutores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAutoresMouseClicked(evt);
            }
        });
        scpAutor.setViewportView(tblAutores);

        btnSairCadastroAutor.setText("Sair");
        btnSairCadastroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroAutorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnSairCadastroAutor))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(scpAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAutorNovo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAutorSalvar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAutorCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAutorEditar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAutorExcluir)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAutorPesquisar)))))))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblNomeAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAutorNovo)
                    .addComponent(btnAutorSalvar)
                    .addComponent(btnAutorCancelar)
                    .addComponent(btnAutorEditar)
                    .addComponent(btnAutorExcluir)
                    .addComponent(btnAutorPesquisar))
                .addGap(18, 18, 18)
                .addComponent(scpAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btnSairCadastroAutor)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNomeAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeAutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeAutorActionPerformed

    private void btnAutorNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorNovoActionPerformed
        //indicar o botao que é novo cadastro
        botao = "novo";
        // habilitar botoes
        btnAutorNovo.setEnabled(false);
        btnAutorSalvar.setEnabled(true);
        btnAutorCancelar.setEnabled(true);
        btnAutorEditar.setEnabled(false);
        btnAutorExcluir.setEnabled(false);
        btnAutorPesquisar.setEnabled(false);
        btnPesquisarAutor.setEnabled(false);
        //habilitar campos de texto
        txtNomeAutor.setEnabled(true);
        txtPaisAutor.setEnabled(true) ;
        
        txtNomeAutor.requestFocus();
    }//GEN-LAST:event_btnAutorNovoActionPerformed

    private void btnSairCadastroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroAutorActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairCadastroAutorActionPerformed

    private void btnAutorCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorCancelarActionPerformed
        // Limpar campos
        txtNomeAutor.setText("");
        txtPaisAutor.setText("");
        // habilitar botoes
        btnAutorNovo.setEnabled(true);
        btnAutorSalvar.setEnabled(false);
        btnAutorCancelar.setEnabled(false);
        btnAutorEditar.setEnabled(false);
        btnAutorExcluir.setEnabled(false);
        btnAutorPesquisar.setEnabled(true);
        btnPesquisarAutor.setEnabled(false);
        //habilitar campos de texto
        txtNomeAutor.setEnabled(false);
        txtPaisAutor.setEnabled(false) ;
    }//GEN-LAST:event_btnAutorCancelarActionPerformed

    private void btnAutorSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorSalvarActionPerformed
        if(txtNomeAutor.getText().equals("") || txtPaisAutor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            String nome = txtNomeAutor.getText();
            String pais = txtPaisAutor.getText();
            
            if(botao.equals("novo")){
                Autor autor = new Autor(nome, pais);             
                listaAutor.add(autor);
                JOptionPane.showMessageDialog(null, "Autor cadastrado com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }else if (botao.equals("editar")){
                 //pegando o indexador da tabela
                 int index = tblAutores.getSelectedRow();
                if(indexPesquisa > -1){//caso seja através de pesquisa o indexador vem do botão ok
                    index = indexPesquisa;
                    indexPesquisa = -1; //voltando o indexador para -1 para não vinmcular a variável que é global
                }               
                listaAutor.get(index).setNomeAutor(nome);
                listaAutor.get(index).setPaisAutor(pais);
                JOptionPane.showMessageDialog(null, "Alteações realizadas com sucesso", "Mensagem", JOptionPane.INFORMATION_MESSAGE);
            }
            carregarTabelaAutor();           
            
            // Limpar campos
            txtNomeAutor.setText("");
            txtPaisAutor.setText("");
            // habilitar botoes
            btnAutorNovo.setEnabled(true);
            btnAutorSalvar.setEnabled(false);
            btnAutorCancelar.setEnabled(false);
            btnAutorEditar.setEnabled(false);
            btnAutorExcluir.setEnabled(false);
            btnAutorPesquisar.setEnabled(true);
            btnPesquisarAutor.setEnabled(false);
            //habilitar campos de texto
            txtNomeAutor.setEnabled(false);
            txtPaisAutor.setEnabled(false) ;
            }
    }//GEN-LAST:event_btnAutorSalvarActionPerformed

    private void tblAutoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAutoresMouseClicked
        int i = tblAutores.getSelectedRow();
        if(i >= 0 && i < listaAutor.size()){
            Autor aut = listaAutor.get(i);
            // inserir campos
            txtNomeAutor.setText(aut.getNomeAutor());
            txtPaisAutor.setText(aut.getPaisAutor());
            //habilitar botões
            btnAutorSalvar.setEnabled(true);
            btnAutorCancelar.setEnabled(true);
            btnAutorEditar.setEnabled(true);           
        }  
    }//GEN-LAST:event_tblAutoresMouseClicked

    private void btnAutorEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorEditarActionPerformed
        //indicar o botao que é editar cadastro
        botao = "editar";
        //habilitar e desabilitar botões
        btnAutorNovo.setEnabled(false);
        btnAutorSalvar.setEnabled(true);
        btnAutorCancelar.setEnabled(true);
        btnAutorEditar.setEnabled(false);
        btnAutorExcluir.setEnabled(false);
        btnAutorPesquisar.setEnabled(false);
        btnPesquisarAutor.setEnabled(false);
         //habilitar campos de texto
        txtNomeAutor.setEnabled(true);
        txtPaisAutor.setEnabled(true) ;
        
        txtNomeAutor.requestFocus();
        
    }//GEN-LAST:event_btnAutorEditarActionPerformed

    private void btnAutorExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorExcluirActionPerformed
        int index = tblAutores.getSelectedRow();
        if(index >= 0 && index < listaAutor.size()){
            listaAutor.remove(index);
       }
        carregarTabelaAutor();
        // Limpar campos
        txtNomeAutor.setText("");
        txtPaisAutor.setText("");
        // habilitar botoes
        btnAutorNovo.setEnabled(true);
        btnAutorSalvar.setEnabled(false);
        btnAutorCancelar.setEnabled(false);
        btnAutorEditar.setEnabled(false);
        btnAutorExcluir.setEnabled(false);
        btnAutorPesquisar.setEnabled(true);
        btnPesquisarAutor.setEnabled(false);
        //habilitar campos de texto
        txtNomeAutor.setEnabled(false);
        txtPaisAutor.setEnabled(false) ;
    }//GEN-LAST:event_btnAutorExcluirActionPerformed
    //botão pesquisar que ativa o botão ok e inicia a pesquisa
    private void btnAutorPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAutorPesquisarActionPerformed
        
         if(listaAutor.isEmpty()){
            JOptionPane.showMessageDialog(null, "Não contém autores cadastrados!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        } else{
            // Limpar campos
            txtNomeAutor.setText("");
            txtPaisAutor.setText("");
            // habilitar botoes
            btnAutorNovo.setEnabled(true);
            btnAutorSalvar.setEnabled(false);
            btnAutorCancelar.setEnabled(false);
            btnAutorEditar.setEnabled(false);
            btnAutorExcluir.setEnabled(false);
            btnAutorPesquisar.setEnabled(true);
            btnPesquisarAutor.setEnabled(true);

            //habilitar campos de texto
            txtNomeAutor.setEnabled(true);
            txtPaisAutor.setEnabled(false) ;
            
            txtNomeAutor.requestFocus();
         }
    }//GEN-LAST:event_btnAutorPesquisarActionPerformed
    //botão ok de pesquisar editora
    private void btnPesquisarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarAutorActionPerformed
        if(txtNomeAutor.getText().equals("")){
            JOptionPane.showMessageDialog(null, "O nome do autor deve ser informado!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            Autor aut;
            String pesquisaAutor = txtNomeAutor.getText(); //pegando o desejo da pesquisa e fazendo loop na lista
            for(int i = 0; i < listaAutor.size(); i++){
                aut = listaAutor.get(i);
                 if(pesquisaAutor.equals(aut.getNomeAutor()) ){
                    //pegando o indexador da pesquisa
                    indexPesquisa = i;
                    txtNomeAutor.setText(aut.getNomeAutor());
                    txtPaisAutor.setText(aut.getPaisAutor());
                    //habilitar botões
                    btnAutorSalvar.setEnabled(true);
                    btnAutorCancelar.setEnabled(true);
                    btnAutorEditar.setEnabled(true); 
                    
                    txtNomeAutor.selectAll();
                    txtNomeAutor.requestFocus();
                    
                    i = listaAutor.size();
                 }
            
            }
             if(txtPaisAutor.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Autor não encontrada!", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                // Limpar campos
                txtNomeAutor.setText("");
                txtPaisAutor.setText("");
                
                txtNomeAutor.selectAll();
                txtNomeAutor.requestFocus();
            } 
        }
    }//GEN-LAST:event_btnPesquisarAutorActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAutor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAutor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAutorCancelar;
    private javax.swing.JButton btnAutorEditar;
    private javax.swing.JButton btnAutorExcluir;
    private javax.swing.JButton btnAutorNovo;
    private javax.swing.JButton btnAutorPesquisar;
    private javax.swing.JButton btnAutorSalvar;
    private javax.swing.JButton btnPesquisarAutor;
    private javax.swing.JButton btnSairCadastroAutor;
    private javax.swing.JLabel lblAutor;
    private javax.swing.JPanel lblNomeAutor;
    private javax.swing.JLabel lblPaisAutor;
    private javax.swing.JScrollPane scpAutor;
    private javax.swing.JTable tblAutores;
    private javax.swing.JTextField txtNomeAutor;
    private javax.swing.JTextField txtPaisAutor;
    // End of variables declaration//GEN-END:variables
}
