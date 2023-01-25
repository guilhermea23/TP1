/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author bodao
 */
public class Livro {
    private long idLivro;
    private String titulo;
    private String genero;
    private int quantidadePaginas;
    private int edicao;
    private int anoPublicacao;
    private boolean emprestado;

    public Livro(boolean emprestado) {
       
    }
    
    public Livro(long idLivro, String titulo, String genero, int quantidadePaginas, int edicao, int anoPublicacao, boolean emprestado) {
        this.idLivro = idLivro;
        this.titulo = titulo;
        this.genero = genero;
        this.quantidadePaginas = quantidadePaginas;
        this.edicao = edicao;
        this.anoPublicacao = anoPublicacao;
        this.emprestado = emprestado;
    }

    public void setIdLivro(long idLivro) {
        this.idLivro = idLivro;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setQuantidadePaginas(int quantidadePaginas) {
        this.quantidadePaginas = quantidadePaginas;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public long getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getQuantidadePaginas() {
        return quantidadePaginas;
    }

    public int getEdicao() {
        return edicao;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public boolean isEmprestado() {
        return emprestado;
    }
    
}
