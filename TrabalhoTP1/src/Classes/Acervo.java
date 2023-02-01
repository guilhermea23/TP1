/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import Classes.Livro;
import Classes.Filme;
import Classes.Artigo;



/**
 *
 * @author bodao
 */
public class Acervo {

    public Acervo() {
    }
    
   
    public Livro buscandoLivro(long idLivro){
        Livro livro = new Livro();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader("livrosCadastrados.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosLivro = linha.split(",");
                long id = Long.parseLong(dadosLivro[0]);
                if(id == idLivro){                    
                    livro.cadastrarLivro(id,dadosLivro[1],dadosLivro[2],Integer.parseInt(dadosLivro[3]),Integer.parseInt(dadosLivro[4]),Integer.parseInt(dadosLivro[5]),Boolean.parseBoolean(dadosLivro[6]));
                    return livro;
                }                
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de livros: " + e.getMessage());
        }
        System.out.println("Livro não cadastrado!");
        return null;
    }
    
    public Filme buscandoFilme(long idFilme){
        Filme filme = new Filme();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader("FilmesCadastrados.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosFilme = linha.split(",");
                long id = Long.parseLong(dadosFilme[0]);
                if(id == idFilme){                                
                    filme.cadastrarFilme(idFilme, dadosFilme[1], dadosFilme[2], Integer.parseInt(dadosFilme[3]), Boolean.parseBoolean(dadosFilme[4]));
                    return filme;
                }                
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        System.out.println("Filme não cadastrado!");
        return null;
    }
    
    public Artigo buscandoArtigo(long idArtigo){
        Artigo artigo = new Artigo();
        try (BufferedReader br = new BufferedReader(new java.io.FileReader("ArtigosCadastrados.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dadosArtigo = linha.split(",");
                long id = Long.parseLong(dadosArtigo[0]);
                if(id == idArtigo){                                
                    //Artigo(long idArtigo,String titulo, int anoPublicacao, String autorArtigo, boolean emprestado)
                    artigo.cadastrarArtigo(idArtigo, dadosArtigo[1], Integer.parseInt(dadosArtigo[2]), dadosArtigo[3], Boolean.parseBoolean(dadosArtigo[4]));
                    return artigo;
                }                
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao carregar o acervo de filmes: " + e.getMessage());
        }
        System.out.println("Artigo não cadastrado!");
        return null;
    }
    
        
    
}
