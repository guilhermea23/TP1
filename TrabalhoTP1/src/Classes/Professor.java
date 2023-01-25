package Classes;

import java.util.Date;

public class Professor extends Cliente{
    private Long matricula;
    private String vinculacao;
    private String formacao;
    private String senha;

    public Professor(Long matricula, String vinculacao, String formacao, String senha, Long id, String nome, int cpf, Date dataNascimento, boolean pendencia) {
        super(id, nome, cpf, dataNascimento, pendencia);
        this.matricula = matricula;
        this.vinculacao = vinculacao;
        this.formacao = formacao;
        this.senha = senha;
    }

    public Professor(Long matricula, String vinculacao, String formacao, String senha) {
        this.matricula = matricula;
        this.vinculacao = vinculacao;
        this.formacao = formacao;
        this.senha = senha;
    }

    public Professor() {
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getVinculacao() {
        return vinculacao;
    }

    public void setVinculacao(String vinculacao) {
        this.vinculacao = vinculacao;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
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
        return "Professor:" + 
                "\nMatricula:" + matricula + 
                "\nVinculação:" + vinculacao + 
                "\nFormacao:" + formacao + 
                "\nSenha:" + senha;
    }
    
    
}
