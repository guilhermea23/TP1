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
public class Acervo {
    private ArrayList<String> Livro;
    private ArrayList<String> Filme;
    private ArrayList<String> Artigo;

    public Acervo(ArrayList<String> Livro, ArrayList<String> Filme, ArrayList<String> Artigo) {
        this.Livro = Livro;
        this.Filme = Filme;
        this.Artigo = Artigo;
    }

    public ArrayList<String> getLivro() {
        return Livro;
    }

    public ArrayList<String> getFilme() {
        return Filme;
    }

    public ArrayList<String> getArtigo() {
        return Artigo;
    }

    public void setLivro(ArrayList<String> Livro) {
        this.Livro = Livro;
    }

    public void setFilme(ArrayList<String> Filme) {
        this.Filme = Filme;
    }

    public void setArtigo(ArrayList<String> Artigo) {
        this.Artigo = Artigo;
    }
    
}
