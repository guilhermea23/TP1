package Classes;

import java.util.Date;

public class Funcionario extends Cliente {
    private Long matricula;
    private String cargo;
    private String senha;

    public Funcionario(Long matricula, String cargo, String senha, Long id, String nome, int cpf, Date dataNascimento, boolean pendencia) {
        super(id, nome, cpf, dataNascimento, pendencia);
        this.matricula = matricula;
        this.cargo = cargo;
        this.senha = senha;
    }

    public Funcionario(Long matricula, String cargo, String senha) {
        this.matricula = matricula;
        this.cargo = cargo;
        this.senha = senha;
    }

    public Funcionario() {
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int getCpf() {
        return cpf;
    }

    @Override
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    @Override
    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public boolean isPendencia() {
        return pendencia;
    }

    @Override
    public void setPendencia(boolean pendencia) {
        this.pendencia = pendencia;
    }

    @Override
    public String toString() {
        return "Funcionario:" + 
                "\nMatricula:" + matricula + 
                "\nCargo:" + cargo + 
                "\nSenha:" + senha;
    }
}
