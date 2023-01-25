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
public class Autor {
    private String nomeAutor;
    private String paisAutor; 
    //referência a objetos associados a classe
    private ArrayList<Livro> livrosAutor;
    
    public Autor(){
        this.livrosAutor = new ArrayList();
    }

    public Autor(String nomeAutor, String paisAutor) {
        this.nomeAutor = nomeAutor;
        this.paisAutor = paisAutor;
        this.livrosAutor = new ArrayList();
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public String getPaisAutor() {
        return paisAutor;
    }

    public ArrayList<Livro> mostrarLivrosAutor() {
        return livrosAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public void setPaisAutor(String paisAutor) {
        this.paisAutor = paisAutor;
    }
    
    
    public void adicionarLivrosAutor(Livro livro){
        this.livrosAutor.add(livro);
    }

    @Override
    public String toString() {
        return "Autor{" + "nomeAutor=" + nomeAutor + ", paisAutor=" + paisAutor + ", livrosAutor=" + livrosAutor + '}';
    }    

    
}
