/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author gabri
 */
public class Artigo {
    private long idArtigo;
    private String titulo;
    private int anoPublicacao;
    private String autorArtigo;
    private boolean emprestado;
    private final String filePath = "src\\Arquivos\\ArtigosCadastrados.txt";
    
    public Artigo(){};
    
    public Artigo(long idArtigo, String titulo, int anoPublicacao, String autorArtigo, boolean emprestado) {        
        this.idArtigo = idArtigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autorArtigo = autorArtigo;
        this.emprestado = emprestado;
    }
    
    public void cadastrarArtigo(long idArtigo, String titulo, int anoPublicacao, String autorArtigo, boolean emprestado) {
        this.idArtigo = idArtigo;
        this.titulo = titulo;
        this.anoPublicacao = anoPublicacao;
        this.autorArtigo = autorArtigo;
        this.emprestado = emprestado;
    }
    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public String getAutorArtigo() {
        return autorArtigo;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public void setAutorArtigo(String autorArtigo) {
        this.autorArtigo = autorArtigo;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    public long getId() {
        return idArtigo;
    }
    
    @Override
    public String toString() {
        return titulo + "," + anoPublicacao + "," + autorArtigo + "," + emprestado;
    }

   public long idArtigo(){
        int id = 1;
        try{
            BufferedReader reader = new BufferedReader(new java.io.FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                id++;
            }
            reader.close();
        }catch (IOException e) {
            System.err.println("Erro ao escrever dados do artigo: " + e.getMessage());
        }
        
        return id;        
    }

    
    //Fazer o cadastro do autor
    public void artigoCadastro() {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true));
            writer.write(new String(this.toString()));
            writer.newLine();
            writer.close();
        } catch (IOException e) {
            System.err.println("Erro ao escrever dados do artigo: " + e.getMessage());
        }

    }
}
