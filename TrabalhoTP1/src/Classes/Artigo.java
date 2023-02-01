/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

/**
 *
 * @author gabri
 */
public class Artigo {

    private long idArtigo;
    private String titulo;
    private int anoPublicacao;
    private boolean emprestado;

    public Artigo(long idArtigo, String titulo, int anoPublicacao, boolean emprestado) {
        this.idArtigo = idArtigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    public long getIdArtigo() {
        return idArtigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setIdArtigo(long idArtigo) {
        this.idArtigo = idArtigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

}
