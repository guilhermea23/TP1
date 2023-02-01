
package telas;

import Classes.Aluno;
import Classes.Funcionario;
import Classes.Professor;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author gabri
 */
public class CadastroCliente extends javax.swing.JFrame {

    public CadastroCliente() {
        initComponents();
        //habilitando txt
        txtMatricula.setEnabled(true);
        txtNome.setEnabled(true);
        txtCPF.setEnabled(true);
        txtDataNascimento.setEnabled(true);
        
        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);        
        txtCursoAluno.setEnabled(false);
        txSenhaAluno.setEnabled(false);        
        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTipoAcervo = new javax.swing.ButtonGroup();
        pnlGeral = new javax.swing.JPanel();
        pnlEmprestimo = new javax.swing.JPanel();
        pnlLivro = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMatricula = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDataNascimento = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        rbProfessor = new javax.swing.JRadioButton();
        rbAluno = new javax.swing.JRadioButton();
        rbFuncionario = new javax.swing.JRadioButton();
        lblTipo = new javax.swing.JLabel();
        pnlCliente = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        pnlPesquisaCliente = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCursoAluno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txSenhaAluno = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        pnlPesquisaCliente1 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        txtFormacaoProfessor = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtSenhaProfessor = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        pnlPesquisaCliente2 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        txtCargoFuncionario = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lblBemVindo = new javax.swing.JLabel();
        lblLogomarca = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        mnPrincipal = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlGeral.setBackground(new java.awt.Color(248, 248, 248));

        pnlEmprestimo.setBackground(new java.awt.Color(249, 249, 249));
        pnlEmprestimo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        pnlEmprestimo.setToolTipText("");

        pnlLivro.setBackground(new java.awt.Color(248, 248, 248));
        pnlLivro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro Geral", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 2, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Matrícula:");

        jLabel3.setText("CPF:");

        txtCPF.setEditable(false);

        jLabel10.setText("Data de nascimento:");

        txtDataNascimento.setEditable(false);

        jLabel13.setText("Nome:");

        txtNome.setEditable(false);

        javax.swing.GroupLayout pnlLivroLayout = new javax.swing.GroupLayout(pnlLivro);
        pnlLivro.setLayout(pnlLivroLayout);
        pnlLivroLayout.setHorizontalGroup(
            pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLivroLayout.createSequentialGroup()
                        .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMatricula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlLivroLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlLivroLayout.setVerticalGroup(
            pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLivroLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(12, 12, 12)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlLivroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        btnTipoAcervo.add(rbProfessor);
        rbProfessor.setText("Professor");
        rbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfessorActionPerformed(evt);
            }
        });

        btnTipoAcervo.add(rbAluno);
        rbAluno.setText("Aluno");
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        btnTipoAcervo.add(rbFuncionario);
        rbFuncionario.setText("Funcionário");
        rbFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFuncionarioActionPerformed(evt);
            }
        });

        lblTipo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTipo.setText("Selecione o cliente a ser cadastrado:");

        javax.swing.GroupLayout pnlEmprestimoLayout = new javax.swing.GroupLayout(pnlEmprestimo);
        pnlEmprestimo.setLayout(pnlEmprestimoLayout);
        pnlEmprestimoLayout.setHorizontalGroup(
            pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTipo)
                            .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                                .addComponent(rbProfessor)
                                .addGap(18, 18, 18)
                                .addComponent(rbAluno)
                                .addGap(18, 18, 18)
                                .addComponent(rbFuncionario))))
                    .addGroup(pnlEmprestimoLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        pnlEmprestimoLayout.setVerticalGroup(
            pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmprestimoLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTipo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmprestimoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbProfessor)
                    .addComponent(rbAluno)
                    .addComponent(rbFuncionario))
                .addGap(42, 42, 42)
                .addComponent(pnlLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pnlCliente.setBackground(new java.awt.Color(249, 249, 249));
        pnlCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        jPanel2.setBackground(new java.awt.Color(248, 248, 248));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Aluno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente.setBackground(new java.awt.Color(248, 248, 248));

        jLabel6.setText("C:urso");

        txtCursoAluno.setEditable(false);
        txtCursoAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCursoAlunoActionPerformed(evt);
            }
        });

        jLabel7.setText("Senha:");

        txSenhaAluno.setEditable(false);
        txSenhaAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txSenhaAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaClienteLayout = new javax.swing.GroupLayout(pnlPesquisaCliente);
        pnlPesquisaCliente.setLayout(pnlPesquisaClienteLayout);
        pnlPesquisaClienteLayout.setHorizontalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaClienteLayout.setVerticalGroup(
            pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaClienteLayout.createSequentialGroup()
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCursoAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txSenhaAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pnlPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(248, 248, 248));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Professor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente1.setBackground(new java.awt.Color(248, 248, 248));

        jLabel18.setText("Formação:");

        txtFormacaoProfessor.setEditable(false);
        txtFormacaoProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFormacaoProfessorActionPerformed(evt);
            }
        });

        jLabel19.setText("Senha:");

        txtSenhaProfessor.setEditable(false);
        txtSenhaProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaCliente1Layout = new javax.swing.GroupLayout(pnlPesquisaCliente1);
        pnlPesquisaCliente1.setLayout(pnlPesquisaCliente1Layout);
        pnlPesquisaCliente1Layout.setHorizontalGroup(
            pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(txtFormacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaCliente1Layout.setVerticalGroup(
            pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente1Layout.createSequentialGroup()
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtFormacaoProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaCliente1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(txtSenhaProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlPesquisaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pnlPesquisaCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBackground(new java.awt.Color(248, 248, 248));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionário", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N

        pnlPesquisaCliente2.setBackground(new java.awt.Color(248, 248, 248));

        jLabel20.setText("Cargo:");

        txtCargoFuncionario.setEditable(false);
        txtCargoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoFuncionarioActionPerformed(evt);
            }
        });

        jLabel21.setText("Senha:");

        txtSenhaFuncionario.setEditable(false);
        txtSenhaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSenhaFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlPesquisaCliente2Layout = new javax.swing.GroupLayout(pnlPesquisaCliente2);
        pnlPesquisaCliente2.setLayout(pnlPesquisaCliente2Layout);
        pnlPesquisaCliente2Layout.setHorizontalGroup(
            pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addGap(18, 18, 18)
                        .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        pnlPesquisaCliente2Layout.setVerticalGroup(
            pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPesquisaCliente2Layout.createSequentialGroup()
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlPesquisaCliente2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(pnlPesquisaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(pnlPesquisaCliente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlClienteLayout = new javax.swing.GroupLayout(pnlCliente);
        pnlCliente.setLayout(pnlClienteLayout);
        pnlClienteLayout.setHorizontalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlClienteLayout.createSequentialGroup()
                    .addContainerGap(16, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(15, 15, 15)))
        );
        pnlClienteLayout.setVerticalGroup(
            pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlClienteLayout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlClienteLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(389, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(new java.awt.Color(248, 248, 248));

        lblBemVindo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblBemVindo.setText("Bem-vindo(a)!");

        lblLogomarca.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLogomarca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogomarca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/book.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogomarca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblBemVindo)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblLogomarca)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblBemVindo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2))
        );

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlGeralLayout = new javax.swing.GroupLayout(pnlGeral);
        pnlGeral.setLayout(pnlGeralLayout);
        pnlGeralLayout.setHorizontalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlEmprestimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(523, 523, 523))
            .addGroup(pnlGeralLayout.createSequentialGroup()
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlGeralLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlGeralLayout.setVerticalGroup(
            pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGeralLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEmprestimo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(16, 16, 16))
        );

        jMenu2.setText("Edit");
        mnPrincipal.add(jMenu2);

        setJMenuBar(mnPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 855, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlGeral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCursoAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCursoAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCursoAlunoActionPerformed

    private void txSenhaAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txSenhaAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txSenhaAlunoActionPerformed

    private void rbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfessorActionPerformed
        //habilitando campos de txt
        txtFormacaoProfessor.setEnabled(true);
        txtSenhaProfessor.setEnabled(true);
        
        txtCursoAluno.setEnabled(false);
        txSenhaAluno.setEnabled(false);
        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
    }//GEN-LAST:event_rbProfessorActionPerformed

    private void rbFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFuncionarioActionPerformed
        //habilitando campos de txt
        txtCargoFuncionario.setEnabled(true);
        txtSenhaFuncionario.setEnabled(true);
        
        txtCursoAluno.setEnabled(false);
        txSenhaAluno.setEnabled(false);        
        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);
        
    }//GEN-LAST:event_rbFuncionarioActionPerformed

    private void txtFormacaoProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFormacaoProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFormacaoProfessorActionPerformed

    private void txtSenhaProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaProfessorActionPerformed

    private void txtCargoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoFuncionarioActionPerformed

    private void txtSenhaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSenhaFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSenhaFuncionarioActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
        //habilitando campos de txt
        txtCursoAluno.setEnabled(true);
        txSenhaAluno.setEnabled(true);
        
        txtFormacaoProfessor.setEnabled(false);
        txtSenhaProfessor.setEnabled(false);
        txtCargoFuncionario.setEnabled(false);
        txtSenhaFuncionario.setEnabled(false);
    }//GEN-LAST:event_rbAlunoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(rbAluno.getHideActionText() == false || rbProfessor.getHideActionText() == false || rbFuncionario.getHideActionText() == false){
            JOptionPane.showMessageDialog(null, "Por favor escolher que tipo de cliente! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
        }else{
            if(rbProfessor.getHideActionText()){
                if(txtMatricula.equals("") || txtNome.equals("") || txtCPF.equals("") || txtDataNascimento.equals("") || txtFormacaoProfessor.equals("") || txtSenhaProfessor.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }else{
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    int cpf = Integer.parseInt(txtCPF.getText());
                    DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                    Date dataNascimento = null;
                    try {
                        dataNascimento = (Date)formatter.parse(txtDataNascimento.getText());
                    } catch (ParseException ex) {
                        Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String formacao = txtFormacaoProfessor.getText();
                    int senha = Integer.parseInt(txSenhaAluno.getText());
                    //Professor(Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia, String vinculacao, String formacao)
                    Professor professor = new Professor(matricula, nome, cpf, dataNascimento, senha, false, formacao);
                    professor.professorCadastro();
                    professor.professorCadastroSenha();
                }
            }
            if(rbAluno.getHideActionText()){
                if(txtMatricula.equals("") || txtNome.equals("") || txtCPF.equals("") || txtDataNascimento.equals("") || txtCursoAluno.equals("") || txSenhaAluno.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }else{
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    int cpf = Integer.parseInt(txtCPF.getText());
                    DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                    Date dataNascimento = null;
                    try {
                        dataNascimento = (Date)formatter.parse(txtDataNascimento.getText());
                    } catch (ParseException ex) {
                        Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String curso = txtCursoAluno.getText();
                    int senha = Integer.parseInt(txSenhaAluno.getText()); 
                    //Aluno(String curso, Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia)
                    Aluno aluno = new Aluno(curso, matricula, nome, cpf, dataNascimento, senha, false);
                    aluno.alunoCadastro();
                    aluno.alunoCadastroSenha();
                }                
            }
            if(rbFuncionario.getHideActionText()){
                if(txtMatricula.equals("") || txtNome.equals("") || txtCPF.equals("") || txtDataNascimento.equals("") || txtCargoFuncionario.equals("") || txtSenhaFuncionario.equals("")){
                    JOptionPane.showMessageDialog(null, "Por favor preencher todos os campos! ", "Mensagem", JOptionPane.PLAIN_MESSAGE);
                }else{
                    long matricula = Long.parseLong(txtMatricula.getText());
                    String nome = txtNome.getText();
                    int cpf = Integer.parseInt(txtCPF.getText());
                    DateFormat formatter = new SimpleDateFormat("MM/dd/yy");
                    Date dataNascimento = null;
                    try {
                        dataNascimento = (Date)formatter.parse(txtDataNascimento.getText());
                    } catch (ParseException ex) {
                        Logger.getLogger(CadastroCliente.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    String cargo = txtCargoFuncionario.getText();
                    int senha = Integer.parseInt(txSenhaAluno.getText());   
                    //Funcionario(String cargo, Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia)
                    Funcionario funcionario = new Funcionario(cargo, matricula, nome, cpf, dataNascimento, senha, false);
                    funcionario.funcionarioCadastro();
                    funcionario.funcionarioCadastroSenha();
                }                
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnTipoAcervo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblBemVindo;
    private javax.swing.JLabel lblLogomarca;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JMenuBar mnPrincipal;
    private javax.swing.JPanel pnlCliente;
    private javax.swing.JPanel pnlEmprestimo;
    private javax.swing.JPanel pnlGeral;
    private javax.swing.JPanel pnlLivro;
    private javax.swing.JPanel pnlPesquisaCliente;
    private javax.swing.JPanel pnlPesquisaCliente1;
    private javax.swing.JPanel pnlPesquisaCliente2;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbFuncionario;
    private javax.swing.JRadioButton rbProfessor;
    private javax.swing.JTextField txSenhaAluno;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtCursoAluno;
    private javax.swing.JTextField txtDataNascimento;
    private javax.swing.JTextField txtFormacaoProfessor;
    private javax.swing.JTextField txtMatricula;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenhaFuncionario;
    private javax.swing.JTextField txtSenhaProfessor;
    // End of variables declaration//GEN-END:variables
}
