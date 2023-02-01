/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import Classes.Livro;
import Classes.Autor;
import Classes.Editora;
import telas.CadastroAutor;
import telas.CadastroEditora;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bodao
 */
public class telaAcervo extends javax.swing.JFrame {

    static ArrayList<Livro> listaLivro;
    
    String botao;
    int indexPesquisa = -1;
    
    public telaAcervo() {        
        
        initComponents();
        
        //maximizar a tela
        //this.setExtendedState(MAXIMIZED_BOTH);      
             
    }    
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnAcervo = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        txtTituloLivro = new javax.swing.JTextField();
        lblAdicionarAutor = new javax.swing.JLabel();
        btnAdicionarAutor = new javax.swing.JButton();
        lblAdicionarEditora = new javax.swing.JLabel();
        btnAdicionarEditora = new javax.swing.JButton();
        btnPesquisarLivro = new javax.swing.JButton();
        cmbLivroAutor = new javax.swing.JComboBox<>();
        cmbLivroEditora = new javax.swing.JComboBox<>();
        lblAdicionarLivro = new javax.swing.JLabel();
        cmbLivroAutor1 = new javax.swing.JComboBox<>();
        btnAdicionarAutor1 = new javax.swing.JButton();
        btnLivroNovo = new javax.swing.JButton();
        btnLivroSalvar = new javax.swing.JButton();
        btnLivroCancelar = new javax.swing.JButton();
        btnLivroEditar = new javax.swing.JButton();
        btnLivroExcluir = new javax.swing.JButton();
        btnLivroPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLivros = new javax.swing.JTable();
        btnSairCadastroLivro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Acervo");

        pnAcervo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Acervo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnAcervo.setName(""); // NOI18N
        pnAcervo.setRequestFocusEnabled(false);

        lblTitulo.setText("Título:");

        txtTituloLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloLivroActionPerformed(evt);
            }
        });

        lblAdicionarAutor.setText("Filme:");

        btnAdicionarAutor.setText("Adicionar Filme");
        btnAdicionarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAutorActionPerformed(evt);
            }
        });

        lblAdicionarEditora.setText("Artigo:");

        btnAdicionarEditora.setText("Adicionar Artigo");
        btnAdicionarEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarEditoraActionPerformed(evt);
            }
        });

        btnPesquisarLivro.setText("ok");
        btnPesquisarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarLivroActionPerformed(evt);
            }
        });

        cmbLivroAutor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Filme" }));
        cmbLivroAutor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbLivroAutorMouseClicked(evt);
            }
        });
        cmbLivroAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLivroAutorActionPerformed(evt);
            }
        });

        cmbLivroEditora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Artigo" }));
        cmbLivroEditora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLivroEditoraActionPerformed(evt);
            }
        });

        lblAdicionarLivro.setText("Livro:");

        cmbLivroAutor1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione Livro" }));
        cmbLivroAutor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbLivroAutor1MouseClicked(evt);
            }
        });
        cmbLivroAutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLivroAutor1ActionPerformed(evt);
            }
        });

        btnAdicionarAutor1.setText("Adicionar Livro");
        btnAdicionarAutor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarAutor1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnAcervoLayout = new javax.swing.GroupLayout(pnAcervo);
        pnAcervo.setLayout(pnAcervoLayout);
        pnAcervoLayout.setHorizontalGroup(
            pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcervoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdicionarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdicionarEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnAcervoLayout.createSequentialGroup()
                        .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 38, Short.MAX_VALUE)
                        .addComponent(btnPesquisarLivro)
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(pnAcervoLayout.createSequentialGroup()
                        .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cmbLivroEditora, javax.swing.GroupLayout.Alignment.LEADING, 0, 165, Short.MAX_VALUE)
                            .addComponent(cmbLivroAutor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbLivroAutor1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdicionarAutor1)
                            .addComponent(btnAdicionarEditora)
                            .addComponent(btnAdicionarAutor))))
                .addGap(38, 38, 38))
        );
        pnAcervoLayout.setVerticalGroup(
            pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAcervoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(txtTituloLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPesquisarLivro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdicionarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbLivroAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdicionarAutor1))
                .addGap(7, 7, 7)
                .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAcervoLayout.createSequentialGroup()
                        .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnAcervoLayout.createSequentialGroup()
                                .addComponent(lblAdicionarAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAcervoLayout.createSequentialGroup()
                                .addComponent(cmbLivroAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)))
                        .addGroup(pnAcervoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbLivroEditora)
                            .addComponent(lblAdicionarEditora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(pnAcervoLayout.createSequentialGroup()
                        .addComponent(btnAdicionarAutor)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAdicionarEditora)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblTitulo.getAccessibleContext().setAccessibleName("");

        btnLivroNovo.setText("Novo");
        btnLivroNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroNovoActionPerformed(evt);
            }
        });

        btnLivroSalvar.setText("Salvar");
        btnLivroSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroSalvarActionPerformed(evt);
            }
        });

        btnLivroCancelar.setText("Cancelar");
        btnLivroCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroCancelarActionPerformed(evt);
            }
        });

        btnLivroEditar.setText("Editar");
        btnLivroEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroEditarActionPerformed(evt);
            }
        });

        btnLivroExcluir.setText("Excluir");
        btnLivroExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroExcluirActionPerformed(evt);
            }
        });

        btnLivroPesquisar.setText("Pesquisar");
        btnLivroPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLivroPesquisarActionPerformed(evt);
            }
        });

        tblLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Título", "Publicação", "Páginas", "Preço", "Gênero", "Vendidas", "Autor", "Editora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblLivros);

        btnSairCadastroLivro.setText("Sair");
        btnSairCadastroLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairCadastroLivroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnLivroNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLivroSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLivroCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLivroEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLivroExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLivroPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(btnSairCadastroLivro))
                    .addComponent(pnAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addComponent(pnAcervo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLivroSalvar)
                    .addComponent(btnLivroCancelar)
                    .addComponent(btnLivroEditar)
                    .addComponent(btnLivroExcluir)
                    .addComponent(btnLivroPesquisar)
                    .addComponent(btnLivroNovo))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(btnSairCadastroLivro)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTituloLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloLivroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloLivroActionPerformed

    private void btnSairCadastroLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairCadastroLivroActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnSairCadastroLivroActionPerformed
    //botão de novo cadastro
    private void btnLivroNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroNovoActionPerformed
       
        
        
    }//GEN-LAST:event_btnLivroNovoActionPerformed
    //botão de cancelar
    private void btnLivroCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroCancelarActionPerformed
        
        
    }//GEN-LAST:event_btnLivroCancelarActionPerformed
    //botão de salvar
    private void btnLivroSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroSalvarActionPerformed
     
        }
    }//GEN-LAST:event_btnLivroSalvarActionPerformed
    //botão adicionar Autor e iniciar cadastro
    private void btnAdicionarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAutorActionPerformed
   
    }//GEN-LAST:event_btnAdicionarAutorActionPerformed
    //botão adicionar editora e iniciar cadastro
    private void btnAdicionarEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarEditoraActionPerformed
n/*ew CadastroEditora().setVisible(true);
carregarTabelaEditoras();
*/
    }//GEN-LAST:event_btnAdicionarEditoraActionPerformed
    //clicando na tabela para editar
    private void tblLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblLivrosMouseClicked
        
        
    }//GEN-LAST:event_tblLivrosMouseClicked
    //Bortão editar cadastro
    private void btnLivroEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroEditarActionPerformed
       
    }//GEN-LAST:event_btnLivroEditarActionPerformed
    //botão de exlcuir cadastro
    private void btnLivroExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroExcluirActionPerformed
      
       
    }//GEN-LAST:event_btnLivroExcluirActionPerformed
    //botão pesquisar que ativa o botão ok e inicia a pesquisa 
    private void btnLivroPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLivroPesquisarActionPerformed
        
        if(listaLivro.isEmpty()){
          
        
    }//GEN-LAST:event_btnLivroPesquisarActionPerformed
    //botão ok de pesquisar o Livro
    private void btnPesquisarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarLivroActionPerformed
       
    }//GEN-LAST:event_btnPesquisarLivroActionPerformed

    private void cmbLivroAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLivroAutorActionPerformed
           
       
    }//GEN-LAST:event_cmbLivroAutorActionPerformed

    private void cmbLivroEditoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLivroEditoraActionPerformed
        
    }//GEN-LAST:event_cmbLivroEditoraActionPerformed

    private void cmbLivroAutorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbLivroAutorMouseClicked
        
    }//GEN-LAST:event_cmbLivroAutorMouseClicked

    private void cmbLivroAutor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbLivroAutor1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLivroAutor1MouseClicked

    private void cmbLivroAutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLivroAutor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbLivroAutor1ActionPerformed

    private void btnAdicionarAutor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarAutor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAdicionarAutor1ActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarAutor;
    private javax.swing.JButton btnAdicionarAutor1;
    private javax.swing.JButton btnAdicionarEditora;
    private javax.swing.JButton btnLivroCancelar;
    private javax.swing.JButton btnLivroEditar;
    private javax.swing.JButton btnLivroExcluir;
    private javax.swing.JButton btnLivroNovo;
    private javax.swing.JButton btnLivroPesquisar;
    private javax.swing.JButton btnLivroSalvar;
    private javax.swing.JButton btnPesquisarLivro;
    private javax.swing.JButton btnSairCadastroLivro;
    private javax.swing.JComboBox<String> cmbLivroAutor;
    private javax.swing.JComboBox<String> cmbLivroAutor1;
    private javax.swing.JComboBox<String> cmbLivroEditora;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAdicionarAutor;
    private javax.swing.JLabel lblAdicionarEditora;
    private javax.swing.JLabel lblAdicionarLivro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnAcervo;
    private javax.swing.JTable tblLivros;
    private javax.swing.JTextField txtTituloLivro;
    // End of variables declaration//GEN-END:variables
