package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Professor extends Cliente{
    //private String vinculacao;
    private String formacao;
    private final String filePathUser = "src\\Arquivos\\user.txt";
    private final String filePathClientes = "src\\Arquivos\\Clientes.txt";
    
    public Professor() {
    }

   
    public Professor(Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia, String formacao) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia);
        this.formacao = formacao;
    }
   
    public String getFormacao() {
        return formacao;
    }

   
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",");
        sb.append(",").append(formacao);
        
        return sb.toString();
    }

    public void professorCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do professor: " + e.getMessage());
        }
    }
    
    public void professorCadastroSenha() {
        try {
            String usuario = "Professor," + this.matricula + "," + this.senha;
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(new String(usuario));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do professor: " + e.getMessage());
        }
    }
    
}
