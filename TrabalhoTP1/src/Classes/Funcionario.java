package Classes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Funcionario extends Cliente {
    private String cargo;
    private final String filePathUser = "src\\Arquivos\\user.txt";
    private final String filePathClientes = "src\\Arquivos\\Clientes.txt";
    
    public Funcionario() {
    }
    

    public Funcionario(String cargo, long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia) {
        super(matricula, nome, cpf, dataNascimento, senha, pendencia);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(",");
        sb.append(",").append(cargo);    
        
        return sb.toString();
    }
    
    public void funcionarioCadastro() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathClientes, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do funionario: " + e.getMessage());
        }
    }

    public void funcionarioCadastroSenha() {
        try {
            String usuario = "Funcionario," + this.matricula + "," + this.senha;
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePathUser, true));
            writer.write(new String(usuario));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever a senha do professor: " + e.getMessage());
        }
    }
}
