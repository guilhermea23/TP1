package Classes;

import java.util.Date;

public class Cliente {
    protected Long id;
    protected String nome;
    protected int cpf;
    protected Date dataNascimento;
    protected boolean pendencia;

    public Cliente(Long id, String nome, int cpf, Date dataNascimento, boolean pendencia) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.pendencia = pendencia;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isPendencia() {
        return pendencia;
    }

    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    @Override
    public String toString() {
        return "Cliente:" + 
                "\nID:" + id + 
                "\nNome:" + nome + 
                "\nCPF:" + cpf + 
                "\nData de Nascimento:" + dataNascimento + 
                "\nPendência:" + pendencia;
    }
}
