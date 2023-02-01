package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Aluno extends Cliente{
    private String curso;
    
    private final String filePathUser = "src\\Arquivos\\user.txt";
   private final String filePathClientes = "src\\Arquivos\\Clientes.txt";
    
    public Aluno(){}
   

    public Aluno(String curso, Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",");
        sb.append(",").append(curso);
        
        return sb.toString();
    }
    
    public void alunoCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do aluno: " + e.getMessage());
        }
    }
    
    public void alunoCadastroSenha() {
        try {
            String usuario = "Professor," + this.matricula + "," + this.senha;
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(new String(usuario));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do aluno: " + e.getMessage());
        }
    }
    
}
