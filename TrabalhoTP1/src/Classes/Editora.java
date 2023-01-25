/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.util.*;

/**
 *
 * @author bodao
 */
public class Editora {
    private String nomeEditora;
    private String paisEditora;
    private String telefoneEditora;
    private ArrayList<Livro> livrosEditora;
    private ArrayList<Autor> autoresEditora;
    
    public Editora(){
        this.livrosEditora = new ArrayList();
        this.autoresEditora = new ArrayList();
    }

    public Editora(String nomeEditora, String paisEditora, String telefoneEditora) {
        this.nomeEditora = nomeEditora;
        this.paisEditora = paisEditora;
        this.telefoneEditora = telefoneEditora;
        this.livrosEditora = new ArrayList();
        this.autoresEditora = new ArrayList();
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public String getPaisEditora() {
        return paisEditora;
    }

    public String getTelefoneEditora() {
        return telefoneEditora;
    }

    public ArrayList<Livro> mostrarLivrosEditora() {
        return livrosEditora;
    }
    
    public ArrayList<Autor> mostrarAutoresEditora() {
        return autoresEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }

    public void setPaisEditora(String paisEditora) {
        this.paisEditora = paisEditora;
    }

    public void setTelefoneEditora(String telefoneEditora) {
        this.telefoneEditora = telefoneEditora;
    }

    public void setLivrosEditora(ArrayList<Livro> livrosEditora) {
        this.livrosEditora = livrosEditora;
    }
    
    public void adicionaLivroEditora(Livro livro){
        this.livrosEditora.add(livro);
    }
    
    public void adicionaAutorEditora(Autor autor){
        this.autoresEditora.add(autor);
    }

    @Override
    public String toString() {
        return "Editora{" + "nomeEditora=" + nomeEditora + ", paisEditora=" + paisEditora + ", telefoneEditora=" + telefoneEditora + '}';
    }
    
    
}
