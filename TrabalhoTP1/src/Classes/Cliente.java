package Classes;

import java.util.Date;

public class Cliente {
    //protected Long id;
    protected Long matricula;
    protected String nome;
    protected int cpf;
    protected Date dataNascimento;
    protected int senha;
    protected boolean pendencia;
    
    public Cliente(){
    
    }

    public Cliente(Long matricula, String nome, int cpf, Date dataNascimento, int senha, boolean pendencia) {
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.senha = senha;
        this.pendencia = pendencia;
    }
   

    public Long getMatricula() {
        return matricula;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(matricula);
        sb.append(",").append(nome);
        sb.append(",").append(cpf);
        sb.append(",").append(dataNascimento);
        sb.append(",").append(senha);
        sb.append(",").append(pendencia);
        return sb.toString();
    }
    
    
    
}
